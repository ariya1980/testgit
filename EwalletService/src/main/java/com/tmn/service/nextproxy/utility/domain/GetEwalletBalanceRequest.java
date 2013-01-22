package com.tmn.service.nextproxy.utility.domain;

public class GetEwalletBalanceRequest {

	private String sessionToken;
	private String userReference;		// email or mobile
	
	public String getSessionToken() {
		return sessionToken;
	}
	public void setSessionToken(String sessionToken) {
		this.sessionToken = sessionToken;
	}
	public String getUserReference() {
		return userReference;
	}
	public void setUserReference(String userReference) {
		this.userReference = userReference;
	}
	
}
