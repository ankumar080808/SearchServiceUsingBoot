
package com.vinculum.ondc.objects.response.onsearch.fb;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
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
    "short_desc",
    "long_desc",
    "images"
})
@Generated("jsonschema2pojo")
public class Descriptor__1 implements Serializable
{

    @JsonProperty("name")
    private String name;
    @JsonProperty("short_desc")
    private String shortDesc;
    @JsonProperty("long_desc")
    private String longDesc;
    @JsonProperty("images")
    private List<String> images;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -5655271172411963269L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Descriptor__1() {
    }

    /**
     * 
     * @param images
     * @param name
     * @param shortDesc
     * @param longDesc
     */
    public Descriptor__1(String name, String shortDesc, String longDesc, List<String> images) {
        super();
        this.name = name;
        this.shortDesc = shortDesc;
        this.longDesc = longDesc;
        this.images = images;
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

    @JsonProperty("long_desc")
    public String getLongDesc() {
        return longDesc;
    }

    @JsonProperty("long_desc")
    public void setLongDesc(String longDesc) {
        this.longDesc = longDesc;
    }

    @JsonProperty("images")
    public List<String> getImages() {
        return images;
    }

    @JsonProperty("images")
    public void setImages(List<String> images) {
        this.images = images;
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
