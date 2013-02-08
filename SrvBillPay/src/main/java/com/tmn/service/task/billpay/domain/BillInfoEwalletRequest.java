package com.tmn.service.task.billpay.domain;

public class BillInfoEwalletRequest {

	//!!! not yet because don't have interface spec.
	private String reqTransactionId;
	private String msisdn;
	
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
	
}
