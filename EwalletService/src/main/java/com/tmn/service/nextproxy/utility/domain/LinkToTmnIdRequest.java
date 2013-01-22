package com.tmn.service.nextproxy.utility.domain;

public class LinkToTmnIdRequest {

	private String tmnId;					// maximum 100 char
	private String ewalletAccount;			// maximum 100 char
	
	public String getTmnId() {
		return tmnId;
	}
	public void setTmnId(String tmnId) {
		this.tmnId = tmnId;
	}
	public String getEwalletAccount() {
		return ewalletAccount;
	}
	public void setEwalletAccount(String ewalletAccount) {
		this.ewalletAccount = ewalletAccount;
	}
	
}
