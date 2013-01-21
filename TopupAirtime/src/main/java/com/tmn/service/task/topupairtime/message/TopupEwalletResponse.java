package com.tmn.service.task.topupairtime.message;

public class TopupEwalletResponse {
	
	private String resultNamespace;	
	private String resultCode;			
	private String reqTransactionId;
	private String transactionId;		
	private String responseMessage;	
	private String downTransId;		
	private String msisdn;				
	private String amount;				
	private String operator;			
	private String currentBalance;		
	private String ewalletTransId;		
	private String ewalletBalance;
	
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
	public String getResponseMessage() {
		return responseMessage;
	}
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	public String getDownTransId() {
		return downTransId;
	}
	public void setDownTransId(String downTransId) {
		this.downTransId = downTransId;
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
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(String currentBalance) {
		this.currentBalance = currentBalance;
	}
	public String getEwalletTransId() {
		return ewalletTransId;
	}
	public void setEwalletTransId(String ewalletTransId) {
		this.ewalletTransId = ewalletTransId;
	}
	public String getEwalletBalance() {
		return ewalletBalance;
	}
	public void setEwalletBalance(String ewalletBalance) {
		this.ewalletBalance = ewalletBalance;
	}
	

}
