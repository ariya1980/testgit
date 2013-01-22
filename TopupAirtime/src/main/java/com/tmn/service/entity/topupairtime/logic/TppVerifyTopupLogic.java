package com.tmn.service.entity.topupairtime.logic;

import com.tmn.service.entity.topupairtime.proxy.TppProxy;
import com.tmn.service.task.topupairtime.domain.VerifyEwalletRequest;
import com.tmn.service.task.topupairtime.domain.VerifyEwalletResponse;

public class TppVerifyTopupLogic {
	
	
	private TppProxy tppProxy;
	
	public VerifyEwalletResponse verifyTopup(VerifyEwalletRequest reqVerifyEwalletModel){
		VerifyEwalletResponse respVerifyEwalletModel = new VerifyEwalletResponse();
		//set xml
		String xmlReq = "";
		String xmlResp = tppProxy.verifyTopup(xmlReq);
		//map xml to respVerifyEwalletModel
		return respVerifyEwalletModel;
	}

}
