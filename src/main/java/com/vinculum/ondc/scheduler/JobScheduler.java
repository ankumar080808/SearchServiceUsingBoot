package com.vinculum.ondc.scheduler;

import it.sauronsoftware.cron4j.Scheduler;

public class JobScheduler<V>{
	
	private Scheduler scheduler = new Scheduler();
	final private Runnable task;
	private String id;
	private String cron;
	

	public JobScheduler(final Runnable task, final String cron){
		this.task = task;
		this.cron = cron;
	}
	
	public void start(){
		id = scheduler.schedule(cron, task);
		scheduler.start();
	}

	public void setScheduler(final Scheduler scheduler) {
		this.scheduler = scheduler;
	}

	public Scheduler getScheduler() {
		return scheduler;
	}

	public String getId() {
		return id;
	}

	public String getCron() {
		return cron;
	}

	public void setCron(final String cron) {
		this.cron = cron;
	}
}
