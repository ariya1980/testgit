package com.tmn.service.task.billpay.domain;

public class ConfirmBillEwalletRequest {

	private String verifyTransId;		
	private String reqTransactionId;
	private String ewTmnId;				
	private String ewUserId;
	private String ewSessionId;
	private String actionType;	//"CONFIRM"
	private String orderAmount;	//10001 = 100.01 bath
	private String paymentAmount;	//10001 = 100.01 bath

}
