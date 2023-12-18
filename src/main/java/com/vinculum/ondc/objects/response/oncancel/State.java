
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
    "descriptor"
})
@Generated("jsonschema2pojo")
public class State implements Serializable
{

    @JsonProperty("descriptor")
    private Descriptor descriptor;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 1058559739506787470L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public State() {
    }

    /**
     * 
     * @param descriptor
     */
    public State(Descriptor descriptor) {
        super();
        this.descriptor = descriptor;
    }

    @JsonProperty("descriptor")
    public Descriptor getDescriptor() {
        return descriptor;
    }

    @JsonProperty("descriptor")
    public void setDescriptor(Descriptor descriptor) {
        this.descriptor = descriptor;
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
