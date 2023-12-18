package com.vinculum.ondc.dao.objects.lookups;

import java.io.Serializable;

public class ClientMaster implements Serializable {

	/**
	 * Generated Serial Version UID
	 */
	private static final long serialVersionUID = 7082456775168270140L;

	private String OrgId;
	private String ClientId;
	private String UDF1;
	private String UDF2;
	private String UDF3;
	private String UDF4;
	private String UDF5;
	private String extClientCode;

	public String getOrgId() {
		return OrgId;
	}

	public void setOrgId(String orgId) {
		OrgId = orgId;
	}

	public String getClientId() {
		return ClientId;
	}

	public void setClientId(String clientId) {
		ClientId = clientId;
	}

	public String getUDF1() {
		return UDF1;
	}

	public void setUDF1(String uDF1) {
		UDF1 = uDF1;
	}

	public String getUDF2() {
		return UDF2;
	}

	public void setUDF2(String uDF2) {
		UDF2 = uDF2;
	}

	public String getUDF3() {
		return UDF3;
	}

	public void setUDF3(String uDF3) {
		UDF3 = uDF3;
	}

	public String getUDF4() {
		return UDF4;
	}

	public void setUDF4(String uDF4) {
		UDF4 = uDF4;
	}

	public String getUDF5() {
		return UDF5;
	}

	public void setUDF5(String uDF5) {
		UDF5 = uDF5;
	}

	public String getExtClientCode() {
		return extClientCode;
	}

	public void setExtClientCode(String extClientCode) {
		this.extClientCode = extClientCode;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
