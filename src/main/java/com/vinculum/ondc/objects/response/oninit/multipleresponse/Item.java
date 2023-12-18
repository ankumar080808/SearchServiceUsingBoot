
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
    "id",
    "fulfillment_id",
    "quantity",
    "parent_item_id",
    "tags"
})
@Generated("jsonschema2pojo")
public class Item implements Serializable
{

    @JsonProperty("id")
    private String id;
    @JsonProperty("fulfillment_id")
    private String fulfillmentId;
    @JsonProperty("quantity")
    private Quantity quantity;
    @JsonProperty("parent_item_id")
    private String parentItemId;
    @JsonProperty("tags")
    private List<Tag> tags;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 8977421114963148775L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Item() {
    }

    /**
     * 
     * @param fulfillmentId
     * @param quantity
     * @param parentItemId
     * @param id
     * @param tags
     */
    public Item(String id, String fulfillmentId, Quantity quantity, String parentItemId, List<Tag> tags) {
        super();
        this.id = id;
        this.fulfillmentId = fulfillmentId;
        this.quantity = quantity;
        this.parentItemId = parentItemId;
        this.tags = tags;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("fulfillment_id")
    public String getFulfillmentId() {
        return fulfillmentId;
    }

    @JsonProperty("fulfillment_id")
    public void setFulfillmentId(String fulfillmentId) {
        this.fulfillmentId = fulfillmentId;
    }

    @JsonProperty("quantity")
    public Quantity getQuantity() {
        return quantity;
    }

    @JsonProperty("quantity")
    public void setQuantity(Quantity quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("parent_item_id")
    public String getParentItemId() {
        return parentItemId;
    }

    @JsonProperty("parent_item_id")
    public void setParentItemId(String parentItemId) {
        this.parentItemId = parentItemId;
    }

    @JsonProperty("tags")
    public List<Tag> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<Tag> tags) {
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
        sb.append(Item.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("fulfillmentId");
        sb.append('=');
        sb.append(((this.fulfillmentId == null)?"<null>":this.fulfillmentId));
        sb.append(',');
        sb.append("quantity");
        sb.append('=');
        sb.append(((this.quantity == null)?"<null>":this.quantity));
        sb.append(',');
        sb.append("parentItemId");
        sb.append('=');
        sb.append(((this.parentItemId == null)?"<null>":this.parentItemId));
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
