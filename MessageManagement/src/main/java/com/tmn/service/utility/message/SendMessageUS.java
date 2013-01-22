package com.tmn.service.utility.message;

public interface SendMessageUS {
	
	public void sendEmail(String subject, String from, String to, String cc,String bcc, String messageValue);
	public void sendSms(String msisdn, String messageValue, String transId, String sender);

}
