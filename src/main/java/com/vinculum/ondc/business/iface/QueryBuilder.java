package com.vinculum.ondc.business.iface;



import java.util.List;

import org.elasticsearch.action.index.IndexRequest;

import co.elastic.clients.elasticsearch._types.query_dsl.Query;

public interface QueryBuilder {
	
	List<Query> buildSearchQuery(Object data) throws Exception;
	IndexRequest buildSaveQuery(Object data) throws Exception;
	

}