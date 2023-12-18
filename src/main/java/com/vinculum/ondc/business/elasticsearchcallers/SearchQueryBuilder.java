/**
 * 
 */
package com.vinculum.ondc.business.elasticsearchcallers;

import java.util.ArrayList;
import java.util.List;

import org.elasticsearch.action.index.IndexRequest;

import com.vinculum.ondc.business.iface.QueryBuilder;
import com.vinculum.ondc.constants.Constants;
import com.vinculum.ondc.objects.SearchException;
import com.vinculum.ondc.objects.request.search.Intent;
import com.vinculum.ondc.objects.request.search.Search;
import com.vinculum.ondc.objects.sku.Confirm;

import co.elastic.clients.elasticsearch._types.query_dsl.MatchQuery;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;

/**
 * 
 */
public class SearchQueryBuilder implements QueryBuilder {

	/**
	 * This method is responsible to Build the Query for Getting Records based on
	 * some Criteria.
	 * 
	 * @param params
	 * @return
	 * @throws SearchException
	 */

	@Override
	public List<Query> buildSearchQuery(Object data) throws Exception {
	    List<Query> queries = new ArrayList<>();

	    if (!(data instanceof Search)) {
	        throw new IllegalArgumentException("Invalid data type for search query builder");
	    }

	    Search search = (Search) data;
	    Intent intent = search.getMessage().getIntent();

	    // Handle item field
	    if (intent.getItem() != null) {
	        String itemValue = intent.getItem().getDescriptor().getName(); // replace with actual method
	        Query byItem = MatchQuery.of(m -> m.field(Constants.ITEM_DESCRIPTOR).query(itemValue))._toQuery();
	        queries.add(byItem);
	    } 
	    // Handle category field
	    else if (intent.getCategory() != null) {
	        String categoryValue = intent.getCategory().toString(); // replace with actual method
	        Query byCategory = MatchQuery.of(m -> m.field(Constants.CATEGORY).query(categoryValue))._toQuery();
	        queries.add(byCategory);
	    } 
	    // Handle fulfillment and location field
	    else if (intent.getFulfillment() != null 
	              && intent.getFulfillment().getEnd() != null 
	              && intent.getFulfillment().getEnd().getLocation().getAddress().getAreaCode() != null) {
	        String locationValue = intent.getFulfillment().getEnd().getLocation().getAddress().getAreaCode().toString(); // replace with actual method
	        Query byLocation = MatchQuery.of(m -> m.field(Constants.AREA_CODE).query(locationValue))._toQuery();
	        queries.add(byLocation);
	    } 
	    // Handle city field
	    else {
	        String cityValue = search.getContext().getCity();
	        Query byCity = MatchQuery.of(m -> m.field(Constants.CITY).query(cityValue))._toQuery();
	        queries.add(byCity);
	    }
	    
	    Query byDomain = MatchQuery.of(m -> m.field(Constants.DOMAIN).query(search.getContext().getDomain()))._toQuery();
        queries.add(byDomain);
        
	    if (queries.isEmpty()) {
	        throw new SearchException(1300, "Could Not Build the Query");
	    }

	    return queries;
	}

	
	
	
	public List<Query> buildConfirmQuery(Object data) throws Exception {
	    List<Query> queries = new ArrayList<>();

	    if (!(data instanceof Search)) {
	        throw new IllegalArgumentException("Invalid data type for search query builder");
	    }

	    Confirm confirm = (Confirm) data;
	    
	    confirm.getStatus();

	    // Handle item field
	    if (confirm.getStatus()==0) {
	       
	        Query byStatus = MatchQuery.of(m -> m.field(Constants.STATUS).query(confirm.getStatus()))._toQuery();
	        queries.add(byStatus);
	    } 
	   
        
	    if (queries.isEmpty()) {
	        throw new SearchException(1300, "Could Not Build the Query");
	    }

	    return queries;
	}
	
	
	@Override
	public IndexRequest buildSaveQuery(Object data) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	
}