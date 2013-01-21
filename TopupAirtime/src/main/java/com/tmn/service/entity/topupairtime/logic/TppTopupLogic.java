package com.tmn.service.entity.topupairtime.logic;

import com.tmn.service.entity.topupairtime.proxy.TppProxy;
import com.tmn.service.task.topupairtime.message.TopupEwalletRequest;
import com.tmn.service.task.topupairtime.message.TopupEwalletResponse;

public class TppTopupLogic {
	
	
	private TppProxy tppProxy;
	
	public TopupEwalletResponse topup(TopupEwalletRequest reqTopupEwalletModel){
		TopupEwalletResponse respTopupEwalletModel = new TopupEwalletResponse();
		//set xml
		String xmlReq = "";
		String xmlResp = tppProxy.topup(xmlReq);
		//map xml to respVerifyEwalletModel
		return respTopupEwalletModel;
	}

}
