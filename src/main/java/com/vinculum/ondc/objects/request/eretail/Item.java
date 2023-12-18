
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

@Generated("jsonschema2pojo")
public class Item implements Serializable
{

	@JsonProperty("lineno")
    private String lineno;
    @JsonProperty("sku")
    private String sku;
    @JsonProperty("channelSkuCode")
    private String channelSkuCode;
    @JsonProperty("channelProductId")
    private String channelProductId;
    @JsonProperty("order_qty")
    private String orderQty;
    @JsonProperty("cancelledQty")
    private String cancelledQty;
    @JsonProperty("unit_price")
    private String unitPrice;
    @JsonProperty("bundleSku")
    private String bundleSku;
    @JsonProperty("bundlePrice")
    private String bundlePrice;
    @JsonProperty("bundleQty")
    private String bundleQty;
    @JsonProperty("mrp")
    private String mrp;
    @JsonProperty("discountAmt")
    private String discountAmt;
    @JsonProperty("giftVoucherAmt")
    private String giftVoucherAmt;
    @JsonProperty("shippingCharges")
    private String shippingCharges;
    @JsonProperty("otherCharge1")
    private String otherCharge1;
    @JsonProperty("transporter")
    private String transporter;
    @JsonProperty("storeCredit")
    private String storeCredit;
    @JsonProperty("isGiftcard")
    private String isGiftcard;
    @JsonProperty("vendor")
    private String vendor;
    @JsonProperty("mode")
    private String mode;
    @JsonProperty("tax_inclusive")
    private String taxInclusive;
    @JsonProperty("taxPercentage")
    private String taxPercentage;
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
    @JsonProperty("udf6")
    private String udf6;
    @JsonProperty("udf7")
    private String udf7;
    @JsonProperty("udf8")
    private String udf8;
    @JsonProperty("udf9")
    private String udf9;
    @JsonProperty("udf10")
    private String udf10;
    @JsonProperty("locationCode")
    private String locationCode;
    @JsonProperty("delFulfillmentMode")
    private String delFulfillmentMode;
    @JsonProperty("shipmentType")
    private String shipmentType;
    @JsonProperty("shipby_date")
    private String shipby_date;
    @JsonProperty("discountPercent")
    private String discountPercent;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -8161936287615900633L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Item() {
    }

	public String getLineno() {
		return lineno;
	}

	public void setLineno(String lineno) {
		this.lineno = lineno;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getChannelSkuCode() {
		return channelSkuCode;
	}

	public void setChannelSkuCode(String channelSkuCode) {
		this.channelSkuCode = channelSkuCode;
	}

	public String getChannelProductId() {
		return channelProductId;
	}

	public void setChannelProductId(String channelProductId) {
		this.channelProductId = channelProductId;
	}

	public String getOrderQty() {
		return orderQty;
	}

	public void setOrderQty(String orderQty) {
		this.orderQty = orderQty;
	}

	public String getCancelledQty() {
		return cancelledQty;
	}

	public void setCancelledQty(String cancelledQty) {
		this.cancelledQty = cancelledQty;
	}

	public String getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getBundleSku() {
		return bundleSku;
	}

	public void setBundleSku(String bundleSku) {
		this.bundleSku = bundleSku;
	}

	public String getBundlePrice() {
		return bundlePrice;
	}

	public void setBundlePrice(String bundlePrice) {
		this.bundlePrice = bundlePrice;
	}

	public String getBundleQty() {
		return bundleQty;
	}

	public void setBundleQty(String bundleQty) {
		this.bundleQty = bundleQty;
	}

	public String getMrp() {
		return mrp;
	}

	public void setMrp(String mrp) {
		this.mrp = mrp;
	}

	public String getDiscountAmt() {
		return discountAmt;
	}

	public void setDiscountAmt(String discountAmt) {
		this.discountAmt = discountAmt;
	}

	public String getGiftVoucherAmt() {
		return giftVoucherAmt;
	}

	public void setGiftVoucherAmt(String giftVoucherAmt) {
		this.giftVoucherAmt = giftVoucherAmt;
	}

	public String getShippingCharges() {
		return shippingCharges;
	}

	public void setShippingCharges(String shippingCharges) {
		this.shippingCharges = shippingCharges;
	}

	public String getOtherCharge1() {
		return otherCharge1;
	}

	public void setOtherCharge1(String otherCharge1) {
		this.otherCharge1 = otherCharge1;
	}

	public String getTransporter() {
		return transporter;
	}

	public void setTransporter(String transporter) {
		this.transporter = transporter;
	}

	public String getStoreCredit() {
		return storeCredit;
	}

	public void setStoreCredit(String storeCredit) {
		this.storeCredit = storeCredit;
	}

	public String getIsGiftcard() {
		return isGiftcard;
	}

	public void setIsGiftcard(String isGiftcard) {
		this.isGiftcard = isGiftcard;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getTaxInclusive() {
		return taxInclusive;
	}

	public void setTaxInclusive(String taxInclusive) {
		this.taxInclusive = taxInclusive;
	}

	public String getTaxPercentage() {
		return taxPercentage;
	}

	public void setTaxPercentage(String taxPercentage) {
		this.taxPercentage = taxPercentage;
	}

	public String getUdf1() {
		return udf1;
	}

	public void setUdf1(String udf1) {
		this.udf1 = udf1;
	}

	public String getUdf2() {
		return udf2;
	}

	public void setUdf2(String udf2) {
		this.udf2 = udf2;
	}

	public String getUdf3() {
		return udf3;
	}

	public void setUdf3(String udf3) {
		this.udf3 = udf3;
	}

	public String getUdf4() {
		return udf4;
	}

	public void setUdf4(String udf4) {
		this.udf4 = udf4;
	}

	public String getUdf5() {
		return udf5;
	}

	public void setUdf5(String udf5) {
		this.udf5 = udf5;
	}

	public String getUdf6() {
		return udf6;
	}

	public void setUdf6(String udf6) {
		this.udf6 = udf6;
	}

	public String getUdf7() {
		return udf7;
	}

	public void setUdf7(String udf7) {
		this.udf7 = udf7;
	}

	public String getUdf8() {
		return udf8;
	}

	public void setUdf8(String udf8) {
		this.udf8 = udf8;
	}

	public String getUdf9() {
		return udf9;
	}

	public void setUdf9(String udf9) {
		this.udf9 = udf9;
	}

	public String getUdf10() {
		return udf10;
	}

	public void setUdf10(String udf10) {
		this.udf10 = udf10;
	}

	public String getLocationCode() {
		return locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	public String getDelFulfillmentMode() {
		return delFulfillmentMode;
	}

	public void setDelFulfillmentMode(String delFulfillmentMode) {
		this.delFulfillmentMode = delFulfillmentMode;
	}

	public String getShipmentType() {
		return shipmentType;
	}

	public void setShipmentType(String shipmentType) {
		this.shipmentType = shipmentType;
	}

	public String getShipby_date() {
		return shipby_date;
	}

	public void setShipby_date(String shipby_date) {
		this.shipby_date = shipby_date;
	}

	public String getDiscountPercent() {
		return discountPercent;
	}

	public void setDiscountPercent(String discountPercent) {
		this.discountPercent = discountPercent;
	}


}
