
package com.vinculum.ondc.objects.request.eretailCancel;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "order"
})
@Generated("jsonschema2pojo")
public class EretailCancel implements Serializable
{

    @JsonProperty("order")
    private Order order;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 3888452253610890089L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public EretailCancel() {
    }

    /**
     * 
     * @param order
     */
    public EretailCancel(Order order) {
        super();
        this.order = order;
    }

    @JsonProperty("order")
    public Order getOrder() {
        return order;
    }

    @JsonProperty("order")
    public void setOrder(Order order) {
        this.order = order;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
