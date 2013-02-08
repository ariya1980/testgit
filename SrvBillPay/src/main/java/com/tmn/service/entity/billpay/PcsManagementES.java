package com.tmn.service.entity.billpay;

public interface PcsManagementES {

	public String verifyPCS(String xml);
	public String confirmPCS(String xml);
	public String inquiryPCS(String xml);

}
