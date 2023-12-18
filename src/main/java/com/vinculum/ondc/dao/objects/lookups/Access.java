package com.vinculum.ondc.dao.objects.lookups;

import java.io.Serializable;

import java.sql.Timestamp;

public class Access implements Serializable{

	/**
	 * Generated Serial Version UID
	 */
	private static final long serialVersionUID = 3336376740960385296L;
	

	    private String clientId;
	    private String dbId;
	    private String orgId;
	    private String ukid;
	    private String subscriberId;
	    private String subscriberUrl;
	    private String type;
	    private String domain;
	    private String domainDesc;
	    private String country;
	    private String city;
	    private String signingPrivateKey;
	    private String encrPrivateKey;
	    private String signingPublicKey;
	    private String encrPublicKey;
	    private Timestamp validFrom;
	    private Timestamp validUntil;
	    private String status;
	    private String active;
	    private Timestamp crtDate;
	    private Timestamp updDate;
	    private String updBy;
	    private String bppDescriptorName;
	    private String bppDescriptorSymbol;
	    private String bppDescriptorShortDesc;
	    private String bppDescriptorLongDesc;
	    private String bppDescriptorImages;
	    private String bppProvidersId;
	    private String bppProvidersTimeLabel;
	    private Timestamp bppProvidersTimeStamp;
	    private String bppProvidersDescriptorName;
	    private String bppProvidersDescriptorSymbol;
	    private String bppProvidersDescriptorShortDesc;
	    private String bppProvidersDescriptorLongDesc;
	    private String bppProvidersDescriptorImages;
	    
		public String getClientId() {
			return clientId;
		}
		public void setClientId(String clientId) {
			this.clientId = clientId;
		}
		public String getDbId() {
			return dbId;
		}
		public void setDbId(String dbId) {
			this.dbId = dbId;
		}
		public String getOrgId() {
			return orgId;
		}
		public void setOrgId(String orgId) {
			this.orgId = orgId;
		}
		public String getUkid() {
			return ukid;
		}
		public void setUkid(String ukid) {
			this.ukid = ukid;
		}
		public String getSubscriberId() {
			return subscriberId;
		}
		public void setSubscriberId(String subscriberId) {
			this.subscriberId = subscriberId;
		}
		public String getSubscriberUrl() {
			return subscriberUrl;
		}
		public void setSubscriberUrl(String subscriberUrl) {
			this.subscriberUrl = subscriberUrl;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getDomain() {
			return domain;
		}
		public void setDomain(String domain) {
			this.domain = domain;
		}
		public String getDomainDesc() {
			return domainDesc;
		}
		public void setDomainDesc(String domainDesc) {
			this.domainDesc = domainDesc;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getSigningPrivateKey() {
			return signingPrivateKey;
		}
		public void setSigningPrivateKey(String signingPrivateKey) {
			this.signingPrivateKey = signingPrivateKey;
		}
		public String getEncrPrivateKey() {
			return encrPrivateKey;
		}
		public void setEncrPrivateKey(String encrPrivateKey) {
			this.encrPrivateKey = encrPrivateKey;
		}
		public String getSigningPublicKey() {
			return signingPublicKey;
		}
		public void setSigningPublicKey(String signingPublicKey) {
			this.signingPublicKey = signingPublicKey;
		}
		public String getEncrPublicKey() {
			return encrPublicKey;
		}
		public void setEncrPublicKey(String encrPublicKey) {
			this.encrPublicKey = encrPublicKey;
		}
		public Timestamp getValidFrom() {
			return validFrom;
		}
		public void setValidFrom(Timestamp validFrom) {
			this.validFrom = validFrom;
		}
		public Timestamp getValidUntil() {
			return validUntil;
		}
		public void setValidUntil(Timestamp validUntil) {
			this.validUntil = validUntil;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getActive() {
			return active;
		}
		public void setActive(String active) {
			this.active = active;
		}
		public Timestamp getCrtDate() {
			return crtDate;
		}
		public void setCrtDate(Timestamp crtDate) {
			this.crtDate = crtDate;
		}
		public Timestamp getUpdDate() {
			return updDate;
		}
		public void setUpdDate(Timestamp updDate) {
			this.updDate = updDate;
		}
		public String getUpdBy() {
			return updBy;
		}
		public void setUpdBy(String updBy) {
			this.updBy = updBy;
		}
		public String getBppDescriptorName() {
			return bppDescriptorName;
		}
		public void setBppDescriptorName(String bppDescriptorName) {
			this.bppDescriptorName = bppDescriptorName;
		}
		public String getBppDescriptorSymbol() {
			return bppDescriptorSymbol;
		}
		public void setBppDescriptorSymbol(String bppDescriptorSymbol) {
			this.bppDescriptorSymbol = bppDescriptorSymbol;
		}
		public String getBppDescriptorShortDesc() {
			return bppDescriptorShortDesc;
		}
		public void setBppDescriptorShortDesc(String bppDescriptorShortDesc) {
			this.bppDescriptorShortDesc = bppDescriptorShortDesc;
		}
		public String getBppDescriptorLongDesc() {
			return bppDescriptorLongDesc;
		}
		public void setBppDescriptorLongDesc(String bppDescriptorLongDesc) {
			this.bppDescriptorLongDesc = bppDescriptorLongDesc;
		}
		public String getBppDescriptorImages() {
			return bppDescriptorImages;
		}
		public void setBppDescriptorImages(String bppDescriptorImages) {
			this.bppDescriptorImages = bppDescriptorImages;
		}
		public String getBppProvidersId() {
			return bppProvidersId;
		}
		public void setBppProvidersId(String bppProvidersId) {
			this.bppProvidersId = bppProvidersId;
		}
		public String getBppProvidersTimeLabel() {
			return bppProvidersTimeLabel;
		}
		public void setBppProvidersTimeLabel(String bppProvidersTimeLabel) {
			this.bppProvidersTimeLabel = bppProvidersTimeLabel;
		}
		
		public Timestamp getBppProvidersTimeStamp() {
			return bppProvidersTimeStamp;
		}
		public void setBppProvidersTimeStamp(Timestamp bppProvidersTimeStamp) {
			this.bppProvidersTimeStamp = bppProvidersTimeStamp;
		}
		public String getBppProvidersDescriptorName() {
			return bppProvidersDescriptorName;
		}
		public void setBppProvidersDescriptorName(String bppProvidersDescriptorName) {
			this.bppProvidersDescriptorName = bppProvidersDescriptorName;
		}
		public String getBppProvidersDescriptorSymbol() {
			return bppProvidersDescriptorSymbol;
		}
		public void setBppProvidersDescriptorSymbol(String bppProvidersDescriptorSymbol) {
			this.bppProvidersDescriptorSymbol = bppProvidersDescriptorSymbol;
		}
		public String getBppProvidersDescriptorShortDesc() {
			return bppProvidersDescriptorShortDesc;
		}
		public void setBppProvidersDescriptorShortDesc(String bppProvidersDescriptorShortDesc) {
			this.bppProvidersDescriptorShortDesc = bppProvidersDescriptorShortDesc;
		}
		public String getBppProvidersDescriptorLongDesc() {
			return bppProvidersDescriptorLongDesc;
		}
		public void setBppProvidersDescriptorLongDesc(String bppProvidersDescriptorLongDesc) {
			this.bppProvidersDescriptorLongDesc = bppProvidersDescriptorLongDesc;
		}
		public String getBppProvidersDescriptorImages() {
			return bppProvidersDescriptorImages;
		}
		public void setBppProvidersDescriptorImages(String bppProvidersDescriptorImages) {
			this.bppProvidersDescriptorImages = bppProvidersDescriptorImages;
		}
	    
			   
	}

	
	

