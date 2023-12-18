package com.vinculum.ondc.objects.response.oncancel.rto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vinculum.ondc.objects.response.OnEventPayloadGenerator;

public class OnCancelRTOGenerator implements OnEventPayloadGenerator {


	@Override
	public  String generate() {


		Context context = generateDummyContext();
		Message message = generateDummyMessage();

		OnCancelRto onCancelRto = new OnCancelRto();
		onCancelRto.setContext(context);
		onCancelRto.setMessage(message);

		String json = "";
		try {
			ObjectMapper objectMapper = new ObjectMapper();
//			objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			json = objectMapper.writeValueAsString(onCancelRto);
			System.out.println(json);
		} catch (Exception e) {
			e.printStackTrace();
		}

         return json;
	}

	public static Context generateDummyContext() {
		Context context = new Context();
		context.setDomain("ONDC:RET10");
		context.setCountry("IND");
		context.setCity("std:080");
		context.setAction("on_cancel");
		context.setCoreVersion("1.2.0");
		context.setBapId("buyerNP.com");
		context.setBapUri("https://buyerNP.com/ondc");
		context.setBppId("sellerNP.com");
		context.setBppUri("https://sellerNP.com/ondc");
		context.setTransactionId("T2");
		context.setMessageId("M10");
		context.setTimestamp("2023-06-03T11:00:30.000Z");
		context.setTtl("PT30S");
		return context;
	}

	public static Message generateDummyMessage() {
		Message message = new Message();
		message.setOrder(generateDummyOrder());
		return message;
	}

	public static Order generateDummyOrder() {
		Order order = new Order();
		order.setId("O1");
		order.setState("Completed");
		order.setProvider(generateDummyProvider());
		order.setItems(generateDummyItems());
		order.setBilling(generateDummyBilling());
		order.setFulfillments(generateDummyFulfillments());
		order.setQuote(generateDummyQuote());
		order.setPayment(generateDummyPayment());
		order.setCreatedAt("2023-06-03T09:30:00.000Z");
		order.setUpdatedAt("2023-06-03T11:00:30.000Z");

		return order;
	}

	private static Payment generateDummyPayment() {

		 // Create and set payment data        
        Payment payment = new Payment();
        payment.setUri("https://ondc.transaction.com/payment");
        payment.setTlMethod("http/get");
        Params params = new Params();
        params.setCurrency("INR");
        params.setTransactionId("3937");
        params.setAmount("415.00");
        payment.setParams(params);
        payment.setStatus("PAID");
        payment.setType("ON-ORDER");
        payment.setCollectedBy("BAP");
        
        payment.setOndcOrgBuyerAppFinderFeeType("percent");
        payment.setOndcOrgBuyerAppFinderFeeAmount("3");
        

        List<OndcOrgSettlementDetail> settlementDetails = new ArrayList<>();
        OndcOrgSettlementDetail settlementDetail = new OndcOrgSettlementDetail();
        // Generate dummy data for settlementDetail
        settlementDetail.setSettlementCounterparty("seller-app");
        settlementDetail.setSettlementPhase("sale-amount");
        settlementDetail.setBeneficiaryName("xxxxx");
        settlementDetail.setSettlementType("upi");
        settlementDetail.setUpiAddress("gft@oksbi");
        settlementDetail.setSettlementBankAccountNo("XXXXXXXXXX");
        settlementDetail.setSettlementIfscCode("XXXXXXXXX");
        settlementDetail.setBankName("xxxx");
        settlementDetail.setBranchName("xxxx");
        settlementDetails.add(settlementDetail);
        payment.setOndcOrgSettlementDetails(settlementDetails);
        
        return payment;
       
	}

	private static Quote generateDummyQuote() {

		// Create and set quote data
        Quote quote = new Quote();
        Price price = new Price();
        price.setCurrency("INR");
        price.setValue("125.00");
        quote.setPrice(price);
        
        // Create and set the breakup for the quote
        List<Breakup> breakupList = new ArrayList<>();

        // Create and add breakup items
        Breakup itemBreakup = new Breakup();
        itemBreakup.setOndcOrgItemId("I1");
        
        OndcOrgItemQuantity itemQuantity = new OndcOrgItemQuantity();
        itemQuantity.setCount(0);
        
        itemBreakup.setOndcOrgItemQuantity(itemQuantity);
        itemBreakup.setTitle("Atta");
        
        itemBreakup.setOndcOrgTitleType("item");
        Price__1 itemPrice = new Price__1();
        itemPrice.setCurrency("INR");
        itemPrice.setValue("0.00");
        
        Item__1 item__1 = new Item__1();
        Price__2 price__2 = new Price__2();
            
        price__2.setCurrency("INR");
        price__2.setValue("170.00");
        
        item__1.setPrice(price__2);
        itemBreakup.setItem(item__1);
        
        itemBreakup.setPrice(itemPrice);
        breakupList.add(itemBreakup);
        
        Breakup deliveryCharges = new Breakup();
        deliveryCharges.setOndcOrgItemId("F1");
        deliveryCharges.setTitle("Delivery charges");
        deliveryCharges.setOndcOrgTitleType("delivery");
        
        Price__1 deliveryPrice = new Price__1();
        deliveryPrice.setCurrency("INR");
        deliveryPrice.setValue("50.00");
        deliveryCharges.setPrice(deliveryPrice);
        breakupList.add(deliveryCharges);
        
        Breakup deliveryCharges2 = new Breakup();
        deliveryCharges2.setOndcOrgItemId("F1-RTO");
        deliveryCharges2.setTitle("Delivery charges");
        deliveryCharges2.setOndcOrgTitleType("delivery");
        
        Price__1 deliveryPrice2 = new Price__1();
        deliveryPrice2.setCurrency("INR");
        deliveryPrice2.setValue("50.00");
        deliveryCharges2.setPrice(deliveryPrice2);
        breakupList.add(deliveryCharges2);
        
        Breakup packingCharges = new Breakup();
        packingCharges.setOndcOrgItemId("F1");
        packingCharges.setTitle("Packing charges");
        packingCharges.setOndcOrgTitleType("packing");
        
        Price__1 packingPrice = new Price__1();
        packingPrice.setCurrency("INR");
        packingPrice.setValue("25.00");
        packingCharges.setPrice(packingPrice);
        breakupList.add(packingCharges);
        
        Breakup taxBreakup = new Breakup();
        taxBreakup.setOndcOrgItemId("I1");
        taxBreakup.setTitle("Tax");
        taxBreakup.setOndcOrgTitleType("tax");
        Price__1 taxPrice = new Price__1();
        taxPrice.setCurrency("INR");
        taxPrice.setValue("0.00");
        taxBreakup.setPrice(taxPrice);
        breakupList.add(taxBreakup);
        
        quote.setBreakup(breakupList);
        
        // Set the ttl for the quote
        quote.setTtl("P1D");
        
        
        return quote;
		
	}

	private static List<Fulfillment> generateDummyFulfillments() {

		Fulfillment fulfillment1 = new Fulfillment();
		fulfillment1.setId("F1");
		fulfillment1.setOndcOrgProviderName("LSP or Provider Name");
		fulfillment1.setType("Delivery");
		fulfillment1.setTracking(true);

		State state = new State();
		Descriptor descriptor = new Descriptor();
		descriptor.setCode("Cancelled");
		state.setDescriptor(descriptor);
		
		fulfillment1.setState(state);

		Start start = new Start();
		Location__1 location__1 = new Location__1();
		location__1.setId("L1");

		Descriptor__1 descriptor__1 = new Descriptor__1();
		descriptor__1.setName("ABC Store");

		location__1.setDescriptor(descriptor__1);

		location__1.setGps("12.956399,77.636803");

		Address__1 address__1 = new Address__1();

		address__1.setLocality("Jayanagar");
		address__1.setCity("Bengaluru");
		address__1.setAreaCode("560076");
		address__1.setState("KA");

		location__1.setAddress(address__1);

		start.setLocation(location__1);
		
	

		Time time = new Time();
		Range range = new Range();
		range.setStart("2023-06-03T11:00:00.000Z");
		range.setEnd("2023-06-03T11:30:00.000Z");
		time.setRange(range);

		start.setTime(time);

		Contact contact = new Contact();
		contact.setPhone("9886098860");
		contact.setEmail("nobody@nomail.com");

		start.setContact(contact);

		fulfillment1.setStart(start);
		
		End end = new End();
		
		Location__2 location__2 = new Location__2();
		location__2.setGps("12.453544,77.928379");
		

		Address__2 address__2 = new Address__2();
		address__2.setName("my house or door or floor #");
		address__2.setBuilding("my building name or house #");
		address__2.setLocality("my street name");
		address__2.setCity("Bengaluru");
		address__2.setState("Karnataka");
		address__2.setCountry("IND");
		address__2.setAreaCode("560037");
		
		location__2.setAddress(address__2);
		
		end.setLocation(location__2);

		  
		Time__1 time__1 = new Time__1();
		
		Range__1 range__1 = new Range__1();
		range__1.setStart("2023-06-03T11:00:00.000Z");
		range__1.setEnd("2023-06-03T11:30:00.000Z");
		
		time__1.setRange(range__1);
		
		end.setTime(time__1);
		
		Person person = new Person();
		person.setName("name_of_person");
		
	    end.setPerson(person);    
		
		Contact__1 contact__1 = new Contact__1();
		contact__1.setPhone("9886098860");
		contact__1.setEmail("nobody@nomail.com");
		
		end.setContact(contact__1);
		
		fulfillment1.setEnd(end);
		
	     List<Tag> tags = new ArrayList<>();
	     

	        // Create the first tag
	        Tag tag1 = new Tag();
	        tag1.setCode("cancel_request");
	        List<com.vinculum.ondc.objects.response.oncancel.rto.List> tag1Items = new ArrayList<>();
	        com.vinculum.ondc.objects.response.oncancel.rto.List tag1Item1 = new com.vinculum.ondc.objects.response.oncancel.rto.List();
	        tag1Item1.setCode("retry_count");
	        tag1Item1.setValue("3");
	        com.vinculum.ondc.objects.response.oncancel.rto.List tag1Item2 = new com.vinculum.ondc.objects.response.oncancel.rto.List();
	        tag1Item2.setCode("rto_id");
	        tag1Item2.setValue("F1-RTO");
	        com.vinculum.ondc.objects.response.oncancel.rto.List tag1Item3 = new com.vinculum.ondc.objects.response.oncancel.rto.List();
	        tag1Item3.setCode("reason_id");
	        tag1Item3.setValue("013");
	        com.vinculum.ondc.objects.response.oncancel.rto.List tag1Item4 = new com.vinculum.ondc.objects.response.oncancel.rto.List();
	        tag1Item4.setCode("initiated_by");
	        tag1Item4.setValue("lsp.com");
	        tag1Items.add(tag1Item1);
	        tag1Items.add(tag1Item2);
	        tag1Items.add(tag1Item3);
	        tag1Items.add(tag1Item4);
	        tag1.setList(tag1Items);
	        tags.add(tag1);
	        
	        fulfillment1.setTags(tags);
	        
	        Fulfillment fulfillment2 = new Fulfillment();
	        fulfillment2.setId("F1-RTO");
	        fulfillment2.setType("RTO");

			State state1 = new State();
			Descriptor descriptor1 = new Descriptor();
			descriptor1.setCode("RTO-Initiated");
			state1.setDescriptor(descriptor1);
			
			fulfillment2.setState(state1);

			Start start1 = new Start();
	
			Time time1 = new Time();
	

			time1.setTimestamp("2023-06-03T11:00:30.000Z");

			start1.setTime(time1);
			
			fulfillment2.setStart(start1);

		     List<Tag> tags2 = new ArrayList<>();

	        // Create the second tag
			
	        Tag tag2 = new Tag();
	        tag2.setCode("quote_trail");
	        List<com.vinculum.ondc.objects.response.oncancel.rto.List> tag2Items = new ArrayList<>();
	        com.vinculum.ondc.objects.response.oncancel.rto.List tag2Item1 = new com.vinculum.ondc.objects.response.oncancel.rto.List();
	        tag2Item1.setCode("type");
	        tag2Item1.setValue("delivery");
	        com.vinculum.ondc.objects.response.oncancel.rto.List tag2Item2 = new com.vinculum.ondc.objects.response.oncancel.rto.List();
	        tag2Item2.setCode("id");
	        tag2Item2.setValue("F1-RTO");
	        com.vinculum.ondc.objects.response.oncancel.rto.List tag2Item3 = new com.vinculum.ondc.objects.response.oncancel.rto.List();
	        tag2Item3.setCode("currency");
	        tag2Item3.setValue("INR");
	        com.vinculum.ondc.objects.response.oncancel.rto.List tag2Item4 = new com.vinculum.ondc.objects.response.oncancel.rto.List();
	        tag2Item4.setCode("value");
	        tag2Item4.setValue("50.00");
	        tag2Items.add(tag2Item1);
	        tag2Items.add(tag2Item2);
	        tag2Items.add(tag2Item3);
	        tag2Items.add(tag2Item4);
	        tag2.setList(tag2Items);
	        tags2.add(tag2);
			
	        // Create the Third tag

	        Tag tag3 = new Tag();
	        tag3.setCode("quote_trail");
	        List<com.vinculum.ondc.objects.response.oncancel.rto.List> tag3Items = new ArrayList<>();
	        com.vinculum.ondc.objects.response.oncancel.rto.List tag3Item1 = new com.vinculum.ondc.objects.response.oncancel.rto.List();
	        tag3Item1.setCode("type");
	        tag3Item1.setValue("item");
	        com.vinculum.ondc.objects.response.oncancel.rto.List tag3Item2 = new com.vinculum.ondc.objects.response.oncancel.rto.List();
	        tag3Item2.setCode("id");
	        tag3Item2.setValue("I1");
	        com.vinculum.ondc.objects.response.oncancel.rto.List tag3Item3 = new com.vinculum.ondc.objects.response.oncancel.rto.List();
	        tag3Item3.setCode("currency");
	        tag3Item3.setValue("INR");
	        com.vinculum.ondc.objects.response.oncancel.rto.List tag3Item4 = new com.vinculum.ondc.objects.response.oncancel.rto.List();
	        tag3Item4.setCode("value");
	        tag3Item4.setValue("-340.00");
	        tag3Items.add(tag3Item1);
	        tag3Items.add(tag3Item2);
	        tag3Items.add(tag3Item3);
	        tag3Items.add(tag3Item4);
	        tag3.setList(tag3Items);
	        tags2.add(tag3);

	        
	        fulfillment2.setTags(tags2);

	        List<Fulfillment> fulfillments = new ArrayList<>();
	        fulfillments.add(fulfillment1);
	        fulfillments.add(fulfillment2);


		

		return fulfillments;
	}

	private static Provider generateDummyProvider() {
		Provider provider = new Provider();
		provider.setId("P1");

		List<Location> locations = new ArrayList<>();
		Location location = new Location();
		location.setId("L1");
		locations.add(location);
		provider.setLocations(locations);

		return provider;
	}

	private static List<Item> generateDummyItems() {

		Item item1 = new Item();
		item1.setId("I1");
		item1.setFulfillmentId("F1");
		Quantity quantity1 = new Quantity();
		quantity1.setCount(0);
		item1.setQuantity(quantity1);
		
		Item item2 = new Item();
		item2.setId("I1");
		item2.setFulfillmentId("F1-RTO");
		Quantity quantity2 = new Quantity();
		quantity2.setCount(2);
		item2.setQuantity(quantity2);

		List<Item> items = new ArrayList<>();
		items.add(item1);
		items.add(item2);
		return items;
	}

	public static Address generateDummyAddress() {
		Address address = new Address();
		address.setName("my house or door or floor #");
		address.setBuilding("my building name or house #");
		address.setLocality("my street name");
		address.setCity("Bengaluru");
		address.setState("Karnataka");
		address.setCountry("IND");
		address.setAreaCode("560037");
		return address;
	}

	public static Billing generateDummyBilling() {
		Billing billing = new Billing();
		billing.setName("ONDC buyer");
		billing.setAddress(generateDummyAddress());
		billing.setEmail("nobody@nomail.com");
		billing.setPhone("9886098860");
		billing.setCreatedAt("2023-06-03T09:00:00.000Z");
		billing.setUpdatedAt("2023-06-03T09:00:00.000Z");
		return billing;
	}

}
