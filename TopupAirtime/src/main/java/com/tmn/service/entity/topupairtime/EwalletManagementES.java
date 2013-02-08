package com.tmn.service.entity.topupairtime;

import com.tmn.service.task.topupairtime.domain.TopupEwalletRequest;
import com.tmn.service.task.topupairtime.domain.TopupEwalletResponse;
import com.tmn.service.task.topupairtime.domain.VerifyEwalletRequest;
import com.tmn.service.task.topupairtime.domain.VerifyEwalletResponse;

public interface EwalletManagementES {
	
	public VerifyEwalletResponse checkBalance(VerifyEwalletRequest verifyEwalletRequest);
	
	public TopupEwalletResponse debitBuy(TopupEwalletRequest topupEwalletRequest);

}
