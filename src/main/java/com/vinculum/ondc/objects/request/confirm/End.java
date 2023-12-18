
package com.vinculum.ondc.objects.request.confirm;

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
    "person",
    "contact",
    "location"
})
@Generated("jsonschema2pojo")
public class End implements Serializable
{

    @JsonProperty("person")
    private Person person;
    @JsonProperty("contact")
    private Contact contact;
    @JsonProperty("location")
    private Location__1 location;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -8560770218487578079L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public End() {
    }

    /**
     * 
     * @param person
     * @param contact
     * @param location
     */
    public End(Person person, Contact contact, Location__1 location) {
        super();
        this.person = person;
        this.contact = contact;
        this.location = location;
    }

    @JsonProperty("person")
    public Person getPerson() {
        return person;
    }

    @JsonProperty("person")
    public void setPerson(Person person) {
        this.person = person;
    }

    @JsonProperty("contact")
    public Contact getContact() {
        return contact;
    }

    @JsonProperty("contact")
    public void setContact(Contact contact) {
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
        sb.append(End.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("person");
        sb.append('=');
        sb.append(((this.person == null)?"<null>":this.person));
        sb.append(',');
        sb.append("contact");
        sb.append('=');
        sb.append(((this.contact == null)?"<null>":this.contact));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
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
