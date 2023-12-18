package com.vinculum.ondc.secret;

import java.util.Properties;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

import com.vinculum.ondc.constants.Constants;

public class VinPropertyPlaceHolderConfigurer  extends PropertyPlaceholderConfigurer {

	//Logger for this class
	public static final Logger LOGGER = LoggerFactory.getLogger(VinPropertyPlaceHolderConfigurer.class);
	private SecretManager manager;

	@Override
	protected void processProperties(final ConfigurableListableBeanFactory beanFactory, final Properties props) throws BeansException {
		//Create the Key
		final String key = StringUtils.upperCase(Constants.APP_ID);
		//Get The Secrets
		final SecretResponse response = manager.getSecret(key);
		//Check null
		if(null != response && 0 == response.getResponseCode()) {
			//Get the Properties
			final Properties secrets = response.getValues();
			//Merge
			props.putAll(secrets);
			//Process
			super.processProperties(beanFactory, props);
		}else {
			//Log
			LOGGER.error(response.getResponseMessage());
			//Terminate
			System.exit(1);
		}
	}

	public SecretManager getManager() {
		return manager;
	}

	public void setManager(SecretManager manager) {
		this.manager = manager;
	}
}
