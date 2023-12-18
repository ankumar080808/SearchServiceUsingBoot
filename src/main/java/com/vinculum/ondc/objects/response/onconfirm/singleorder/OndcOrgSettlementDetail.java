
package com.vinculum.ondc.objects.response.onconfirm.singleorder;
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
    "settlement_counterparty",
    "settlement_phase",
    "beneficiary_name",
    "settlement_type",
    "upi_address",
    "settlement_bank_account_no",
    "settlement_ifsc_code",
    "bank_name",
    "branch_name"
})
@Generated("jsonschema2pojo")
public class OndcOrgSettlementDetail implements Serializable
{

    @JsonProperty("settlement_counterparty")
    private String settlementCounterparty;
    @JsonProperty("settlement_phase")
    private String settlementPhase;
    @JsonProperty("beneficiary_name")
    private String beneficiaryName;
    @JsonProperty("settlement_type")
    private String settlementType;
    @JsonProperty("upi_address")
    private String upiAddress;
    @JsonProperty("settlement_bank_account_no")
    private String settlementBankAccountNo;
    @JsonProperty("settlement_ifsc_code")
    private String settlementIfscCode;
    @JsonProperty("bank_name")
    private String bankName;
    @JsonProperty("branch_name")
    private String branchName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 921398393654155297L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public OndcOrgSettlementDetail() {
    }

    /**
     * 
     * @param settlementType
     * @param beneficiaryName
     * @param settlementBankAccountNo
     * @param settlementIfscCode
     * @param settlementPhase
     * @param settlementCounterparty
     * @param branchName
     * @param upiAddress
     * @param bankName
     */
    public OndcOrgSettlementDetail(String settlementCounterparty, String settlementPhase, String beneficiaryName, String settlementType, String upiAddress, String settlementBankAccountNo, String settlementIfscCode, String bankName, String branchName) {
        super();
        this.settlementCounterparty = settlementCounterparty;
        this.settlementPhase = settlementPhase;
        this.beneficiaryName = beneficiaryName;
        this.settlementType = settlementType;
        this.upiAddress = upiAddress;
        this.settlementBankAccountNo = settlementBankAccountNo;
        this.settlementIfscCode = settlementIfscCode;
        this.bankName = bankName;
        this.branchName = branchName;
    }

    @JsonProperty("settlement_counterparty")
    public String getSettlementCounterparty() {
        return settlementCounterparty;
    }

    @JsonProperty("settlement_counterparty")
    public void setSettlementCounterparty(String settlementCounterparty) {
        this.settlementCounterparty = settlementCounterparty;
    }

    @JsonProperty("settlement_phase")
    public String getSettlementPhase() {
        return settlementPhase;
    }

    @JsonProperty("settlement_phase")
    public void setSettlementPhase(String settlementPhase) {
        this.settlementPhase = settlementPhase;
    }

    @JsonProperty("beneficiary_name")
    public String getBeneficiaryName() {
        return beneficiaryName;
    }

    @JsonProperty("beneficiary_name")
    public void setBeneficiaryName(String beneficiaryName) {
        this.beneficiaryName = beneficiaryName;
    }

    @JsonProperty("settlement_type")
    public String getSettlementType() {
        return settlementType;
    }

    @JsonProperty("settlement_type")
    public void setSettlementType(String settlementType) {
        this.settlementType = settlementType;
    }

    @JsonProperty("upi_address")
    public String getUpiAddress() {
        return upiAddress;
    }

    @JsonProperty("upi_address")
    public void setUpiAddress(String upiAddress) {
        this.upiAddress = upiAddress;
    }

    @JsonProperty("settlement_bank_account_no")
    public String getSettlementBankAccountNo() {
        return settlementBankAccountNo;
    }

    @JsonProperty("settlement_bank_account_no")
    public void setSettlementBankAccountNo(String settlementBankAccountNo) {
        this.settlementBankAccountNo = settlementBankAccountNo;
    }

    @JsonProperty("settlement_ifsc_code")
    public String getSettlementIfscCode() {
        return settlementIfscCode;
    }

    @JsonProperty("settlement_ifsc_code")
    public void setSettlementIfscCode(String settlementIfscCode) {
        this.settlementIfscCode = settlementIfscCode;
    }

    @JsonProperty("bank_name")
    public String getBankName() {
        return bankName;
    }

    @JsonProperty("bank_name")
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @JsonProperty("branch_name")
    public String getBranchName() {
        return branchName;
    }

    @JsonProperty("branch_name")
    public void setBranchName(String branchName) {
        this.branchName = branchName;
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
        sb.append(OndcOrgSettlementDetail.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("settlementCounterparty");
        sb.append('=');
        sb.append(((this.settlementCounterparty == null)?"<null>":this.settlementCounterparty));
        sb.append(',');
        sb.append("settlementPhase");
        sb.append('=');
        sb.append(((this.settlementPhase == null)?"<null>":this.settlementPhase));
        sb.append(',');
        sb.append("beneficiaryName");
        sb.append('=');
        sb.append(((this.beneficiaryName == null)?"<null>":this.beneficiaryName));
        sb.append(',');
        sb.append("settlementType");
        sb.append('=');
        sb.append(((this.settlementType == null)?"<null>":this.settlementType));
        sb.append(',');
        sb.append("upiAddress");
        sb.append('=');
        sb.append(((this.upiAddress == null)?"<null>":this.upiAddress));
        sb.append(',');
        sb.append("settlementBankAccountNo");
        sb.append('=');
        sb.append(((this.settlementBankAccountNo == null)?"<null>":this.settlementBankAccountNo));
        sb.append(',');
        sb.append("settlementIfscCode");
        sb.append('=');
        sb.append(((this.settlementIfscCode == null)?"<null>":this.settlementIfscCode));
        sb.append(',');
        sb.append("bankName");
        sb.append('=');
        sb.append(((this.bankName == null)?"<null>":this.bankName));
        sb.append(',');
        sb.append("branchName");
        sb.append('=');
        sb.append(((this.branchName == null)?"<null>":this.branchName));
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
