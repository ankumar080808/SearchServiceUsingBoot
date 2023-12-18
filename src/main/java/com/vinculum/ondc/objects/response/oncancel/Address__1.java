
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
    "locality",
    "city",
    "area_code",
    "state"
})
@Generated("jsonschema2pojo")
public class Address__1 implements Serializable
{

    @JsonProperty("locality")
    private String locality;
    @JsonProperty("city")
    private String city;
    @JsonProperty("area_code")
    private String areaCode;
    @JsonProperty("state")
    private String state;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -1386253477239324728L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Address__1() {
    }

    /**
     * 
     * @param areaCode
     * @param city
     * @param locality
     * @param state
     */
    public Address__1(String locality, String city, String areaCode, String state) {
        super();
        this.locality = locality;
        this.city = city;
        this.areaCode = areaCode;
        this.state = state;
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

    @JsonProperty("area_code")
    public String getAreaCode() {
        return areaCode;
    }

    @JsonProperty("area_code")
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
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
