
package com.vinculum.ondc.objects.response.onconfirm.multipleorders;

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
    "instructions",
    "contact"
})
@Generated("jsonschema2pojo")
public class Start implements Serializable
{

    @JsonProperty("location")
    private Location__1 location;
    @JsonProperty("time")
    private Time time;
    @JsonProperty("instructions")
    private Instructions instructions;
    @JsonProperty("contact")
    private Contact contact;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 127724716099778038L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Start() {
    }

    /**
     * 
     * @param instructions
     * @param contact
     * @param location
     * @param time
     */
    public Start(Location__1 location, Time time, Instructions instructions, Contact contact) {
        super();
        this.location = location;
        this.time = time;
        this.instructions = instructions;
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

    @JsonProperty("instructions")
    public Instructions getInstructions() {
        return instructions;
    }

    @JsonProperty("instructions")
    public void setInstructions(Instructions instructions) {
        this.instructions = instructions;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Start.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("time");
        sb.append('=');
        sb.append(((this.time == null)?"<null>":this.time));
        sb.append(',');
        sb.append("instructions");
        sb.append('=');
        sb.append(((this.instructions == null)?"<null>":this.instructions));
        sb.append(',');
        sb.append("contact");
        sb.append('=');
        sb.append(((this.contact == null)?"<null>":this.contact));
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
