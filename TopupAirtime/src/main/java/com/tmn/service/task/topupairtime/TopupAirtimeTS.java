package com.tmn.service.task.topupairtime;

import com.tmn.service.task.topupairtime.message.TopupEwalletRequest;
import com.tmn.service.task.topupairtime.message.VerifyEwalletRequest;
import com.tmn.service.task.topupairtime.message.TopupEwalletResponse;
import com.tmn.service.task.topupairtime.message.VerifyEwalletResponse;

public interface TopupAirtimeTS {
	
	public VerifyEwalletResponse verifyTopupAirtimeEwallet(VerifyEwalletRequest reqVerifyEwalletModel);
	public TopupEwalletResponse topupAirtimeEwallet(TopupEwalletRequest reqTopupEwalletModel);

}
