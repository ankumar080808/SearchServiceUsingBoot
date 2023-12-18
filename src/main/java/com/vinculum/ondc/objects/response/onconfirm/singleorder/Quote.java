package com.vinculum.ondc.objects.response.onconfirm.singleorder;

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
    "price",
    "breakup",
    "ttl"
})
@Generated("jsonschema2pojo")
public class Quote implements Serializable
{

    @JsonProperty("price")
    private Price price;
    @JsonProperty("breakup")
    private List<Breakup> breakup;
    @JsonProperty("ttl")
    private String ttl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 2039687731530296134L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Quote() {
    }

    /**
     * 
     * @param breakup
     * @param price
     * @param ttl
     */
    public Quote(Price price, List<Breakup> breakup, String ttl) {
        super();
        this.price = price;
        this.breakup = breakup;
        this.ttl = ttl;
    }

    @JsonProperty("price")
    public Price getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Price price) {
        this.price = price;
    }

    @JsonProperty("breakup")
    public List<Breakup> getBreakup() {
        return breakup;
    }

    @JsonProperty("breakup")
    public void setBreakup(List<Breakup> breakup) {
        this.breakup = breakup;
    }

    @JsonProperty("ttl")
    public String getTtl() {
        return ttl;
    }

    @JsonProperty("ttl")
    public void setTtl(String ttl) {
        this.ttl = ttl;
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
        sb.append(Quote.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("price");
        sb.append('=');
        sb.append(((this.price == null)?"<null>":this.price));
        sb.append(',');
        sb.append("breakup");
        sb.append('=');
        sb.append(((this.breakup == null)?"<null>":this.breakup));
        sb.append(',');
        sb.append("ttl");
        sb.append('=');
        sb.append(((this.ttl == null)?"<null>":this.ttl));
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
