package com.vinculum.ondc.objects.response.onsearch.GroceryCatalog;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vinculum.ondc.constants.Constants;

import com.vinculum.ondc.objects.response.onsearch.GroceryCatalog.*;

public class OnSearchByGroceryCatalogGenerator {

	public static void main(String[] args) {
		// OrderMessage orderMessage = new OrderMessage();

		String payload = generatePayload();

		// print the generated payload
		System.out.println(payload);

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
		Descriptor__1 desc = new Descriptor__1();
		desc.setName("Pizza");
		cat.setDescriptor(desc);
		List<Tag> tags = new ArrayList<>();
		Tag tags_1 = new Tag();
		tags_1.setCode("type");
		List<com.vinculum.ondc.objects.response.onsearch.GroceryCatalog.List> lists_1 = new ArrayList<>();
		com.vinculum.ondc.objects.response.onsearch.GroceryCatalog.List list_1 = new com.vinculum.ondc.objects.response.onsearch.GroceryCatalog.List();
		list_1.setCode("type");
		list_1.setValue("variant_group");
		lists_1.add(list_1);
		tags_1.setList(lists_1);
		tags.add(tags_1);

		Tag tags_2 = new Tag();
		tags_2.setCode("attr");

		List<com.vinculum.ondc.objects.response.onsearch.GroceryCatalog.List> lists_2 = new ArrayList<>();
		com.vinculum.ondc.objects.response.onsearch.GroceryCatalog.List list_2 = new com.vinculum.ondc.objects.response.onsearch.GroceryCatalog.List();
		com.vinculum.ondc.objects.response.onsearch.GroceryCatalog.List list_3 = new com.vinculum.ondc.objects.response.onsearch.GroceryCatalog.List();
		list_2.setCode("name");
		list_2.setValue("item.quantity.unitized.measure");
		list_3.setCode("seq");
		list_3.setValue("1");
		lists_2.add(list_2);
		lists_2.add(list_3);
		tags_2.setList(lists_2);
		tags.add(tags_2);
		cat.setTags(tags);
		categories.add(cat);
		provider.setCategories(categories);
		providers.add(provider);

		List<Item> items = new ArrayList<>();
		Item item = new Item();
		item.setId("I1");
		Time__2 time_1 = new Time__2();
		time_1.setLabel("enable");
		time_1.setTimestamp("2023-06-03T07:30:00.000Z");
		item.setTime(time_1);
		item.setParentItemId("V1");

		Descriptor__2 descriptor_2 = new Descriptor__2();

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

		reqspc.setCommonOrGenericNameOfCommodity("Shelcal HD");

		reqspc.setMonthYearOfManufacturePackingImport("Mar-22");

		item.setOndcOrgStatutoryReqsPackagedCommodities(reqspc);
		OndcOrgStatutoryReqsPrepackagedFood rpf = new OndcOrgStatutoryReqsPrepackagedFood();
		rpf.setNutritionalInfo("Energy(KCal)-(per 100kg) 420,");
		rpf.setAdditivesInfo("Preservatives,Artificial Colours");
		rpf.setBrandOwnerFSSAILicenseNo("12345678901234");
		rpf.setOtherFSSAILicenseNo("12345678901234");
		rpf.setImporterFSSAILicenseNo("12345678901234");
		item.setOndcOrgStatutoryReqsPrepackagedFood(rpf);
		
		List<Tag__1> tags_4 = new ArrayList<>();
		Tag__1 tags_3 = new Tag__1();
		tags_3.setCode("attr");

		List<com.vinculum.ondc.objects.response.onsearch.GroceryCatalog.List__1> lists_3 = new ArrayList<>();
		com.vinculum.ondc.objects.response.onsearch.GroceryCatalog.List__1 list_4 = new com.vinculum.ondc.objects.response.onsearch.GroceryCatalog.List__1();
		com.vinculum.ondc.objects.response.onsearch.GroceryCatalog.List__1 list_5 = new com.vinculum.ondc.objects.response.onsearch.GroceryCatalog.List__1();
		list_4.setCode("name");
		list_4.setValue("item.quantity.unitized.measure");
		list_5.setCode("seq");
		list_5.setValue("1");
		lists_3.add(list_4);
		lists_3.add(list_5);
		tags_3.setList(lists_3);
		tags_4.add(tags_3);
		item.setTags(tags_4);
		items.add(item);
		
		
		Item item_2 = new Item();
		item_2.setId("I2");
		item_2.setParentItemId("V1");
		Descriptor__2 desc_2 = new Descriptor__2();
		desc_2.setName("Farmhouse Pizza");
		desc_2.setCode("1:XXXXXXXXXXXXX");
		desc_2.setSymbol("https://sellerNP.com/images/i1.png");
		desc_2.setShortDesc("Farmhouse Pizza");
		desc_2.setLongDesc("Farmhouse Pizza");
		List<String> imgs = new ArrayList<>();
		imgs.add("https://sellerNP.com/images/i1.png");
		descriptor_2.setImages(imgs);
		item.setDescriptor(desc_2);
		
		Quantity quan_1 = new Quantity();
		Unitized unit_1 = new Unitized();
		Measure measure_1 = new Measure();
		measure_1.setUnit("unit");
		measure_1.setValue("1");
		unit_1.setMeasure(measure_1);
		quan_1.setUnitized(unit_1);
		Available avail_1 = new Available();
		avail_1.setCount("99");
		quan_1.setAvailable(avail_1);
		Maximum max_1 = new Maximum();
		max_1.setCount("99");
		quan_1.setMaximum(max_1);
		item_2.setQuantity(quan_1);
		Price price_2 = new Price();
		price_2.setCurrency("INR");
		price_2.setValue("269.0");
		price_2.setMaximumValue("269.0");
		item_2.setPrice(price);
		item_2.setCategoryId("Pizza");
		item_2.setFulfillmentId("F1");
		item_2.setLocationId("L1");
		item_2.setOndcOrgReturnable(false);
		item_2.setOndcOrgCancellable(false);
		item_2.setOndcOrgReturnWindow("PT1H");
		item_2.setOndcOrgSellerPickupReturn(false);
		item_2.setOndcOrgTimeToShip("PT45M");
		item_2.setOndcOrgAvailableOnCod(false);
		item_2.setOndcOrgContactDetailsConsumerCare("Ramesh,ramesh@abc.com,18004254444");
		OndcOrgStatutoryReqsPackagedCommodities reqspcs = new OndcOrgStatutoryReqsPackagedCommodities();
		reqspcs.setManufacturerOrPackerName("Pure and Cure Healthcare Pvt Ltd");
		reqspcs.setManufacturerOrPackerAddress("Plot No 26A-30, Sector 8A, IIE, SIDCUL, Ranipur, Haridwar-249403");

		reqspcs.setCommonOrGenericNameOfCommodity("Shelcal HD");

		reqspcs.setMonthYearOfManufacturePackingImport("Mar-22");

		item_2.setOndcOrgStatutoryReqsPackagedCommodities(reqspcs);
		OndcOrgStatutoryReqsPrepackagedFood rpfs = new OndcOrgStatutoryReqsPrepackagedFood();
		rpfs.setNutritionalInfo("Energy(KCal)-(per 100kg) 420,");
		rpfs.setAdditivesInfo("Preservatives,Artificial Colours");
		rpfs.setBrandOwnerFSSAILicenseNo("12345678901234");
		rpfs.setOtherFSSAILicenseNo("12345678901234");
		rpfs.setImporterFSSAILicenseNo("12345678901234");
		item_2.setOndcOrgStatutoryReqsPrepackagedFood(rpfs);
		
		List<Tag__1> tags_5=new ArrayList<>();
		Tag__1 tag_6=new Tag__1();
		
		List<com.vinculum.ondc.objects.response.onsearch.GroceryCatalog.List__1> lists_4 = new ArrayList<>();
		com.vinculum.ondc.objects.response.onsearch.GroceryCatalog.List__1 list_6 = new com.vinculum.ondc.objects.response.onsearch.GroceryCatalog.List__1();
		com.vinculum.ondc.objects.response.onsearch.GroceryCatalog.List__1 list_7 = new com.vinculum.ondc.objects.response.onsearch.GroceryCatalog.List__1();
		list_6.setCode("name");
		list_6.setValue("item.quantity.unitized.measure");
		list_7.setCode("seq");
		list_7.setValue("1");
		lists_4.add(list_6);
		lists_4.add(list_7);
		tag_6.setList(lists_4);
		tags_5.add(tag_6);
		item_2.setTags(tags_5);
		items.add(item_2);
		
		
		Item item_3 = new Item();
		item_3.setId("I3");
		item_3.setParentItemId("V1");
		Descriptor__2 desc_3 = new Descriptor__2();
		desc_3.setName("Farmhouse Pizza");
		desc_3.setCode("1:XXXXXXXXXXXXX");
		desc_3.setSymbol("https://sellerNP.com/images/i1.png");
		desc_3.setShortDesc("Farmhouse Pizza");
		desc_3.setLongDesc("Farmhouse Pizza");
		List<String> imgss = new ArrayList<>();
		imgss.add("https://sellerNP.com/images/i1.png");
		desc_3.setImages(imgss);
		item_3.setDescriptor(desc_2);
		
		Quantity quan_2 = new Quantity();
		Unitized unit_2 = new Unitized();
		Measure measure_2 = new Measure();
		measure_2.setUnit("unit");
		measure_2.setValue("1");
		unit_2.setMeasure(measure_1);
		quan_2.setUnitized(unit_1);
		Available avail_2 = new Available();
		avail_2.setCount("99");
		quan_2.setAvailable(avail_1);
		Maximum max_2 = new Maximum();
		max_2.setCount("99");
		quan_2.setMaximum(max_1);
		item_3.setQuantity(quan_1);
		Price price_3 = new Price();
		price_3.setCurrency("INR");
		price_3.setValue("269.0");
		price_3.setMaximumValue("269.0");
		item_3.setPrice(price);
		item_3.setCategoryId("Pizza");
		item_3.setFulfillmentId("F1");
		item_3.setLocationId("L1");
		item_3.setOndcOrgReturnable(false);
		item_3.setOndcOrgCancellable(false);
		item_3.setOndcOrgReturnWindow("PT1H");
		item_3.setOndcOrgSellerPickupReturn(false);
		item_3.setOndcOrgTimeToShip("PT45M");
		item_3.setOndcOrgAvailableOnCod(false);
		item_3.setOndcOrgContactDetailsConsumerCare("Ramesh,ramesh@abc.com,18004254444");
		OndcOrgStatutoryReqsPackagedCommodities reqspcss = new OndcOrgStatutoryReqsPackagedCommodities();
		reqspcs.setManufacturerOrPackerName("Pure and Cure Healthcare Pvt Ltd");
		reqspcs.setManufacturerOrPackerAddress("Plot No 26A-30, Sector 8A, IIE, SIDCUL, Ranipur, Haridwar-249403");

		reqspcs.setCommonOrGenericNameOfCommodity("Shelcal HD");

		reqspcs.setMonthYearOfManufacturePackingImport("Mar-22");

		item_3.setOndcOrgStatutoryReqsPackagedCommodities(reqspcs);
		OndcOrgStatutoryReqsPrepackagedFood rpfss = new OndcOrgStatutoryReqsPrepackagedFood();
		rpfs.setNutritionalInfo("Energy(KCal)-(per 100kg) 420,");
		rpfs.setAdditivesInfo("Preservatives,Artificial Colours");
		rpfs.setBrandOwnerFSSAILicenseNo("12345678901234");
		rpfs.setOtherFSSAILicenseNo("12345678901234");
		rpfs.setImporterFSSAILicenseNo("12345678901234");
		item_3.setOndcOrgStatutoryReqsPrepackagedFood(rpfs);
		
		

		List<Tag__1> tags_6=new ArrayList<>();
		Tag__1 tag_7=new Tag__1();
		
		
		List<com.vinculum.ondc.objects.response.onsearch.GroceryCatalog.List__1> lists_5 = new ArrayList<>();
		com.vinculum.ondc.objects.response.onsearch.GroceryCatalog.List__1 list_8 = new com.vinculum.ondc.objects.response.onsearch.GroceryCatalog.List__1();
		com.vinculum.ondc.objects.response.onsearch.GroceryCatalog.List__1 list_9 = new com.vinculum.ondc.objects.response.onsearch.GroceryCatalog.List__1();
		list_8.setCode("name");
		list_8.setValue("item.quantity.unitized.measure");
		list_9.setCode("seq");
		list_9.setValue("1");
		lists_5.add(list_8);
		lists_5.add(list_9);
		tag_7.setList(lists_5);
		tags_6.add(tag_7);
		item_3.setTags(tags_6);
		items.add(item_3);
		provider.setItems(items);
		
		
		List<Tag__2> tag_10 = new ArrayList<>();

		Tag__2 tag_10a = new Tag__2();
		tag_10a.setCode("serviceability");

		List<com.vinculum.ondc.objects.response.onsearch.GroceryCatalog.List__2> lists_10b = new ArrayList<>();
		com.vinculum.ondc.objects.response.onsearch.GroceryCatalog.List__2 list_10b1 = new com.vinculum.ondc.objects.response.onsearch.GroceryCatalog.List__2();
		com.vinculum.ondc.objects.response.onsearch.GroceryCatalog.List__2 list_10b2 = new com.vinculum.ondc.objects.response.onsearch.GroceryCatalog.List__2();
		com.vinculum.ondc.objects.response.onsearch.GroceryCatalog.List__2 list_10b3 = new com.vinculum.ondc.objects.response.onsearch.GroceryCatalog.List__2();
		com.vinculum.ondc.objects.response.onsearch.GroceryCatalog.List__2 list_10b4 = new com.vinculum.ondc.objects.response.onsearch.GroceryCatalog.List__2();
		com.vinculum.ondc.objects.response.onsearch.GroceryCatalog.List__2 list_10b5 = new com.vinculum.ondc.objects.response.onsearch.GroceryCatalog.List__2();

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
		OnSearchByGroceryCatalog search=new OnSearchByGroceryCatalog();
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
}