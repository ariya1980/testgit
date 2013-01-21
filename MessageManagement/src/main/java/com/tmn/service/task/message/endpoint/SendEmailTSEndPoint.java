package com.tmn.service.task.message.endpoint;

import com.tmn.service.task.message.SendMessageTS;

public class SendEmailTSEndPoint{
	
	SendMessageTS sendMessageTS;

	public void sendEmail(String subject, String from, String to, String cc,
			String bcc, String messageValue) {
		// TODO Auto-generated method stub
		sendMessageTS.sendEmail(subject, from, to, cc, bcc, messageValue);

	}


}
