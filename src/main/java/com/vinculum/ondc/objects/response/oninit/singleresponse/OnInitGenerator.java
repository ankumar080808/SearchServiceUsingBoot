package com.vinculum.ondc.objects.response.oninit.singleresponse;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vinculum.ondc.constants.Constants;
import com.vinculum.ondc.objects.response.OnEventPayloadGenerator;


public class OnInitGenerator implements  OnEventPayloadGenerator{
	
	
	@Override
	public  String generate() {

		String jsonPayload = null;

		// Populate Context
		Context context = new Context();
		context.setDomain("ONDC:RET11");
		context.setCountry("IND");
		context.setCity("std:080");
		context.setAction(Constants.ON_INIT);
		context.setCoreVersion("1.1.0");
		context.setBapId("buyerapp.com");
		context.setBapUri("https://buyerapp.com/ondc");
		context.setBppId("sellerNP.com");
		context.setBppUri("https://sellerapp.com/ondc");
		context.setTransactionId("1234");
		context.setMessageId("M1");
		context.setTimestamp("2023-06-03T08:00:30.000Z");

		// Populate Message
		Message message = new Message();
		Order order = new Order();
		Provider pro = new Provider();
		pro.setId("L1");
		order.setProvider(pro);
		
		ProviderLocation loc=new ProviderLocation();
		loc.setId("L1");
		order.setProviderLocation(loc);
		List<Item> items = new ArrayList<>();
		Item item = new Item();
		item.setId("I1");
		item.setFulfillmentId("F1");
		Quantity quan=new Quantity();
		quan.setCount(2);
		item.setQuantity(quan);
		items.add(item);
		order.setItems(items);
		
		Billing bill=new Billing();
		bill.setName("Ondc buyer");
		Address add=new Address();
		add.setName("My house");
		add.setBuilding("My building");
		add.setLocality("My street");
		add.setCity("Bnag");
		add.setState("Karnatak");
		add.setCountry("Ind");
		add.setAreaCode("5607");
		bill.setAddress(add);
		bill.setTaxNumber("XXXX");
		bill.setEmail("vvv");
		bill.setPhone("hhhh");
		bill.setCreatedAt("2023-06-03T09:00:00.000Z");
		bill.setUpdatedAt("2023-06-03T09:00:00.000Z");
		order.setBilling(bill);
		
		List<Fulfillment> fulfillments = new ArrayList<>();
		Fulfillment fulfillment = new Fulfillment();
	    fulfillment.setId("F1");
	    fulfillment.setType("Delievery");
	    fulfillment.setTracking(false);
	    End end=new End();
	    Location loc_1=new Location();
	    loc_1.setGps("sss");
	    Address__1 add_1=new Address__1();
		add_1.setName("My house");
		add_1.setBuilding("My building");
		add.setLocality("My street");
		add.setCity("Bnag");
		add.setState("Karnatak");
		add.setCountry("Ind");
		add.setAreaCode("5607");
		loc_1.setAddress(add_1);
		end.setLocation(loc_1);
		Contact con=new Contact();
		con.setPhone("123");
		end.setContact(con);
		 fulfillment.setEnd(end);
		fulfillments.add(fulfillment);
		order.setFulfillments(fulfillments);
		
		Quote quo=new Quote();
		Price price=new Price();
		price.setCurrency("23");
		price.setValue("sdsd");
		quo.setPrice(price);
		
		List<Breakup> breakups = new ArrayList<>();
		Breakup breakup = new Breakup();
		breakup.setOndcOrgItemId("I1");
		OndcOrgItemQuantity ondcorgitemquantity = new OndcOrgItemQuantity();
		ondcorgitemquantity.setCount(0);
		breakup.setOndcOrgItemQuantity(ondcorgitemquantity);
		breakup.setTitle("Atta");
		breakup.setOndcOrgTitleType("item");
		Price__1 price_1 = new Price__1();
		price_1.setCurrency("INR");
		price_1.setValue("170");
		breakup.setPrice(price_1);
		Item__1 item_1 = new Item__1();
		Price__2 price_2=new Price__2();
		price_2.setCurrency("cx");
		price_2.setValue("33");
		item_1.setPrice(price_2);
		breakup.setItem(item_1);
		breakups.add(breakup);
		
		Breakup breakup_2 = new Breakup();
		breakup_2.setOndcOrgItemId("F1");
		
		breakup_2.setTitle("Atta");
		breakup_2.setOndcOrgTitleType("item");
		Price__1 price_3 = new Price__1();
		price_3.setCurrency("INR");
		price_3.setValue("170");
		breakup_2.setPrice(price_3);
		breakups.add(breakup_2);
		
		
		Breakup breakup_3 = new Breakup();
		breakup_3.setOndcOrgItemId("F1");
		
		breakup_3.setTitle("Atta");
		breakup_3.setOndcOrgTitleType("item");
		Price__1 price_3a = new Price__1();
		price_3a.setCurrency("INR");
		price_3a.setValue("170");
		breakup_3.setPrice(price_3a);
		breakups.add(breakup_3);
		
		
		
		Breakup breakup_4 = new Breakup();
		breakup_4.setOndcOrgItemId("I1");
		
		breakup_4.setTitle("Atta");
		breakup_4.setOndcOrgTitleType("item");
		Price__1 price_3b = new Price__1();
		price_3b.setCurrency("INR");
		price_3b.setValue("170");
		breakup_4.setPrice(price_3b);
		breakups.add(breakup_4);
		

		Breakup breakup_5 = new Breakup();
		breakup_5.setOndcOrgItemId("I1");
		
		breakup_5.setTitle("Atta");
		breakup_5.setOndcOrgTitleType("item");
		Price__1 price_3c = new Price__1();
		price_3c.setCurrency("INR");
		price_3c.setValue("170");
		breakup_5.setPrice(price_3c);
		breakups.add(breakup_5);
		
		Breakup breakup_6 = new Breakup();
		breakup_6.setOndcOrgItemId("F1");
		
		breakup_6.setTitle("Atta");
		breakup_6.setOndcOrgTitleType("item");
		Price__1 price_3d = new Price__1();
		price_3d.setCurrency("INR");
		price_3d.setValue("170");
		breakup_6.setPrice(price_3d);
		breakups.add(breakup_6);
		quo.setBreakup(breakups);
		
		quo.setTtl("P1D");
		order.setQuote(quo);
		
		
		Payment pay=new Payment();
		pay.setType("ds");
		pay.setCollectedBy("ssf");
		pay.setUri("sfs");
		pay.setStatus("fsfs");
		pay.setOndcOrgBuyerAppFinderFeeType("sfs");
		pay.setOndcOrgBuyerAppFinderFeeAmount("dfd");
		pay.setOndcOrgSettlementBasis("fd");
		pay.setOndcOrgSettlementWindow("232");
		pay.setOndcOrgWithholdingAmount("343");
		 
		List<OndcOrgSettlementDetail> onds=new ArrayList<>();
		OndcOrgSettlementDetail ond=new OndcOrgSettlementDetail();
		ond.setSettlementCounterparty("32");
		ond.setSettlementPhase("322");
		ond.setSettlementType("dd");
		ond.setBeneficiaryName("fdf");
		ond.setUpiAddress("vxv");
		ond.setSettlementBankAccountNo("Vvv");
		ond.setSettlementIfscCode("vvv");
		ond.setBankName("vvvv");
		ond.setBranchName("333");
		onds.add(ond);
		pay.setOndcOrgSettlementDetails(onds);
		order.setPayment(pay);
		
		List<Tag> tags=new ArrayList<>();
		Tag tag=new Tag();
		tag.setCode("ddd");
		List<com.vinculum.ondc.objects.response.oninit.singleresponse.List> lists_2 = new ArrayList<>();
		com.vinculum.ondc.objects.response.oninit.singleresponse.List list_2 = new com.vinculum.ondc.objects.response.oninit.singleresponse.List();
		
		list_2.setCode("tsa");
		list_2.setValue("nj");
		lists_2.add(list_2);
		tag.setList(lists_2);
		tags.add(tag);
		order.setTags(tags);
		
		message.setOrder(order);
		
		OnInit on = new OnInit();
		on.setContext(context);
		on.setMessage(message);
		
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			jsonPayload = objectMapper.writeValueAsString(on);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return jsonPayload;
		
	}
	
	public static void main(String args[]) {
		String json =new OnInitGenerator().generate();
		System.out.print(json);
	}
		
}
