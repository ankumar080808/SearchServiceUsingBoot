
package com.vinculum.ondc.objects.response.onsearch.fb;

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
    "id",
    "time",
    "gps",
    "address",
    "circle"
})
@Generated("jsonschema2pojo")
public class Location implements Serializable
{

    @JsonProperty("id")
    private String id;
    @JsonProperty("time")
    private Time__1 time;
    @JsonProperty("gps")
    private String gps;
    @JsonProperty("address")
    private Address address;
    @JsonProperty("circle")
    private Circle circle;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 3276021593547576601L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Location() {
    }

    /**
     * 
     * @param address
     * @param id
     * @param time
     * @param gps
     * @param circle
     */
    public Location(String id, Time__1 time, String gps, Address address, Circle circle) {
        super();
        this.id = id;
        this.time = time;
        this.gps = gps;
        this.address = address;
        this.circle = circle;
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
    public Time__1 getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(Time__1 time) {
        this.time = time;
    }

    @JsonProperty("gps")
    public String getGps() {
        return gps;
    }

    @JsonProperty("gps")
    public void setGps(String gps) {
        this.gps = gps;
    }

    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    @JsonProperty("circle")
    public Circle getCircle() {
        return circle;
    }

    @JsonProperty("circle")
    public void setCircle(Circle circle) {
        this.circle = circle;
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
