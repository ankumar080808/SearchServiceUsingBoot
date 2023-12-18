
package com.vinculum.ondc.objects.response.oninit.singleresponse;

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
    "type",
    "collected_by",
    "uri",
    "status",
    "@ondc/org/buyer_app_finder_fee_type",
    "@ondc/org/buyer_app_finder_fee_amount",
    "@ondc/org/settlement_basis",
    "@ondc/org/settlement_window",
    "@ondc/org/withholding_amount",
    "@ondc/org/settlement_details"
})
@Generated("jsonschema2pojo")
public class Payment implements Serializable
{

    @JsonProperty("type")
    private String type;
    @JsonProperty("collected_by")
    private String collectedBy;
    @JsonProperty("uri")
    private String uri;
    @JsonProperty("status")
    private String status;
    @JsonProperty("@ondc/org/buyer_app_finder_fee_type")
    private String ondcOrgBuyerAppFinderFeeType;
    @JsonProperty("@ondc/org/buyer_app_finder_fee_amount")
    private String ondcOrgBuyerAppFinderFeeAmount;
    @JsonProperty("@ondc/org/settlement_basis")
    private String ondcOrgSettlementBasis;
    @JsonProperty("@ondc/org/settlement_window")
    private String ondcOrgSettlementWindow;
    @JsonProperty("@ondc/org/withholding_amount")
    private String ondcOrgWithholdingAmount;
    @JsonProperty("@ondc/org/settlement_details")
    private List<OndcOrgSettlementDetail> ondcOrgSettlementDetails;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 3225683902761852248L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Payment() {
    }

    /**
     * 
     * @param ondcOrgSettlementBasis
     * @param ondcOrgSettlementDetails
     * @param ondcOrgWithholdingAmount
     * @param type
     * @param ondcOrgBuyerAppFinderFeeType
     * @param ondcOrgBuyerAppFinderFeeAmount
     * @param uri
     * @param collectedBy
     * @param status
     * @param ondcOrgSettlementWindow
     */
    public Payment(String type, String collectedBy, String uri, String status, String ondcOrgBuyerAppFinderFeeType, String ondcOrgBuyerAppFinderFeeAmount, String ondcOrgSettlementBasis, String ondcOrgSettlementWindow, String ondcOrgWithholdingAmount, List<OndcOrgSettlementDetail> ondcOrgSettlementDetails) {
        super();
        this.type = type;
        this.collectedBy = collectedBy;
        this.uri = uri;
        this.status = status;
        this.ondcOrgBuyerAppFinderFeeType = ondcOrgBuyerAppFinderFeeType;
        this.ondcOrgBuyerAppFinderFeeAmount = ondcOrgBuyerAppFinderFeeAmount;
        this.ondcOrgSettlementBasis = ondcOrgSettlementBasis;
        this.ondcOrgSettlementWindow = ondcOrgSettlementWindow;
        this.ondcOrgWithholdingAmount = ondcOrgWithholdingAmount;
        this.ondcOrgSettlementDetails = ondcOrgSettlementDetails;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("collected_by")
    public String getCollectedBy() {
        return collectedBy;
    }

    @JsonProperty("collected_by")
    public void setCollectedBy(String collectedBy) {
        this.collectedBy = collectedBy;
    }

    @JsonProperty("uri")
    public String getUri() {
        return uri;
    }

    @JsonProperty("uri")
    public void setUri(String uri) {
        this.uri = uri;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
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

    @JsonProperty("@ondc/org/settlement_basis")
    public String getOndcOrgSettlementBasis() {
        return ondcOrgSettlementBasis;
    }

    @JsonProperty("@ondc/org/settlement_basis")
    public void setOndcOrgSettlementBasis(String ondcOrgSettlementBasis) {
        this.ondcOrgSettlementBasis = ondcOrgSettlementBasis;
    }

    @JsonProperty("@ondc/org/settlement_window")
    public String getOndcOrgSettlementWindow() {
        return ondcOrgSettlementWindow;
    }

    @JsonProperty("@ondc/org/settlement_window")
    public void setOndcOrgSettlementWindow(String ondcOrgSettlementWindow) {
        this.ondcOrgSettlementWindow = ondcOrgSettlementWindow;
    }

    @JsonProperty("@ondc/org/withholding_amount")
    public String getOndcOrgWithholdingAmount() {
        return ondcOrgWithholdingAmount;
    }

    @JsonProperty("@ondc/org/withholding_amount")
    public void setOndcOrgWithholdingAmount(String ondcOrgWithholdingAmount) {
        this.ondcOrgWithholdingAmount = ondcOrgWithholdingAmount;
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
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("collectedBy");
        sb.append('=');
        sb.append(((this.collectedBy == null)?"<null>":this.collectedBy));
        sb.append(',');
        sb.append("uri");
        sb.append('=');
        sb.append(((this.uri == null)?"<null>":this.uri));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("ondcOrgBuyerAppFinderFeeType");
        sb.append('=');
        sb.append(((this.ondcOrgBuyerAppFinderFeeType == null)?"<null>":this.ondcOrgBuyerAppFinderFeeType));
        sb.append(',');
        sb.append("ondcOrgBuyerAppFinderFeeAmount");
        sb.append('=');
        sb.append(((this.ondcOrgBuyerAppFinderFeeAmount == null)?"<null>":this.ondcOrgBuyerAppFinderFeeAmount));
        sb.append(',');
        sb.append("ondcOrgSettlementBasis");
        sb.append('=');
        sb.append(((this.ondcOrgSettlementBasis == null)?"<null>":this.ondcOrgSettlementBasis));
        sb.append(',');
        sb.append("ondcOrgSettlementWindow");
        sb.append('=');
        sb.append(((this.ondcOrgSettlementWindow == null)?"<null>":this.ondcOrgSettlementWindow));
        sb.append(',');
        sb.append("ondcOrgWithholdingAmount");
        sb.append('=');
        sb.append(((this.ondcOrgWithholdingAmount == null)?"<null>":this.ondcOrgWithholdingAmount));
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
