package com.vinculum.ondc.objects.request.init;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "provider",
    "items",
    "billing",
    "fulfillments"
})
@Generated("jsonschema2pojo")
public class Order implements Serializable
{

    @JsonProperty("provider")
    @Valid
    private Provider provider;
    @JsonProperty("items")
    @Valid
    private List<Item> items = new ArrayList<Item>();
    @JsonProperty("billing")
    @Valid
    private Billing billing;
    @JsonProperty("fulfillments")
    @Valid
    private List<Fulfillment> fulfillments = new ArrayList<Fulfillment>();
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -2789750067525260971L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Order() {
    }

    /**
     * 
     * @param fulfillments
     * @param provider
     * @param items
     * @param billing
     */
    public Order(Provider provider, List<Item> items, Billing billing, List<Fulfillment> fulfillments) {
        super();
        this.provider = provider;
        this.items = items;
        this.billing = billing;
        this.fulfillments = fulfillments;
    }

    @JsonProperty("provider")
    public Provider getProvider() {
        return provider;
    }

    @JsonProperty("provider")
    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    @JsonProperty("items")
    public List<Item> getItems() {
        return items;
    }

    @JsonProperty("items")
    public void setItems(List<Item> items) {
        this.items = items;
    }

    @JsonProperty("billing")
    public Billing getBilling() {
        return billing;
    }

    @JsonProperty("billing")
    public void setBilling(Billing billing) {
        this.billing = billing;
    }

    @JsonProperty("fulfillments")
    public List<Fulfillment> getFulfillments() {
        return fulfillments;
    }

    @JsonProperty("fulfillments")
    public void setFulfillments(List<Fulfillment> fulfillments) {
        this.fulfillments = fulfillments;
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
        sb.append(Order.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("provider");
        sb.append('=');
        sb.append(((this.provider == null)?"<null>":this.provider));
        sb.append(',');
        sb.append("items");
        sb.append('=');
        sb.append(((this.items == null)?"<null>":this.items));
        sb.append(',');
        sb.append("billing");
        sb.append('=');
        sb.append(((this.billing == null)?"<null>":this.billing));
        sb.append(',');
        sb.append("fulfillments");
        sb.append('=');
        sb.append(((this.fulfillments == null)?"<null>":this.fulfillments));
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
