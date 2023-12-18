package com.vinculum.ondc.dao.custom;

import java.io.Serializable;
import java.util.concurrent.ConcurrentLinkedQueue;
/**
 * 
 * @author Manish Anand
 * 
 * This class is responsible for storing the 
 * cron expressions and its descrptions. It is
 * just a POJO
 *
 */
public class Cron implements Serializable{

	/**
	 * Generated Serial Version UID
	 */
	private static final long serialVersionUID = 2785820977205703847L;
	private String cron;
	private String type;
	private ConcurrentLinkedQueue<String> queue;
	private String fqcn;
	private String mdcType;
	
	public String getCron() {
		return cron;
	}
	public void setCron(final String cron) {
		this.cron = cron;
	}
	public String getType() {
		return type;
	}
	public void setType(final String type) {
		this.type = type;
	}
	public ConcurrentLinkedQueue<String> getQueue() {
		return queue;
	}
	public void setQueue(ConcurrentLinkedQueue<String> queue) {
		this.queue = queue;
	}
	public String getFqcn() {
		return fqcn;
	}
	public void setFqcn(String fqcn) {
		this.fqcn = fqcn;
	}
	public String getMdcType() {
		return mdcType;
	}
	public void setMdcType(String mdcType) {
		this.mdcType = mdcType;
	}

}
