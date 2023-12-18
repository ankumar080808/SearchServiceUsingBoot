package com.vinculum.ondc.objects.response.oninit.multipleresponse;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
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
    "@ondc/org/buyer_app_finder_fee_type",
    "@ondc/org/buyer_app_finder_fee_amount",
    "@ondc/org/settlement_details"
})
@Generated("jsonschema2pojo")
public class Payment implements Serializable
{

    @JsonProperty("@ondc/org/buyer_app_finder_fee_type")
    private String ondcOrgBuyerAppFinderFeeType;
    @JsonProperty("@ondc/org/buyer_app_finder_fee_amount")
    private String ondcOrgBuyerAppFinderFeeAmount;
    @JsonProperty("@ondc/org/settlement_details")
    private List<OndcOrgSettlementDetail> ondcOrgSettlementDetails;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -3812956765763030327L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Payment() {
    }

    /**
     * 
     * @param ondcOrgSettlementDetails
     * @param ondcOrgBuyerAppFinderFeeType
     * @param ondcOrgBuyerAppFinderFeeAmount
     */
    public Payment(String ondcOrgBuyerAppFinderFeeType, String ondcOrgBuyerAppFinderFeeAmount, List<OndcOrgSettlementDetail> ondcOrgSettlementDetails) {
        super();
        this.ondcOrgBuyerAppFinderFeeType = ondcOrgBuyerAppFinderFeeType;
        this.ondcOrgBuyerAppFinderFeeAmount = ondcOrgBuyerAppFinderFeeAmount;
        this.ondcOrgSettlementDetails = ondcOrgSettlementDetails;
    }

    @JsonProperty("@ondc/org/buyer_app_finder_fee_type")
    public String getOndcOrgBuyerAppFinderFeeType() {
        return ondcOrgBuyerAppFinderFeeType;
    }

    @JsonProperty("@ondc/org/buyer_app_finder_fee_type")
    public void setOndcOrgBuyerAppFinderFeeType(String ondcOrgBuyerAppFinderFeeType) {
        this.ondcOrgBuyerAppFinderFeeType = ondcOrgBuyerAppFinderFeeType;
    }

    @JsonProperty("@ondc/org/buyer_app_finder_fee_amount")
    public String getOndcOrgBuyerAppFinderFeeAmount() {
        return ondcOrgBuyerAppFinderFeeAmount;
    }

    @JsonProperty("@ondc/org/buyer_app_finder_fee_amount")
    public void setOndcOrgBuyerAppFinderFeeAmount(String ondcOrgBuyerAppFinderFeeAmount) {
        this.ondcOrgBuyerAppFinderFeeAmount = ondcOrgBuyerAppFinderFeeAmount;
    }

    @JsonProperty("@ondc/org/settlement_details")
    public List<OndcOrgSettlementDetail> getOndcOrgSettlementDetails() {
        return ondcOrgSettlementDetails;
    }

    @JsonProperty("@ondc/org/settlement_details")
    public void setOndcOrgSettlementDetails(List<OndcOrgSettlementDetail> ondcOrgSettlementDetails) {
        this.ondcOrgSettlementDetails = ondcOrgSettlementDetails;
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
        sb.append(Payment.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ondcOrgBuyerAppFinderFeeType");
        sb.append('=');
        sb.append(((this.ondcOrgBuyerAppFinderFeeType == null)?"<null>":this.ondcOrgBuyerAppFinderFeeType));
        sb.append(',');
        sb.append("ondcOrgBuyerAppFinderFeeAmount");
        sb.append('=');
        sb.append(((this.ondcOrgBuyerAppFinderFeeAmount == null)?"<null>":this.ondcOrgBuyerAppFinderFeeAmount));
        sb.append(',');
        sb.append("ondcOrgSettlementDetails");
        sb.append('=');
        sb.append(((this.ondcOrgSettlementDetails == null)?"<null>":this.ondcOrgSettlementDetails));
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
