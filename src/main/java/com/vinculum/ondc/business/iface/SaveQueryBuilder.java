package com.vinculum.ondc.business.iface;

import co.elastic.clients.elasticsearch._types.query_dsl.Query;

public interface SaveQueryBuilder {

	 Query buildSaveQuery(Object data) throws Exception;
}
