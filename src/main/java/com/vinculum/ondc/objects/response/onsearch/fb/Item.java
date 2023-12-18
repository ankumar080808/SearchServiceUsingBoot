
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
    "id",
    "time",
    "descriptor",
    "quantity",
    "price",
    "category_id",
    "category_ids",
    "fulfillment_id",
    "location_id",
    "related",
    "recommended",
    "@ondc/org/returnable",
    "@ondc/org/cancellable",
    "@ondc/org/return_window",
    "@ondc/org/seller_pickup_return",
    "@ondc/org/time_to_ship",
    "@ondc/org/available_on_cod",
    "@ondc/org/contact_details_consumer_care",
    "tags"
})
@Generated("jsonschema2pojo")
public class Item implements Serializable
{

    @JsonProperty("id")
    private String id;
    @JsonProperty("time")
    private Time__2 time;
    @JsonProperty("descriptor")
    private Descriptor__2 descriptor;
    @JsonProperty("quantity")
    private Quantity quantity;
    @JsonProperty("price")
    private Price price;
    @JsonProperty("category_id")
    private String categoryId;
    @JsonProperty("category_ids")
    private List<String> categoryIds;
    @JsonProperty("fulfillment_id")
    private String fulfillmentId;
    @JsonProperty("location_id")
    private String locationId;
    @JsonProperty("related")
    private boolean related;
    @JsonProperty("recommended")
    private boolean recommended;
    @JsonProperty("@ondc/org/returnable")
    private boolean ondcOrgReturnable;
    @JsonProperty("@ondc/org/cancellable")
    private boolean ondcOrgCancellable;
    @JsonProperty("@ondc/org/return_window")
    private String ondcOrgReturnWindow;
    @JsonProperty("@ondc/org/seller_pickup_return")
    private boolean ondcOrgSellerPickupReturn;
    @JsonProperty("@ondc/org/time_to_ship")
    private String ondcOrgTimeToShip;
    @JsonProperty("@ondc/org/available_on_cod")
    private boolean ondcOrgAvailableOnCod;
    @JsonProperty("@ondc/org/contact_details_consumer_care")
    private String ondcOrgContactDetailsConsumerCare;
    @JsonProperty("tags")
    private List<Tag__1> tags;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 4061846170169174161L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Item() {
    }

    /**
     * 
     * @param fulfillmentId
     * @param ondcOrgSellerPickupReturn
     * @param quantity
     * @param ondcOrgAvailableOnCod
     * @param ondcOrgCancellable
     * @param descriptor
     * @param recommended
     * @param tags
     * @param ondcOrgReturnWindow
     * @param categoryIds
     * @param ondcOrgTimeToShip
     * @param related
     * @param price
     * @param locationId
     * @param ondcOrgReturnable
     * @param id
     * @param time
     * @param ondcOrgContactDetailsConsumerCare
     * @param categoryId
     */
    public Item(String id, Time__2 time, Descriptor__2 descriptor, Quantity quantity, Price price, String categoryId, List<String> categoryIds, String fulfillmentId, String locationId, boolean related, boolean recommended, boolean ondcOrgReturnable, boolean ondcOrgCancellable, String ondcOrgReturnWindow, boolean ondcOrgSellerPickupReturn, String ondcOrgTimeToShip, boolean ondcOrgAvailableOnCod, String ondcOrgContactDetailsConsumerCare, List<Tag__1> tags) {
        super();
        this.id = id;
        this.time = time;
        this.descriptor = descriptor;
        this.quantity = quantity;
        this.price = price;
        this.categoryId = categoryId;
        this.categoryIds = categoryIds;
        this.fulfillmentId = fulfillmentId;
        this.locationId = locationId;
        this.related = related;
        this.recommended = recommended;
        this.ondcOrgReturnable = ondcOrgReturnable;
        this.ondcOrgCancellable = ondcOrgCancellable;
        this.ondcOrgReturnWindow = ondcOrgReturnWindow;
        this.ondcOrgSellerPickupReturn = ondcOrgSellerPickupReturn;
        this.ondcOrgTimeToShip = ondcOrgTimeToShip;
        this.ondcOrgAvailableOnCod = ondcOrgAvailableOnCod;
        this.ondcOrgContactDetailsConsumerCare = ondcOrgContactDetailsConsumerCare;
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

    @JsonProperty("time")
    public Time__2 getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(Time__2 time) {
        this.time = time;
    }

    @JsonProperty("descriptor")
    public Descriptor__2 getDescriptor() {
        return descriptor;
    }

    @JsonProperty("descriptor")
    public void setDescriptor(Descriptor__2 descriptor) {
        this.descriptor = descriptor;
    }

    @JsonProperty("quantity")
    public Quantity getQuantity() {
        return quantity;
    }

    @JsonProperty("quantity")
    public void setQuantity(Quantity quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("price")
    public Price getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Price price) {
        this.price = price;
    }

    @JsonProperty("category_id")
    public String getCategoryId() {
        return categoryId;
    }

    @JsonProperty("category_id")
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    @JsonProperty("category_ids")
    public List<String> getCategoryIds() {
        return categoryIds;
    }

    @JsonProperty("category_ids")
    public void setCategoryIds(List<String> categoryIds) {
        this.categoryIds = categoryIds;
    }

    @JsonProperty("fulfillment_id")
    public String getFulfillmentId() {
        return fulfillmentId;
    }

    @JsonProperty("fulfillment_id")
    public void setFulfillmentId(String fulfillmentId) {
        this.fulfillmentId = fulfillmentId;
    }

    @JsonProperty("location_id")
    public String getLocationId() {
        return locationId;
    }

    @JsonProperty("location_id")
    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    @JsonProperty("related")
    public boolean isRelated() {
        return related;
    }

    @JsonProperty("related")
    public void setRelated(boolean related) {
        this.related = related;
    }

    @JsonProperty("recommended")
    public boolean isRecommended() {
        return recommended;
    }

    @JsonProperty("recommended")
    public void setRecommended(boolean recommended) {
        this.recommended = recommended;
    }

    @JsonProperty("@ondc/org/returnable")
    public boolean isOndcOrgReturnable() {
        return ondcOrgReturnable;
    }

    @JsonProperty("@ondc/org/returnable")
    public void setOndcOrgReturnable(boolean ondcOrgReturnable) {
        this.ondcOrgReturnable = ondcOrgReturnable;
    }

    @JsonProperty("@ondc/org/cancellable")
    public boolean isOndcOrgCancellable() {
        return ondcOrgCancellable;
    }

    @JsonProperty("@ondc/org/cancellable")
    public void setOndcOrgCancellable(boolean ondcOrgCancellable) {
        this.ondcOrgCancellable = ondcOrgCancellable;
    }

    @JsonProperty("@ondc/org/return_window")
    public String getOndcOrgReturnWindow() {
        return ondcOrgReturnWindow;
    }

    @JsonProperty("@ondc/org/return_window")
    public void setOndcOrgReturnWindow(String ondcOrgReturnWindow) {
        this.ondcOrgReturnWindow = ondcOrgReturnWindow;
    }

    @JsonProperty("@ondc/org/seller_pickup_return")
    public boolean isOndcOrgSellerPickupReturn() {
        return ondcOrgSellerPickupReturn;
    }

    @JsonProperty("@ondc/org/seller_pickup_return")
    public void setOndcOrgSellerPickupReturn(boolean ondcOrgSellerPickupReturn) {
        this.ondcOrgSellerPickupReturn = ondcOrgSellerPickupReturn;
    }

    @JsonProperty("@ondc/org/time_to_ship")
    public String getOndcOrgTimeToShip() {
        return ondcOrgTimeToShip;
    }

    @JsonProperty("@ondc/org/time_to_ship")
    public void setOndcOrgTimeToShip(String ondcOrgTimeToShip) {
        this.ondcOrgTimeToShip = ondcOrgTimeToShip;
    }

    @JsonProperty("@ondc/org/available_on_cod")
    public boolean isOndcOrgAvailableOnCod() {
        return ondcOrgAvailableOnCod;
    }

    @JsonProperty("@ondc/org/available_on_cod")
    public void setOndcOrgAvailableOnCod(boolean ondcOrgAvailableOnCod) {
        this.ondcOrgAvailableOnCod = ondcOrgAvailableOnCod;
    }

    @JsonProperty("@ondc/org/contact_details_consumer_care")
    public String getOndcOrgContactDetailsConsumerCare() {
        return ondcOrgContactDetailsConsumerCare;
    }

    @JsonProperty("@ondc/org/contact_details_consumer_care")
    public void setOndcOrgContactDetailsConsumerCare(String ondcOrgContactDetailsConsumerCare) {
        this.ondcOrgContactDetailsConsumerCare = ondcOrgContactDetailsConsumerCare;
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

}
