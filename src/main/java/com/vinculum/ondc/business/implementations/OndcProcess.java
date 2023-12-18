package com.vinculum.ondc.business.implementations;

import com.vinculum.ondc.objects.MetaData;
import com.vinculum.ondc.objects.response.ResponseStatus;

public interface OndcProcess {
	
	//Create a process method
	public void process(final Object data,final String route)throws  Exception;
	//Set
	public void setMetaData(MetaData metaData);
	//Set
	public void setDbId(final String dbId);
	
	


}
