
package com.vinculum.ondc.objects.request.cancel;

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
    "name",
    "short_desc"
})
@Generated("jsonschema2pojo")
public class Descriptor implements Serializable
{

    @JsonProperty("name")
    private String name;
    @JsonProperty("short_desc")
    private String shortDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 5974783097173446853L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Descriptor() {
    }

    /**
     * 
     * @param name
     * @param shortDesc
     */
    public Descriptor(String name, String shortDesc) {
        super();
        this.name = name;
        this.shortDesc = shortDesc;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("short_desc")
    public String getShortDesc() {
        return shortDesc;
    }

    @JsonProperty("short_desc")
    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
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
