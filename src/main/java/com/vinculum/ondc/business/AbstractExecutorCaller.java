package com.vinculum.ondc.business;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.apache.http.impl.client.CloseableHttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vinculum.ondc.constants.Constants;
import com.vinculum.ondc.dao.custom.Cron;
import com.vinculum.ondc.objects.MetaData;
/**
 * 
 * @author Manish Anand
 * 
 * This class is an abstract class and has to be extended by all the classes 
 * generally in this case they are going to be the schedulers that will extend
 * this class for raising extra threads per client using the executor service.
 * 
 * This is the generalization of the code to reduce the replicated code and a
 * way for making this case reusable. 
 *
 */
public abstract class AbstractExecutorCaller {
	/**
	 * Logger for this class.
	 */
	public static final Logger LOGGER = LoggerFactory.getLogger(AbstractExecutorCaller.class);
	/**
	 * Declare the DB ID
	 */
	protected final String dbId;
	/**
	 * Declare The Process Metadata
	 */
	protected final MetaData metadata;
	/**
	 * Declare the Fully Qualified Class Name
	 */
	private final String fqcn;
	//Create Type
	protected final String type;
	
	protected String mdcType;

	/**
	 * Constructor for this Abstract class
	 * @param dbId
	 * @param metadata
	 * @param type
	 */
	public AbstractExecutorCaller(final String dbId, final MetaData metadata, final Cron cron) {
		//Assign
		this.dbId = dbId;
		//Assign
		this.metadata = metadata;
		//Set the FQCN	
		this.fqcn = cron.getFqcn();
		//Set Type 
		this.type= cron.getType();
		//Set Type 
		this.mdcType= cron.getMdcType();
	}



	/**
	 * This call method is responsible for raising another thread 
	 * through executor service which will take the business process further
	 * down the lane.
	 * 
	 * @param client
	 */
	public void call(final CloseableHttpClient client) {
		//Create the executor with max 5 threads in a row
		final ExecutorService executorService = Executors.newFixedThreadPool(Constants.MAX_THREAD_IN_POOL);
		//Create the list
		final List<Callable<String>> callables = new ArrayList<>();
		//Populate the thread based on the supplied type
		populate(client, callables);
		//Handle
		try {	
			//Check
			if(!callables.isEmpty()) {
				List<Future<String>> results =  executorService.invokeAll(callables);
				try {
					//Check
					if(null != results && !results.isEmpty()) {
						//Loop
						for(final Future<String> result: results) {
							//Block
							result.get();
						}
					}
				} catch (final InterruptedException | ExecutionException exception) {
					//Log the exception
					LOGGER.error(exception.getMessage(), exception.fillInStackTrace());
				}
			}
		}catch(final Exception exception) {
			//Log
			LOGGER.error(exception.getMessage(), exception.fillInStackTrace());
		}finally {
			//Shut Down the executor service
			executorService.shutdown();
		}

	}

	private void  populate(final CloseableHttpClient client,final List<Callable<String>> callables) {
		//Handle Exception
		try {
			final Class<?>  clazz = Class.forName(fqcn);
			//Get the constructor of the loaded class.
			final Constructor<?>[] constructors = clazz.getDeclaredConstructors();
			//Invoke the constructor with the configured metadata
			@SuppressWarnings("unchecked")
			final Callable<String> callable = (Callable<String>)constructors[0].newInstance(new Object[]{metadata, dbId, client, mdcType});
			//Add To The List
			callables.add(callable);

		}catch(final Exception exception) {
			//Log
			LOGGER.error(exception.getMessage(), exception.fillInStackTrace());
		}
	}
}
