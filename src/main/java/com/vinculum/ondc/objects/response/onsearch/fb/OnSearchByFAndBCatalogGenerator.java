package com.vinculum.ondc.objects.response.onsearch.fb;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vinculum.ondc.constants.Constants;
import com.vinculum.ondc.objects.MetaData;

public class OnSearchByFAndBCatalogGenerator implements java.io.Serializable{

	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 948346614290468686L;

	public OnSearchByFAndBCatalogGenerator()
	{
		
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

		// Populate bpp/fulfillments in Catalog
		List<BppFulfillment> fulfillments = new ArrayList<>();
		fulfillments.add(new BppFulfillment("1", "Delivery"));
		fulfillments.add(new BppFulfillment("2", "Self-Pickup"));
		fulfillments.add(new BppFulfillment("3", "Delivery and Self-Pickup"));
		catalog.setBppFulfillments(fulfillments);

		// Populate bpp/descriptor in Catalog
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
		Contact con = new Contact();
		con.setEmail("abc@xyz.com");
		con.setPhone("9886098860");
		fulfilment.setContact(con);
		fulfilments.add(fulfilment);
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
		provider.setOndcOrgFssaiLicenseNo("12345678901234");
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
		
		List<Category> categories = new ArrayList<>();
		Category cat = new Category();
		cat.setId("5");
		cat.setParentCategoryId("");
		Descriptor__1 desc = new Descriptor__1();
		desc.setName("Pizza");
		desc.setShortDesc("Veg and Non-Veg pizza");
		desc.setLongDesc("American and Italian Veg and Non-Veg Pizza");
		List<String> imagess = new ArrayList<>();
		imagess.add("https://sellerNP.com/ondc/m005.png");
		desc.setImages(imagess);
		cat.setDescriptor(desc);
		List<Tag> tags = new ArrayList<>();
		Tag tags_1 = new Tag();
		tags_1.setCode("type");
		List<com.vinculum.ondc.objects.response.onsearch.fb.List> lists_1 = new ArrayList<>();
		com.vinculum.ondc.objects.response.onsearch.fb.List list_1 = new com.vinculum.ondc.objects.response.onsearch.fb.List();
		list_1.setCode("type");
		list_1.setValue("custom_menu");
		lists_1.add(list_1);
		tags_1.setList(lists_1);
		tags.add(tags_1);
		Tag tags_2 = new Tag();
		tags_2.setCode("timing");
		List<com.vinculum.ondc.objects.response.onsearch.fb.List> lists_2 = new ArrayList<>();
		com.vinculum.ondc.objects.response.onsearch.fb.List list_2 = new com.vinculum.ondc.objects.response.onsearch.fb.List();
		com.vinculum.ondc.objects.response.onsearch.fb.List list_3 = new com.vinculum.ondc.objects.response.onsearch.fb.List();
		com.vinculum.ondc.objects.response.onsearch.fb.List list_4 = new com.vinculum.ondc.objects.response.onsearch.fb.List();
		com.vinculum.ondc.objects.response.onsearch.fb.List list_5 = new com.vinculum.ondc.objects.response.onsearch.fb.List();

		list_2.setCode("day_from");
		list_2.setValue("1");
		list_3.setCode("day_to");
		list_3.setValue("5");
		list_4.setCode("time_from");
		list_4.setValue("1800");
		list_5.setCode("time_to");
		list_5.setValue("2200");
		lists_2.add(list_2);
		lists_2.add(list_3);
		lists_2.add(list_4);
		lists_2.add(list_5);
		tags_2.setList(lists_2);
		tags.add(tags_2);
		Tag tags_3 = new Tag();
		tags_3.setCode("display");
		List<com.vinculum.ondc.objects.response.onsearch.fb.List> lists_3 = new ArrayList<>();
		com.vinculum.ondc.objects.response.onsearch.fb.List list_3_3 = new com.vinculum.ondc.objects.response.onsearch.fb.List();
		list_3_3.setCode("rank");
		list_3_3.setValue("3");
		lists_3.add(list_3_3);
		tags_3.setList(lists_3);
		tags.add(tags_3);
		cat.setTags(tags);
		categories.add(cat);
		Category cat_2 = new Category();
		cat_2.setId("CG1");
		Descriptor__1 desc_2 = new Descriptor__1();
		desc_2.setName("Crust (any 1 option)");
		cat_2.setDescriptor(desc_2);

		List<Tag> tags_2_2 = new ArrayList<>();
		Tag tags_2_2_1 = new Tag();
		tags_2_2_1.setCode("type");
		List<com.vinculum.ondc.objects.response.onsearch.fb.List> lists_2_2 = new ArrayList<>();
		com.vinculum.ondc.objects.response.onsearch.fb.List list_2_2_1 = new com.vinculum.ondc.objects.response.onsearch.fb.List();
		list_2_2_1.setCode("type");
		list_2_2_1.setValue("custom_group");
		lists_2_2.add(list_2_2_1);
		tags_2_2_1.setList(lists_2_2);
		tags_2_2.add(tags_2_2_1);
		Tag tags_2_2_2 = new Tag();
		tags_2_2_2.setCode("config");
		List<com.vinculum.ondc.objects.response.onsearch.fb.List> lists_2_2_1 = new ArrayList<>();
		com.vinculum.ondc.objects.response.onsearch.fb.List list_2_2_2 = new com.vinculum.ondc.objects.response.onsearch.fb.List();
		com.vinculum.ondc.objects.response.onsearch.fb.List list_2_2_3 = new com.vinculum.ondc.objects.response.onsearch.fb.List();
		com.vinculum.ondc.objects.response.onsearch.fb.List list_2_2_4 = new com.vinculum.ondc.objects.response.onsearch.fb.List();
		com.vinculum.ondc.objects.response.onsearch.fb.List list_2_2_5 = new com.vinculum.ondc.objects.response.onsearch.fb.List();
		list_2_2_2.setCode("min");
		list_2_2_2.setValue("1");
		list_2_2_3.setCode("max");
		list_2_2_3.setValue("1");
		list_2_2_4.setCode("input");
		list_2_2_4.setValue("select");
		list_2_2_5.setCode("seq");
		list_2_2_5.setValue("1");

		lists_2_2_1.add(list_2_2_2);
		lists_2_2_1.add(list_2_2_3);
		lists_2_2_1.add(list_2_2_4);
		lists_2_2_1.add(list_2_2_5);
		tags_2_2_2.setList(lists_2_2_1);
		tags_2_2.add(tags_2_2_2);
		cat_2.setTags(tags_2_2);
		categories.add(cat_2);

		Category cat_3 = new Category();
		cat_3.setId("CG2");
		Descriptor__1 desc_3 = new Descriptor__1();
		desc_3.setName("Size (any 1 option)");
		cat_3.setDescriptor(desc_3);

		List<Tag> tags_3_3 = new ArrayList<>();
		Tag tags_3_3_1 = new Tag();
		tags_3_3_1.setCode("type");
		List<com.vinculum.ondc.objects.response.onsearch.fb.List> lists_3_2 = new ArrayList<>();
		com.vinculum.ondc.objects.response.onsearch.fb.List list_3_2_1 = new com.vinculum.ondc.objects.response.onsearch.fb.List();
		list_3_2_1.setCode("type");
		list_3_2_1.setValue("custom_group");
		lists_3_2.add(list_3_2_1);
		tags_3_3_1.setList(lists_3_2);
		tags_3_3.add(tags_3_3_1);

		Tag tags_3_3_2 = new Tag();
		tags_3_3_2.setCode("config");
		List<com.vinculum.ondc.objects.response.onsearch.fb.List> lists_3_2_1 = new ArrayList<>();
		com.vinculum.ondc.objects.response.onsearch.fb.List list_3_3_1 = new com.vinculum.ondc.objects.response.onsearch.fb.List();
		com.vinculum.ondc.objects.response.onsearch.fb.List list_3_3_2 = new com.vinculum.ondc.objects.response.onsearch.fb.List();
		com.vinculum.ondc.objects.response.onsearch.fb.List list_3_3_3 = new com.vinculum.ondc.objects.response.onsearch.fb.List();
		com.vinculum.ondc.objects.response.onsearch.fb.List list_3_3_4 = new com.vinculum.ondc.objects.response.onsearch.fb.List();
		list_3_3_1.setCode("min");
		list_3_3_1.setValue("1");
		list_3_3_2.setCode("max");
		list_3_3_2.setValue("1");
		list_3_3_3.setCode("input");
		list_3_3_3.setValue("select");
		list_3_3_4.setCode("seq");
		list_3_3_4.setValue("1");

		lists_3_2_1.add(list_3_3_1);
		lists_3_2_1.add(list_3_3_2);
		lists_3_2_1.add(list_3_3_3);
		lists_3_2_1.add(list_3_3_4);
		tags_3_3_2.setList(lists_3_2_1);
		tags_3_3.add(tags_3_3_2);
		cat_3.setTags(tags_3_3);
		categories.add(cat_3);

		Category cat_4 = new Category();
		cat_4.setId("CG3");
		Descriptor__1 desc_4 = new Descriptor__1();
		desc_4.setName("Toppings (up to 2 options)");
		cat_4.setDescriptor(desc_4);

		List<Tag> tags_4_3 = new ArrayList<>();
		Tag tags_4_3_1 = new Tag();
		tags_4_3_1.setCode("type");
		List<com.vinculum.ondc.objects.response.onsearch.fb.List> lists_4_2 = new ArrayList<>();
		com.vinculum.ondc.objects.response.onsearch.fb.List list_4_2_1 = new com.vinculum.ondc.objects.response.onsearch.fb.List();
		list_4_2_1.setCode("type");
		list_4_2_1.setValue("custom_group");
		lists_4_2.add(list_4_2_1);
		tags_4_3_1.setList(lists_4_2);
		tags_4_3.add(tags_4_3_1);

		Tag tags_4_3_2 = new Tag();
		tags_4_3_2.setCode("config");
		List<com.vinculum.ondc.objects.response.onsearch.fb.List> lists_5_2_1 = new ArrayList<>();
		com.vinculum.ondc.objects.response.onsearch.fb.List list_5_3_1 = new com.vinculum.ondc.objects.response.onsearch.fb.List();
		com.vinculum.ondc.objects.response.onsearch.fb.List list_5_3_2 = new com.vinculum.ondc.objects.response.onsearch.fb.List();
		com.vinculum.ondc.objects.response.onsearch.fb.List list_5_3_3 = new com.vinculum.ondc.objects.response.onsearch.fb.List();
		com.vinculum.ondc.objects.response.onsearch.fb.List list_5_3_4 = new com.vinculum.ondc.objects.response.onsearch.fb.List();
		list_5_3_1.setCode("min");
		list_5_3_1.setValue("0");
		list_5_3_2.setCode("max");
		list_5_3_2.setValue("2");
		list_5_3_3.setCode("input");
		list_5_3_3.setValue("select");
		list_5_3_4.setValue("seq");
		list_5_3_4.setValue("2");

		lists_5_2_1.add(list_3_3_1);
		lists_5_2_1.add(list_3_3_2);
		lists_5_2_1.add(list_3_3_3);
		lists_5_2_1.add(list_3_3_4);
		tags_4_3_2.setList(lists_5_2_1);
		tags_4_3.add(tags_4_3_2);
		cat_4.setTags(tags_4_3);
		categories.add(cat_4);
		provider.setCategories(categories);

		List<Item> items = new ArrayList<>();
		Item item = new Item();
		item.setId("I1");
		Time__2 time_1 = new Time__2();
		time_1.setLabel("enable");
		time_1.setTimestamp("2023-06-03T07:30:00.000Z");
		item.setTime(time_1);
		Descriptor__2 descriptor_2 = new Descriptor__2();

		descriptor_2.setName("Farmhouse Pizza");
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
		List<String> category_ids = new ArrayList<>();
		category_ids.add("5:1");
		item.setCategoryIds(category_ids);
		item.setFulfillmentId("F1");
		item.setLocationId("L1");
		item.setRelated(false);
		item.setRecommended(true);
		item.setOndcOrgReturnable(false);
		item.setOndcOrgCancellable(false);
		item.setOndcOrgReturnWindow("PT1H");
		item.setOndcOrgSellerPickupReturn(false);
		item.setOndcOrgTimeToShip("PT45M");
		item.setOndcOrgAvailableOnCod(false);
		item.setOndcOrgContactDetailsConsumerCare("Ramesh,ramesh@abc.com,18004254444");
		List<Tag__1> tag_6 = new ArrayList<>();

		Tag__1 tag_6a = new Tag__1();
		tag_6a.setCode("type");

		List<com.vinculum.ondc.objects.response.onsearch.fb.List__1> lists_6_1_1 = new ArrayList<>();
		com.vinculum.ondc.objects.response.onsearch.fb.List__1 list_6_1_2 = new com.vinculum.ondc.objects.response.onsearch.fb.List__1();
		list_6_1_2.setCode("type");
		list_6_1_2.setValue("item");
		lists_6_1_1.add(list_6_1_2);
		tag_6a.setList(lists_6_1_1);
		tag_6.add(tag_6a);

		Tag__1 tag_6b = new Tag__1();
		tag_6b.setCode("custom-group");
		List<com.vinculum.ondc.objects.response.onsearch.fb.List__1> lists_6b1 = new ArrayList<>();
		com.vinculum.ondc.objects.response.onsearch.fb.List__1 list_6b2 = new com.vinculum.ondc.objects.response.onsearch.fb.List__1();
		com.vinculum.ondc.objects.response.onsearch.fb.List__1 list_6b3 = new com.vinculum.ondc.objects.response.onsearch.fb.List__1();
		com.vinculum.ondc.objects.response.onsearch.fb.List__1 list_6b4 = new com.vinculum.ondc.objects.response.onsearch.fb.List__1();

		list_6b2.setCode("id");
		list_6b2.setValue("cg-1");
		list_6b3.setCode("id");
		list_6b3.setValue("cg-2");
		list_6b4.setCode("cid");
		list_6b4.setValue("cg-3");

		lists_6b1.add(list_6b2);
		lists_6b1.add(list_6b3);
		lists_6b1.add(list_6b4);

		tag_6b.setList(lists_6b1);
		tag_6.add(tag_6b);

		Tag__1 tags_6c = new Tag__1();
		tags_6c.setCode("config");
		List<com.vinculum.ondc.objects.response.onsearch.fb.List__1> lists_6c = new ArrayList<>();
		com.vinculum.ondc.objects.response.onsearch.fb.List__1 list_6c1 = new com.vinculum.ondc.objects.response.onsearch.fb.List__1();
		com.vinculum.ondc.objects.response.onsearch.fb.List__1 list_6c2 = new com.vinculum.ondc.objects.response.onsearch.fb.List__1();
		com.vinculum.ondc.objects.response.onsearch.fb.List__1 list_6c3 = new com.vinculum.ondc.objects.response.onsearch.fb.List__1();
		com.vinculum.ondc.objects.response.onsearch.fb.List__1 list_6c4 = new com.vinculum.ondc.objects.response.onsearch.fb.List__1();

		list_6c1.setCode("id");
		list_6c1.setValue("cg-1");
		list_6c2.setCode("id");
		list_6c2.setValue("cg-2");
		list_6c3.setCode("cid");
		list_6c3.setValue("cg-3");
		list_6c4.setCode("id");
		list_6c4.setValue("cg4");

		lists_6c.add(list_6c1);
		lists_6c.add(list_6c2);
		lists_6c.add(list_6c3);
		lists_6c.add(list_6c4);

		tags_6c.setList(lists_6c);
		tag_6.add(tags_6c);

		Tag__1 tags_6d = new Tag__1();
		tags_6d.setCode("timing");
		List<com.vinculum.ondc.objects.response.onsearch.fb.List__1> lists_6d = new ArrayList<>();
		com.vinculum.ondc.objects.response.onsearch.fb.List__1 list_6d1 = new com.vinculum.ondc.objects.response.onsearch.fb.List__1();
		com.vinculum.ondc.objects.response.onsearch.fb.List__1 list_6d2 = new com.vinculum.ondc.objects.response.onsearch.fb.List__1();
		com.vinculum.ondc.objects.response.onsearch.fb.List__1 list_6d3 = new com.vinculum.ondc.objects.response.onsearch.fb.List__1();

		list_6d1.setCode("id");
		list_6d1.setValue("cg-1");
		list_6d2.setCode("id");
		list_6d2.setValue("2");
		list_6d3.setCode("cid");
		list_6d3.setValue("cg-3");

		lists_6d.add(list_6d1);
		lists_6d.add(list_6d2);
		lists_6d.add(list_6d3);

		tags_6d.setList(lists_6d);
		tag_6.add(tags_6d);

		Tag__1 tags_6e = new Tag__1();
		tags_6e.setCode("veg-nonveg");
		List<com.vinculum.ondc.objects.response.onsearch.fb.List__1> lists_6e = new ArrayList<>();
		com.vinculum.ondc.objects.response.onsearch.fb.List__1 list_6e1 = new com.vinculum.ondc.objects.response.onsearch.fb.List__1();

		list_6e1.setCode("id");
		list_6e1.setValue("1");

		lists_6e.add(list_6e1);

		tags_6e.setList(lists_6e);
		tag_6.add(tags_6e);

		item.setTags(tag_6);
		items.add(item);

		Item item_1 = new Item();
		item_1.setId("c1");
		Descriptor__2 descriptors_2 = new Descriptor__2();
		descriptors_2.setName("New Hand Tossed");
		item_1.setDescriptor(descriptors_2);
		Quantity quan_2 = new Quantity();
		Available avail_2 = new Available();
		avail_2.setCount("99");
		quan_2.setAvailable(avail_2);
		Maximum max_2 = new Maximum();
		max_2.setCount("99");
		quan_2.setMaximum(max_2);
		item_1.setQuantity(quan_2);

		Price price_2 = new Price();
		price_2.setCurrency("INR");
		price_2.setValue("269.0");
		price_2.setMaximumValue("269.0");
		item_1.setPrice(price_2);

		item_1.setCategoryId("F&B");
		item_1.setRelated(true);

		List<Tag__1> tag_7 = new ArrayList<>();

		Tag__1 tag_7a = new Tag__1();
		tag_7a.setCode("type");

		List<com.vinculum.ondc.objects.response.onsearch.fb.List__1> lists_7_1_1 = new ArrayList<>();
		com.vinculum.ondc.objects.response.onsearch.fb.List__1 list_7_1_2 = new com.vinculum.ondc.objects.response.onsearch.fb.List__1();
		list_7_1_2.setCode("type");
		list_7_1_2.setValue("item");
		lists_7_1_1.add(list_7_1_2);
		tag_7a.setList(lists_7_1_1);
		tag_7.add(tag_7a);

		Tag__1 tags_7b = new Tag__1();
		tags_7b.setCode("parent");
		List<com.vinculum.ondc.objects.response.onsearch.fb.List__1> lists_7b = new ArrayList<>();
		com.vinculum.ondc.objects.response.onsearch.fb.List__1 list_7b1 = new com.vinculum.ondc.objects.response.onsearch.fb.List__1();
		com.vinculum.ondc.objects.response.onsearch.fb.List__1 list_7b2 = new com.vinculum.ondc.objects.response.onsearch.fb.List__1();

		list_7b1.setCode("id");
		list_7b1.setValue("cg-1");
		list_7b2.setCode("id");
		list_7b2.setValue("2");

		lists_7b.add(list_6d1);
		lists_7b.add(list_6d2);
		tags_7b.setList(lists_7b);
		tag_7.add(tags_7b);

		Tag__1 tags_7c = new Tag__1();
		tags_7b.setCode("child");
		List<com.vinculum.ondc.objects.response.onsearch.fb.List__1> lists_7c = new ArrayList<>();
		com.vinculum.ondc.objects.response.onsearch.fb.List__1 list_7c1 = new com.vinculum.ondc.objects.response.onsearch.fb.List__1();
		list_7b1.setCode("id");
		list_7b1.setValue("cg-1");

		lists_7c.add(list_7b1);
		tags_7c.setList(lists_7c);
		tag_7.add(tags_7c);

		Tag__1 tags_7d = new Tag__1();
		tags_7b.setCode("non-veg");
		List<com.vinculum.ondc.objects.response.onsearch.fb.List__1> lists_7d = new ArrayList<>();
		com.vinculum.ondc.objects.response.onsearch.fb.List__1 list_7d = new com.vinculum.ondc.objects.response.onsearch.fb.List__1();
		list_7d.setCode("id");
		list_7d.setValue("cg-1");

		lists_7d.add(list_7d);
		tags_7d.setList(lists_7d);
		tag_7.add(tags_7d);

		item_1.setTags(tag_7);
		items.add(item_1);

		Item item_2 = new Item();
		item_2.setId("c2");
		Descriptor__2 descriptors_3 = new Descriptor__2();
		descriptors_3.setName("Regular");
		item_2.setDescriptor(descriptors_3);
		Quantity quan_3 = new Quantity();
		Available avail_3 = new Available();
		avail_3.setCount("99");
		quan_3.setAvailable(avail_2);
		Maximum max_3 = new Maximum();
		max_3.setCount("99");
		quan_3.setMaximum(max_2);
		item_2.setQuantity(quan_3);

		Price price_3 = new Price();
		price_3.setCurrency("INR");
		price_3.setValue("269.0");
		price_3.setMaximumValue("269.0");
		item_2.setPrice(price_2);

		item_2.setCategoryId("F&B");
		item_2.setRelated(true);

		List<Tag__1> tag_8 = new ArrayList<>();

		Tag__1 tag_8a = new Tag__1();
		tag_8a.setCode("type");

		List<com.vinculum.ondc.objects.response.onsearch.fb.List__1> lists_8_1_1 = new ArrayList<>();
		com.vinculum.ondc.objects.response.onsearch.fb.List__1 list_8_1_2 = new com.vinculum.ondc.objects.response.onsearch.fb.List__1();
		list_8_1_2.setCode("type");
		list_8_1_2.setValue("item");
		lists_8_1_1.add(list_8_1_2);
		tag_8a.setList(lists_8_1_1);
		tag_8.add(tag_8a);

		Tag__1 tags_8b = new Tag__1();
		tags_8b.setCode("parent");
		List<com.vinculum.ondc.objects.response.onsearch.fb.List__1> lists_8b = new ArrayList<>();
		com.vinculum.ondc.objects.response.onsearch.fb.List__1 list_8b1 = new com.vinculum.ondc.objects.response.onsearch.fb.List__1();
		com.vinculum.ondc.objects.response.onsearch.fb.List__1 list_8b2 = new com.vinculum.ondc.objects.response.onsearch.fb.List__1();

		list_8b1.setCode("id");
		list_8b1.setValue("cg-1");
		list_8b2.setCode("id");
		list_8b2.setValue("2");

		lists_8b.add(list_8b1);
		lists_8b.add(list_8b2);
		tags_8b.setList(lists_8b);
		tag_8.add(tags_8b);

		Tag__1 tags_8c = new Tag__1();
		tags_8c.setCode("child");
		List<com.vinculum.ondc.objects.response.onsearch.fb.List__1> lists_8c = new ArrayList<>();
		com.vinculum.ondc.objects.response.onsearch.fb.List__1 list_8c1 = new com.vinculum.ondc.objects.response.onsearch.fb.List__1();
		list_8c1.setCode("id");
		list_8c1.setValue("cg-1");

		lists_8c.add(list_8c1);
		tags_8c.setList(lists_8c);
		tag_8.add(tags_8c);

		Tag__1 tags_8d = new Tag__1();
		tags_8d.setCode("non-veg");
		List<com.vinculum.ondc.objects.response.onsearch.fb.List__1> lists_8d = new ArrayList<>();
		com.vinculum.ondc.objects.response.onsearch.fb.List__1 list_8d = new com.vinculum.ondc.objects.response.onsearch.fb.List__1();
		list_8d.setCode("id");
		list_8d.setValue("cg-1");

		lists_8d.add(list_8d);
		tags_8d.setList(lists_8d);
		tag_8.add(tags_8d);

		item_2.setTags(tag_8);
		items.add(item_2);

		Item item_3 = new Item();
		item_3.setId("c3");
		Descriptor__2 descriptors_4 = new Descriptor__2();
		descriptors_4.setName("Grilled mushrooms");
		item_3.setDescriptor(descriptors_4);
		Quantity quan_4 = new Quantity();
		Available avail_4 = new Available();
		avail_4.setCount("99");
		quan_4.setAvailable(avail_4);
		Maximum max_4 = new Maximum();
		max_4.setCount("99");
		quan_4.setMaximum(max_4);
		item_3.setQuantity(quan_4);

		Price price_4 = new Price();
		price_4.setCurrency("INR");
		price_4.setValue("269.0");
		price_4.setMaximumValue("269.0");
		item_3.setPrice(price_4);

		item_3.setCategoryId("F&B");
		item_3.setRelated(true);
		items.add(item_3);
        provider.setItems(items);

		List<Tag__1> tag_9 = new ArrayList<>();

		Tag__1 tag_9a = new Tag__1();
		tag_9a.setCode("type");

		List<com.vinculum.ondc.objects.response.onsearch.fb.List__1> lists_9_1_1 = new ArrayList<>();
		com.vinculum.ondc.objects.response.onsearch.fb.List__1 list_9_1_2 = new com.vinculum.ondc.objects.response.onsearch.fb.List__1();
		list_9_1_2.setCode("type");
		list_9_1_2.setValue("item");
		lists_9_1_1.add(list_9_1_2);
		tag_9a.setList(lists_9_1_1);
		tag_9.add(tag_9a);

		Tag__1 tags_9b = new Tag__1();
		tags_9b.setCode("parent");
		List<com.vinculum.ondc.objects.response.onsearch.fb.List__1> lists_9b = new ArrayList<>();
		com.vinculum.ondc.objects.response.onsearch.fb.List__1 list_9b1 = new com.vinculum.ondc.objects.response.onsearch.fb.List__1();
		com.vinculum.ondc.objects.response.onsearch.fb.List__1 list_9b2 = new com.vinculum.ondc.objects.response.onsearch.fb.List__1();

		list_9b1.setCode("id");
		list_9b1.setValue("cg-1");
		list_9b2.setCode("id");
		list_9b2.setValue("2");

		lists_9b.add(list_9b1);
		lists_9b.add(list_9b2);
		tags_9b.setList(lists_9b);
		tag_9.add(tags_9b);

		Tag__1 tag_9c = new Tag__1();
		tag_9a.setCode("nonveg");

		List<com.vinculum.ondc.objects.response.onsearch.fb.List__1> lists_9c = new ArrayList<>();
		com.vinculum.ondc.objects.response.onsearch.fb.List__1 list_9c = new com.vinculum.ondc.objects.response.onsearch.fb.List__1();
		list_9c.setCode("type");
		list_9c.setValue("item");
		lists_9c.add(list_9c);
		tag_9c.setList(lists_9c);
		tag_9.add(tag_9c);
		item_3.setTags(tag_9);
		provider.setItems(items);
		

		List<Tag__2> tag_10 = new ArrayList<>();

		Tag__2 tag_10a = new Tag__2();
		tag_10a.setCode("serviceability");

		List<com.vinculum.ondc.objects.response.onsearch.fb.List__2> lists_10b = new ArrayList<>();
		com.vinculum.ondc.objects.response.onsearch.fb.List__2 list_10b1 = new com.vinculum.ondc.objects.response.onsearch.fb.List__2();
		com.vinculum.ondc.objects.response.onsearch.fb.List__2 list_10b2 = new com.vinculum.ondc.objects.response.onsearch.fb.List__2();
		com.vinculum.ondc.objects.response.onsearch.fb.List__2 list_10b3 = new com.vinculum.ondc.objects.response.onsearch.fb.List__2();
		com.vinculum.ondc.objects.response.onsearch.fb.List__2 list_10b4 = new com.vinculum.ondc.objects.response.onsearch.fb.List__2();
		com.vinculum.ondc.objects.response.onsearch.fb.List__2 list_10b5 = new com.vinculum.ondc.objects.response.onsearch.fb.List__2();

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
		OnSearchByFAndBCatalog search=new OnSearchByFAndBCatalog();
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
        //OrderMessage orderMessage = new OrderMessage();
    	
    	 String payload = generatePayload();
         
         // print the generated payload
         System.out.println(payload);
    	
    }

}