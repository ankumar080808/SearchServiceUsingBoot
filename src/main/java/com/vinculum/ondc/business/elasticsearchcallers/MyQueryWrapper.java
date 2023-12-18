package com.vinculum.ondc.business.elasticsearchcallers;

import org.elasticsearch.search.builder.SearchSourceBuilder;

import co.elastic.clients.elasticsearch._types.query_dsl.Query;

public class MyQueryWrapper {
	
	private final SearchSourceBuilder sourceBuilder;
	
	public MyQueryWrapper(SearchSourceBuilder sourceBuilder) {
	    this.sourceBuilder = sourceBuilder;
	}
	
	public SearchSourceBuilder getSourceBuilder() {
	    return sourceBuilder;
	}
}
