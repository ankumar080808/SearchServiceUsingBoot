
package com.vinculum.ondc.objects.request.eretail;

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

@Generated("jsonschema2pojo")
public class Order implements Serializable {

	@JsonProperty("order_location")
	private String orderLocation;
	@JsonProperty("uniqueKey")
	private String uniqueKey;
	@JsonProperty("order_no")
	private String orderNo;
	@JsonProperty("order_type")
	private String orderType;
	@JsonProperty("payment_type")
	private String paymentType;
	@JsonProperty("awbNo")
	private String awbNo;
	@JsonProperty("status")
	private String status;
	@JsonProperty("holdStatus")
	private String holdStatus;
	@JsonProperty("address_verified")
	private String addressVerified;
	@JsonProperty("payment_verified")
	private String paymentVerified;
	@JsonProperty("addressType")
	private String addressType;
	@JsonProperty("order_date")
	private String orderDate;
	@JsonProperty("shipbyDate")
	private String shipbyDate;
	@JsonProperty("order_amount")
	private String orderAmount;
	@JsonProperty("order_currency")
	private String orderCurrency;
	@JsonProperty("conversion_rate")
	private String conversionRate;
	@JsonProperty("is_replacement")
	private String isReplacement;
	@JsonProperty("originalOrderNo")
	private String originalOrderNo;
	
	

	@JsonProperty("customerCode")
	private String customerCode;
	@JsonProperty("extCustomerCode")
	private String extCustomerCode;
	@JsonProperty("customer_name")
	private String customerName;
	@JsonProperty("ship_address1")
	private String shipAddress1;
	@JsonProperty("ship_address2")
	private String shipAddress2;
	@JsonProperty("shipAddress3")
	private String shipAddress3;
	@JsonProperty("shipAddress4")
	private String shipAddress4;
	@JsonProperty("ship_city")
	private String shipCity;
	@JsonProperty("ship_state")
	private String shipState;
	@JsonProperty("ship_country")
	private String shipCountry;
	@JsonProperty("ship_pincode")
	private String shipPinCode;
	@JsonProperty("ship_phone1")
	private String shipPhone1;
	@JsonProperty("shipPhone2")
	private String shipPhone2;
	@JsonProperty("ship_email1")
	private String shipEmail1;
	@JsonProperty("shipEmail2")
	private String shipEmail2;
	@JsonProperty("bill_name")
	private String billName;
	@JsonProperty("bill_address1")
	private String billAddress1;
	@JsonProperty("bill_address2")
	private String billAddress2;
	@JsonProperty("billAddress3")
	private String billAddress3;
	@JsonProperty("billAddress4")
	private String billAddress4;
	@JsonProperty("bill_city")
	private String billCity;
	@JsonProperty("bill_state")
	private String billState;
	@JsonProperty("landmark")
	private String landmark;
	@JsonProperty("latitude")
	private String latitude;
	@JsonProperty("longitude")
	private String longitude;
	@JsonProperty("url")
	private String url;
	@JsonProperty("bill_country")
	private String billCountry;
	@JsonProperty("bill_pincode")
	private String billPinCode;
	@JsonProperty("bill_phone1")
	private String billPhone1;
	@JsonProperty("billPhone2")
	private String billPhone2;
	@JsonProperty("bill_email1")
	private String billEmail1;
	@JsonProperty("billEmail2")
	private String billEmail2;
	@JsonProperty("orderRemarks")
	private String orderRemarks;
	@JsonProperty("shippingCharges")
	private String shippingCharges;
	@JsonProperty("otherCharge1")
	private String otherCharge1;
	@JsonProperty("otherCharge2")
	private String otherCharge2;
	@JsonProperty("storeCredit")
	private String storeCredit;
	@JsonProperty("otherDiscount")
	private String otherDiscount;
	@JsonProperty("discountCode")
	private String discountCode;
	@JsonProperty("cancelRemark")
	private String cancelRemark;
	@JsonProperty("isGiftWrap")
	private String isGiftWrap;
	@JsonProperty("giftWrapMsg")
	private String giftWrapMsg;
	@JsonProperty("deliverySlot")
	private String deliverySlot;
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
	@JsonProperty("custTinNo")
	private String custTinNo;
	@JsonProperty("pickAfterDate")
	private String pickAfterDate;
	@JsonProperty("giftwrapCharge")
	private String giftwrapCharge;
	@JsonProperty("gvAmount")
	private String gvAmount;
	//@JsonProperty("rewardPointsAmount")
	//private long rewardPointsAmount;
	@JsonProperty("cust_type")
	private String custType;
	@JsonProperty("reqType")
	private String reqType;
	@JsonProperty("pickupLocation")
	private String pickupLocation;
	@JsonProperty("handoverValCode")
	private String handoverValCode;
	@JsonProperty("geoType")
	private String geoType;
	@JsonProperty("geoAddress")
	private String geoAddress;
	@JsonProperty("geoLatitude")
	private String geoLatitude;
	@JsonProperty("geoLongitude")
	private String geoLongitude;


	@JsonProperty("orderProcessing")
	private String orderProcessing;
	@JsonProperty("userConsent")
	private String userConsent;
	@JsonProperty("items")
	private List<Item> items;
	@JsonProperty("paymentItems")
	private List<PaymentItem> paymentItems;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
	private final static long serialVersionUID = -7297013081037002374L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Order() {
	}

	public String getOrderLocation() {
		return orderLocation;
	}

	public void setOrderLocation(String orderLocation) {
		this.orderLocation = orderLocation;
	}

	public String getUniqueKey() {
		return uniqueKey;
	}

	public void setUniqueKey(String uniqueKey) {
		this.uniqueKey = uniqueKey;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getAwbNo() {
		return awbNo;
	}

	public void setAwbNo(String awbNo) {
		this.awbNo = awbNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getHoldStatus() {
		return holdStatus;
	}

	public void setHoldStatus(String holdStatus) {
		this.holdStatus = holdStatus;
	}

	public String getAddressVerified() {
		return addressVerified;
	}

	public void setAddressVerified(String addressVerified) {
		this.addressVerified = addressVerified;
	}

	public String getPaymentVerified() {
		return paymentVerified;
	}

	public void setPaymentVerified(String paymentVerified) {
		this.paymentVerified = paymentVerified;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getShipbyDate() {
		return shipbyDate;
	}

	public void setShipbyDate(String shipbyDate) {
		this.shipbyDate = shipbyDate;
	}

	public String getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOrderCurrency() {
		return orderCurrency;
	}

	public void setOrderCurrency(String orderCurrency) {
		this.orderCurrency = orderCurrency;
	}

	public String getConversionRate() {
		return conversionRate;
	}

	public void setConversionRate(String conversionRate) {
		this.conversionRate = conversionRate;
	}

	public String getIsReplacement() {
		return isReplacement;
	}

	public void setIsReplacement(String isReplacement) {
		this.isReplacement = isReplacement;
	}

	public String getOriginalOrderNo() {
		return originalOrderNo;
	}

	public void setOriginalOrderNo(String originalOrderNo) {
		this.originalOrderNo = originalOrderNo;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getExtCustomerCode() {
		return extCustomerCode;
	}

	public void setExtCustomerCode(String extCustomerCode) {
		this.extCustomerCode = extCustomerCode;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getShipAddress1() {
		return shipAddress1;
	}

	public void setShipAddress1(String shipAddress1) {
		this.shipAddress1 = shipAddress1;
	}

	public String getShipAddress2() {
		return shipAddress2;
	}

	public void setShipAddress2(String shipAddress2) {
		this.shipAddress2 = shipAddress2;
	}

	public String getShipAddress3() {
		return shipAddress3;
	}

	public void setShipAddress3(String shipAddress3) {
		this.shipAddress3 = shipAddress3;
	}

	public String getShipAddress4() {
		return shipAddress4;
	}

	public void setShipAddress4(String shipAddress4) {
		this.shipAddress4 = shipAddress4;
	}

	public String getShipCity() {
		return shipCity;
	}

	public void setShipCity(String shipCity) {
		this.shipCity = shipCity;
	}

	public String getShipState() {
		return shipState;
	}

	public void setShipState(String shipState) {
		this.shipState = shipState;
	}

	public String getShipCountry() {
		return shipCountry;
	}

	public void setShipCountry(String shipCountry) {
		this.shipCountry = shipCountry;
	}

	public String getShipPinCode() {
		return shipPinCode;
	}

	public void setShipPinCode(String shipPinCode) {
		this.shipPinCode = shipPinCode;
	}

	public String getShipPhone1() {
		return shipPhone1;
	}

	public void setShipPhone1(String shipPhone1) {
		this.shipPhone1 = shipPhone1;
	}

	public String getShipPhone2() {
		return shipPhone2;
	}

	public void setShipPhone2(String shipPhone2) {
		this.shipPhone2 = shipPhone2;
	}

	public String getShipEmail1() {
		return shipEmail1;
	}

	public void setShipEmail1(String shipEmail1) {
		this.shipEmail1 = shipEmail1;
	}

	public String getShipEmail2() {
		return shipEmail2;
	}

	public void setShipEmail2(String shipEmail2) {
		this.shipEmail2 = shipEmail2;
	}

	public String getBillName() {
		return billName;
	}

	public void setBillName(String billName) {
		this.billName = billName;
	}

	public String getBillAddress1() {
		return billAddress1;
	}

	public void setBillAddress1(String billAddress1) {
		this.billAddress1 = billAddress1;
	}

	public String getBillAddress2() {
		return billAddress2;
	}

	public void setBillAddress2(String billAddress2) {
		this.billAddress2 = billAddress2;
	}

	public String getBillAddress3() {
		return billAddress3;
	}

	public void setBillAddress3(String billAddress3) {
		this.billAddress3 = billAddress3;
	}

	public String getBillAddress4() {
		return billAddress4;
	}

	public void setBillAddress4(String billAddress4) {
		this.billAddress4 = billAddress4;
	}

	public String getBillCity() {
		return billCity;
	}

	public void setBillCity(String billCity) {
		this.billCity = billCity;
	}

	public String getBillState() {
		return billState;
	}

	public void setBillState(String billState) {
		this.billState = billState;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getBillCountry() {
		return billCountry;
	}

	public void setBillCountry(String billCountry) {
		this.billCountry = billCountry;
	}

	public String getBillPinCode() {
		return billPinCode;
	}

	public void setBillPinCode(String billPinCode) {
		this.billPinCode = billPinCode;
	}

	public String getBillPhone1() {
		return billPhone1;
	}

	public void setBillPhone1(String billPhone1) {
		this.billPhone1 = billPhone1;
	}

	public String getBillPhone2() {
		return billPhone2;
	}

	public void setBillPhone2(String billPhone2) {
		this.billPhone2 = billPhone2;
	}

	public String getBillEmail1() {
		return billEmail1;
	}

	public void setBillEmail1(String billEmail1) {
		this.billEmail1 = billEmail1;
	}

	public String getBillEmail2() {
		return billEmail2;
	}

	public void setBillEmail2(String billEmail2) {
		this.billEmail2 = billEmail2;
	}

	public String getOrderRemarks() {
		return orderRemarks;
	}

	public void setOrderRemarks(String orderRemarks) {
		this.orderRemarks = orderRemarks;
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

	public String getOtherCharge2() {
		return otherCharge2;
	}

	public void setOtherCharge2(String otherCharge2) {
		this.otherCharge2 = otherCharge2;
	}

	public String getStoreCredit() {
		return storeCredit;
	}

	public void setStoreCredit(String storeCredit) {
		this.storeCredit = storeCredit;
	}

	public String getOtherDiscount() {
		return otherDiscount;
	}

	public void setOtherDiscount(String otherDiscount) {
		this.otherDiscount = otherDiscount;
	}

	public String getDiscountCode() {
		return discountCode;
	}

	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}

	public String getCancelRemark() {
		return cancelRemark;
	}

	public void setCancelRemark(String cancelRemark) {
		this.cancelRemark = cancelRemark;
	}

	public String getIsGiftWrap() {
		return isGiftWrap;
	}

	public void setIsGiftWrap(String isGiftWrap) {
		this.isGiftWrap = isGiftWrap;
	}

	public String getGiftWrapMsg() {
		return giftWrapMsg;
	}

	public void setGiftWrapMsg(String giftWrapMsg) {
		this.giftWrapMsg = giftWrapMsg;
	}

	public String getDeliverySlot() {
		return deliverySlot;
	}

	public void setDeliverySlot(String deliverySlot) {
		this.deliverySlot = deliverySlot;
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

	public String getCustTinNo() {
		return custTinNo;
	}

	public void setCustTinNo(String custTinNo) {
		this.custTinNo = custTinNo;
	}

	public String getPickAfterDate() {
		return pickAfterDate;
	}

	public void setPickAfterDate(String pickAfterDate) {
		this.pickAfterDate = pickAfterDate;
	}

	public String getGiftwrapCharge() {
		return giftwrapCharge;
	}

	public void setGiftwrapCharge(String giftwrapCharge) {
		this.giftwrapCharge = giftwrapCharge;
	}

	public String getGvAmount() {
		return gvAmount;
	}

	public void setGvAmount(String gvAmount) {
		this.gvAmount = gvAmount;
	}

	/*public long getRewardPointsAmount() {
		return rewardPointsAmount;
	}

	public void setRewardPointsAmount(long rewardPointsAmount) {
		this.rewardPointsAmount = rewardPointsAmount;
	}*/

	public String getCustType() {
		return custType;
	}

	public void setCustType(String custType) {
		this.custType = custType;
	}

	public String getReqType() {
		return reqType;
	}

	public void setReqType(String reqType) {
		this.reqType = reqType;
	}

	public String getPickupLocation() {
		return pickupLocation;
	}

	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}

	public String getHandoverValCode() {
		return handoverValCode;
	}

	public void setHandoverValCode(String handoverValCode) {
		this.handoverValCode = handoverValCode;
	}

	public String getGeoType() {
		return geoType;
	}

	public void setGeoType(String geoType) {
		this.geoType = geoType;
	}

	public String getGeoAddress() {
		return geoAddress;
	}

	public void setGeoAddress(String geoAddress) {
		this.geoAddress = geoAddress;
	}

	public String getGeoLatitude() {
		return geoLatitude;
	}

	public void setGeoLatitude(String geoLatitude) {
		this.geoLatitude = geoLatitude;
	}

	public String getGeoLongitude() {
		return geoLongitude;
	}

	public void setGeoLongitude(String geoLongitude) {
		this.geoLongitude = geoLongitude;
	}

	public String getOrderProcessing() {
		return orderProcessing;
	}

	public void setOrderProcessing(String orderProcessing) {
		this.orderProcessing = orderProcessing;
	}

	public String getUserConsent() {
		return userConsent;
	}

	public void setUserConsent(String userConsent) {
		this.userConsent = userConsent;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public List<PaymentItem> getPaymentItems() {
		return paymentItems;
	}

	public void setPaymentItems(List<PaymentItem> paymentItems) {
		this.paymentItems = paymentItems;
	}

	


}
