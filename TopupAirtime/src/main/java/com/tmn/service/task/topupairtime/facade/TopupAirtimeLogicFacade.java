package com.tmn.service.task.topupairtime.facade;

import com.tmn.service.task.topupairtime.logic.TppTopupLogic;
import com.tmn.service.task.topupairtime.logic.TppVerifyTopupLogic;
import com.tmn.service.task.topupairtime.model.ReqTopupEwalletModel;
import com.tmn.service.task.topupairtime.model.ReqVerifyEwalletModel;
import com.tmn.service.task.topupairtime.model.RespTopupEwalletModel;
import com.tmn.service.task.topupairtime.model.RespVerifyEwalletModel;

public class TopupAirtimeLogicFacade {
	
	private TppTopupLogic tppTopupLogic;
	private TppVerifyTopupLogic tppVerifyTopupLogic;

	public RespVerifyEwalletModel verifyTopup(ReqVerifyEwalletModel reqVerifyEwalletModel) {
		RespVerifyEwalletModel respVerifyEwalletModel = new RespVerifyEwalletModel();
		return tppVerifyTopupLogic.verifyTopup(reqVerifyEwalletModel);
	}
	
	public RespTopupEwalletModel topup(ReqTopupEwalletModel reqTopupEwalletModel) {
		RespTopupEwalletModel respTopupEwalletModel = new RespTopupEwalletModel();
		return tppTopupLogic.topup(reqTopupEwalletModel);
	}
	

}
