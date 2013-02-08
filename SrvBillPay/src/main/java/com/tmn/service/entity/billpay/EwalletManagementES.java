package com.tmn.service.entity.billpay;

public interface EwalletManagementES {

	public String getEwalletBalance(String xml);
	public String checkEwalletBalance(String xml);
	public String debitBillPay(String xml);

}
