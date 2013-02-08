package com.tmn.service.task.billpay.domain;

public class VerifyBillEwalletRequest {

	private String reqTransactionId;
	private String ewTmnId;				
	private String ewUserId;
	private String ewSessionId;
	private String actionType;	//"VERIFY"
	private String sof;	//EW,CC,DD
	private String sofGateway;	//EW,KBANK,BBL
	private String serviceType;	//PAY_BILL
	private String channel;	//MOBILE_APP,KIOSK,WEB,COUNTER
	private String orderAmount;	//10001 = 100.01 bath
	private String paymentAmount;	//10001 = 100.01 bath
	private String currency;	//currency=THB, US
	private String orderDate;	//order_date=yyyy/mm/dd hh:mm:ss
	private String dueDate;	//due_date=yyyy/mm/dd hh:mm:ss
	private String exchangeRate;
	private String vat;	//vat (%)
	private String clientVersion;	//client_version=mobile app version,terminal version
	private String clientId;	//client_id=089xxxxxxx,terminal_id,device_id
	private String billerService;	//biller_service=true_x
	private String reference1;	//reference1=100004209890
	private String reference2;	//reference2=100004209890

}
