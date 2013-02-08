package com.ewallet.service.utility.proxy;

public interface EwalletProxy {
	
	// xml request and response to PPGW
	public String getBalance(String xml);
	
	public String debitBuy(String xml);
	
	public String debitBillPay(String xml);

}
