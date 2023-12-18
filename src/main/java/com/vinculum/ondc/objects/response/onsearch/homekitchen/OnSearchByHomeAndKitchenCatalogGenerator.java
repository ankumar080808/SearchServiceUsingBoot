package com.vinculum.ondc.objects.response.onsearch.homekitchen;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vinculum.ondc.constants.Constants;
import com.vinculum.ondc.objects.MetaData;
import com.vinculum.ondc.objects.response.onsearch.homekitchen.*;

public class OnSearchByHomeAndKitchenCatalogGenerator {

	
	final MetaData metadata;
	 
	public OnSearchByHomeAndKitchenCatalogGenerator(MetaData metadata)
	{
		 this.metadata=metadata;
	}

	public static String generatePayload() {

		String jsonPayload = null;

		// Populate Context
		Context context = new Context();
		context.setDomain("ONDC:RET11");
		context.setCountry("IND");
		context.setCity("std:080");
		context.setAction(Constants.ON_SEARCH);
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

		// Populate Catalog
		Catalog catalog = new Catalog();

		List<BppFulfillment> fulfillments = new ArrayList<>();
		fulfillments.add(new BppFulfillment("1", "Delivery"));
		fulfillments.add(new BppFulfillment("2", "Self-Pickup"));
		fulfillments.add(new BppFulfillment("3", "Delivery and Self-Pickup"));

		catalog.setBppFulfillments(fulfillments);

		BppDescriptor descriptor = new BppDescriptor();
		descriptor.setName("Seller NP");
		descriptor.setSymbol("https://sellerNP.com/images/np.png");
		descriptor.setShortDesc("Seller Marketplace");
		descriptor.setLongDesc("Seller Marketplace");
		List<String> images = new ArrayList<>();
		images.add("https://abc.com/images/shop-img");

		descriptor.setImages(images);
		catalog.setBppDescriptor(descriptor);

		List<BppProvider> providers = new ArrayList<>();
		BppProvider provider = new BppProvider();
		provider.setId("P1");
		Time time = new Time();
		time.setLabel("enable");
		time.setTimestamp("2023-06-03T07:00:00.000Z");
		provider.setTime(time);

		List<Fulfillment> fulfilments = new ArrayList<>();
		Fulfillment fulfilment = new Fulfillment();
		Fulfillment fulfilment_1 = new Fulfillment();
		Contact con = new Contact();
		Contact con_1 = new Contact();
		fulfilment.setId("F1");
		fulfilment.setType("Delievery");
		con.setEmail("abc@xyz.com");
		con.setPhone("9886098860");
		fulfilment.setContact(con);
		fulfilments.add(fulfilment);
		fulfilment_1.setId("F2");
		fulfilment_1.setType("Self Pickup");
		con_1.setEmail("mailto:abc@xyz.com");
		con_1.setPhone("9886098860");
		fulfilment_1.setContact(con_1);
		fulfilments.add(fulfilment_1);
		provider.setFulfillments(fulfilments);

		Descriptor providerDescriptor = new Descriptor();
		providerDescriptor.setName("Store 1");
		providerDescriptor.setSymbol("https://sellerNP.com/images/store1.png");
		providerDescriptor.setShortDesc("Store 1");
		providerDescriptor.setLongDesc("Store 1");
		List<String> image_1 = new ArrayList<>();
		image_1.add("https://abc.com/images/shop-img");
		providerDescriptor.setImages(image_1);
		provider.setDescriptor(providerDescriptor);
		provider.setTtl("P1D");

		List<Location> locations = new ArrayList<>();
		Location location = new Location();
		location.setId("L1");

		Time__1 times = new Time__1();
		times.setLabel("enable");
		times.setTimestamp("2023-06-03T07:30:30.000Z");
		times.setDays("1,2,3,4,5,6,7");

		Schedule schedule = new Schedule();
		List<String> holidays = new ArrayList<>();
		holidays.add("2023-08-15");
		schedule.setHolidays(holidays);
		schedule.setFrequency("PT4H");

		List<String> timess = new ArrayList<>();
		timess.add("1100");
		timess.add("1900");
		schedule.setTimes(timess);
		times.setSchedule(schedule);
		Range range = new Range();
		range.setStart("1100");
		range.setEnd("2100");
		times.setRange(range);
		location.setTime(times);
		location.setGps("12.967555,77.749666");
		Address address = new Address();
		address.setLocality("Jayanagar 4th Block");
		address.setStreet("Jayanagar 4th Block");
		address.setCity(".Bengaluru");
		address.setAreaCode("011");
		address.setState("KA");
		location.setAddress(address);
		Circle circle = new Circle();
		circle.setGps("12.967555,77.749666");
		Radius radius = new Radius();
		radius.setUnit("km");
		radius.setValue("3");
		circle.setRadius(radius);
		location.setCircle(circle);
		locations.add(location);
		provider.setLocations(locations);

		List<Item> items = new ArrayList<>();
		Item item = new Item();
		item.setId("I1");
		Time__2 time_1 = new Time__2();
		time_1.setLabel("enable");
		time_1.setTimestamp("2023-06-03T07:30:00.000Z");
		item.setTime(time_1);

		Descriptor__1 descriptor_2 = new Descriptor__1();

		descriptor_2.setName("Farmhouse Pizza");
		descriptor_2.setCode("1:XXXXXXXXXXXXX");
		descriptor_2.setSymbol("https://sellerNP.com/images/i1.png");
		descriptor_2.setShortDesc("Farmhouse Pizza");
		descriptor_2.setLongDesc("Farmhouse Pizza");
		List<String> img = new ArrayList<>();
		img.add("https://sellerNP.com/images/i1.png");
		descriptor_2.setImages(img);
		item.setDescriptor(descriptor_2);

		Quantity quan = new Quantity();
		Unitized unit = new Unitized();
		Measure measure = new Measure();
		measure.setUnit("unit");
		measure.setValue("1");
		unit.setMeasure(measure);
		quan.setUnitized(unit);

		Available avail = new Available();
		avail.setCount("99");
		quan.setAvailable(avail);
		Maximum max = new Maximum();
		max.setCount("99");
		quan.setMaximum(max);
		item.setQuantity(quan);

		Price price = new Price();
		price.setCurrency("INR");
		price.setValue("269.0");
		price.setMaximumValue("269.0");
		item.setPrice(price);
		item.setCategoryId("Pizza");
		item.setFulfillmentId("F1");
		item.setLocationId("L1");
		item.setOndcOrgReturnable(false);
		item.setOndcOrgCancellable(false);
		item.setOndcOrgReturnWindow("PT1H");
		item.setOndcOrgSellerPickupReturn(false);
		item.setOndcOrgTimeToShip("PT45M");

		item.setOndcOrgAvailableOnCod(false);
		item.setOndcOrgContactDetailsConsumerCare("Ramesh,ramesh@abc.com,18004254444");

		OndcOrgStatutoryReqsPackagedCommodities reqspc = new OndcOrgStatutoryReqsPackagedCommodities();
		reqspc.setManufacturerOrPackerName("Pure and Cure Healthcare Pvt Ltd");
		reqspc.setManufacturerOrPackerAddress("Plot No 26A-30, Sector 8A, IIE, SIDCUL, Ranipur, Haridwar-249403");
		;
		reqspc.setCommonOrGenericNameOfCommodity("Shelcal HD");

		reqspc.setMonthYearOfManufacturePackingImport("Mar-22");

		item.setOndcOrgStatutoryReqsPackagedCommodities(reqspc);

		List<Tag> tagss = new ArrayList<>();
		Tag tags = new Tag();
		tags.setCode("origin");
		List<com.vinculum.ondc.objects.response.onsearch.homekitchen.List> lists_6_1_1 = new ArrayList<>();
		com.vinculum.ondc.objects.response.onsearch.homekitchen.List list_6_1_2 = new com.vinculum.ondc.objects.response.onsearch.homekitchen.List();
		list_6_1_2.setCode("country");
		list_6_1_2.setValue("India");
		lists_6_1_1.add(list_6_1_2);
		tags.setList(lists_6_1_1);
		tagss.add(tags);
		Tag tags_1=new Tag();
		tags_1.setCode("image");
		
		List<com.vinculum.ondc.objects.response.onsearch.homekitchen.List> lists_7_1_1 = new ArrayList<>();
		com.vinculum.ondc.objects.response.onsearch.homekitchen.List list_7_1_2 = new com.vinculum.ondc.objects.response.onsearch.homekitchen.List();
		com.vinculum.ondc.objects.response.onsearch.homekitchen.List list_7_1_3 = new com.vinculum.ondc.objects.response.onsearch.homekitchen.List();
		list_7_1_2.setCode("type");
		list_7_1_2.setValue("back_image");
		lists_7_1_1.add(list_7_1_2);
		list_7_1_3.setCode("url");
		list_7_1_3.setValue("https://sellernp.com/images/i1_back_image.png");
		lists_7_1_1.add(list_7_1_3);
		tags_1.setList(lists_7_1_1);
		tagss.add(tags_1);
		item.setTags(tagss);
		items.add(item);
		provider.setItems(items);
		
		List<Tag__1> tag_10 = new ArrayList<>();

		Tag__1 tag_10a = new Tag__1();
		tag_10a.setCode("serviceability");
		List<com.vinculum.ondc.objects.response.onsearch.homekitchen.List__1> lists_10b = new ArrayList<>();
		com.vinculum.ondc.objects.response.onsearch.homekitchen.List__1 list_10b1 = new com.vinculum.ondc.objects.response.onsearch.homekitchen.List__1();
		com.vinculum.ondc.objects.response.onsearch.homekitchen.List__1 list_10b2 = new com.vinculum.ondc.objects.response.onsearch.homekitchen.List__1();
		com.vinculum.ondc.objects.response.onsearch.homekitchen.List__1 list_10b3 = new com.vinculum.ondc.objects.response.onsearch.homekitchen.List__1();
		com.vinculum.ondc.objects.response.onsearch.homekitchen.List__1 list_10b4 = new com.vinculum.ondc.objects.response.onsearch.homekitchen.List__1();
		com.vinculum.ondc.objects.response.onsearch.homekitchen.List__1 list_10b5 = new com.vinculum.ondc.objects.response.onsearch.homekitchen.List__1();
		list_10b1.setCode("id");
		list_10b1.setValue("cg-1");
		list_10b2.setCode("id");
		list_10b2.setValue("2");
		list_10b3.setCode("id");
		list_10b3.setValue("2");
		list_10b4.setCode("id");
		list_10b4.setValue("2");
		list_10b5.setCode("id");
		list_10b5.setValue("2");

		lists_10b.add(list_10b1);
		lists_10b.add(list_10b2);
		lists_10b.add(list_10b3);
		lists_10b.add(list_10b4);
		lists_10b.add(list_10b5);
		tag_10a.setList(lists_10b);
		tag_10.add(tag_10a);

		provider.setTags(tag_10);
		providers.add(provider);
		catalog.setBppProviders(providers);
		message.setCatalog(catalog);

		OnSearchByHomeAndKitchenCatalog search = new OnSearchByHomeAndKitchenCatalog();
		search.setContext(context);
		search.setMessage(message);

		try {
			ObjectMapper objectMapper = new ObjectMapper();
			jsonPayload = objectMapper.writeValueAsString(search);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return jsonPayload;

	}
	public static void main(String[] args) {
		// OrderMessage orderMessage = new OrderMessage();

		String payload = generatePayload();

		// print the generated payload
		System.out.println(payload);

	}
}
