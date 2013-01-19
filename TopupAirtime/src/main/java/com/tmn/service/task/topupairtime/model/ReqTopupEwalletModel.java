package com.tmn.service.task.topupairtime.model;

public class ReqTopupEwalletModel {
	
	private String channel;				
	private String verifyTransId;		
	private String reqTransactionId;	
	private String msisdn;				
	private String amount;				
	private String cashcardNo;		
	private String initiator;				
	private String pin;
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getVerifyTransId() {
		return verifyTransId;
	}
	public void setVerifyTransId(String verifyTransId) {
		this.verifyTransId = verifyTransId;
	}
	public String getReqTransactionId() {
		return reqTransactionId;
	}
	public void setReqTransactionId(String reqTransactionId) {
		this.reqTransactionId = reqTransactionId;
	}
	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getCashcardNo() {
		return cashcardNo;
	}
	public void setCashcardNo(String cashcardNo) {
		this.cashcardNo = cashcardNo;
	}
	public String getInitiator() {
		return initiator;
	}
	public void setInitiator(String initiator) {
		this.initiator = initiator;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	
}
