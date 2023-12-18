package com.vinculum.ondc.dao.custom;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PreDestroy;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.vinculum.ondc.constants.Constants;
import com.vinculum.ondc.objects.MetaData;
import com.vinculum.ondc.scheduler.JobScheduler;
import com.vinculum.ondc.scheduler.VinScheduler;
import com.vinculum.ondc.utils.Util;

import it.sauronsoftware.cron4j.Scheduler;


@Service
public class OndcInitializer {

	public static final Logger LOGGER = LoggerFactory.getLogger(OndcInitializer.class);
	/**
	 * The cron map to be injected from spring.
	 */
	private Map<Integer, Cron> cronMap;

	/**
	 * Static list of all the schedulers which are active. These are stored for
	 * shutting then down gracefully on shutdown command.
	 */
	private final static List<JobScheduler<String>> SCHEDULES = new ArrayList<>();
	/**
	 * Inject The Process Metadata
	 */
	private MetaData metadata;

	private String schedule= Constants.ON;

	/**
	 * Initialize Method is Used To Initialize the Service.
	 */
	public void init() {
		// Log the memory details
		Util.memory(OndcInitializer.class);
		// Log the information
		LOGGER.info("Initializing Ondc Scheduler...");
		//Log the memory details
		Util.memory(OndcInitializer.class);
		// Log the information
		LOGGER.info("Ondc Main Thread Started.");
		// Start the order sku pull scheduler
		start();
		// Display
		display();
	}

	/**
	 * This method is responsible for starting the scheduler for the all the
	 * configured client.
	 */
	private void start() {	
		
		final MetaDataLoader loader = new MetaDataLoader();
		
		//Set manager
		loader.setManager(metadata.getManager());
		//Set Session
		loader.setSqlSession(metadata.getSession());
		
	
		//Loop Through The Data Sources
		for (final String dbId : metadata.getDatasources().keySet()) {
			// Check if DB id is not for global database
			if (!StringUtils.equalsIgnoreCase(Constants.GLOBAL_DB_ID, dbId)) {
				//Check
				if(StringUtils.equalsIgnoreCase(schedule, Constants.ON)) {
					
					if (StringUtils.equalsIgnoreCase(Constants.POSTGRES_DB_ID, dbId)) {
						
						
						//smetadata.setInfos(loader.populateMetaInfo(dbId));
					}
					
					//Loop Through The Cron Map
					for (final Map.Entry<Integer, Cron> cron : cronMap.entrySet()) {
						//Get the Cron Value
						final Cron value = cron.getValue();
						//Get the Activity
						final int activity = cron.getKey();
						// Get the CRON String.
						final String cronString = value.getCron();
						//Get The Type String
						final String type = cron.getValue().getType();
						//Create Scheduler Object
						final VinScheduler schedule = new VinScheduler(metadata , dbId , activity, value);
						// Create the Main Worker Object
						final JobScheduler<String> scheduler = new JobScheduler<>(schedule, cronString);
						// Kick
						kick(scheduler, activity, cronString, dbId, type);
					}
				}else {
					//Log
					LOGGER.info("Scheduler is Switched Off");
				}
			}
		}
	}

	private void kick(final JobScheduler<String> scheduler, final int frequencyType, final String cronString,final String dbId, final String type) {
		// Start the scheduler.
		scheduler.start();
		// Log the information
		LOGGER.info(String.format("Job Started With CRON ID [Activity Type]: %d and Cron String: %s For Db Id: %s [Activity Name: %s]", frequencyType,	cronString, dbId, type));
		// Add the running schedulers.
		SCHEDULES.add(scheduler);
	}

	@PreDestroy
	public void close() {
		for (final JobScheduler<String> scheduler : SCHEDULES) {
			final Scheduler schedule = scheduler.getScheduler();
			if (null != schedule && schedule.isStarted()) {
				LOGGER.info(String.format("Shutting down scheduler: %s", scheduler.getId()));
				schedule.stop();
			}
		}
	}

	/**
	 * @return the cronMap
	 */
	public Map<Integer, Cron> getCronMap() {
		return cronMap;
	}

	/**
	 * @param cronMap
	 *            the cronMap to set
	 */
	public void setCronMap(final Map<Integer, Cron> cronMap) {
		this.cronMap = cronMap;
	}



	private void display() {
		LOGGER.info("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX  ");
		LOGGER.info("XXX                   XXX  XXX   XXXXXX          XXX         XXXXXXXX        XXXXXXXXXXXXXXX   XXX               ");
		LOGGER.info(" XXX                 XXX   XXX   XXX XXX         XXX         XXX    XXX      XXXXXXXXXXXXXXX   XXX               ");
		LOGGER.info("  XXX               XXX    XXX   XXX  XXX        XXX         XXX     XXX     XXX               XXX               ");
		LOGGER.info("   XXX             XXX     XXX   XXX   XXX       XXX         XXX      XXX    XXX               XXX               ");
		LOGGER.info("    XXX           XXX      XXX   XXX    XXX      XXX         XXX       XXX   XXXXXXXXX         XXX               ");
		LOGGER.info("     XXX         XXX       XXX   XXX     XXX     XXX  XXXXXX XXX        XXX  XXXXXXXXX         XXX               ");
		LOGGER.info("      XXX       XXX        XXX   XXX      XXX    XXX         XXX       XXX   XXXXXXXXX         XXX               ");
		LOGGER.info("       XXX     XXX         XXX   XXX       XXX   XXX         XXX      XXX    XXX               XXX               ");
		LOGGER.info("        XXX   XXX          XXX   XXX        XXX  XXX         XXX     XXX     XXX               XXX               ");
		LOGGER.info("         XXXXXXX           XXX   XXX         XXX XXX         XXX    XXX      XXXXXXXXXXXXXXX   XXXXXXXXXXXX      ");
		LOGGER.info("          XXXXX            XXX   XXX          XXXXXX         XXXXXXXXX       XXXXXXXXXXXXXXX   XXXXXXXXXXXX      ");
		LOGGER.info("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX  ");
		LOGGER.info("                                            STARTUP COMPLETE                                                     ");
		LOGGER.info("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX  ");
	}

	public void setMetadata(MetaData metadata) {
		this.metadata = metadata;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
}
