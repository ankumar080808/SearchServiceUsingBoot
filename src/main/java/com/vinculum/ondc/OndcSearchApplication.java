package com.vinculum.ondc;

import org.slf4j.MDC;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.ApplicationContext;


import com.vinculum.ondc.constants.Constants;

/**
 * The Main Service Class. This is the start point
 * of the VIN-PAC Service. It Loads the Spring context
 * and starts up the application.
 *
 */
@SpringBootApplication(exclude = {GsonAutoConfiguration.class,MongoAutoConfiguration.class, 
		MongoDataAutoConfiguration.class})
@ImportResource({"classpath*:ondc-spring-context.xml"})
@ComponentScan("com.vinculum.ondc.objects.*")
public class OndcSearchApplication extends SpringBootServletInitializer {




	public static void main(String[] args) {
		
		/* ApplicationContext context = SpringApplication.run(OndcSearchApplication.class, args);
		 
		    if (isReactive(context)) {
	            System.out.println("The application is using the reactive stack.");
	        } else {
	            System.out.println("The application is not using the reactive stack.");
	        }
		    */

		//Put Unique Key For Main Logging
		MDC.put(Constants.UNIQUE, Constants.MAIN);
		
		//Run
		SpringApplication.run(OndcSearchApplication.class, args);
		
		//Remove The Key
		MDC.remove(Constants.UNIQUE);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(OndcSearchApplication.class);
	}
	
	private static boolean isReactive(ApplicationContext context) {
		
	      return context.getBeansOfType(OndcSearchApplication.class).size() > 0;
	      
    }
}
