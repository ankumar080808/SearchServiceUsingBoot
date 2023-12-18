package com.vinculum.ondc.dao.datasource;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
/**
 * 
 * @author Manish Anand
 * 
 * This method is responsible for support of multiple database
 * [multi tenancy architecture]
 *
 */
public class CustomerRoutingDataSource extends AbstractRoutingDataSource {

   @Override
   protected Object determineCurrentLookupKey() {
      return CustomerContextHolder.getCustomerType();
   }
}
