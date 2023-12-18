
package com.vinculum.ondc.objects.response.onsearch.health;


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
    "bpp/fulfillments",
    "bpp/descriptor",
    "bpp/providers"
})
@Generated("jsonschema2pojo")
public class Catalog implements Serializable
{

    @JsonProperty("bpp/fulfillments")
    private List<BppFulfillment> bppFulfillments;
    @JsonProperty("bpp/descriptor")
    private BppDescriptor bppDescriptor;
    @JsonProperty("bpp/providers")
    private List<BppProvider> bppProviders;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 8793053000328997220L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Catalog() {
    }

    /**
     * 
     * @param bppDescriptor
     * @param bppFulfillments
     * @param bppProviders
     */
    public Catalog(List<BppFulfillment> bppFulfillments, BppDescriptor bppDescriptor, List<BppProvider> bppProviders) {
        super();
        this.bppFulfillments = bppFulfillments;
        this.bppDescriptor = bppDescriptor;
        this.bppProviders = bppProviders;
    }

    @JsonProperty("bpp/fulfillments")
    public List<BppFulfillment> getBppFulfillments() {
        return bppFulfillments;
    }

    @JsonProperty("bpp/fulfillments")
    public void setBppFulfillments(List<BppFulfillment> bppFulfillments) {
        this.bppFulfillments = bppFulfillments;
    }

    @JsonProperty("bpp/descriptor")
    public BppDescriptor getBppDescriptor() {
        return bppDescriptor;
    }

    @JsonProperty("bpp/descriptor")
    public void setBppDescriptor(BppDescriptor bppDescriptor) {
        this.bppDescriptor = bppDescriptor;
    }

    @JsonProperty("bpp/providers")
    public List<BppProvider> getBppProviders() {
        return bppProviders;
    }

    @JsonProperty("bpp/providers")
    public void setBppProviders(List<BppProvider> bppProviders) {
        this.bppProviders = bppProviders;
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
        sb.append(Catalog.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bppFulfillments");
        sb.append('=');
        sb.append(((this.bppFulfillments == null)?"<null>":this.bppFulfillments));
        sb.append(',');
        sb.append("bppDescriptor");
        sb.append('=');
        sb.append(((this.bppDescriptor == null)?"<null>":this.bppDescriptor));
        sb.append(',');
        sb.append("bppProviders");
        sb.append('=');
        sb.append(((this.bppProviders == null)?"<null>":this.bppProviders));
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
