
package com.vinculum.ondc.objects.response.oncancel.rto;

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
    "location",
    "time",
    "contact"
})
@Generated("jsonschema2pojo")
public class Start implements Serializable
{

    @JsonProperty("location")
    private Location__1 location;
    @JsonProperty("time")
    private Time time;
    @JsonProperty("contact")
    private Contact contact;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -6150572657985238660L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Start() {
    }

    /**
     * 
     * @param contact
     * @param location
     * @param time
     */
    public Start(Location__1 location, Time time, Contact contact) {
        super();
        this.location = location;
        this.time = time;
        this.contact = contact;
    }

    @JsonProperty("location")
    public Location__1 getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location__1 location) {
        this.location = location;
    }

    @JsonProperty("time")
    public Time getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(Time time) {
        this.time = time;
    }

    @JsonProperty("contact")
    public Contact getContact() {
        return contact;
    }

    @JsonProperty("contact")
    public void setContact(Contact contact) {
        this.contact = contact;
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
