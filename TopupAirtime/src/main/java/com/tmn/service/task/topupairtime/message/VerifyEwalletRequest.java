package com.tmn.service.task.topupairtime.message;

public class VerifyEwalletRequest {
	
	private String channel;			
	private String reqTransactionId;
	private String msisdn;				
	private String amount;				
	private String cashcardNo;
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
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
	
	

}
