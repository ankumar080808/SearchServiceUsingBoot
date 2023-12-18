
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
    "gps",
    "radius"
})
@Generated("jsonschema2pojo")
public class Circle implements Serializable
{

    @JsonProperty("gps")
    private String gps;
    @JsonProperty("radius")
    private Radius radius;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -55766129240897168L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Circle() {
    }

    /**
     * 
     * @param gps
     * @param radius
     */
    public Circle(String gps, Radius radius) {
        super();
        this.gps = gps;
        this.radius = radius;
    }

    @JsonProperty("gps")
    public String getGps() {
        return gps;
    }

    @JsonProperty("gps")
    public void setGps(String gps) {
        this.gps = gps;
    }

    @JsonProperty("radius")
    public Radius getRadius() {
        return radius;
    }

    @JsonProperty("radius")
    public void setRadius(Radius radius) {
        this.radius = radius;
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
