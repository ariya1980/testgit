package com.tmn.service.task.topupairtime.logic;

import com.tmn.service.task.topupairtime.model.ReqVerifyEwalletModel;
import com.tmn.service.task.topupairtime.model.RespVerifyEwalletModel;
import com.tmn.service.task.topupairtime.proxy.TppProxy;

public class TppVerifyTopupLogic {
	
	
	private TppProxy tppProxy;
	
	public RespVerifyEwalletModel verifyTopup(ReqVerifyEwalletModel reqVerifyEwalletModel){
		RespVerifyEwalletModel respVerifyEwalletModel = new RespVerifyEwalletModel();
		//set xml
		String xmlReq = "";
		String xmlResp = tppProxy.verifyTopup(xmlReq);
		//map xml to respVerifyEwalletModel
		return respVerifyEwalletModel;
	}

}
