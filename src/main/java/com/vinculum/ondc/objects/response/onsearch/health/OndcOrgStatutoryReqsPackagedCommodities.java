
package com.vinculum.ondc.objects.response.onsearch.health;


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
    "manufacturer_or_packer_name",
    "manufacturer_or_packer_address",
    "mfg_license_no",
    "common_or_generic_name_of_commodity",
    "multiple_products_name_number_or_qty",
    "month_year_of_manufacture_packing_import",
    "expiry_date"
})
@Generated("jsonschema2pojo")
public class OndcOrgStatutoryReqsPackagedCommodities implements Serializable
{

    @JsonProperty("manufacturer_or_packer_name")
    private String manufacturerOrPackerName;
    @JsonProperty("manufacturer_or_packer_address")
    private String manufacturerOrPackerAddress;
    @JsonProperty("mfg_license_no")
    private String mfgLicenseNo;
    @JsonProperty("common_or_generic_name_of_commodity")
    private String commonOrGenericNameOfCommodity;
    @JsonProperty("multiple_products_name_number_or_qty")
    private String multipleProductsNameNumberOrQty;
    @JsonProperty("month_year_of_manufacture_packing_import")
    private String monthYearOfManufacturePackingImport;
    @JsonProperty("expiry_date")
    private String expiryDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 5634506126337144294L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public OndcOrgStatutoryReqsPackagedCommodities() {
    }

    /**
     * 
     * @param commonOrGenericNameOfCommodity
     * @param expiryDate
     * @param multipleProductsNameNumberOrQty
     * @param mfgLicenseNo
     * @param manufacturerOrPackerAddress
     * @param monthYearOfManufacturePackingImport
     * @param manufacturerOrPackerName
     */
    public OndcOrgStatutoryReqsPackagedCommodities(String manufacturerOrPackerName, String manufacturerOrPackerAddress, String mfgLicenseNo, String commonOrGenericNameOfCommodity, String multipleProductsNameNumberOrQty, String monthYearOfManufacturePackingImport, String expiryDate) {
        super();
        this.manufacturerOrPackerName = manufacturerOrPackerName;
        this.manufacturerOrPackerAddress = manufacturerOrPackerAddress;
        this.mfgLicenseNo = mfgLicenseNo;
        this.commonOrGenericNameOfCommodity = commonOrGenericNameOfCommodity;
        this.multipleProductsNameNumberOrQty = multipleProductsNameNumberOrQty;
        this.monthYearOfManufacturePackingImport = monthYearOfManufacturePackingImport;
        this.expiryDate = expiryDate;
    }

    @JsonProperty("manufacturer_or_packer_name")
    public String getManufacturerOrPackerName() {
        return manufacturerOrPackerName;
    }

    @JsonProperty("manufacturer_or_packer_name")
    public void setManufacturerOrPackerName(String manufacturerOrPackerName) {
        this.manufacturerOrPackerName = manufacturerOrPackerName;
    }

    @JsonProperty("manufacturer_or_packer_address")
    public String getManufacturerOrPackerAddress() {
        return manufacturerOrPackerAddress;
    }

    @JsonProperty("manufacturer_or_packer_address")
    public void setManufacturerOrPackerAddress(String manufacturerOrPackerAddress) {
        this.manufacturerOrPackerAddress = manufacturerOrPackerAddress;
    }

    @JsonProperty("mfg_license_no")
    public String getMfgLicenseNo() {
        return mfgLicenseNo;
    }

    @JsonProperty("mfg_license_no")
    public void setMfgLicenseNo(String mfgLicenseNo) {
        this.mfgLicenseNo = mfgLicenseNo;
    }

    @JsonProperty("common_or_generic_name_of_commodity")
    public String getCommonOrGenericNameOfCommodity() {
        return commonOrGenericNameOfCommodity;
    }

    @JsonProperty("common_or_generic_name_of_commodity")
    public void setCommonOrGenericNameOfCommodity(String commonOrGenericNameOfCommodity) {
        this.commonOrGenericNameOfCommodity = commonOrGenericNameOfCommodity;
    }

    @JsonProperty("multiple_products_name_number_or_qty")
    public String getMultipleProductsNameNumberOrQty() {
        return multipleProductsNameNumberOrQty;
    }

    @JsonProperty("multiple_products_name_number_or_qty")
    public void setMultipleProductsNameNumberOrQty(String multipleProductsNameNumberOrQty) {
        this.multipleProductsNameNumberOrQty = multipleProductsNameNumberOrQty;
    }

    @JsonProperty("month_year_of_manufacture_packing_import")
    public String getMonthYearOfManufacturePackingImport() {
        return monthYearOfManufacturePackingImport;
    }

    @JsonProperty("month_year_of_manufacture_packing_import")
    public void setMonthYearOfManufacturePackingImport(String monthYearOfManufacturePackingImport) {
        this.monthYearOfManufacturePackingImport = monthYearOfManufacturePackingImport;
    }

    @JsonProperty("expiry_date")
    public String getExpiryDate() {
        return expiryDate;
    }

    @JsonProperty("expiry_date")
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
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
        sb.append(OndcOrgStatutoryReqsPackagedCommodities.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("manufacturerOrPackerName");
        sb.append('=');
        sb.append(((this.manufacturerOrPackerName == null)?"<null>":this.manufacturerOrPackerName));
        sb.append(',');
        sb.append("manufacturerOrPackerAddress");
        sb.append('=');
        sb.append(((this.manufacturerOrPackerAddress == null)?"<null>":this.manufacturerOrPackerAddress));
        sb.append(',');
        sb.append("mfgLicenseNo");
        sb.append('=');
        sb.append(((this.mfgLicenseNo == null)?"<null>":this.mfgLicenseNo));
        sb.append(',');
        sb.append("commonOrGenericNameOfCommodity");
        sb.append('=');
        sb.append(((this.commonOrGenericNameOfCommodity == null)?"<null>":this.commonOrGenericNameOfCommodity));
        sb.append(',');
        sb.append("multipleProductsNameNumberOrQty");
        sb.append('=');
        sb.append(((this.multipleProductsNameNumberOrQty == null)?"<null>":this.multipleProductsNameNumberOrQty));
        sb.append(',');
        sb.append("monthYearOfManufacturePackingImport");
        sb.append('=');
        sb.append(((this.monthYearOfManufacturePackingImport == null)?"<null>":this.monthYearOfManufacturePackingImport));
        sb.append(',');
        sb.append("expiryDate");
        sb.append('=');
        sb.append(((this.expiryDate == null)?"<null>":this.expiryDate));
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
