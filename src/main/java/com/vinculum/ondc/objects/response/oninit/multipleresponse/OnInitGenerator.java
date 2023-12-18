package com.vinculum.ondc.objects.response.oninit.multipleresponse;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vinculum.ondc.objects.response.OnEventPayloadGenerator;


public class OnInitGenerator implements OnEventPayloadGenerator {

	@Override
	public String generate() {
		// TODO Auto-generated method stub
		
		Context context = new Context();
		context.setDomain("ONDC:RET11");
		context.setAction("on_init");
		context.setCoreVersion("1.2.0");
		context.setBapId("buyerNP.com");
		context.setBapUri("https://buyerNP.com/ondc");
		context.setBppId("sellerNP.com");
		context.setBppUri("https://sellerNP.com/ondc");
		context.setTransactionId("T2");
		context.setMessageId("M3");
		context.setCity("std:080");
		context.setCountry("IND");
		context.setTimestamp("2023-06-03T09:00:30.000Z");

		OnInit onInit = new OnInit();
		onInit.setContext(context);

		Message message = new Message();

		Order order = new Order();
		
//	    "items",
//	    "billing",
//	    "fulfillments",
//	    "quote",
//	    "payment"

		Provider provider = new Provider();
		provider.setId("P1");
		order.setProvider(provider);

		ProviderLocation providerLocation = new ProviderLocation();
		providerLocation.setId("L1");
		order.setProviderLocation(providerLocation);

		Item item_1 = new Item();
		item_1.setId("I1");
		item_1.setFulfillmentId("F1");
		Quantity quantity_1 = new Quantity();
		quantity_1.setCount(1);
		item_1.setQuantity(quantity_1);

		item_1.setParentItemId("DI1");

		Tag tag_1 = new Tag();
		tag_1.setCode("type");

		List<com.vinculum.ondc.objects.response.oninit.multipleresponse.List> tagList_1 = new ArrayList<com.vinculum.ondc.objects.response.oninit.multipleresponse.List>();
		com.vinculum.ondc.objects.response.oninit.multipleresponse.List tagListObj = new com.vinculum.ondc.objects.response.oninit.multipleresponse.List();
		tagListObj.setCode("type");
		tagListObj.setValue("item");

		tagList_1.add(tagListObj);
		tag_1.setList(tagList_1);

		List<Tag> tags1 = new ArrayList<Tag>();
		tags1.add(tag_1);
		item_1.setTags(tags1);

		Item item_2 = new Item();
		item_2.setId("C1");
		item_2.setFulfillmentId("F1");
		Quantity quantity_2 = new Quantity();
		quantity_2.setCount(1);
		item_2.setQuantity(quantity_2);

		item_2.setParentItemId("DI1");

		Tag tag_2 = new Tag();
		tag_2.setCode("type");

		List<com.vinculum.ondc.objects.response.oninit.multipleresponse.List> tagList_2 = new ArrayList<com.vinculum.ondc.objects.response.oninit.multipleresponse.List>();
		com.vinculum.ondc.objects.response.oninit.multipleresponse.List tagListObj2 = new com.vinculum.ondc.objects.response.oninit.multipleresponse.List();
		tagListObj2.setCode("type");
		tagListObj2.setValue("customization");
		tagList_2.add(tagListObj2);
		tag_2.setList(tagList_2);

		Tag tag_3 = new Tag();
		tag_3.setCode("parent");
		List<com.vinculum.ondc.objects.response.oninit.multipleresponse.List> tagList_3 = new ArrayList<com.vinculum.ondc.objects.response.oninit.multipleresponse.List>();
		com.vinculum.ondc.objects.response.oninit.multipleresponse.List tagListObj3 = new com.vinculum.ondc.objects.response.oninit.multipleresponse.List();
		tagListObj3.setCode("id");
		tagListObj3.setValue("CG1");
		tagList_3.add(tagListObj3);
		tag_3.setList(tagList_3);

		List<Tag> tags2 = new ArrayList<Tag>();
		tags2.add(tag_2);
		tags2.add(tag_3);
		item_2.setTags(tags2);

		Item item_3 = new Item();
		item_3.setId("C7");
		item_3.setFulfillmentId("F1");
		Quantity quantity_3 = new Quantity();
		quantity_3.setCount(1);
		item_3.setQuantity(quantity_3);

		item_3.setParentItemId("DI1");

		Tag tag_4 = new Tag();
		tag_4.setCode("type");

		List<com.vinculum.ondc.objects.response.oninit.multipleresponse.List> tagList_4 = new ArrayList<com.vinculum.ondc.objects.response.oninit.multipleresponse.List>();
		com.vinculum.ondc.objects.response.oninit.multipleresponse.List tagListObj4 = new com.vinculum.ondc.objects.response.oninit.multipleresponse.List();
		tagListObj4.setCode("type");
		tagListObj4.setValue("customization");
		tagList_4.add(tagListObj4);
		tag_4.setList(tagList_4);


		Tag tag_5 = new Tag();
		tag_5.setCode("parent");
		List<com.vinculum.ondc.objects.response.oninit.multipleresponse.List> tagList_5 = new ArrayList<com.vinculum.ondc.objects.response.oninit.multipleresponse.List>();
		com.vinculum.ondc.objects.response.oninit.multipleresponse.List tagListObj5 = new com.vinculum.ondc.objects.response.oninit.multipleresponse.List();
		tagListObj5.setCode("id");
		tagListObj5.setValue("CG2");
		tagList_5.add(tagListObj5);
		tag_5.setList(tagList_5);

		List<Tag> tags3 = new ArrayList<Tag>();
     	tags3.add(tag_4);
		tags3.add(tag_5);//
		item_3.setTags(tags3);

		Item item_4 = new Item();
		item_4.setId("C14");
		item_4.setFulfillmentId("F1");
		Quantity quantity_4 = new Quantity();
		quantity_4.setCount(1);
		item_4.setQuantity(quantity_4);

		item_4.setParentItemId("DI1");

		Tag tag_6 = new Tag();
		tag_6.setCode("type");

		List<com.vinculum.ondc.objects.response.oninit.multipleresponse.List> tagList_6 = new ArrayList<com.vinculum.ondc.objects.response.oninit.multipleresponse.List>();
		com.vinculum.ondc.objects.response.oninit.multipleresponse.List tagListObj6 = new com.vinculum.ondc.objects.response.oninit.multipleresponse.List();
		tagListObj6.setCode("type");
		tagListObj6.setValue("customization");
		tagList_6.add(tagListObj6);
		tag_6.setList(tagList_6);

		Tag tag_7 = new Tag();
		tag_7.setCode("parent");
		List<com.vinculum.ondc.objects.response.oninit.multipleresponse.List> tagList_7 = new ArrayList<com.vinculum.ondc.objects.response.oninit.multipleresponse.List>();
		com.vinculum.ondc.objects.response.oninit.multipleresponse.List tagListObj7 = new com.vinculum.ondc.objects.response.oninit.multipleresponse.List();
		tagListObj7.setCode("id");
		tagListObj7.setValue("CG3");
		
		
		tagList_7.add(tagListObj7);
		tag_7.setList(tagList_7);

		List<Tag> tags4 = new ArrayList<Tag>();
		tags4.add(tag_6);
		tags4.add(tag_7);
		item_4.setTags(tags4);

		Item item_5 = new Item();
		item_5.setId("C16");
		item_5.setFulfillmentId("F1");
		Quantity quantity_5 = new Quantity();
		quantity_5.setCount(1);
		item_5.setQuantity(quantity_5);

		item_5.setParentItemId("DI1");

		Tag tag_8 = new Tag();
		tag_8.setCode("type");

		List<com.vinculum.ondc.objects.response.oninit.multipleresponse.List> tagList_8 = new ArrayList<com.vinculum.ondc.objects.response.oninit.multipleresponse.List>();
		com.vinculum.ondc.objects.response.oninit.multipleresponse.List tagListObj8 = new com.vinculum.ondc.objects.response.oninit.multipleresponse.List();
		tagListObj8.setCode("type");
		tagListObj8.setValue("customization");
		tagList_8.add(tagListObj8);
		tag_8.setList(tagList_8);

		Tag tag_9 = new Tag();
		tag_9.setCode("parent");
		List<com.vinculum.ondc.objects.response.oninit.multipleresponse.List> tagList_9 = new ArrayList<com.vinculum.ondc.objects.response.oninit.multipleresponse.List>();
		com.vinculum.ondc.objects.response.oninit.multipleresponse.List tagListObj9 = new com.vinculum.ondc.objects.response.oninit.multipleresponse.List();
		tagListObj9.setCode("id");
		tagListObj9.setValue("CG3");
		tagList_9.add(tagListObj9);
		tag_9.setList(tagList_9);


		List<Tag> tags5 = new ArrayList<Tag>();
		tags5.add(tag_8);
		tags5.add(tag_9);
		item_5.setTags(tags5);

		Item item_6 = new Item();
		item_6.setId("I1");
		item_6.setFulfillmentId("F1");
		Quantity quantity_6 = new Quantity();
		quantity_6.setCount(1);
		item_6.setQuantity(quantity_6);

		item_6.setParentItemId("DI2");

		Tag tag_10 = new Tag();
		tag_10.setCode("type");

		List<com.vinculum.ondc.objects.response.oninit.multipleresponse.List> tagList_10 = new ArrayList<com.vinculum.ondc.objects.response.oninit.multipleresponse.List>();
		com.vinculum.ondc.objects.response.oninit.multipleresponse.List tagListObj10 = new com.vinculum.ondc.objects.response.oninit.multipleresponse.List();
		tagListObj10.setCode("type");
		tagListObj10.setValue("item");
		tagList_10.add(tagListObj10);
		tag_10.setList(tagList_10);


		List<Tag> tags6 = new ArrayList<Tag>();
		tags6.add(tag_10);
		item_6.setTags(tags6);

		Item item_7 = new Item();
		item_7.setId("C2");
		item_7.setFulfillmentId("F1");
		Quantity quantity_7 = new Quantity();
		quantity_7.setCount(1);
		item_7.setQuantity(quantity_7);

		item_7.setParentItemId("DI2");

		Tag tag_11 = new Tag();
		tag_11.setCode("type");

		List<com.vinculum.ondc.objects.response.oninit.multipleresponse.List> tagList_11 = new ArrayList<com.vinculum.ondc.objects.response.oninit.multipleresponse.List>();
		com.vinculum.ondc.objects.response.oninit.multipleresponse.List tagListObj11 = new com.vinculum.ondc.objects.response.oninit.multipleresponse.List();
		tagListObj11.setCode("type");
		tagListObj11.setValue("customization");
		tagList_11.add(tagListObj11);
		tag_11.setList(tagList_11);


		Tag tag_12 = new Tag();
		tag_12.setCode("parent");
		List<com.vinculum.ondc.objects.response.oninit.multipleresponse.List> tagList_12 = new ArrayList<com.vinculum.ondc.objects.response.oninit.multipleresponse.List>();
		com.vinculum.ondc.objects.response.oninit.multipleresponse.List tagListObj12 = new com.vinculum.ondc.objects.response.oninit.multipleresponse.List();
		tagListObj12.setCode("id");
		tagListObj12.setValue("CG1");
		tagList_12.add(tagListObj12);
		tag_12.setList(tagList_12);


		List<Tag> tags7 = new ArrayList<Tag>();
		tags7.add(tag_11);
		tags7.add(tag_12);
		item_7.setTags(tags7);

		Item item_8 = new Item();
		item_8.setId("C7");
		item_8.setFulfillmentId("F1");
		Quantity quantity_8 = new Quantity();
		quantity_8.setCount(1);
		item_8.setQuantity(quantity_8);

		item_8.setParentItemId("DI2");

		Tag tag_13 = new Tag();
		tag_13.setCode("type");

		List<com.vinculum.ondc.objects.response.oninit.multipleresponse.List> tagList_13 = new ArrayList<com.vinculum.ondc.objects.response.oninit.multipleresponse.List>();
		com.vinculum.ondc.objects.response.oninit.multipleresponse.List tagListObj13 = new com.vinculum.ondc.objects.response.oninit.multipleresponse.List();
		tagListObj13.setCode("type");
		tagListObj13.setValue("customization");
		tagList_13.add(tagListObj13);
		tag_13.setList(tagList_13);


		Tag tag_14 = new Tag();
		tag_14.setCode("parent");
		List<com.vinculum.ondc.objects.response.oninit.multipleresponse.List> tagList_14 = new ArrayList<com.vinculum.ondc.objects.response.oninit.multipleresponse.List>();
		com.vinculum.ondc.objects.response.oninit.multipleresponse.List tagListObj14 = new com.vinculum.ondc.objects.response.oninit.multipleresponse.List();
		tagListObj14.setCode("id");
		tagListObj14.setValue("CG2");
		tagList_14.add(tagListObj14);
		tag_14.setList(tagList_14);


		List<Tag> tags8 = new ArrayList<Tag>();
		tags8.add(tag_13);
		tags8.add(tag_14);
		item_8.setTags(tags8);

		Item item_9 = new Item();
		item_9.setId("C14");
		item_9.setFulfillmentId("F1");
		Quantity quantity_9 = new Quantity();
		quantity_9.setCount(1);
		item_9.setQuantity(quantity_9);

		item_9.setParentItemId("DI2");

		Tag tag_15 = new Tag();
		tag_15.setCode("type");

		List<com.vinculum.ondc.objects.response.oninit.multipleresponse.List> tagList_15 = new ArrayList<com.vinculum.ondc.objects.response.oninit.multipleresponse.List>();
		com.vinculum.ondc.objects.response.oninit.multipleresponse.List tagListObj15 = new com.vinculum.ondc.objects.response.oninit.multipleresponse.List();
		tagListObj15.setCode("type");
		tagListObj15.setValue("customization");
		tagList_15.add(tagListObj15);
		tag_15.setList(tagList_15);


		Tag tag_16 = new Tag();
		tag_16.setCode("parent");
		List<com.vinculum.ondc.objects.response.oninit.multipleresponse.List> tagList_16 = new ArrayList<com.vinculum.ondc.objects.response.oninit.multipleresponse.List>();
		com.vinculum.ondc.objects.response.oninit.multipleresponse.List tagListObj16 = new com.vinculum.ondc.objects.response.oninit.multipleresponse.List();
		tagListObj16.setCode("id");
		tagListObj16.setValue("CG3");
		tagList_16.add(tagListObj16);
		tag_16.setList(tagList_16);

		List<Tag> tags9 = new ArrayList<Tag>();
		tags9.add(tag_15);
		tags9.add(tag_16);
		item_9.setTags(tags9);

		Item item_10 = new Item();
		item_10.setId("C15");
		item_10.setFulfillmentId("F1");
		Quantity quantity_10 = new Quantity();
		quantity_10.setCount(1);
		item_10.setQuantity(quantity_10);

		item_10.setParentItemId("DI2");

		Tag tag_17 = new Tag();
		tag_17.setCode("type");

		List<com.vinculum.ondc.objects.response.oninit.multipleresponse.List> tagList_17 = new ArrayList<com.vinculum.ondc.objects.response.oninit.multipleresponse.List>();
		com.vinculum.ondc.objects.response.oninit.multipleresponse.List tagListObj17 = new com.vinculum.ondc.objects.response.oninit.multipleresponse.List();
		tagListObj17.setCode("type");
		tagListObj17.setValue("customization");
		tagList_17.add(tagListObj17);
		tag_17.setList(tagList_17);


		Tag tag_18 = new Tag();
		tag_18.setCode("parent");
		List<com.vinculum.ondc.objects.response.oninit.multipleresponse.List> tagList_18 = new ArrayList<com.vinculum.ondc.objects.response.oninit.multipleresponse.List>();
		com.vinculum.ondc.objects.response.oninit.multipleresponse.List tagListObj18 = new com.vinculum.ondc.objects.response.oninit.multipleresponse.List();
		tagListObj18.setCode("id");
		tagListObj18.setValue("CG3");
		tagList_18.add(tagListObj18);
		tag_18.setList(tagList_18);

		List<Tag> tags10 = new ArrayList<Tag>();
		tags10.add(tag_17);
		tags10.add(tag_18);
		item_10.setTags(tags10);

		List<Item> items = new ArrayList<Item>();
		items.add(item_1);
		items.add(item_2);
		items.add(item_3);
		items.add(item_4);
		items.add(item_5);
		items.add(item_6);
		items.add(item_7);
		items.add(item_8);
		items.add(item_9);
		items.add(item_10);

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

		billing.setTaxNumber("XXXXXXXXXXXXXXX");
		billing.setEmail("nobody@nomail.com");
		billing.setPhone("9886098860");
		billing.setCreatedAt("2023-06-03T09:00:00.000Z");
		billing.setUpdatedAt("2023-06-03T09:00:00.000Z");

		order.setBilling(billing);

		Fulfillment fulfillment = new Fulfillment();
		fulfillment.setId("F1");
		fulfillment.setType("Delivery");
		fulfillment.setTracking(false);

		End end = new End();
		Location location = new Location();
		location.setGps("12.453544,77.928379");

		Address__1 address__1 = new Address__1();
		address__1.setName("my house or door or floor #");
		address__1.setBuilding("my building name or house #");
		address__1.setLocality("my street name");
		address__1.setCity("Bengaluru");
		address__1.setState("Karnataka");
		address__1.setCountry("IND");
		address__1.setAreaCode("560037");

		location.setAddress(address__1);
		end.setLocation(location);

		Contact contact = new Contact();
		contact.setPhone("9886098860");

		end.setContact(contact);

		fulfillment.setEnd(end);

		List<Fulfillment> fulfillments = new ArrayList<Fulfillment>();
		fulfillments.add(fulfillment);

		order.setFulfillments(fulfillments);

		Quote quote = new Quote();
		Price price = new Price();
		price.setCurrency("INR");
		price.setValue("1946.65");

		quote.setPrice(price);

		//////////////////////////////// ------breakup1------//////////////////////////////////////

		Breakup breakup1 = new Breakup();
		breakup1.setOndcOrgItemId("I1");
		
		OndcOrgItemQuantity ondcOrgItemQuantity1 = new OndcOrgItemQuantity(); //
		ondcOrgItemQuantity1.setCount(1);
		breakup1.setOndcOrgItemQuantity(ondcOrgItemQuantity1);

		breakup1.setTitle("Farm House Pizza");
		breakup1.setOndcOrgTitleType("item");

		Price__1 price__1 = new Price__1();
		price__1.setCurrency("INR");
		price__1.setValue("269.00");

		breakup1.setPrice(price__1);

		Item__1 item__1 = new Item__1();
		item__1.setParentItemId("DI1");

		Quantity__1 quantity__1 = new Quantity__1();
		Available available = new Available();
		available.setCount("99");
		quantity__1.setAvailable(available);

		Maximum maximum = new Maximum();
		maximum.setCount("99");
		quantity__1.setMaximum(maximum);

		item__1.setQuantity(quantity__1);

		Price__2 price__2 = new Price__2();
		price__2.setCurrency("INR");
		price__2.setValue("269.00");

		item__1.setPrice(price__2);

		Tag__1 tag__1 = new Tag__1();
		tag__1.setCode("type");

		List__1 list__1 = new List__1();
		list__1.setCode("type");
		list__1.setValue("item");

		List<List__1> list__1s = new ArrayList<List__1>();
		list__1s.add(list__1);

		tag__1.setList(list__1s);

		List<Tag__1> tag__1s = new ArrayList<Tag__1>();
		tag__1s.add(tag__1);

		item__1.setTags(tag__1s);

		breakup1.setItem(item__1);

		//////////////////////////////// ------breakup2------//////////////////////////////////////

		Breakup breakup2 = new Breakup();
		breakup2.setOndcOrgItemId("C1");

		OndcOrgItemQuantity ondcOrgItemQuantity2 = new OndcOrgItemQuantity();
		ondcOrgItemQuantity2.setCount(1);
		breakup2.setOndcOrgItemQuantity(ondcOrgItemQuantity2);


		breakup2.setTitle("New Hand Tossed");
		breakup2.setOndcOrgTitleType("item");

		Price__1 price__3 = new Price__1();
		price__3.setCurrency("INR");
		price__3.setValue("0.00");

		breakup2.setPrice(price__3);

		Item__1 item__2 = new Item__1();
		item__2.setParentItemId("DI1");

		Quantity__1 quantity__2 = new Quantity__1();
		Available available2 = new Available();
		available2.setCount("99");
		quantity__2.setAvailable(available2);

		Maximum maximum2 = new Maximum();
		maximum2.setCount("99");
		quantity__2.setMaximum(maximum2);

		item__2.setQuantity(quantity__2);

		Price__2 price__4 = new Price__2();
		price__4.setCurrency("INR");
		price__4.setValue("0.00");

		item__2.setPrice(price__4);

		Tag__1 tag__2 = new Tag__1();
		tag__2.setCode("type");

		List__1 list__2 = new List__1();
		list__2.setCode("type");
		list__2.setValue("customization");

		List<List__1> list__2s = new ArrayList<List__1>();
		list__2s.add(list__2);

		tag__2.setList(list__2s);

		Tag__1 tag__3 = new Tag__1();
		tag__3.setCode("parent");

		List__1 list__3 = new List__1();
		list__3.setCode("id");
		list__3.setValue("CG1");

		List<List__1> list__3s = new ArrayList<List__1>();
		list__3s.add(list__3);

		tag__3.setList(list__3s);

		List<Tag__1> tag__2s = new ArrayList<Tag__1>();
		tag__2s.add(tag__2);
		tag__2s.add(tag__3);

		item__2.setTags(tag__2s);

		breakup2.setItem(item__2);

		//////////////////////////////// ------breakup3------//////////////////////////////////////

		Breakup breakup3 = new Breakup();
		breakup3.setOndcOrgItemId("C7");

		OndcOrgItemQuantity ondcOrgItemQuantity3 = new OndcOrgItemQuantity();
		ondcOrgItemQuantity3.setCount(1);
		breakup3.setOndcOrgItemQuantity(ondcOrgItemQuantity3);

		breakup3.setTitle("Large");
		breakup3.setOndcOrgTitleType("item");

		Price__1 price__5 = new Price__1();
		price__5.setCurrency("INR");
		price__5.setValue("450.00");

		breakup3.setPrice(price__5);

		Item__1 item__3 = new Item__1();
		item__3.setParentItemId("DI1");

		Quantity__1 quantity__3 = new Quantity__1();
		Available available3 = new Available();
		available3.setCount("99");
		quantity__3.setAvailable(available3);

		Maximum maximum3 = new Maximum();
		maximum3.setCount("99");
		quantity__3.setMaximum(maximum3);

		item__3.setQuantity(quantity__3);

		Price__2 price__6 = new Price__2();
		price__6.setCurrency("INR");
		price__6.setValue("450.00");

		item__3.setPrice(price__6);

		Tag__1 tag__4 = new Tag__1();
		tag__4.setCode("type");

		List__1 list__4 = new List__1();
		list__4.setCode("type");
		list__4.setValue("customization");

		List<List__1> list__4s = new ArrayList<List__1>();
		list__4s.add(list__4);

		tag__4.setList(list__4s);

		Tag__1 tag__5 = new Tag__1();
		tag__5.setCode("parent");

		List__1 list__5 = new List__1();
		list__5.setCode("id");
		list__5.setValue("CG2");

		List<List__1> list__5s = new ArrayList<List__1>();
		list__5s.add(list__5);

		tag__5.setList(list__5s);

		List<Tag__1> tag__3s = new ArrayList<Tag__1>();
		tag__3s.add(tag__4);
		tag__3s.add(tag__5);

		item__3.setTags(tag__3s);

		breakup3.setItem(item__3);

		//////////////////////////////// ------breakup4------//////////////////////////////////////

		Breakup breakup4 = new Breakup();
		breakup4.setOndcOrgItemId("C14");

		OndcOrgItemQuantity ondcOrgItemQuantity4 = new OndcOrgItemQuantity();
		ondcOrgItemQuantity4.setCount(1);
		breakup4.setOndcOrgItemQuantity(ondcOrgItemQuantity4);

		breakup4.setTitle("Grilled Mushrooms");
		breakup4.setOndcOrgTitleType("item");

		Price__1 price__7 = new Price__1();
		price__7.setCurrency("INR");
		price__7.setValue("80.00");

		breakup4.setPrice(price__7);

		Item__1 item__4 = new Item__1();
		item__4.setParentItemId("DI1");

		Quantity__1 quantity__4 = new Quantity__1();
		Available available4 = new Available();
		available4.setCount("99");
		quantity__4.setAvailable(available4);

		Maximum maximum4 = new Maximum();
		maximum4.setCount("99");
		quantity__4.setMaximum(maximum4);

		item__4.setQuantity(quantity__4);

		Price__2 price__8 = new Price__2();
		price__8.setCurrency("INR");
		price__8.setValue("80.00");

		item__4.setPrice(price__8);

		Tag__1 tag__6 = new Tag__1();
		tag__6.setCode("type");

		List__1 list__6 = new List__1();
		list__6.setCode("type");
		list__6.setValue("customization");

		List<List__1> list__6s = new ArrayList<List__1>();
		list__6s.add(list__6);

		tag__6.setList(list__6s);

		Tag__1 tag__7 = new Tag__1();
		tag__7.setCode("parent");

		List__1 list__7 = new List__1();
		list__7.setCode("id");
		list__7.setValue("CG3");

		List<List__1> list__7s = new ArrayList<List__1>();
		list__7s.add(list__7);

		tag__7.setList(list__7s);

		List<Tag__1> tag__4s = new ArrayList<Tag__1>();
		tag__4s.add(tag__6);
		tag__4s.add(tag__7);

		item__4.setTags(tag__4s);

		breakup4.setItem(item__4);

		//////////////////////////////// ------breakup5------//////////////////////////////////////

		Breakup breakup5 = new Breakup();
		breakup5.setOndcOrgItemId("C16");

		OndcOrgItemQuantity ondcOrgItemQuantity5 = new OndcOrgItemQuantity();
		ondcOrgItemQuantity5.setCount(1);
		breakup5.setOndcOrgItemQuantity(ondcOrgItemQuantity5);

		breakup5.setTitle("Pepper Barbeque Chicken");
		breakup5.setOndcOrgTitleType("item");

		Price__1 price__9 = new Price__1();
		price__9.setCurrency("INR");
		price__9.setValue("95.00");

		breakup5.setPrice(price__9);

		Item__1 item__5 = new Item__1();
		item__5.setParentItemId("DI1");

		Quantity__1 quantity__5 = new Quantity__1();
		Available available5 = new Available();
		available5.setCount("99");
		quantity__5.setAvailable(available5);

		Maximum maximum5 = new Maximum();
		maximum5.setCount("99");
		quantity__5.setMaximum(maximum5);

		item__5.setQuantity(quantity__5);

		Price__2 price__10 = new Price__2();
		price__10.setCurrency("INR");
		price__10.setValue("95.00");

		item__5.setPrice(price__10);

		Tag__1 tag__8 = new Tag__1();
		tag__8.setCode("type");

		List__1 list__8 = new List__1();
		list__8.setCode("type");
		list__8.setValue("customization");

		List<List__1> list__8s = new ArrayList<List__1>();
		list__8s.add(list__8);

		tag__8.setList(list__8s);

		Tag__1 tag__9 = new Tag__1();
		tag__9.setCode("parent");

		List__1 list__9 = new List__1();
		list__9.setCode("id");
		list__9.setValue("CG3");

		List<List__1> list__9s = new ArrayList<List__1>();
		list__9s.add(list__9);

		tag__9.setList(list__9s);

		List<Tag__1> tag__5s = new ArrayList<Tag__1>();
		tag__5s.add(tag__8);
		tag__5s.add(tag__9);

		item__5.setTags(tag__5s);

		breakup5.setItem(item__5);

		//////////////////////////////// ------breakup6------//////////////////////////////////////

		Breakup breakup6 = new Breakup();
		breakup6.setOndcOrgItemId("I1");

		OndcOrgItemQuantity ondcOrgItemQuantity6 = new OndcOrgItemQuantity();
		ondcOrgItemQuantity6.setCount(1);
		breakup6.setOndcOrgItemQuantity(ondcOrgItemQuantity6);

		breakup6.setTitle("Farm House Pizza");
		breakup6.setOndcOrgTitleType("item");

		Price__1 price__11 = new Price__1();
		price__11.setCurrency("INR");
		price__11.setValue("269.00");

		breakup6.setPrice(price__11);

		Item__1 item__6 = new Item__1();
		item__6.setParentItemId("DI2");

		Quantity__1 quantity__6 = new Quantity__1();
		Available available6 = new Available();
		available6.setCount("99");
		quantity__6.setAvailable(available6);

		Maximum maximum6 = new Maximum();
		maximum6.setCount("99");
		quantity__6.setMaximum(maximum6);

		item__6.setQuantity(quantity__6);

		Price__2 price__12 = new Price__2();
		price__12.setCurrency("INR");
		price__12.setValue("269.00");

		item__6.setPrice(price__12);

		Tag__1 tag__10 = new Tag__1();
		tag__10.setCode("type");

		List__1 list__10 = new List__1();
		list__10.setCode("type");
		list__10.setValue("item");

		List<List__1> list__10s = new ArrayList<List__1>();
		list__10s.add(list__10);

		tag__10.setList(list__10s);

		List<Tag__1> tag__6s = new ArrayList<Tag__1>();
		tag__6s.add(tag__10);

		item__6.setTags(tag__6s);

		breakup6.setItem(item__6);

		//////////////////////////////// ------breakup7------//////////////////////////////////////

		Breakup breakup7 = new Breakup();
		breakup7.setOndcOrgItemId("C2");

		OndcOrgItemQuantity ondcOrgItemQuantity7 = new OndcOrgItemQuantity();
		ondcOrgItemQuantity7.setCount(1);
		breakup7.setOndcOrgItemQuantity(ondcOrgItemQuantity7);

		breakup7.setTitle("100% Wheat Thin Crust");
		breakup7.setOndcOrgTitleType("item");

		Price__1 price__13 = new Price__1();
		price__13.setCurrency("INR");
		price__13.setValue("0.00");

		breakup7.setPrice(price__13);

		Item__1 item__7 = new Item__1();
		item__7.setParentItemId("DI2");

		Quantity__1 quantity__7 = new Quantity__1();
		Available available7 = new Available();
		available7.setCount("99");
		quantity__7.setAvailable(available7);

		Maximum maximum7 = new Maximum();
		maximum7.setCount("99");
		quantity__7.setMaximum(maximum7);

		item__7.setQuantity(quantity__7);

		Price__2 price__14 = new Price__2();
		price__14.setCurrency("INR");
		price__14.setValue("0.00");

		item__7.setPrice(price__14);

		Tag__1 tag__11 = new Tag__1();
		tag__11.setCode("type");

		List__1 list__11 = new List__1();
		list__11.setCode("type");
		list__11.setValue("customization");

		List<List__1> list__11s = new ArrayList<List__1>();
		list__11s.add(list__11);

		tag__11.setList(list__11s);

		Tag__1 tag__12 = new Tag__1();
		tag__12.setCode("parent");

		List__1 list__12 = new List__1();
		list__12.setCode("id");
		list__12.setValue("CG1");

		List<List__1> list__12s = new ArrayList<List__1>();
		list__12s.add(list__12);

		tag__12.setList(list__12s);

		List<Tag__1> tag__7s = new ArrayList<Tag__1>();
		tag__7s.add(tag__11);
		tag__7s.add(tag__12);

		item__7.setTags(tag__7s);

		breakup7.setItem(item__7);

		//////////////////////////////// ------breakup8------//////////////////////////////////////

		Breakup breakup8 = new Breakup();
		breakup8.setOndcOrgItemId("C7");

		OndcOrgItemQuantity ondcOrgItemQuantity8 = new OndcOrgItemQuantity();
		ondcOrgItemQuantity8.setCount(1);
		breakup8.setOndcOrgItemQuantity(ondcOrgItemQuantity8);

		breakup8.setTitle("Large");
		breakup8.setOndcOrgTitleType("item");

		Price__1 price__15 = new Price__1();
		price__15.setCurrency("INR");
		price__15.setValue("450.00");

		breakup8.setPrice(price__15);

		Item__1 item__8 = new Item__1();
		item__8.setParentItemId("DI2");

		Quantity__1 quantity__8 = new Quantity__1();
		Available available8 = new Available();
		available8.setCount("99");
		quantity__8.setAvailable(available8);

		Maximum maximum8 = new Maximum();
		maximum8.setCount("99");
		quantity__8.setMaximum(maximum8);

		item__8.setQuantity(quantity__8);

		Price__2 price__16 = new Price__2();
		price__16.setCurrency("INR");
		price__16.setValue("450.00");

		item__8.setPrice(price__16);

		Tag__1 tag__13 = new Tag__1();
		tag__13.setCode("type");

		List__1 list__13 = new List__1();
		list__13.setCode("type");
		list__13.setValue("customization");

		List<List__1> list__13s = new ArrayList<List__1>();
		list__13s.add(list__13);

		tag__13.setList(list__13s);

		Tag__1 tag__14 = new Tag__1();
		tag__14.setCode("parent");

		List__1 list__14 = new List__1();
		list__14.setCode("id");
		list__14.setValue("CG2");

		List<List__1> list__14s = new ArrayList<List__1>();
		list__14s.add(list__14);

		tag__14.setList(list__14s);

		List<Tag__1> tag__8s = new ArrayList<Tag__1>();
		tag__8s.add(tag__13);
		tag__8s.add(tag__14);

		item__8.setTags(tag__8s);

		breakup8.setItem(item__8);

		//////////////////////////////// ------breakup9------//////////////////////////////////////

		Breakup breakup9 = new Breakup();
		breakup9.setOndcOrgItemId("C14");

		OndcOrgItemQuantity ondcOrgItemQuantity9 = new OndcOrgItemQuantity();
		ondcOrgItemQuantity9.setCount(1);
		breakup9.setOndcOrgItemQuantity(ondcOrgItemQuantity9);

		breakup9.setTitle("Grilled Mushrooms");
		breakup9.setOndcOrgTitleType("item");

		Price__1 price__17 = new Price__1();
		price__17.setCurrency("INR");
		price__17.setValue("80.00");

		breakup9.setPrice(price__17);

		Item__1 item__9 = new Item__1();
		item__9.setParentItemId("DI2");

		Quantity__1 quantity__9 = new Quantity__1();
		Available available9 = new Available();
		available9.setCount("99");
		quantity__9.setAvailable(available9);

		Maximum maximum9 = new Maximum();
		maximum9.setCount("99");
		quantity__9.setMaximum(maximum9);

		item__9.setQuantity(quantity__9);

		Price__2 price__18 = new Price__2();
		price__18.setCurrency("INR");
		price__18.setValue("80.00");

		item__9.setPrice(price__18);

		Tag__1 tag__15 = new Tag__1();
		tag__15.setCode("type");

		List__1 list__15 = new List__1();
		list__15.setCode("type");
		list__15.setValue("customization");

		List<List__1> list__15s = new ArrayList<List__1>();
		list__15s.add(list__15);

		tag__15.setList(list__15s);

		Tag__1 tag__16 = new Tag__1();
		tag__16.setCode("parent");

		List__1 list__16 = new List__1();
		list__16.setCode("id");
		list__16.setValue("CG3");

		List<List__1> list__16s = new ArrayList<List__1>();
		list__16s.add(list__16);

		tag__16.setList(list__16s);

		List<Tag__1> tag__9s = new ArrayList<Tag__1>();
		tag__9s.add(tag__15);
		tag__9s.add(tag__16);

		item__9.setTags(tag__9s);

		breakup9.setItem(item__9);

		//////////////////////////////// ------breakup10------//////////////////////////////////////

		Breakup breakup10 = new Breakup();
		breakup10.setOndcOrgItemId("C15");

		OndcOrgItemQuantity ondcOrgItemQuantity10 = new OndcOrgItemQuantity();
		ondcOrgItemQuantity10.setCount(1);
		breakup10.setOndcOrgItemQuantity(ondcOrgItemQuantity10);
		
		breakup10.setTitle("Fresh Tomato");
		breakup10.setOndcOrgTitleType("item");

		Price__1 price__19 = new Price__1();
		price__19.setCurrency("INR");
		price__19.setValue("80.00");

		breakup10.setPrice(price__19);

		Item__1 item__10 = new Item__1();
		item__10.setParentItemId("DI2");

		Quantity__1 quantity__10 = new Quantity__1();
		Available available10 = new Available();
		available10.setCount("99");
		quantity__10.setAvailable(available10);

		Maximum maximum10 = new Maximum();
		maximum10.setCount("99");
		quantity__10.setMaximum(maximum10);

		item__10.setQuantity(quantity__10);

		Price__2 price__20 = new Price__2();
		price__20.setCurrency("INR");
		price__20.setValue("80.00");

		item__10.setPrice(price__20);

		Tag__1 tag__17 = new Tag__1();
		tag__17.setCode("type");

		List__1 list__17 = new List__1();
		list__17.setCode("type");
		list__17.setValue("customization");

		List<List__1> list__17s = new ArrayList<List__1>();
		list__17s.add(list__17);

		tag__17.setList(list__17s);

		Tag__1 tag__18 = new Tag__1();
		tag__18.setCode("parent");

		List__1 list__18 = new List__1();
		list__18.setCode("id");
		list__18.setValue("CG3");

		List<List__1> list__18s = new ArrayList<List__1>();
		list__18s.add(list__18);

		tag__18.setList(list__18s);

		List<Tag__1> tag__10s = new ArrayList<Tag__1>();
		tag__10s.add(tag__17);
		tag__10s.add(tag__18);

		item__10.setTags(tag__10s);

		breakup10.setItem(item__10);

		//////////////////////////////// ------breakup11------//////////////////////////////////////

		Breakup breakup11 = new Breakup();
		breakup11.setOndcOrgItemId("I1");

		breakup11.setTitle("Tax");
		breakup11.setOndcOrgTitleType("tax");

		Price__1 price__21 = new Price__1();
		price__21.setCurrency("INR");
		price__21.setValue("13.45");

		breakup11.setPrice(price__21);

		Item__1 item__11 = new Item__1();
		item__11.setParentItemId("DI2");

		Tag__1 tag__19 = new Tag__1();
		tag__19.setCode("type");

		List__1 list__19 = new List__1();
		list__19.setCode("type");
		list__19.setValue("item");

		List<List__1> list__19s = new ArrayList<List__1>();
		list__19s.add(list__19);

		tag__19.setList(list__19s);

		List<Tag__1> tag__11s = new ArrayList<Tag__1>();
		tag__11s.add(tag__19);

		item__11.setTags(tag__11s);
		breakup11.setItem(item__11);

		//////////////////////////////// ------breakup12------//////////////////////////////////////

		Breakup breakup12 = new Breakup();
		breakup12.setOndcOrgItemId("C1");

		breakup12.setTitle("Tax");
		breakup12.setOndcOrgTitleType("tax");

		Price__1 price__22 = new Price__1();
		price__22.setCurrency("INR");
		price__22.setValue("0.00");

		breakup12.setPrice(price__22);

		Item__1 item__12 = new Item__1();
		item__12.setParentItemId("DI1");

		Tag__1 tag__20 = new Tag__1();
		tag__20.setCode("type");

		List__1 list__20 = new List__1();
		list__20.setCode("type");
		list__20.setValue("customization");

		List<List__1> list__20s = new ArrayList<List__1>();
		list__20s.add(list__20);

		tag__20.setList(list__20s);

		Tag__1 tag__21 = new Tag__1();
		tag__21.setCode("parent");

		List__1 list__21 = new List__1();
		list__21.setCode("id");
		list__21.setValue("CG1");

		List<List__1> list__21s = new ArrayList<List__1>();
		list__21s.add(list__21);

		tag__21.setList(list__21s);

		List<Tag__1> tag__12s = new ArrayList<Tag__1>();
		tag__12s.add(tag__20);
		tag__12s.add(tag__21);

		item__12.setTags(tag__12s);

		breakup12.setItem(item__12);

		//////////////////////////////// ------breakup13------//////////////////////////////////////

		Breakup breakup13 = new Breakup();
		breakup13.setOndcOrgItemId("C7");

		breakup13.setTitle("Tax");
		breakup13.setOndcOrgTitleType("tax");

		Price__1 price__23 = new Price__1();
		price__23.setCurrency("INR");
		price__23.setValue("22.50");

		breakup13.setPrice(price__23);

		Item__1 item__13 = new Item__1();
		item__13.setParentItemId("DI1");

		Tag__1 tag__22 = new Tag__1();
		tag__22.setCode("type");

		List__1 list__22 = new List__1();
		list__22.setCode("type");
		list__22.setValue("customization");

		List<List__1> list__22s = new ArrayList<List__1>();
		list__22s.add(list__22);

		tag__22.setList(list__22s);

		Tag__1 tag__23 = new Tag__1();
		tag__23.setCode("parent");

		List__1 list__23 = new List__1();
		list__23.setCode("id");
		list__23.setValue("CG2");

		List<List__1> list__23s = new ArrayList<List__1>();
		list__23s.add(list__23);

		tag__23.setList(list__23s);

		List<Tag__1> tag__13s = new ArrayList<Tag__1>();
		tag__13s.add(tag__22);
		tag__13s.add(tag__23);

		item__13.setTags(tag__13s);

		breakup13.setItem(item__13);

		//////////////////////////////// ------breakup14------//////////////////////////////////////

		Breakup breakup14 = new Breakup();
		breakup14.setOndcOrgItemId("C14");

		breakup14.setTitle("Tax");
		breakup14.setOndcOrgTitleType("tax");

		Price__1 price__24 = new Price__1();
		price__24.setCurrency("INR");
		price__24.setValue("4.00");

		breakup14.setPrice(price__24);

		Item__1 item__14 = new Item__1();
		item__14.setParentItemId("DI1");

		Tag__1 tag__24 = new Tag__1();
		tag__24.setCode("type");

		List__1 list__24 = new List__1();
		list__24.setCode("type");
		list__24.setValue("customization");

		List<List__1> list__24s = new ArrayList<List__1>();
		list__24s.add(list__24);

		tag__24.setList(list__24s);

		Tag__1 tag__25 = new Tag__1();
		tag__25.setCode("parent");

		List__1 list__25 = new List__1();
		list__25.setCode("id");
		list__25.setValue("CG3");

		List<List__1> list__25s = new ArrayList<List__1>();
		list__25s.add(list__25);

		tag__25.setList(list__25s);

		List<Tag__1> tag__14s = new ArrayList<Tag__1>();
		tag__14s.add(tag__24);
		tag__14s.add(tag__25);

		item__14.setTags(tag__14s);

		breakup14.setItem(item__14);

		//////////////////////////////// ------breakup15------//////////////////////////////////////

		Breakup breakup15 = new Breakup();
		breakup15.setOndcOrgItemId("C16");

		breakup15.setTitle("Tax");
		breakup15.setOndcOrgTitleType("tax");

		Price__1 price__25 = new Price__1();
		price__25.setCurrency("INR");
		price__25.setValue("4.75");

		breakup15.setPrice(price__25);

		Item__1 item__15 = new Item__1();
		item__15.setParentItemId("DI1");

		Tag__1 tag__26 = new Tag__1();
		tag__26.setCode("type");

		List__1 list__26 = new List__1();
		list__26.setCode("type");
		list__26.setValue("customization");

		List<List__1> list__26s = new ArrayList<List__1>();
		list__26s.add(list__26);

		tag__26.setList(list__26s);

		Tag__1 tag__27 = new Tag__1();
		tag__27.setCode("parent");

		List__1 list__27 = new List__1();
		list__27.setCode("id");
		list__27.setValue("CG1");

		List<List__1> list__27s = new ArrayList<List__1>();
		list__27s.add(list__27);

		tag__27.setList(list__27s);

		List<Tag__1> tag__15s = new ArrayList<Tag__1>();
		tag__15s.add(tag__26);
		tag__15s.add(tag__27);

		item__15.setTags(tag__15s);

		breakup15.setItem(item__15);

		//////////////////////////////// ------breakup16------//////////////////////////////////////

		Breakup breakup16 = new Breakup();
		breakup16.setOndcOrgItemId("I1");

		breakup16.setTitle("Tax");
		breakup16.setOndcOrgTitleType("tax");

		Price__1 price__26 = new Price__1();
		price__26.setCurrency("INR");
		price__26.setValue("13.45");

		breakup16.setPrice(price__26);

		Item__1 item__16 = new Item__1();
		item__16.setParentItemId("DI1");

		Tag__1 tag__28 = new Tag__1();
		tag__28.setCode("type");

		List__1 list__28 = new List__1();
		list__28.setCode("type");
		list__28.setValue("item");

		List<List__1> list__28s = new ArrayList<List__1>();
		list__28s.add(list__28);

		tag__28.setList(list__28s);

		List<Tag__1> tag__16s = new ArrayList<Tag__1>();
		tag__16s.add(tag__28);

		item__16.setTags(tag__16s);

		breakup16.setItem(item__16);

		//////////////////////////////// ------breakup17------//////////////////////////////////////

		Breakup breakup17 = new Breakup();
		breakup17.setOndcOrgItemId("C2");

		breakup17.setTitle("Tax");
		breakup17.setOndcOrgTitleType("tax");

		Price__1 price__27 = new Price__1();
		price__27.setCurrency("INR");
		price__27.setValue("22.50");

		breakup17.setPrice(price__27);

		Item__1 item__17 = new Item__1();
		item__17.setParentItemId("DI2");

		Tag__1 tag__29 = new Tag__1();
		tag__29.setCode("type");

		List__1 list__29 = new List__1();
		list__29.setCode("type");
		list__29.setValue("customization");

		List<List__1> list__29s = new ArrayList<List__1>();
		list__29s.add(list__29);

		tag__29.setList(list__29s);

		Tag__1 tag__30 = new Tag__1();
		tag__30.setCode("parent");

		List__1 list__30 = new List__1();
		list__30.setCode("id");
		list__30.setValue("CG1");

		List<List__1> list__30s = new ArrayList<List__1>();
		list__30s.add(list__30);

		tag__30.setList(list__30s);

		List<Tag__1> tag__17s = new ArrayList<Tag__1>();
		tag__17s.add(tag__29);
		tag__17s.add(tag__30);

		item__17.setTags(tag__17s);

		breakup17.setItem(item__17);

		//////////////////////////////// ------breakup18------//////////////////////////////////////

		Breakup breakup18 = new Breakup();
		breakup18.setOndcOrgItemId("C7");

		breakup18.setTitle("Tax");
		breakup18.setOndcOrgTitleType("tax");

		Price__1 price__28 = new Price__1();
		price__28.setCurrency("INR");
		price__28.setValue("22.50");

		breakup18.setPrice(price__28);

		Item__1 item__18 = new Item__1();
		item__18.setParentItemId("DI2");

		Tag__1 tag__31 = new Tag__1();
		tag__31.setCode("type");

		List__1 list__31 = new List__1();
		list__31.setCode("type");
		list__31.setValue("customization");

		List<List__1> list__31s = new ArrayList<List__1>();
		list__31s.add(list__31);

		tag__31.setList(list__31s);

		Tag__1 tag__32 = new Tag__1();
		tag__32.setCode("parent");

		List__1 list__32 = new List__1();
		list__32.setCode("id");
		list__32.setValue("CG2");

		List<List__1> list__32s = new ArrayList<List__1>();
		list__32s.add(list__32);

		tag__32.setList(list__32s);

		List<Tag__1> tag__18s = new ArrayList<Tag__1>();
		tag__18s.add(tag__31);
		tag__18s.add(tag__32);

		item__18.setTags(tag__18s);

		breakup18.setItem(item__18);

		//////////////////////////////// ------breakup19------//////////////////////////////////////

//		Breakup breakup19 = new Breakup();
//		breakup19.setOndcOrgItemId("C7");
//
//		breakup19.setTitle("Tax");
//		breakup19.setOndcOrgTitleType("tax");
//
//		Price__1 price__29 = new Price__1();
//		price__29.setCurrency("INR");
//		price__29.setValue("22.50");
//
//		breakup19.setPrice(price__29);
//
//		Item__1 item__19 = new Item__1();
//		item__19.setParentItemId("DI2");
//
//		Tag__1 tag__33 = new Tag__1();
//		tag__33.setCode("type");
//
//		List__1 list__33 = new List__1();
//		list__33.setCode("type");
//		list__33.setValue("customization");
//
//		List<List__1> list__33s = new ArrayList<List__1>();
//		list__33s.add(list__33);
//
//		tag__33.setList(list__33s);
//
//		Tag__1 tag__34 = new Tag__1();
//		tag__34.setCode("parent");
//
//		List__1 list__34 = new List__1();
//		list__34.setCode("id");
//		list__34.setValue("CG2");
//
//		List<List__1> list__34s = new ArrayList<List__1>();
//		list__34s.add(list__34);
//
//		tag__34.setList(list__34s);
//
//		List<Tag__1> tag__19s = new ArrayList<Tag__1>();
//		tag__19s.add(tag__33);
//		tag__19s.add(tag__34);
//
//		item__19.setTags(tag__19s);
//
//		breakup19.setItem(item__19);

		//////////////////////////////// ------breakup20------//////////////////////////////////////

		Breakup breakup20 = new Breakup();
		breakup20.setOndcOrgItemId("C14");

		breakup20.setTitle("Tax");
		breakup20.setOndcOrgTitleType("tax");

		Price__1 price__30 = new Price__1();
		price__30.setCurrency("INR");
		price__30.setValue("4.00");

		breakup20.setPrice(price__30);

		Item__1 item__20 = new Item__1();
		item__20.setParentItemId("DI2");

		Tag__1 tag__35 = new Tag__1();
		tag__35.setCode("type");

		List__1 list__35 = new List__1();
		list__35.setCode("type");
		list__35.setValue("customization");

		List<List__1> list__35s = new ArrayList<List__1>();
		list__35s.add(list__35);

		tag__35.setList(list__35s);

		Tag__1 tag__36 = new Tag__1();
		tag__36.setCode("parent");

		List__1 list__36 = new List__1();
		list__36.setCode("id");
		list__36.setValue("CG3");

		List<List__1> list__36s = new ArrayList<List__1>();
		list__36s.add(list__36);

		tag__36.setList(list__36s);

		List<Tag__1> tag__20s = new ArrayList<Tag__1>();
		tag__20s.add(tag__35);
		tag__20s.add(tag__36);

		item__20.setTags(tag__20s);

		breakup20.setItem(item__20);

		//////////////////////////////// ------breakup21------//////////////////////////////////////

		Breakup breakup21 = new Breakup();
		breakup21.setOndcOrgItemId("C15");

		breakup21.setTitle("Tax");
		breakup21.setOndcOrgTitleType("tax");

		Price__1 price__31 = new Price__1();
		price__31.setCurrency("INR");
		price__31.setValue("4.00");

		breakup21.setPrice(price__31);

		Item__1 item__21 = new Item__1();
		item__21.setParentItemId("DI2");

		Tag__1 tag__37 = new Tag__1();
		tag__37.setCode("type");

		List__1 list__37 = new List__1();
		list__37.setCode("type");
		list__37.setValue("customization");

		List<List__1> list__37s = new ArrayList<List__1>();
		list__37s.add(list__37);

		tag__37.setList(list__37s);

		Tag__1 tag__38 = new Tag__1();
		tag__38.setCode("parent");

		List__1 list__38 = new List__1();
		list__38.setCode("id");
		list__38.setValue("CG3");

		List<List__1> list__38s = new ArrayList<List__1>();
		list__38s.add(list__38);

		tag__38.setList(list__38s);

		List<Tag__1> tag__21s = new ArrayList<Tag__1>();
		tag__21s.add(tag__37);
		tag__21s.add(tag__38);

		item__21.setTags(tag__21s);

		breakup21.setItem(item__21);

		//////////////////////////////// ------breakup22------//////////////////////////////////////

		Breakup breakup22 = new Breakup();
		breakup22.setOndcOrgItemId("F1");

		breakup22.setTitle("Delivery charges");
		breakup22.setOndcOrgTitleType("delivery");

		Price__1 price__32 = new Price__1();
		price__32.setCurrency("INR");
		price__32.setValue("50.00");

		breakup22.setPrice(price__32);

		//////////////////////////////// ------breakup23------//////////////////////////////////////

		Breakup breakup23 = new Breakup();
		breakup23.setOndcOrgItemId("F1");

		breakup23.setTitle("Packing charges");
		breakup23.setOndcOrgTitleType("packing");

		Price__1 price__33 = new Price__1();
		price__33.setCurrency("INR");
		price__33.setValue("25.00");

		breakup23.setPrice(price__33);

		//////////////////////////////// ------breakup24------//////////////////////////////////////

		Breakup breakup24 = new Breakup();
		breakup24.setOndcOrgItemId("F1");

		breakup24.setTitle("Convenience Fee");
		breakup24.setOndcOrgTitleType("misc");

		Price__1 price__34 = new Price__1();
		price__34.setCurrency("INR");
		price__34.setValue("10.00");

		breakup24.setPrice(price__34);

		List<Breakup> breakups = new ArrayList<Breakup>();
		breakups.add(breakup1);
		breakups.add(breakup2);
		breakups.add(breakup3);
		breakups.add(breakup4);
		breakups.add(breakup5);
		breakups.add(breakup6);
		breakups.add(breakup7);
		breakups.add(breakup8);
		breakups.add(breakup9);
		breakups.add(breakup10);
		breakups.add(breakup11);
		breakups.add(breakup12);
		breakups.add(breakup13);
		breakups.add(breakup14);
		breakups.add(breakup15);
		breakups.add(breakup16);
		breakups.add(breakup17);
		breakups.add(breakup18);
//		breakups.add(breakup19);
		breakups.add(breakup20);
		breakups.add(breakup21);
		breakups.add(breakup22);
		breakups.add(breakup23);
		breakups.add(breakup24);

		quote.setBreakup(breakups);

		quote.setTtl("PT1H");

		order.setQuote(quote);

		Payment payment = new Payment();
		payment.setOndcOrgBuyerAppFinderFeeType("percent");
		payment.setOndcOrgBuyerAppFinderFeeAmount("3");

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

		message.setOrder(order);

		onInit.setMessage(message);
		
		String json = "";
		try {
			ObjectMapper objectMapper = new ObjectMapper();
//			objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			json = objectMapper.writeValueAsString(onInit);
			System.out.println(json);
		} catch (Exception e) {
			e.printStackTrace();
		}

       return json;

	}

	

}
