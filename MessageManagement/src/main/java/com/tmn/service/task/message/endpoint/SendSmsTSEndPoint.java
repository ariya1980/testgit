package com.tmn.service.task.message.endpoint;

import com.tmn.service.task.message.SendMessageTS;

public class SendSmsTSEndPoint{
	
	SendMessageTS sendMessageTS;
	public void sendSms(String msisdn, String messageValue, String transId, String sender) {
		// TODO Auto-generated method stub
		sendMessageTS.sendSms(msisdn, messageValue, transId,  sender);

	}

}
