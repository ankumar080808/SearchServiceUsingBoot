package com.vinculum.ondc.objects.request.select;

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
    "id",
    "parent_item_id",
    "location_id",
    "quantity",
    "tags"
})
@Generated("jsonschema2pojo")
public class Item {

    @JsonProperty("id")
    private String id;
    @JsonProperty("parent_item_id")
    private String parentItemId;
    @JsonProperty("location_id")
    private String locationId;
    @JsonProperty("quantity")
    @Valid
    private Quantity quantity;
    @JsonProperty("tags")
    @Valid
    private List<Tag> tags;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Item() {
    }

    /**
     * 
     * @param quantity
     * @param parentItemId
     * @param locationId
     * @param id
     * @param tags
     */
    public Item(String id, String parentItemId, String locationId, Quantity quantity, List<Tag> tags) {
        super();
        this.id = id;
        this.parentItemId = parentItemId;
        this.locationId = locationId;
        this.quantity = quantity;
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

    @JsonProperty("parent_item_id")
    public String getParentItemId() {
        return parentItemId;
    }

    @JsonProperty("parent_item_id")
    public void setParentItemId(String parentItemId) {
        this.parentItemId = parentItemId;
    }

    @JsonProperty("location_id")
    public String getLocationId() {
        return locationId;
    }

    @JsonProperty("location_id")
    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    @JsonProperty("quantity")
    public Quantity getQuantity() {
        return quantity;
    }

    @JsonProperty("quantity")
    public void setQuantity(Quantity quantity) {
        this.quantity = quantity;
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
        sb.append("parentItemId");
        sb.append('=');
        sb.append(((this.parentItemId == null)?"<null>":this.parentItemId));
        sb.append(',');
        sb.append("locationId");
        sb.append('=');
        sb.append(((this.locationId == null)?"<null>":this.locationId));
        sb.append(',');
        sb.append("quantity");
        sb.append('=');
        sb.append(((this.quantity == null)?"<null>":this.quantity));
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
