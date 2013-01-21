package com.tmn.service.entity.topupairtime.impl;

import com.tmn.service.comon.SpringServiceProxy;
import com.tmn.service.entity.topupairtime.TopupAirtimeES;
import com.tmn.service.entity.topupairtime.facade.TopupAirtimeLogicFacade;
import com.tmn.service.task.topupairtime.message.TopupEwalletRequest;
import com.tmn.service.task.topupairtime.message.VerifyEwalletRequest;
import com.tmn.service.task.topupairtime.message.TopupEwalletResponse;
import com.tmn.service.task.topupairtime.message.VerifyEwalletResponse;

public class TopupAirtimeESImpl implements TopupAirtimeES {


	public VerifyEwalletResponse verifyTopupByEwallet(
			VerifyEwalletRequest reqVerifyEwalletModel) {
		// TODO Auto-generated method stub
		//call verify topup
		TopupAirtimeLogicFacade topupAirtimeLogicFacade = new 	TopupAirtimeLogicFacade();
		return topupAirtimeLogicFacade.verifyTopup(reqVerifyEwalletModel);
	}

	public TopupEwalletResponse topupByEwallet(
			TopupEwalletRequest reqTopupEwalletModel) {
		// TODO Auto-generated method stub
		TopupAirtimeLogicFacade topupAirtimeLogicFacade = new 	TopupAirtimeLogicFacade();
		//call topup
		TopupEwalletResponse respTopupEwalletModel = topupAirtimeLogicFacade.topup(reqTopupEwalletModel);
		//call Ewallet get current balance (REST to ewallet service)
		SpringServiceProxy springServiceProxy = new SpringServiceProxy();
		springServiceProxy.call("/xxxx/xxxx/{xxxx}", "POST", null);
		
		//set current balance to RespTopupEwalletModel
		
		return respTopupEwalletModel;
	}



}
