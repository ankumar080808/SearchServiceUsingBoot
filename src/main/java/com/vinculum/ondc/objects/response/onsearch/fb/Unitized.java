
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
    "measure"
})
@Generated("jsonschema2pojo")
public class Unitized implements Serializable
{

    @JsonProperty("measure")
    private Measure measure;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 6756442121906074903L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Unitized() {
    }

    /**
     * 
     * @param measure
     */
    public Unitized(Measure measure) {
        super();
        this.measure = measure;
    }

    @JsonProperty("measure")
    public Measure getMeasure() {
        return measure;
    }

    @JsonProperty("measure")
    public void setMeasure(Measure measure) {
        this.measure = measure;
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
