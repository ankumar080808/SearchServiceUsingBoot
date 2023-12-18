
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
    "cancellation_reason_id"
})
@Generated("jsonschema2pojo")
public class Tags implements Serializable
{

    @JsonProperty("cancellation_reason_id")
    private String cancellationReasonId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 7058392936511479000L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Tags() {
    }

    /**
     * 
     * @param cancellationReasonId
     */
    public Tags(String cancellationReasonId) {
        super();
        this.cancellationReasonId = cancellationReasonId;
    }

    @JsonProperty("cancellation_reason_id")
    public String getCancellationReasonId() {
        return cancellationReasonId;
    }

    @JsonProperty("cancellation_reason_id")
    public void setCancellationReasonId(String cancellationReasonId) {
        this.cancellationReasonId = cancellationReasonId;
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
        sb.append(Tags.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cancellationReasonId");
        sb.append('=');
        sb.append(((this.cancellationReasonId == null)?"<null>":this.cancellationReasonId));
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
