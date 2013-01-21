package com.tmn.service.entity.topupairtime.facade;

import com.tmn.service.entity.topupairtime.logic.TppTopupLogic;
import com.tmn.service.entity.topupairtime.logic.TppVerifyTopupLogic;
import com.tmn.service.task.topupairtime.message.TopupEwalletRequest;
import com.tmn.service.task.topupairtime.message.VerifyEwalletRequest;
import com.tmn.service.task.topupairtime.message.TopupEwalletResponse;
import com.tmn.service.task.topupairtime.message.VerifyEwalletResponse;

public class TopupAirtimeLogicFacade {
	
	private TppTopupLogic tppTopupLogic;
	private TppVerifyTopupLogic tppVerifyTopupLogic;

	public VerifyEwalletResponse verifyTopup(VerifyEwalletRequest reqVerifyEwalletModel) {
		VerifyEwalletResponse respVerifyEwalletModel = new VerifyEwalletResponse();
		return tppVerifyTopupLogic.verifyTopup(reqVerifyEwalletModel);
	}
	
	public TopupEwalletResponse topup(TopupEwalletRequest reqTopupEwalletModel) {
		TopupEwalletResponse respTopupEwalletModel = new TopupEwalletResponse();
		return tppTopupLogic.topup(reqTopupEwalletModel);
	}
	

}
