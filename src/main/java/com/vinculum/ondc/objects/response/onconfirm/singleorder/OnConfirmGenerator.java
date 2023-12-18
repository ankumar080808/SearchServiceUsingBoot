package com.vinculum.ondc.objects.response.onconfirm.singleorder;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vinculum.ondc.objects.response.OnEventPayloadGenerator;

public class OnConfirmGenerator implements OnEventPayloadGenerator {

	public static void main(String[] args) {

		
	}

	@Override
	public String generate() {
		Context context = new Context();
		context.setDomain("ONDC:RET10");
		context.setAction("on_confirm");
		context.setCoreVersion("1.2.0");
		context.setBapId("buyerNP.com");
		context.setBapUri("https://buyerNP.com/ondc");
		context.setBppId("sellerNP.com");
		context.setBppUri("https://sellerNP.com/ondc");
		context.setTransactionId("T2");
		context.setMessageId("M4");
		context.setCity("std:080");
		context.setCountry("IND");
		context.setTimestamp("2023-06-03T09:30:30.000Z");

		OnConfirm onConfirmScenerio2 = new OnConfirm();
		onConfirmScenerio2.setContext(context);

		Message message = new Message();
		Order order = new Order();

		order.setId("O1");
		order.setState("Accepted");

		Provider provider = new Provider();
		provider.setId("P1");

		Location providerLocation = new Location();
		providerLocation.setId("L1");

		List<Location> providerLocations = new ArrayList<Location>();
		providerLocations.add(providerLocation);
		provider.setLocations(providerLocations);

		order.setProvider(provider);

		Item item = new Item();
		item.setId("I1");
		item.setFulfillmentId("F1");
		Quantity quantity = new Quantity();
		quantity.setCount(2);
		item.setQuantity(quantity);

		List<Item> items = new ArrayList<Item>();
		items.add(item);

		order.setItems(items);

		Billing billing = new Billing();
		billing.setName("ONDC buyer");

		Address address = new Address();
		address.setName("my house or door or floor #");
		address.setBuilding("my building name or house #");
		address.setLocality("my street name");
		address.setCity("Bengaluru");
		address.setState("Karnataka");
		address.setCountry("IND");
		address.setAreaCode("560037");

		billing.setAddress(address);

		billing.setEmail("nobody@nomail.com");
		billing.setPhone("9886098860");
		billing.setCreatedAt("2023-06-03T09:00:00.000Z");
		billing.setUpdatedAt("2023-06-03T09:00:00.000Z");

		order.setBilling(billing);

		Fulfillment fulfillment = new Fulfillment();
		fulfillment.setId("F1");
		fulfillment.setOndcOrgProviderName("LSP or Provider Name");

		State state = new State();
		Descriptor descriptor = new Descriptor();
		descriptor.setCode("Pending");
		state.setDescriptor(descriptor);
		fulfillment.setState(state);

		fulfillment.setType("Delivery");
		fulfillment.setTracking(true);

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
		range.setStart("2023-06-03T10:00:00.000Z");
		range.setEnd("2023-06-03T10:30:00.000Z");
		time.setRange(range);
		start.setTime(time);

		Instructions instructions = new Instructions();
		instructions.setCode("2");
		instructions.setName("ONDC order");
		instructions.setShortDesc("value of PCC");
		instructions.setLongDesc("additional instructions such as register or counter no for self-pickup");
		start.setInstructions(instructions);

		Contact contact = new Contact();
		contact.setPhone("9886098860");
		contact.setEmail("nobody@nomail.com");
		start.setContact(contact);

		fulfillment.setStart(start);

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

		fulfillment.setEnd(end);

		List<Fulfillment> fulfillments = new ArrayList<Fulfillment>();
		fulfillments.add(fulfillment);

		order.setFulfillments(fulfillments);

		Quote quote = new Quote();
		Price price = new Price();
		price.setCurrency("INR");
		price.setValue("415.00");

		quote.setPrice(price);

		//////////////////////////////// ------breakup1------//////////////////////////////////////

		Breakup breakup1 = new Breakup();
		breakup1.setOndcOrgItemId("I1");

		OndcOrgItemQuantity ondcOrgItemQuantity1 = new OndcOrgItemQuantity(); //
		ondcOrgItemQuantity1.setCount(2);
		breakup1.setOndcOrgItemQuantity(ondcOrgItemQuantity1);

		breakup1.setTitle("Atta");
		breakup1.setOndcOrgTitleType("item");

		Price__1 price__1 = new Price__1();
		price__1.setCurrency("INR");
		price__1.setValue("340.00");

		breakup1.setPrice(price__1);

		Item__1 item__1 = new Item__1();
		Price__2 price__2 = new Price__2();
		price__2.setCurrency("INR");
		price__2.setValue("170.00");

		item__1.setPrice(price__2);

		breakup1.setItem(item__1);

		//////////////////////////////// ------breakup2------//////////////////////////////////////

		Breakup breakup2 = new Breakup();
		breakup2.setOndcOrgItemId("F1");

		breakup2.setTitle("Delivery charges");
		breakup2.setOndcOrgTitleType("delivery");

		Price__1 price__3 = new Price__1();
		price__3.setCurrency("INR");
		price__3.setValue("50.00");

		breakup2.setPrice(price__3);

		//////////////////////////////// ------breakup3------//////////////////////////////////////

		Breakup breakup3 = new Breakup();
		breakup3.setOndcOrgItemId("F1");

		breakup3.setTitle("Packing charges");
		breakup3.setOndcOrgTitleType("packing");

		Price__1 price__4 = new Price__1();
		price__4.setCurrency("INR");
		price__4.setValue("25.00");

		breakup3.setPrice(price__4);

		//////////////////////////////// ------breakup4------//////////////////////////////////////

		Breakup breakup4 = new Breakup();
		breakup4.setOndcOrgItemId("I1");

		breakup4.setTitle("Tax");
		breakup4.setOndcOrgTitleType("tax");

		Price__1 price__5 = new Price__1();
		price__5.setCurrency("INR");
		price__5.setValue("0.00");

		breakup4.setPrice(price__5);

		//////////////////////////////// ------breakup5------//////////////////////////////////////

		Breakup breakup5 = new Breakup();
		breakup5.setOndcOrgItemId("I1");

		breakup5.setTitle("Discount");
		breakup5.setOndcOrgTitleType("discount");

		Price__1 price__6 = new Price__1();
		price__6.setCurrency("INR");
		price__6.setValue("-10.00");
		breakup5.setPrice(price__6);


		//////////////////////////////// ------breakup6------//////////////////////////////////////

		Breakup breakup6 = new Breakup();
		breakup6.setOndcOrgItemId("F1");

		breakup6.setTitle("Convenience Fee");
		breakup6.setOndcOrgTitleType("misc");

		Price__1 price__7 = new Price__1();
		price__7.setCurrency("INR");
		price__7.setValue("10.00");

		breakup6.setPrice(price__7);

		List<Breakup> breakups = new ArrayList<Breakup>();
		breakups.add(breakup1);
		breakups.add(breakup2);
		breakups.add(breakup3);
		breakups.add(breakup4);
		breakups.add(breakup5);
		breakups.add(breakup6);

		quote.setBreakup(breakups);

		quote.setTtl("P1D");

		order.setQuote(quote);

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

		payment.setOndcOrgSettlementBasis("delivery");
		payment.setOndcOrgSettlementWindow("P1D");
		payment.setOndcOrgWithholdingAmount("10.00");

		OndcOrgSettlementDetail ondcOrgSettlementDetail = new OndcOrgSettlementDetail();
		ondcOrgSettlementDetail.setSettlementCounterparty("seller-app");
		ondcOrgSettlementDetail.setSettlementPhase("sale-amount");
		ondcOrgSettlementDetail.setSettlementType("upi");
		ondcOrgSettlementDetail.setBeneficiaryName("xxxxx");
		ondcOrgSettlementDetail.setUpiAddress("gft@oksbi");
		ondcOrgSettlementDetail.setSettlementBankAccountNo("XXXXXXXXXX");
		ondcOrgSettlementDetail.setSettlementIfscCode("XXXXXXXXX");
		ondcOrgSettlementDetail.setBankName("xxxx");
		ondcOrgSettlementDetail.setBranchName("xxxx");

		List<OndcOrgSettlementDetail> ondcOrgSettlementDetails = new ArrayList<OndcOrgSettlementDetail>();
		ondcOrgSettlementDetails.add(ondcOrgSettlementDetail);

		payment.setOndcOrgSettlementDetails(ondcOrgSettlementDetails);

		order.setPayment(payment);

		Tag tag___2 = new Tag();
		tag___2.setCode("bpp_terms");

		com.vinculum.ondc.objects.response.onconfirm.singleorder.List list__110 = new com.vinculum.ondc.objects.response.onconfirm.singleorder.List();
		list__110.setCode("tax_number");
		list__110.setValue("gst_number_of_sellerNP");

		List<com.vinculum.ondc.objects.response.onconfirm.singleorder.List> list__110s = new ArrayList<com.vinculum.ondc.objects.response.onconfirm.singleorder.List>();
		list__110s.add(list__110);
		tag___2.setList(list__110s);

		Tag tag___3 = new Tag();
		tag___3.setCode("bap_terms");

		com.vinculum.ondc.objects.response.onconfirm.singleorder.List list__210 = new com.vinculum.ondc.objects.response.onconfirm.singleorder.List();
		list__210.setCode("tax_number");
		list__210.setValue("gst_number_of_buyerNP");

		List<com.vinculum.ondc.objects.response.onconfirm.singleorder.List> list__210s = new ArrayList<com.vinculum.ondc.objects.response.onconfirm.singleorder.List>();
		list__210s.add(list__210);
		tag___3.setList(list__210s);

		List<Tag> tagss = new ArrayList<Tag>();
		tagss.add(tag___2);
		tagss.add(tag___3);

		order.setTags(tagss);

		order.setCreatedAt("2023-06-03T09:30:00.000Z");
		order.setUpdatedAt("2023-06-03T09:31:30.000Z");

		message.setOrder(order);

		onConfirmScenerio2.setMessage(message);

		String json = "";
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			json = objectMapper.writeValueAsString(onConfirmScenerio2);
			System.out.println(json);
		} catch (Exception e) {
			e.printStackTrace();
		}
      return json;
	}

}
