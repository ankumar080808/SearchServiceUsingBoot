/**
 * 
 */
package com.vinculum.ondc.business.elasticsearchcallers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vinculum.ondc.business.iface.QueryBuilder;

import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import org.elasticsearch.action.index.IndexRequest;

/**
 * 
 */
public class SaveQueryBuilder implements QueryBuilder {

	 private final ObjectMapper objectMapper = new ObjectMapper();  // Initialize Jackson's ObjectMapper

	@Override
	public List<Query> buildSearchQuery(Object data) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public IndexRequest buildSaveQuery(Object data) throws Exception {
		 @SuppressWarnings("unchecked")
		Map<String, Object> jsonData = objectMapper.convertValue(data, Map.class);

	        // Create an IndexRequest for the "orders" index
	        IndexRequest indexRequest = new IndexRequest("orders");

	        // Set the source to be the Map
	        indexRequest.source(jsonData);

	        return indexRequest;
	}

}
