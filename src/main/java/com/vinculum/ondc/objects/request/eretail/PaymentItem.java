
package com.vinculum.ondc.objects.request.eretail;

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
    "paymentMode",
    "docNo",
    "docDate",
    "docBank",
    "ifscCode",
    "docAmt",
    "amountReceived",
    "branch",
    "authCode",
    "edcNo",
    "udf1",
    "udf2",
    "udf3",
    "udf4",
    "udf5"
})
@Generated("jsonschema2pojo")
public class PaymentItem implements Serializable
{

    @JsonProperty("paymentMode")
    private String paymentMode;
    @JsonProperty("docNo")
    private String docNo;
    @JsonProperty("docDate")
    private String docDate;
    @JsonProperty("docBank")
    private String docBank;
    @JsonProperty("ifscCode")
    private String ifscCode;
    @JsonProperty("docAmt")
    private String docAmt;
    @JsonProperty("amountReceived")
    private String amountReceived;
    @JsonProperty("branch")
    private String branch;
    @JsonProperty("authCode")
    private String authCode;
    @JsonProperty("edcNo")
    private String edcNo;
    @JsonProperty("udf1")
    private String udf1;
    @JsonProperty("udf2")
    private String udf2;
    @JsonProperty("udf3")
    private String udf3;
    @JsonProperty("udf4")
    private String udf4;
    @JsonProperty("udf5")
    private String udf5;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -8054014058300063592L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PaymentItem() {
    }

    /**
     * 
     * @param authCode
     * @param paymentMode
     * @param udf5
     * @param docDate
     * @param udf3
     * @param udf4
     * @param docNo
     * @param udf1
     * @param branch
     * @param udf2
     * @param amountReceived
     * @param edcNo
     * @param ifscCode
     * @param docAmt
     * @param docBank
     */
    public PaymentItem(String paymentMode, String docNo, String docDate, String docBank, String ifscCode, String docAmt, String amountReceived, String branch, String authCode, String edcNo, String udf1, String udf2, String udf3, String udf4, String udf5) {
        super();
        this.paymentMode = paymentMode;
        this.docNo = docNo;
        this.docDate = docDate;
        this.docBank = docBank;
        this.ifscCode = ifscCode;
        this.docAmt = docAmt;
        this.amountReceived = amountReceived;
        this.branch = branch;
        this.authCode = authCode;
        this.edcNo = edcNo;
        this.udf1 = udf1;
        this.udf2 = udf2;
        this.udf3 = udf3;
        this.udf4 = udf4;
        this.udf5 = udf5;
    }

    @JsonProperty("paymentMode")
    public String getPaymentMode() {
        return paymentMode;
    }

    @JsonProperty("paymentMode")
    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    @JsonProperty("docNo")
    public String getDocNo() {
        return docNo;
    }

    @JsonProperty("docNo")
    public void setDocNo(String docNo) {
        this.docNo = docNo;
    }

    @JsonProperty("docDate")
    public String getDocDate() {
        return docDate;
    }

    @JsonProperty("docDate")
    public void setDocDate(String docDate) {
        this.docDate = docDate;
    }

    @JsonProperty("docBank")
    public String getDocBank() {
        return docBank;
    }

    @JsonProperty("docBank")
    public void setDocBank(String docBank) {
        this.docBank = docBank;
    }

    @JsonProperty("ifscCode")
    public String getIfscCode() {
        return ifscCode;
    }

    @JsonProperty("ifscCode")
    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    @JsonProperty("docAmt")
    public String getDocAmt() {
        return docAmt;
    }

    @JsonProperty("docAmt")
    public void setDocAmt(String docAmt) {
        this.docAmt = docAmt;
    }

    @JsonProperty("amountReceived")
    public String getAmountReceived() {
        return amountReceived;
    }

    @JsonProperty("amountReceived")
    public void setAmountReceived(String amountReceived) {
        this.amountReceived = amountReceived;
    }

    @JsonProperty("branch")
    public String getBranch() {
        return branch;
    }

    @JsonProperty("branch")
    public void setBranch(String branch) {
        this.branch = branch;
    }

    @JsonProperty("authCode")
    public String getAuthCode() {
        return authCode;
    }

    @JsonProperty("authCode")
    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    @JsonProperty("edcNo")
    public String getEdcNo() {
        return edcNo;
    }

    @JsonProperty("edcNo")
    public void setEdcNo(String edcNo) {
        this.edcNo = edcNo;
    }

    @JsonProperty("udf1")
    public String getUdf1() {
        return udf1;
    }

    @JsonProperty("udf1")
    public void setUdf1(String udf1) {
        this.udf1 = udf1;
    }

    @JsonProperty("udf2")
    public String getUdf2() {
        return udf2;
    }

    @JsonProperty("udf2")
    public void setUdf2(String udf2) {
        this.udf2 = udf2;
    }

    @JsonProperty("udf3")
    public String getUdf3() {
        return udf3;
    }

    @JsonProperty("udf3")
    public void setUdf3(String udf3) {
        this.udf3 = udf3;
    }

    @JsonProperty("udf4")
    public String getUdf4() {
        return udf4;
    }

    @JsonProperty("udf4")
    public void setUdf4(String udf4) {
        this.udf4 = udf4;
    }

    @JsonProperty("udf5")
    public String getUdf5() {
        return udf5;
    }

    @JsonProperty("udf5")
    public void setUdf5(String udf5) {
        this.udf5 = udf5;
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
        sb.append(PaymentItem.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("paymentMode");
        sb.append('=');
        sb.append(((this.paymentMode == null)?"<null>":this.paymentMode));
        sb.append(',');
        sb.append("docNo");
        sb.append('=');
        sb.append(((this.docNo == null)?"<null>":this.docNo));
        sb.append(',');
        sb.append("docDate");
        sb.append('=');
        sb.append(((this.docDate == null)?"<null>":this.docDate));
        sb.append(',');
        sb.append("docBank");
        sb.append('=');
        sb.append(((this.docBank == null)?"<null>":this.docBank));
        sb.append(',');
        sb.append("ifscCode");
        sb.append('=');
        sb.append(((this.ifscCode == null)?"<null>":this.ifscCode));
        sb.append(',');
        sb.append("docAmt");
        sb.append('=');
        sb.append(((this.docAmt == null)?"<null>":this.docAmt));
        sb.append(',');
        sb.append("amountReceived");
        sb.append('=');
        sb.append(((this.amountReceived == null)?"<null>":this.amountReceived));
        sb.append(',');
        sb.append("branch");
        sb.append('=');
        sb.append(((this.branch == null)?"<null>":this.branch));
        sb.append(',');
        sb.append("authCode");
        sb.append('=');
        sb.append(((this.authCode == null)?"<null>":this.authCode));
        sb.append(',');
        sb.append("edcNo");
        sb.append('=');
        sb.append(((this.edcNo == null)?"<null>":this.edcNo));
        sb.append(',');
        sb.append("udf1");
        sb.append('=');
        sb.append(((this.udf1 == null)?"<null>":this.udf1));
        sb.append(',');
        sb.append("udf2");
        sb.append('=');
        sb.append(((this.udf2 == null)?"<null>":this.udf2));
        sb.append(',');
        sb.append("udf3");
        sb.append('=');
        sb.append(((this.udf3 == null)?"<null>":this.udf3));
        sb.append(',');
        sb.append("udf4");
        sb.append('=');
        sb.append(((this.udf4 == null)?"<null>":this.udf4));
        sb.append(',');
        sb.append("udf5");
        sb.append('=');
        sb.append(((this.udf5 == null)?"<null>":this.udf5));
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
