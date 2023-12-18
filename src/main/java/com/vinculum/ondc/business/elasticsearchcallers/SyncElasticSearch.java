package com.vinculum.ondc.business.elasticsearchcallers;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CompletableFuture;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpHost;
import org.elasticsearch.action.update.UpdateResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vinculum.ondc.constants.Constants;
import com.vinculum.ondc.dao.objects.Sku;
import com.vinculum.ondc.objects.MetaData;
import com.vinculum.ondc.objects.SearchException;
import com.vinculum.ondc.objects.request.confirm.Confirm;
import com.vinculum.ondc.objects.request.init.Init;
import com.vinculum.ondc.objects.sku.Detail;
import com.vinculum.ondc.objects.sku.Product;

import co.elastic.clients.elasticsearch.core.BulkRequest;
import co.elastic.clients.elasticsearch.core.BulkResponse;
import co.elastic.clients.elasticsearch.core.bulk.BulkOperation;
import co.elastic.clients.elasticsearch.core.bulk.BulkResponseItem;
import co.elastic.clients.elasticsearch.core.bulk.IndexOperation;
import co.elastic.clients.elasticsearch.core.search.Hit;
import co.elastic.clients.elasticsearch.indices.CreateIndexRequest;
import co.elastic.clients.elasticsearch.indices.CreateIndexResponse;


import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.builder.SearchSourceBuilder;




/*
 * The given code represents a Java class named SyncElasticSearch that interacts with an Elasticsearch database.
 * 
 * The class contains a logger object for logging messages.It has a constructor that takes an Elasticsearch client
 * and an index name as parameters to initialize the class.
 * 
 * The createIndice method creates an index in Elasticsearch by sending a request with the provided data and index name.It returns the response. 
 * 
 * The bulkUpsert method performs bulk upsert operations, adding or updating multiple products in the Elasticsearch database.
 * It takes a list of products as input and returns a list of BulkResponseItem.
 * 
 * The build method builds a list of Product objects based on a list of Sku objects. It sets the properties of each Product object and returns the list of products.
 * 
 * Overall, the class provides methods to create an index, perform bulk upsert operations, build product data, 
 * and handle bulk deletion in an Elasticsearch database.
 * 
 */

public class SyncElasticSearch {

	public static final Logger LOGGER = LoggerFactory.getLogger(SyncElasticSearch.class);

	private final String indexName;

	private MetaData metaData;

	public SyncElasticSearch(final MetaData metaData, final String indexName) {
		// Assign
		this.metaData = metaData;
		// Assign
		this.indexName = indexName;
	}

	/**
	 * An Index is a Database that we create on ElasticSearch. An Indice is a
	 * Document Id. In Elastic Search, to search one document, we will use Index Id
	 * or Indices Id & name. createIndice is a One Time Call. This Method is Used to
	 * Create an Index on Elastic Search.
	 * 
	 * @param data
	 * @return
	 * @throws Exception
	 */
	public CreateIndexResponse createIndice(final String data) throws Exception {
		// Initialize
		CreateIndexResponse response = null;
		// Handle Exceptions Here
		try {
			// Check
			if (StringUtils.isNotBlank(data) && StringUtils.isNotBlank(indexName)) {
				// Create Reader
				final StringReader reader = new StringReader(data);
				// Create Request for Indices
				final CreateIndexRequest request = new CreateIndexRequest.Builder().withJson(reader).index(indexName)
						.build();
				// Check
				if (null == request) {
					// Throw
					throw new SearchException(1100, String.format(Constants.CREATE_INDICE_REQ_NULL, indexName));
				}
				// Get the Response
				response = metaData.getElasticClient().indices().create(request);
				// Check
				if (null != response) {
					// Log
					LOGGER.info(response.index());
					// Log
					LOGGER.info(response.toString());
				}
			} else {
				// Throw
				throw new SearchException(1101, Constants.CREATE_INDICE_DATA_NULL);
			}
		} catch (final Exception exception) {
			// Throw
			throw exception;
		}
		// Return
		return response;
	}

	/**
	 * This Method is Responsible to Add / Update Data in the Database.
	 * 
	 * @param product
	 * @param type
	 * @return
	 * @throws Exception
	 */
	public List<BulkResponseItem> bulkUpsert(final List<Product> products) throws Exception {
		// Create Responses
		List<BulkResponseItem> items = null;
		// Handle Exceptions Here
		try {
			// Check
			if (null != products && !products.isEmpty()) {
				// Create the Builder
				final BulkRequest.Builder builder = new BulkRequest.Builder();

				// Check
				if (null != builder) {

					List<BulkOperation> boperations = new ArrayList<>();
					// Loop
					for (final Product product : products) {
						// Create the Index
						final IndexOperation<Product> ioperation = new IndexOperation.Builder<Product>()
								.index(Constants.PRODUCTS).id(product.getSku()).document(product).build();


						// Create the Bulk Opearion
						final BulkOperation boperation = new BulkOperation.Builder().index(ioperation).build();
						// Add
						boperations.add(boperation);
					}
					builder.operations(boperations);
					// Call the API
					BulkResponse result = metaData.getElasticClient().bulk(builder.build());
					// Check
					if (result == null) {
						// Throw
						throw new SearchException(1300, String.format(Constants.CREATE_DATA_REQ_OBJ_NULL, indexName));
					}
					// Check
					if (result.errors()) {
						// Log
						LOGGER.error("bulkUpsert had errors");
						// Get the Items
						final List<BulkResponseItem> list = result.items();
						// Check
						if (null == list) {
							// Throw
							throw new SearchException(1303,
									String.format(Constants.BULK_RESPONSE_ITEM_NULL, indexName));
						}
						// Loop
						for (final BulkResponseItem item : list) {
							// Check
							if (item.error() != null) {
								// Get the Reason
								String errorReason = StringUtils.left(item.error().reason(), 300);
								// Check
								if (StringUtils.isBlank(errorReason)) {
									// Assign
									errorReason = Constants.RESPONSE_ITEM_UNEXPECTED_ERROR;
								}
								// Catch the Error and Throw It. Skus will be retried since transmitlog date
								// will not get updated to now.
								throw new SearchException(1300, errorReason);
							}
						}
					} else {
						// Re-Assign
						items = result.items();
						// Loop
						for (final BulkResponseItem item : items) {
							// Out
							LOGGER.info(item.id());
						}
					}
				}
			}
		} catch (final Exception exception) {
			// Log
			LOGGER.info(exception.getMessage(), exception.fillInStackTrace());
			// Throw
			throw exception;
		}
		// Return
		return items;

	}

	/**
	 * This method is responsible to build data for Insertion/Updation
	 * 
	 * @param skus
	 * @return
	 */
	public List<Product> build(final List<Sku> skus) {
		// Create List of Products
		final List<Product> products = new ArrayList<>();
		// Loop
		for (final Sku sku : skus) {
			// Create a Product
			final Product product = new Product();
			// Set Sku
			product.setSku(sku.getSku());
			// Set Name
			product.setSkuname(sku.getName());
			// Set Status
			product.setStatus(sku.getStatus());
			// Create Details
			final Detail detail = new Detail();
			// Check
			if (null != sku.getLength()) {
				// Set
				detail.setLength(sku.getLength());
			}
			if (null != sku.getWidth()) {
				// Set
				detail.setWidth(sku.getWidth());
			}
			if (null != sku.getHeight()) {
				// Set
				detail.setHeight(sku.getHeight());
			}
			// Set
			product.setDetails(detail);
			// Add
			products.add(product);
		}
		// Return
		return products;
	}

	public void bulkDelete(List<Product> products) {
		// Fill in the Deletion Here

	}


	public void bulkUpsert(final Object data) {
		try 
		{
			if (null != data)
			{
				Init init = (Init) data;
				final BulkRequest.Builder builder = new BulkRequest.Builder();
				List<BulkOperation> boperations = new ArrayList<>();
				Map<String, Object> map = new HashMap<>();

				map.put("timestamp", init.getContext().getTimestamp());
				map.put("bap_id", init.getContext().getBppId());
				map.put("bpp_id", init.getContext().getBapUri());
				map.put("object", data);

				Random random = new Random();
				int randomNumber = random.nextInt(10); // Generates a random number between 0 and 99999
				String uniqueNo = String.valueOf(randomNumber);

				// Create the Index
				final IndexOperation<Object> ioperation = new IndexOperation.Builder<Object>().index(Constants.ORDERS)
						.id(uniqueNo).document(map).build();

				// Create the Bulk Operation
				final BulkOperation boperation = new BulkOperation.Builder().index(ioperation).build();
				// AddS

				boperations.add(boperation); 
				builder.operations(boperations);
				// Call the API with the BulkRequest

			CompletableFuture<BulkResponse> result =metaData.getElasticAsyncClient().bulk(builder.build());

				result.whenCompleteAsync((bulkResponse, throwable) -> {
					if (throwable != null) {
						// Handle or log the exception here
					} else {
						// Invoke the Consumer class init method, passing the actual BulkResponse
						new Consumer().onInit(bulkResponse,throwable);
					}
				});

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}


	public void bulkUpsertConfirm(final Object data) {
		try 
		{
			if (null != data)
			{
				Confirm confirm = (Confirm) data;
				final BulkRequest.Builder builder = new BulkRequest.Builder();
				List<BulkOperation> boperations = new ArrayList<>();
				Map<String, Object> map = new HashMap<>();

				Random random = new Random();
				int randomNumber = random.nextInt(10); // Generates a random number between 0 and 99999
				String uniqueNo = String.valueOf(randomNumber);


				map.put("id", 1);
				map.put("timestamp", confirm.getContext().getTimestamp());
				map.put("bap_id", confirm.getContext().getBppId());
				map.put("bpp_id", confirm.getContext().getBapUri());
				map.put("status", Constants.DEFAULT_STATUS);
				map.put("object", data);



				// Create the Index
				final IndexOperation<Object> ioperation = new IndexOperation.Builder<Object>().index(Constants.CONFIRM)
						.id(uniqueNo).document(map).build();

				// Create the Bulk Operation
				final BulkOperation boperation = new BulkOperation.Builder().index(ioperation).build();
				// AddS

				org.elasticsearch.action.update.UpdateRequest updateRequest = new org.elasticsearch.action.update.UpdateRequest("confirm","1");
				updateRequest.doc("status","1");


				boperations.add(boperation); 
				builder.operations(boperations);
				// Call the API with the BulkRequest

				CompletableFuture<BulkResponse> result =metaData.getElasticAsyncClient().bulk(builder.build());

				result.whenCompleteAsync((bulkResponse, throwable) -> {
					if (throwable != null) {
						// Handle or log the exception here
					} else {
						// Invoke the Consumer class init method, passing the actual BulkResponse
						new Consumer().onInit(bulkResponse,throwable);
					}
				});

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public List<com.vinculum.ondc.objects.sku.Confirm> getRecordsWithStatusZero() {

		List<com.vinculum.ondc.objects.sku.Confirm> confirmList = new ArrayList<com.vinculum.ondc.objects.sku.Confirm>();

		// Specify the index name
		String indexName = "confirm";

		try (RestHighLevelClient restClient = new RestHighLevelClient(
				RestClient.builder(new HttpHost("localhost", 9200, "http")))) {

			// Create a search request
			SearchRequest searchRequest = new SearchRequest(indexName);

			// Create a search source builder
			SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();

			// Build the query to retrieve documents where status is 0
			searchSourceBuilder.query(QueryBuilders.termQuery("status", 0));

			// Set the source builder to the search request
			searchRequest.source(searchSourceBuilder);

			// Execute the search request
			SearchResponse searchResponse = restClient.search(searchRequest, RequestOptions.DEFAULT);

			ObjectMapper objectMapper = new ObjectMapper();

			// Process the search hits
			for (SearchHit hit : searchResponse.getHits().getHits()) {

				// Deserialize the source of the hit to Confirm object
				com.vinculum.ondc.objects.sku.Confirm confirm=objectMapper.readValue(hit.getSourceAsString(), com.vinculum.ondc.objects.sku.Confirm.class);

				confirmList.add(confirm);
			} 

		} catch (IOException e) {
			LOGGER.error("Error while executing search request", e);
			// Handle the exception appropriately
		}

		return confirmList;
	}

	public  void updateStatus() throws IOException {

		RestHighLevelClient client = new RestHighLevelClient(RestClient.builder(new HttpHost("localhost", 9200, "http")));

		org.elasticsearch.action.update.UpdateRequest updateRequest = new org.elasticsearch.action.update.UpdateRequest("confirm","id");
		updateRequest.doc("status","1");


		UpdateResponse updateResponse = client.update(updateRequest, RequestOptions.DEFAULT);
		System.out.println("updated response id: "+updateResponse.getId());

	}

}
