
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
    "fulfillments",
    "descriptor",
    "@ondc/org/fssai_license_no",
    "ttl",
    "locations",
    "categories",
    "items",
    "tags"
})
@Generated("jsonschema2pojo")
public class BppProvider implements Serializable
{

    @JsonProperty("id")
    private String id;
    @JsonProperty("time")
    private Time time;
    @JsonProperty("fulfillments")
    private List<Fulfillment> fulfillments;
    @JsonProperty("descriptor")
    private Descriptor descriptor;
    @JsonProperty("@ondc/org/fssai_license_no")
    private String ondcOrgFssaiLicenseNo;
    @JsonProperty("ttl")
    private String ttl;
    @JsonProperty("locations")
    private List<Location> locations;
    @JsonProperty("categories")
    private List<Category> categories;
    @JsonProperty("items")
    private List<Item> items;
    @JsonProperty("tags")
    private List<Tag__2> tags;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 3186286221379785859L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public BppProvider() {
    }

    /**
     * 
     * @param fulfillments
     * @param locations
     * @param id
     * @param time
     * @param descriptor
     * @param categories
     * @param ttl
     * @param items
     * @param ondcOrgFssaiLicenseNo
     * @param tags
     */
    public BppProvider(String id, Time time, List<Fulfillment> fulfillments, Descriptor descriptor, String ondcOrgFssaiLicenseNo, String ttl, List<Location> locations, List<Category> categories, List<Item> items, List<Tag__2> tags) {
        super();
        this.id = id;
        this.time = time;
        this.fulfillments = fulfillments;
        this.descriptor = descriptor;
        this.ondcOrgFssaiLicenseNo = ondcOrgFssaiLicenseNo;
        this.ttl = ttl;
        this.locations = locations;
        this.categories = categories;
        this.items = items;
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
    public Time getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(Time time) {
        this.time = time;
    }

    @JsonProperty("fulfillments")
    public List<Fulfillment> getFulfillments() {
        return fulfillments;
    }

    @JsonProperty("fulfillments")
    public void setFulfillments(List<Fulfillment> fulfillments) {
        this.fulfillments = fulfillments;
    }

    @JsonProperty("descriptor")
    public Descriptor getDescriptor() {
        return descriptor;
    }

    @JsonProperty("descriptor")
    public void setDescriptor(Descriptor descriptor) {
        this.descriptor = descriptor;
    }

    @JsonProperty("@ondc/org/fssai_license_no")
    public String getOndcOrgFssaiLicenseNo() {
        return ondcOrgFssaiLicenseNo;
    }

    @JsonProperty("@ondc/org/fssai_license_no")
    public void setOndcOrgFssaiLicenseNo(String ondcOrgFssaiLicenseNo) {
        this.ondcOrgFssaiLicenseNo = ondcOrgFssaiLicenseNo;
    }

    @JsonProperty("ttl")
    public String getTtl() {
        return ttl;
    }

    @JsonProperty("ttl")
    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    @JsonProperty("locations")
    public List<Location> getLocations() {
        return locations;
    }

    @JsonProperty("locations")
    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    @JsonProperty("categories")
    public List<Category> getCategories() {
        return categories;
    }

    @JsonProperty("categories")
    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    @JsonProperty("items")
    public List<Item> getItems() {
        return items;
    }

    @JsonProperty("items")
    public void setItems(List<Item> items) {
        this.items = items;
    }

    @JsonProperty("tags")
    public List<Tag__2> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<Tag__2> tags) {
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
