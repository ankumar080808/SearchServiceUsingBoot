package com.vinculum.ondc.dao.iface;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.vinculum.ondc.dao.objects.lookups.Access;
import com.vinculum.ondc.dao.objects.lookups.ClientMaster;

public interface LookupsDao {
	/**
	 * This method is responsible for getting the client masters
	 * @return
	 */
	public List<ClientMaster> getClientMaster();
	/**
	 * This method is responsible for getting the client master by external client code.
	 * @param extclientcode
	 * @return
	 */
	public List<ClientMaster> getClient(@Param("extclientcode") String extclientcode);
	
	
	/**
	 * This method is responsible for getting all the metadata information
	 * from the customer configuration database.
	 * 
	 * @param dbId
	 * @return
	 */
	public List<Access> getMetaInformation(@Param("dbId") String dbId);
}
	