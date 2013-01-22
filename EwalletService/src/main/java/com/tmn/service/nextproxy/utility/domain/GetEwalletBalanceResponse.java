package com.tmn.service.nextproxy.utility.domain;

public class GetEwalletBalanceResponse extends NextServiceResponse {

	private String balance;
	private String fullName;
	
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
}
