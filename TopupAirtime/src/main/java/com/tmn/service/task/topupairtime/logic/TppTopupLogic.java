package com.tmn.service.task.topupairtime.logic;

import com.tmn.service.task.topupairtime.model.ReqTopupEwalletModel;
import com.tmn.service.task.topupairtime.model.RespTopupEwalletModel;
import com.tmn.service.task.topupairtime.proxy.TppProxy;

public class TppTopupLogic {
	
	
	private TppProxy tppProxy;
	
	public RespTopupEwalletModel topup(ReqTopupEwalletModel reqTopupEwalletModel){
		RespTopupEwalletModel respTopupEwalletModel = new RespTopupEwalletModel();
		//set xml
		String xmlReq = "";
		String xmlResp = tppProxy.topup(xmlReq);
		//map xml to respVerifyEwalletModel
		return respTopupEwalletModel;
	}

}
