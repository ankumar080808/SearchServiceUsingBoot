package com.vinculum.ondc.objects.response.oninit.multipleresponse;

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
    "parent_item_id",
    "quantity",
    "price",
    "tags"
})
@Generated("jsonschema2pojo")
public class Item__1 implements Serializable
{

    @JsonProperty("parent_item_id")
    private String parentItemId;
    @JsonProperty("quantity")
    private Quantity__1 quantity;
    @JsonProperty("price")
    private Price__2 price;
    @JsonProperty("tags")
    private List<Tag__1> tags;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -4490104461959642233L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Item__1() {
    }

    /**
     * 
     * @param quantity
     * @param parentItemId
     * @param price
     * @param tags
     */
    public Item__1(String parentItemId, Quantity__1 quantity, Price__2 price, List<Tag__1> tags) {
        super();
        this.parentItemId = parentItemId;
        this.quantity = quantity;
        this.price = price;
        this.tags = tags;
    }

    @JsonProperty("parent_item_id")
    public String getParentItemId() {
        return parentItemId;
    }

    @JsonProperty("parent_item_id")
    public void setParentItemId(String parentItemId) {
        this.parentItemId = parentItemId;
    }

    @JsonProperty("quantity")
    public Quantity__1 getQuantity() {
        return quantity;
    }

    @JsonProperty("quantity")
    public void setQuantity(Quantity__1 quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("price")
    public Price__2 getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Price__2 price) {
        this.price = price;
    }

    @JsonProperty("tags")
    public List<Tag__1> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<Tag__1> tags) {
        this.tags = tags;
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
        sb.append(Item__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("parentItemId");
        sb.append('=');
        sb.append(((this.parentItemId == null)?"<null>":this.parentItemId));
        sb.append(',');
        sb.append("quantity");
        sb.append('=');
        sb.append(((this.quantity == null)?"<null>":this.quantity));
        sb.append(',');
        sb.append("price");
        sb.append('=');
        sb.append(((this.price == null)?"<null>":this.price));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
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
