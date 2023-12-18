
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
    "cancelled_by",
    "reason"
})
@Generated("jsonschema2pojo")
public class Cancellation implements Serializable
{

    @JsonProperty("cancelled_by")
    private String cancelledBy;
    @JsonProperty("reason")
    private Reason reason;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -7349860793549669672L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Cancellation() {
    }

    /**
     * 
     * @param reason
     * @param cancelledBy
     */
    public Cancellation(String cancelledBy, Reason reason) {
        super();
        this.cancelledBy = cancelledBy;
        this.reason = reason;
    }

    @JsonProperty("cancelled_by")
    public String getCancelledBy() {
        return cancelledBy;
    }

    @JsonProperty("cancelled_by")
    public void setCancelledBy(String cancelledBy) {
        this.cancelledBy = cancelledBy;
    }

    @JsonProperty("reason")
    public Reason getReason() {
        return reason;
    }

    @JsonProperty("reason")
    public void setReason(Reason reason) {
        this.reason = reason;
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
