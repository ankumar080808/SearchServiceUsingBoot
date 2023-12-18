
package com.vinculum.ondc.objects.response.onsearch.fb;

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
    "catalog"
})
@Generated("jsonschema2pojo")
public class Message implements Serializable
{

    @JsonProperty("catalog")
    private Catalog catalog;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 6506293127338592967L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Message() {
    }

    /**
     * 
     * @param catalog
     */
    public Message(Catalog catalog) {
        super();
        this.catalog = catalog;
    }

    @JsonProperty("catalog")
    public Catalog getCatalog() {
        return catalog;
    }

    @JsonProperty("catalog")
    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
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
