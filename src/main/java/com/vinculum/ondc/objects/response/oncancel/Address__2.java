
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
    "name",
    "building",
    "locality",
    "city",
    "state",
    "country",
    "area_code"
})
@Generated("jsonschema2pojo")
public class Address__2 implements Serializable
{

    @JsonProperty("name")
    private String name;
    @JsonProperty("building")
    private String building;
    @JsonProperty("locality")
    private String locality;
    @JsonProperty("city")
    private String city;
    @JsonProperty("state")
    private String state;
    @JsonProperty("country")
    private String country;
    @JsonProperty("area_code")
    private String areaCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -4722932069874977656L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Address__2() {
    }

    /**
     * 
     * @param country
     * @param areaCode
     * @param city
     * @param name
     * @param locality
     * @param state
     * @param building
     */
    public Address__2(String name, String building, String locality, String city, String state, String country, String areaCode) {
        super();
        this.name = name;
        this.building = building;
        this.locality = locality;
        this.city = city;
        this.state = state;
        this.country = country;
        this.areaCode = areaCode;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("building")
    public String getBuilding() {
        return building;
    }

    @JsonProperty("building")
    public void setBuilding(String building) {
        this.building = building;
    }

    @JsonProperty("locality")
    public String getLocality() {
        return locality;
    }

    @JsonProperty("locality")
    public void setLocality(String locality) {
        this.locality = locality;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("area_code")
    public String getAreaCode() {
        return areaCode;
    }

    @JsonProperty("area_code")
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
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
