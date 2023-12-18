package com.vinculum.ondc.objects.request.search;

import java.io.Serializable;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "@ondc/org/buyer_app_finder_fee_type",
    "@ondc/org/buyer_app_finder_fee_amount"
})
@Generated("jsonschema2pojo")
public class Payment implements Serializable
{

    @JsonProperty("@ondc/org/buyer_app_finder_fee_type")
    private String ondcOrgBuyerAppFinderFeeType;
    @JsonProperty("@ondc/org/buyer_app_finder_fee_amount")
    private String ondcOrgBuyerAppFinderFeeAmount;
    private final static long serialVersionUID = 36907643886131777L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Payment() {
    }

    /**
     * 
     * @param ondcOrgBuyerAppFinderFeeType
     * @param ondcOrgBuyerAppFinderFeeAmount
     */
    public Payment(String ondcOrgBuyerAppFinderFeeType, String ondcOrgBuyerAppFinderFeeAmount) {
        super();
        this.ondcOrgBuyerAppFinderFeeType = ondcOrgBuyerAppFinderFeeType;
        this.ondcOrgBuyerAppFinderFeeAmount = ondcOrgBuyerAppFinderFeeAmount;
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
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
