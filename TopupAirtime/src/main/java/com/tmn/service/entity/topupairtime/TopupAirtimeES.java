package com.tmn.service.entity.topupairtime;

import com.tmn.service.task.topupairtime.message.TopupEwalletRequest;
import com.tmn.service.task.topupairtime.message.VerifyEwalletRequest;
import com.tmn.service.task.topupairtime.message.TopupEwalletResponse;
import com.tmn.service.task.topupairtime.message.VerifyEwalletResponse;

public interface TopupAirtimeES {
	
	public VerifyEwalletResponse verifyTopupAirtimeEwallet(VerifyEwalletRequest reqVerifyEwalletModel);
	public TopupEwalletResponse topupAirtimeEwallet(TopupEwalletRequest reqTopupEwalletModel);

}
