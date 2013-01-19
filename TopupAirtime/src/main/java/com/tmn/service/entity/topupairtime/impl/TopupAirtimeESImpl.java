package com.tmn.service.entity.topupairtime.impl;

import com.tmn.service.entity.topupairtime.TopupAirtimeES;
import com.tmn.service.task.topupairtime.facade.TopupAirtimeLogicFacade;
import com.tmn.service.task.topupairtime.model.ReqTopupEwalletModel;
import com.tmn.service.task.topupairtime.model.ReqVerifyEwalletModel;
import com.tmn.service.task.topupairtime.model.RespTopupEwalletModel;
import com.tmn.service.task.topupairtime.model.RespVerifyEwalletModel;

public class TopupAirtimeESImpl implements TopupAirtimeES {


	public RespVerifyEwalletModel verifyTopupAirtimeEwallet(
			ReqVerifyEwalletModel reqVerifyEwalletModel) {
		// TODO Auto-generated method stub
		//call verify topup
		TopupAirtimeLogicFacade topupAirtimeLogicFacade = new 	TopupAirtimeLogicFacade();
		return topupAirtimeLogicFacade.verifyTopup(reqVerifyEwalletModel);
	}

	public RespTopupEwalletModel topupAirtimeEwallet(
			ReqTopupEwalletModel reqTopupEwalletModel) {
		// TODO Auto-generated method stub
		TopupAirtimeLogicFacade topupAirtimeLogicFacade = new 	TopupAirtimeLogicFacade();
		//call topup
		RespTopupEwalletModel respTopupEwalletModel = topupAirtimeLogicFacade.topup(reqTopupEwalletModel);
		//call Ewallet get current balance (REST to ewallet service)
		
		//set current balance to RespTopupEwalletModel
		
		return respTopupEwalletModel;
	}

}
