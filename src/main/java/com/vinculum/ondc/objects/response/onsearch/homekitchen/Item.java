
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
    "id",
    "time",
    "descriptor",
    "quantity",
    "price",
    "category_id",
    "fulfillment_id",
    "location_id",
    "@ondc/org/returnable",
    "@ondc/org/cancellable",
    "@ondc/org/return_window",
    "@ondc/org/seller_pickup_return",
    "@ondc/org/time_to_ship",
    "@ondc/org/available_on_cod",
    "@ondc/org/contact_details_consumer_care",
    "@ondc/org/statutory_reqs_packaged_commodities",
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
    private Descriptor__1 descriptor;
    @JsonProperty("quantity")
    private Quantity quantity;
    @JsonProperty("price")
    private Price price;
    @JsonProperty("category_id")
    private String categoryId;
    @JsonProperty("fulfillment_id")
    private String fulfillmentId;
    @JsonProperty("location_id")
    private String locationId;
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
    @JsonProperty("@ondc/org/statutory_reqs_packaged_commodities")
    private OndcOrgStatutoryReqsPackagedCommodities ondcOrgStatutoryReqsPackagedCommodities;
    @JsonProperty("tags")
    private List<Tag> tags;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 8657116274462259146L;

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
     * @param tags
     * @param ondcOrgReturnWindow
     * @param ondcOrgTimeToShip
     * @param price
     * @param locationId
     * @param ondcOrgStatutoryReqsPackagedCommodities
     * @param ondcOrgReturnable
     * @param id
     * @param time
     * @param ondcOrgContactDetailsConsumerCare
     * @param categoryId
     */
    public Item(String id, Time__2 time, Descriptor__1 descriptor, Quantity quantity, Price price, String categoryId, String fulfillmentId, String locationId, boolean ondcOrgReturnable, boolean ondcOrgCancellable, String ondcOrgReturnWindow, boolean ondcOrgSellerPickupReturn, String ondcOrgTimeToShip, boolean ondcOrgAvailableOnCod, String ondcOrgContactDetailsConsumerCare, OndcOrgStatutoryReqsPackagedCommodities ondcOrgStatutoryReqsPackagedCommodities, List<Tag> tags) {
        super();
        this.id = id;
        this.time = time;
        this.descriptor = descriptor;
        this.quantity = quantity;
        this.price = price;
        this.categoryId = categoryId;
        this.fulfillmentId = fulfillmentId;
        this.locationId = locationId;
        this.ondcOrgReturnable = ondcOrgReturnable;
        this.ondcOrgCancellable = ondcOrgCancellable;
        this.ondcOrgReturnWindow = ondcOrgReturnWindow;
        this.ondcOrgSellerPickupReturn = ondcOrgSellerPickupReturn;
        this.ondcOrgTimeToShip = ondcOrgTimeToShip;
        this.ondcOrgAvailableOnCod = ondcOrgAvailableOnCod;
        this.ondcOrgContactDetailsConsumerCare = ondcOrgContactDetailsConsumerCare;
        this.ondcOrgStatutoryReqsPackagedCommodities = ondcOrgStatutoryReqsPackagedCommodities;
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
    public Descriptor__1 getDescriptor() {
        return descriptor;
    }

    @JsonProperty("descriptor")
    public void setDescriptor(Descriptor__1 descriptor) {
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

    @JsonProperty("@ondc/org/statutory_reqs_packaged_commodities")
    public OndcOrgStatutoryReqsPackagedCommodities getOndcOrgStatutoryReqsPackagedCommodities() {
        return ondcOrgStatutoryReqsPackagedCommodities;
    }

    @JsonProperty("@ondc/org/statutory_reqs_packaged_commodities")
    public void setOndcOrgStatutoryReqsPackagedCommodities(OndcOrgStatutoryReqsPackagedCommodities ondcOrgStatutoryReqsPackagedCommodities) {
        this.ondcOrgStatutoryReqsPackagedCommodities = ondcOrgStatutoryReqsPackagedCommodities;
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
        sb.append("time");
        sb.append('=');
        sb.append(((this.time == null)?"<null>":this.time));
        sb.append(',');
        sb.append("descriptor");
        sb.append('=');
        sb.append(((this.descriptor == null)?"<null>":this.descriptor));
        sb.append(',');
        sb.append("quantity");
        sb.append('=');
        sb.append(((this.quantity == null)?"<null>":this.quantity));
        sb.append(',');
        sb.append("price");
        sb.append('=');
        sb.append(((this.price == null)?"<null>":this.price));
        sb.append(',');
        sb.append("categoryId");
        sb.append('=');
        sb.append(((this.categoryId == null)?"<null>":this.categoryId));
        sb.append(',');
        sb.append("fulfillmentId");
        sb.append('=');
        sb.append(((this.fulfillmentId == null)?"<null>":this.fulfillmentId));
        sb.append(',');
        sb.append("locationId");
        sb.append('=');
        sb.append(((this.locationId == null)?"<null>":this.locationId));
        sb.append(',');
        sb.append("ondcOrgReturnable");
        sb.append('=');
        sb.append(this.ondcOrgReturnable);
        sb.append(',');
        sb.append("ondcOrgCancellable");
        sb.append('=');
        sb.append(this.ondcOrgCancellable);
        sb.append(',');
        sb.append("ondcOrgReturnWindow");
        sb.append('=');
        sb.append(((this.ondcOrgReturnWindow == null)?"<null>":this.ondcOrgReturnWindow));
        sb.append(',');
        sb.append("ondcOrgSellerPickupReturn");
        sb.append('=');
        sb.append(this.ondcOrgSellerPickupReturn);
        sb.append(',');
        sb.append("ondcOrgTimeToShip");
        sb.append('=');
        sb.append(((this.ondcOrgTimeToShip == null)?"<null>":this.ondcOrgTimeToShip));
        sb.append(',');
        sb.append("ondcOrgAvailableOnCod");
        sb.append('=');
        sb.append(this.ondcOrgAvailableOnCod);
        sb.append(',');
        sb.append("ondcOrgContactDetailsConsumerCare");
        sb.append('=');
        sb.append(((this.ondcOrgContactDetailsConsumerCare == null)?"<null>":this.ondcOrgContactDetailsConsumerCare));
        sb.append(',');
        sb.append("ondcOrgStatutoryReqsPackagedCommodities");
        sb.append('=');
        sb.append(((this.ondcOrgStatutoryReqsPackagedCommodities == null)?"<null>":this.ondcOrgStatutoryReqsPackagedCommodities));
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
