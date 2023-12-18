
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
    "gps",
    "address"
})
@Generated("jsonschema2pojo")
public class Location__2 implements Serializable
{

    @JsonProperty("gps")
    private String gps;
    @JsonProperty("address")
    private Address__2 address;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -6185280838131379584L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Location__2() {
    }

    /**
     * 
     * @param address
     * @param gps
     */
    public Location__2(String gps, Address__2 address) {
        super();
        this.gps = gps;
        this.address = address;
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
    public Address__2 getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(Address__2 address) {
        this.address = address;
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
