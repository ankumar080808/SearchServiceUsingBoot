
package com.vinculum.ondc.objects.request.eretailCancel;

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
    "order_location",
    "uniqueKey",
    "order_no",
    "cancelation_reason",
    "cancelation_remarks"
})
@Generated("jsonschema2pojo")
public class Order implements Serializable
{

    @JsonProperty("order_location")
    private String orderLocation;
    @JsonProperty("uniqueKey")
    private String uniqueKey;
    @JsonProperty("order_no")
    private String orderNo;
    @JsonProperty("cancelation_reason")
    private String cancelationReason;
    @JsonProperty("cancelation_remarks")
    private String cancelationRemarks;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -3940775453559181993L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Order() {
    }

    /**
     * 
     * @param cancelationRemarks
     * @param orderNo
     * @param uniqueKey
     * @param orderLocation
     * @param cancelationReason
     */
    public Order(String orderLocation, String uniqueKey, String orderNo, String cancelationReason, String cancelationRemarks) {
        super();
        this.orderLocation = orderLocation;
        this.uniqueKey = uniqueKey;
        this.orderNo = orderNo;
        this.cancelationReason = cancelationReason;
        this.cancelationRemarks = cancelationRemarks;
    }

    @JsonProperty("order_location")
    public String getOrderLocation() {
        return orderLocation;
    }

    @JsonProperty("order_location")
    public void setOrderLocation(String orderLocation) {
        this.orderLocation = orderLocation;
    }

    @JsonProperty("uniqueKey")
    public String getUniqueKey() {
        return uniqueKey;
    }

    @JsonProperty("uniqueKey")
    public void setUniqueKey(String uniqueKey) {
        this.uniqueKey = uniqueKey;
    }

    @JsonProperty("order_no")
    public String getOrderNo() {
        return orderNo;
    }

    @JsonProperty("order_no")
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    @JsonProperty("cancelation_reason")
    public String getCancelationReason() {
        return cancelationReason;
    }

    @JsonProperty("cancelation_reason")
    public void setCancelationReason(String cancelationReason) {
        this.cancelationReason = cancelationReason;
    }

    @JsonProperty("cancelation_remarks")
    public String getCancelationRemarks() {
        return cancelationRemarks;
    }

    @JsonProperty("cancelation_remarks")
    public void setCancelationRemarks(String cancelationRemarks) {
        this.cancelationRemarks = cancelationRemarks;
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
