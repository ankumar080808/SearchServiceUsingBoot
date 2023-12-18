package com.vinculum.ondc.objects.response.onselect.ItemNotInStock;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vinculum.ondc.constants.Constants;
import com.vinculum.ondc.objects.response.OnEventPayloadGenerator;

public class ItemNotInStockGenerator implements OnEventPayloadGenerator {

	

	public String generate() {

		String jsonPayload = null;

		// Populate Context
		Context context = new Context();
		context.setDomain("ONDC:RET11");
		context.setCountry("IND");
		context.setCity("std:080");
		context.setAction(Constants.ON_SELECT);
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
		pro.setId("P1");
		order.setProvider(pro);
		List<Item> items = new ArrayList<>();
		Item item = new Item();
		item.setFulfillmentId("F1");
		item.setId("I1");
		items.add(item);
		order.setItems(items);
		List<Fulfillment> fulfillments = new ArrayList<>();
		Fulfillment fulfillment = new Fulfillment();
		fulfillment.setId("F1");
		fulfillment.setOndcOrgProviderName("LSP or Provider Name");
		fulfillment.setTracking(false);
		fulfillment.setOndcOrgCategory("Immediate Delivery");
		fulfillment.setOndcOrgTAT("PT60M");
		State st = new State();
		Descriptor des = new Descriptor();
		des.setCode("Servicable");
		st.setDescriptor(des);
		fulfillment.setState(st);
		fulfillments.add(fulfillment);
		order.setFulfillments(fulfillments);

		Quote quote = new Quote();
		Price price = new Price();
		price.setCurrency("INR");
		price.setValue("245");
		quote.setPrice(price);
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
		Quantity quant = new Quantity();
		Available avail = new Available();
		avail.setCount("99");
		quant.setAvailable(avail);
		Maximum max = new Maximum();
		max.setCount("99");
		quant.setMaximum(max);
		item_1.setQuantity(quant);
		Price__2 price_2 = new Price__2();
		price_2.setCurrency("INR");
		price_2.setValue("170");
		item_1.setPrice(price_2);
		breakup.setItem(item_1);
		breakups.add(breakup);

		Breakup breakup_2 = new Breakup();
		breakup_2.setOndcOrgItemId("F1");
		breakup_2.setTitle("Delievery Charges");
		breakup_2.setOndcOrgTitleType("delievery");
		Price__1 price_3 = new Price__1();
		price_3.setCurrency("INR");
		price_3.setValue("0.000");
		breakup_2.setPrice(price_3);
		breakups.add(breakup_2);
		quote.setBreakup(breakups);
		quote.setTtl("P1D");

		order.setQuote(quote);
		message.setOrder(order);

		Error error = new Error();
		error.setCode("4002");
		error.setType("DOMAIN-ERROR");
		error.setMessage("M1");

		OnSelect itemNotInStock = new OnSelect();
		itemNotInStock.setContext(context);
		itemNotInStock.setMessage(message);
		itemNotInStock.setError(error);

		try {
			ObjectMapper objectMapper = new ObjectMapper();
			jsonPayload = objectMapper.writeValueAsString(itemNotInStock);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return jsonPayload;

	}

	public static void main(String args[]) {
		String json = new ItemNotInStockGenerator().generate();
		System.out.print(json);
	}
}
