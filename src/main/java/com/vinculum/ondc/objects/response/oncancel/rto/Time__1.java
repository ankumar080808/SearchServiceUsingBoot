
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
    "range"
})
@Generated("jsonschema2pojo")
public class Time__1 implements Serializable
{

    @JsonProperty("range")
    private Range__1 range;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 7132640031460618718L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Time__1() {
    }

    /**
     * 
     * @param range
     */
    public Time__1(Range__1 range) {
        super();
        this.range = range;
    }

    @JsonProperty("range")
    public Range__1 getRange() {
        return range;
    }

    @JsonProperty("range")
    public void setRange(Range__1 range) {
        this.range = range;
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
