package com.vinculum.ondc.scheduler;

import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.pool.PoolStats;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import com.vinculum.ondc.constants.Constants;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author manish.anand
 *
 * This class is responsible for eviction of http connections
 * which will be managed by apache pooling http client connection
 * manager.
 *
 */
public class EvictionScheduler implements Runnable{
	/**
	 * Logger for this class.
	 */
	public static final Logger LOGGER = LoggerFactory.getLogger(EvictionScheduler.class);
	/**
	 * The Connection Manager
	 */
	private final PoolingHttpClientConnectionManager manager;
	/**
	 * The Default Constructor for this class
	 */
	public EvictionScheduler(final PoolingHttpClientConnectionManager manager){
		//Initialize the manager
		this.manager = manager;
	}
	/**
	 * The run method which is called by the scheduler on specified time.
	 */
	@Override
	public void run() {
		//Put this to MDC
		MDC.put(Constants.UNIQUE, Constants.SYSTEM + Constants.F_SLASH + Constants.EVICTION);
		//Null check
		if(null != manager){
			//Log the information
			LOGGER.info("Executing Eviction Thread.");
			//Get the pool stats
			final PoolStats stats = manager.getTotalStats();
			//Null check
			if(null != stats){
				//Log the information
				LOGGER.info(String.format("Max Connections: %d", stats.getMax()));
				//Log the information
				LOGGER.info(String.format("Total Available Connections: %d", stats.getAvailable()));
				//Log the information
				LOGGER.info(String.format("Total Leased Connections: %d", stats.getLeased()));
				//Log the information
				LOGGER.info(String.format("Total Pending Connections: %d", stats.getPending()));
			}
			//Log the information
			LOGGER.info("Closing Expired Connection.");
			//Close the Expired Connection
			manager.closeExpiredConnections();
			//Log the information
			LOGGER.info("Closing Idle Connection.");
			//Close the Idle Connection
			manager.closeIdleConnections(180, TimeUnit.SECONDS);
			//Log the information
			LOGGER.info("Eviction Process Ends.");
		}
		//Remove
		MDC.remove(Constants.UNIQUE);
	}//End Of Evication.
}