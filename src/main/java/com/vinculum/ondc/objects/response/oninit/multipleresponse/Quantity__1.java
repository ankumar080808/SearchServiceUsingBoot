
package com.vinculum.ondc.objects.response.oninit.multipleresponse;

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
    "available",
    "maximum"
})
@Generated("jsonschema2pojo")
public class Quantity__1 implements Serializable
{

    @JsonProperty("available")
    private Available available;
    @JsonProperty("maximum")
    private Maximum maximum;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 7598350482903846555L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Quantity__1() {
    }

    /**
     * 
     * @param available
     * @param maximum
     */
    public Quantity__1(Available available, Maximum maximum) {
        super();
        this.available = available;
        this.maximum = maximum;
    }

    @JsonProperty("available")
    public Available getAvailable() {
        return available;
    }

    @JsonProperty("available")
    public void setAvailable(Available available) {
        this.available = available;
    }

    @JsonProperty("maximum")
    public Maximum getMaximum() {
        return maximum;
    }

    @JsonProperty("maximum")
    public void setMaximum(Maximum maximum) {
        this.maximum = maximum;
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
        sb.append(Quantity__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("available");
        sb.append('=');
        sb.append(((this.available == null)?"<null>":this.available));
        sb.append(',');
        sb.append("maximum");
        sb.append('=');
        sb.append(((this.maximum == null)?"<null>":this.maximum));
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
