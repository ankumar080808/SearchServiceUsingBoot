
package com.vinculum.ondc.objects.response.onsearch.homekitchen;

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
    "code",
    "symbol",
    "long_desc",
    "short_desc",
    "images"
})
@Generated("jsonschema2pojo")
public class Descriptor__1 implements Serializable
{

    @JsonProperty("name")
    private String name;
    @JsonProperty("code")
    private String code;
    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("long_desc")
    private String longDesc;
    @JsonProperty("short_desc")
    private String shortDesc;
    @JsonProperty("images")
    private List<String> images;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 1316771987961841119L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Descriptor__1() {
    }

    /**
     * 
     * @param symbol
     * @param images
     * @param code
     * @param name
     * @param shortDesc
     * @param longDesc
     */
    public Descriptor__1(String name, String code, String symbol, String longDesc, String shortDesc, List<String> images) {
        super();
        this.name = name;
        this.code = code;
        this.symbol = symbol;
        this.longDesc = longDesc;
        this.shortDesc = shortDesc;
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

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("symbol")
    public String getSymbol() {
        return symbol;
    }

    @JsonProperty("symbol")
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @JsonProperty("long_desc")
    public String getLongDesc() {
        return longDesc;
    }

    @JsonProperty("long_desc")
    public void setLongDesc(String longDesc) {
        this.longDesc = longDesc;
    }

    @JsonProperty("short_desc")
    public String getShortDesc() {
        return shortDesc;
    }

    @JsonProperty("short_desc")
    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Descriptor__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("symbol");
        sb.append('=');
        sb.append(((this.symbol == null)?"<null>":this.symbol));
        sb.append(',');
        sb.append("longDesc");
        sb.append('=');
        sb.append(((this.longDesc == null)?"<null>":this.longDesc));
        sb.append(',');
        sb.append("shortDesc");
        sb.append('=');
        sb.append(((this.shortDesc == null)?"<null>":this.shortDesc));
        sb.append(',');
        sb.append("images");
        sb.append('=');
        sb.append(((this.images == null)?"<null>":this.images));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
