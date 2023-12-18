package com.vinculum.ondc.business.elasticsearchcallers;

import java.util.ArrayList;
import java.util.List;
import org.elasticsearch.action.index.IndexRequest;
import com.vinculum.ondc.business.iface.QueryBuilder;
import com.vinculum.ondc.constants.Constants;
import com.vinculum.ondc.objects.request.select.Item;
import com.vinculum.ondc.objects.request.select.Select;
import co.elastic.clients.elasticsearch._types.query_dsl.MatchQuery;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;

public class SelectQueryBuilder implements QueryBuilder {

    @Override
    public List<Query> buildSearchQuery(Object data) throws Exception {
        List<Query> queries = new ArrayList<>();

        if (data instanceof Select) {
            Select select = (Select) data;

            if (select.getContext().getDomain() != null) {
                final String domainValue = select.getContext().getDomain();
                Query byDomain = MatchQuery.of(m -> m.field(Constants.DOMAIN).query(domainValue))._toQuery();
                queries.add(byDomain);
            }

            if (select.getMessage().getOrder() != null) {
                final String areaCode = select.getMessage().getOrder().getFulfillments().get(0).getEnd().getLocation().getAddress().getAreaCode();
                List<Item> items = select.getMessage().getOrder().getItems();

                if (!items.isEmpty()) {
                    for (Item item : items) {
                        Query byItem = MatchQuery.of(m -> m.field(Constants.ITEM).query(item.getId()))._toQuery();
                        queries.add(byItem);
                    }
                }
                Query byAreaCode = MatchQuery.of(m -> m.field(Constants.AREA_CODE).query(areaCode))._toQuery();
                queries.add(byAreaCode);
            }

            return queries;
        }
        throw new IllegalArgumentException("Invalid data type for search query builder");
    }

    @Override
    public IndexRequest buildSaveQuery(Object data) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }
}
