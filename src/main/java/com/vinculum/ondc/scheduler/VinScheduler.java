package com.vinculum.ondc.scheduler;


import java.util.concurrent.ConcurrentLinkedQueue;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import com.vinculum.ondc.business.AbstractExecutorCaller;
import com.vinculum.ondc.constants.Constants;
import com.vinculum.ondc.dao.custom.Cron;
import com.vinculum.ondc.objects.MetaData;
/**
 *
 * @author Manish Anand
 *
 * This is the SKU scheduler responsible for Updating the SKU info. The Cron4j scheduler will create unique
 * instance for this scheduler for every customer which will be
 * configured in the spring data source.
 *
 */
public class VinScheduler extends AbstractExecutorCaller implements Runnable {
	/**
	 * Declare the Logger
	 */
	public static final Logger LOGGER 	= LoggerFactory.getLogger(com.vinculum.ondc.scheduler.VinScheduler.class);
	/**
	 * Declare the under process queue
	 */
	private final ConcurrentLinkedQueue<String> queue;


	public VinScheduler(final MetaData metadata, final String dbId, final int activity, final Cron cron) {
		//Call Super
		super(dbId, metadata, cron);
		//Initialize
		this.queue = cron.getQueue();
	}

	@Override
	public void run() {
		MDC.put(Constants.UNIQUE,String.format(Constants.CUSTOMERS, dbId));
		//Declare under process [This is to check if the previous scheduler for this activity is already running or not]
		boolean underprocess = queue.contains(dbId);
		// Check
		if (!underprocess) {
			//Add Under Process
			queue.add(dbId);
			// Handle Exception
			try {
				// Create 1 Client For Every Customer
				final CloseableHttpClient client = HttpClients.custom().setConnectionManager(metadata.getConnmanager()).build();
				//Log the exception
				LOGGER.info(String.format("Initialized Process: %s For DB ID: %s ",mdcType, dbId));
				// Call
				call(client);
			} catch (final Exception exception) {
				//Log The Exception
				LOGGER.error(exception.getMessage(), exception.fillInStackTrace());
			} catch (final Throwable exception) {
				//LOG The Throwable
				LOGGER.error(exception.getMessage(), exception.fillInStackTrace());
			} finally {
				// Remove
				queue.remove(dbId);
			}
		}else {
			//Log the exception
			LOGGER.info(String.format("Skipping Process: %s For DB ID: %s ",mdcType, dbId));
		}
		LOGGER.info(String.format("Sku Scheduler Main Thread Ends. With DB Id %s", dbId));
		// Remove this from MDC
		MDC.remove(Constants.UNIQUE);
	}
}
