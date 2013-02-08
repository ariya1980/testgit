package com.tmn.service.task.billpay.domain;

public class BillInfoEwalletResponse {

	//!!! not yet because don't have interface spec.	
	private String reqTransactionId;	
	private String transactionId;		
	private String downTransId;	
	private String resultNamespace;
	private String resultCode;			
	private String responseMessage;	
	private String msisdn;				
	private String amount;
	
	public String getReqTransactionId() {
		return reqTransactionId;
	}
	public void setReqTransactionId(String reqTransactionId) {
		this.reqTransactionId = reqTransactionId;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getDownTransId() {
		return downTransId;
	}
	public void setDownTransId(String downTransId) {
		this.downTransId = downTransId;
	}
	public String getResultNamespace() {
		return resultNamespace;
	}
	public void setResultNamespace(String resultNamespace) {
		this.resultNamespace = resultNamespace;
	}
	public String getResultCode() {
		return resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResponseMessage() {
		return responseMessage;
	}
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
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

}
