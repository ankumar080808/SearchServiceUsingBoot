
package com.vinculum.ondc.objects.response.onsearch.homekitchen;

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
    private final static long serialVersionUID = 4634920498213865442L;

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Unitized.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("measure");
        sb.append('=');
        sb.append(((this.measure == null)?"<null>":this.measure));
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
