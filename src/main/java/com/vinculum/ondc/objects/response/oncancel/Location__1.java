
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
    "id",
    "descriptor",
    "gps",
    "address"
})
@Generated("jsonschema2pojo")
public class Location__1 implements Serializable
{

    @JsonProperty("id")
    private String id;
    @JsonProperty("descriptor")
    private Descriptor__1 descriptor;
    @JsonProperty("gps")
    private String gps;
    @JsonProperty("address")
    private Address__1 address;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -9140176588458413713L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Location__1() {
    }

    /**
     * 
     * @param address
     * @param id
     * @param descriptor
     * @param gps
     */
    public Location__1(String id, Descriptor__1 descriptor, String gps, Address__1 address) {
        super();
        this.id = id;
        this.descriptor = descriptor;
        this.gps = gps;
        this.address = address;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("descriptor")
    public Descriptor__1 getDescriptor() {
        return descriptor;
    }

    @JsonProperty("descriptor")
    public void setDescriptor(Descriptor__1 descriptor) {
        this.descriptor = descriptor;
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
    public Address__1 getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(Address__1 address) {
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
