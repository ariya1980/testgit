package com.tmn.service.utility.message.impl;

import com.tmn.service.comon.SpringServiceProxy;
import com.tmn.service.utility.message.SendMessageUS;

public class SendMessageUSImpl implements SendMessageUS {

	public void sendEmail(String subject, String from, String to, String cc,
			String bcc, String messageValue) {
		//call mail server by ...
		
	}

	public void sendSms(String msisdn, String messageValue, String transId) {
		//get URL of SMS Firsthop in DB Config
		
		//prepare xml message to SMS firsthop
		
		//call Firsthop by REST
		SpringServiceProxy springServiceProxy =  new SpringServiceProxy();
		springServiceProxy.call("/xxxx/xxxx/{xxxx}", "POST", null);
		
	}

}
