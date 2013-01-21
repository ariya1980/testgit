package com.tmn.service.task.message.impl;

import com.tmn.service.task.message.SendMessageTS;
import com.tmn.service.utility.message.SendMessageUS;

public class SendMessageTSImpl implements SendMessageTS {
	
	SendMessageUS sendMessageUS;

	public void sendEmail(String subject, String from, String to, String cc,String bcc, String messageValue) {
		sendMessageUS.sendEmail(subject, from, to, cc, bcc, messageValue);
	}

	public void sendSms(String msisdn, String messageValue, String transId) {
		sendMessageUS.sendSms(msisdn, messageValue, transId);
	}

}
