
package com.vinculum.ondc.objects.response.oncancel;

import java.io.Serializable;
import java.util.LinkedHashMap;
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
    "@ondc/org/item_id",
    "@ondc/org/item_quantity",
    "title",
    "@ondc/org/title_type",
    "price",
    "item"
})
@Generated("jsonschema2pojo")
public class Breakup implements Serializable
{

    @JsonProperty("@ondc/org/item_id")
    private String ondcOrgItemId;
    @JsonProperty("@ondc/org/item_quantity")
    private OndcOrgItemQuantity ondcOrgItemQuantity;
    @JsonProperty("title")
    private String title;
    @JsonProperty("@ondc/org/title_type")
    private String ondcOrgTitleType;
    @JsonProperty("price")
    private Price__1 price;
    @JsonProperty("item")
    private Item__1 item;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -5753209158450190006L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Breakup() {
    }

    /**
     * 
     * @param item
     * @param price
     * @param ondcOrgItemQuantity
     * @param title
     * @param ondcOrgTitleType
     * @param ondcOrgItemId
     */
    public Breakup(String ondcOrgItemId, OndcOrgItemQuantity ondcOrgItemQuantity, String title, String ondcOrgTitleType, Price__1 price, Item__1 item) {
        super();
        this.ondcOrgItemId = ondcOrgItemId;
        this.ondcOrgItemQuantity = ondcOrgItemQuantity;
        this.title = title;
        this.ondcOrgTitleType = ondcOrgTitleType;
        this.price = price;
        this.item = item;
    }

    @JsonProperty("@ondc/org/item_id")
    public String getOndcOrgItemId() {
        return ondcOrgItemId;
    }

    @JsonProperty("@ondc/org/item_id")
    public void setOndcOrgItemId(String ondcOrgItemId) {
        this.ondcOrgItemId = ondcOrgItemId;
    }

    @JsonProperty("@ondc/org/item_quantity")
    public OndcOrgItemQuantity getOndcOrgItemQuantity() {
        return ondcOrgItemQuantity;
    }

    @JsonProperty("@ondc/org/item_quantity")
    public void setOndcOrgItemQuantity(OndcOrgItemQuantity ondcOrgItemQuantity) {
        this.ondcOrgItemQuantity = ondcOrgItemQuantity;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("@ondc/org/title_type")
    public String getOndcOrgTitleType() {
        return ondcOrgTitleType;
    }

    @JsonProperty("@ondc/org/title_type")
    public void setOndcOrgTitleType(String ondcOrgTitleType) {
        this.ondcOrgTitleType = ondcOrgTitleType;
    }

    @JsonProperty("price")
    public Price__1 getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Price__1 price) {
        this.price = price;
    }

    @JsonProperty("item")
    public Item__1 getItem() {
        return item;
    }

    @JsonProperty("item")
    public void setItem(Item__1 item) {
        this.item = item;
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
