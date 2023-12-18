
package com.vinculum.ondc.objects.request.confirm;

import java.io.Serializable;
import java.util.ArrayList;
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
    "id",
    "state",
    "provider",
    "items",
    "billing",
    "fulfillments",
    "quote",
    "payment",
    "created_at",
    "updated_at"
})
@Generated("jsonschema2pojo")
public class Order implements Serializable
{

    @JsonProperty("id")
    private String id;
    @JsonProperty("state")
    private String state;
    @JsonProperty("provider")
    private Provider provider;
    @JsonProperty("items")
    private List<Item> items = new ArrayList<Item>();
    @JsonProperty("billing")
    private Billing billing;
    @JsonProperty("fulfillments")
    private List<Fulfillment> fulfillments = new ArrayList<Fulfillment>();
    @JsonProperty("quote")
    private Quote quote;
    @JsonProperty("payment")
    private Payment payment;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -6449284804870739978L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Order() {
    }

    /**
     * 
     * @param fulfillments
     * @param createdAt
     * @param quote
     * @param provider
     * @param payment
     * @param id
     * @param state
     * @param items
     * @param billing
     * @param updatedAt
     */
    public Order(String id, String state, Provider provider, List<Item> items, Billing billing, List<Fulfillment> fulfillments, Quote quote, Payment payment, String createdAt, String updatedAt) {
        super();
        this.id = id;
        this.state = state;
        this.provider = provider;
        this.items = items;
        this.billing = billing;
        this.fulfillments = fulfillments;
        this.quote = quote;
        this.payment = payment;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
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

    @JsonProperty("quote")
    public Quote getQuote() {
        return quote;
    }

    @JsonProperty("quote")
    public void setQuote(Quote quote) {
        this.quote = quote;
    }

    @JsonProperty("payment")
    public Payment getPayment() {
        return payment;
    }

    @JsonProperty("payment")
    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
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
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
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
        sb.append("quote");
        sb.append('=');
        sb.append(((this.quote == null)?"<null>":this.quote));
        sb.append(',');
        sb.append("payment");
        sb.append('=');
        sb.append(((this.payment == null)?"<null>":this.payment));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("updatedAt");
        sb.append('=');
        sb.append(((this.updatedAt == null)?"<null>":this.updatedAt));
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
