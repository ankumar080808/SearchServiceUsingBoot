
package com.vinculum.ondc.objects.response.oncancel.rto;

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
    "price"
})
@Generated("jsonschema2pojo")
public class Item__1 implements Serializable
{

    @JsonProperty("price")
    private Price__2 price;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 987772173618755513L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Item__1() {
    }

    /**
     * 
     * @param price
     */
    public Item__1(Price__2 price) {
        super();
        this.price = price;
    }

    @JsonProperty("price")
    public Price__2 getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Price__2 price) {
        this.price = price;
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
