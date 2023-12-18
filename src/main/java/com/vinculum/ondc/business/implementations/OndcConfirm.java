package com.vinculum.ondc.business.implementations;

import java.util.concurrent.CompletableFuture;

import javax.ws.rs.BadRequestException;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.PlatformTransactionManager;

import com.vinculum.ondc.business.elasticsearchcallers.Consumer;
import com.vinculum.ondc.business.eretail.vinculum.transformer.OndcToVinculumTransformer;
import com.vinculum.ondc.constants.Constants;
import com.vinculum.ondc.objects.MetaData;

public class OndcConfirm implements OndcProcess {

	/**
	 * Declare The Logger
	 */
	public static final Logger LOGGER = LoggerFactory.getLogger(OndcElasticSearch.class);
	/**
	 * This is the Meta Data
	 */
	@Autowired
	private MetaData metaData;
	/**
	 * Declare the Db ID
	 */
	protected String dbId;

	/**
	 * Declare the SQL Session
	 */
	protected SqlSessionTemplate session;

	/**
	 * Declare the platform transaction Manager
	 */
	protected PlatformTransactionManager manager;

	@Override
	public void process(final Object data, final String route) throws Exception {

		CompletableFuture.runAsync(() -> {

			try {
				Consumer con = new Consumer(route, dbId, metaData, data);
				con.onConfirm(data);

			} catch (BadRequestException e) {
				LOGGER.error("Bad request error during async process", e);

			} catch (Exception e) {
				LOGGER.error("Error during async process", e);

			}

		});
	}

	public MetaData getMetaData() {
		return metaData;
	}

	public void setMetaData(MetaData metaData) {
		this.metaData = metaData;
	}

	public String getDbId() {
		return dbId;
	}

	public void setDbId(String dbId) {
		this.dbId = dbId;
	}

}
