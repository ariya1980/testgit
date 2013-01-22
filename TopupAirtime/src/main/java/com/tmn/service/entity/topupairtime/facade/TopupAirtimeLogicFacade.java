package com.tmn.service.entity.topupairtime.facade;

import com.tmn.service.entity.topupairtime.logic.TppTopupLogic;
import com.tmn.service.entity.topupairtime.logic.TppVerifyTopupLogic;
import com.tmn.service.task.topupairtime.domain.TopupEwalletRequest;
import com.tmn.service.task.topupairtime.domain.TopupEwalletResponse;
import com.tmn.service.task.topupairtime.domain.VerifyEwalletRequest;
import com.tmn.service.task.topupairtime.domain.VerifyEwalletResponse;

public class TopupAirtimeLogicFacade {
	
	private TppTopupLogic tppTopupLogic;
	private TppVerifyTopupLogic tppVerifyTopupLogic;

	public VerifyEwalletResponse verifyTopup(VerifyEwalletRequest reqVerifyEwalletModel) {
		return tppVerifyTopupLogic.verifyTopup(reqVerifyEwalletModel);
	}
	
	public TopupEwalletResponse topup(TopupEwalletRequest reqTopupEwalletModel) {
		return tppTopupLogic.topup(reqTopupEwalletModel);
	}
	

}
