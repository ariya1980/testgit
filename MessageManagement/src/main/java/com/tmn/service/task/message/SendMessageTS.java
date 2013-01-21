package com.tmn.service.task.message;

public interface SendMessageTS {
	
	public void sendEmail(String subject,String from,String to,String cc,String bcc,String messageValue);
	public void sendSms(String msisdn,String messageValue,String transId);

}
