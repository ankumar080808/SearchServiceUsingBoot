
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
    "symbol",
    "short_desc",
    "long_desc",
    "images"
})
@Generated("jsonschema2pojo")
public class BppDescriptor implements Serializable
{

    @JsonProperty("name")
    private String name;
    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("short_desc")
    private String shortDesc;
    @JsonProperty("long_desc")
    private String longDesc;
    @JsonProperty("images")
    private List<String> images;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 7146870199898286446L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public BppDescriptor() {
    }

    /**
     * 
     * @param symbol
     * @param images
     * @param name
     * @param shortDesc
     * @param longDesc
     */
    public BppDescriptor(String name, String symbol, String shortDesc, String longDesc, List<String> images) {
        super();
        this.name = name;
        this.symbol = symbol;
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

    @JsonProperty("symbol")
    public String getSymbol() {
        return symbol;
    }

    @JsonProperty("symbol")
    public void setSymbol(String symbol) {
        this.symbol = symbol;
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
