package com.tmn.service.ewallet.domain;

public class RefillEwalletWithCashCardRequest {

	private String sessionToken;
	private String userReference;		// email or mobile
	private String cashCardNo;			// cash card number 14 digit
	
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
	public String getCashCardNo() {
		return cashCardNo;
	}
	public void setCashCardNo(String cashCardNo) {
		this.cashCardNo = cashCardNo;
	}
	
}
