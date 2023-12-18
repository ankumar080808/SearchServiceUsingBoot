
package com.vinculum.ondc.objects.request.cancel;

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
    "order_id",
    "cancellation_reason_id",
    "descriptor"
})
@Generated("jsonschema2pojo")
public class Message implements Serializable
{

    @JsonProperty("order_id")
    private String orderId;
    @JsonProperty("cancellation_reason_id")
    private String cancellationReasonId;
    @JsonProperty("descriptor")
    private Descriptor descriptor;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -5143906706585193252L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Message() {
    }

    /**
     * 
     * @param orderId
     * @param cancellationReasonId
     * @param descriptor
     */
    public Message(String orderId, String cancellationReasonId, Descriptor descriptor) {
        super();
        this.orderId = orderId;
        this.cancellationReasonId = cancellationReasonId;
        this.descriptor = descriptor;
    }

    @JsonProperty("order_id")
    public String getOrderId() {
        return orderId;
    }

    @JsonProperty("order_id")
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @JsonProperty("cancellation_reason_id")
    public String getCancellationReasonId() {
        return cancellationReasonId;
    }

    @JsonProperty("cancellation_reason_id")
    public void setCancellationReasonId(String cancellationReasonId) {
        this.cancellationReasonId = cancellationReasonId;
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
