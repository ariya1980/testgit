package com.tmn.service.task.topupairtime;

import com.tmn.service.exception.TmnServiceException;
import com.tmn.service.task.topupairtime.domain.TopupEwalletRequest;
import com.tmn.service.task.topupairtime.domain.TopupEwalletResponse;
import com.tmn.service.task.topupairtime.domain.VerifyEwalletRequest;
import com.tmn.service.task.topupairtime.domain.VerifyEwalletResponse;

public interface TopupAirtimeTS {
	
	public VerifyEwalletResponse verifyTopupByEwallet(VerifyEwalletRequest reqVerifyEwalletModel)  throws TmnServiceException;
	public TopupEwalletResponse topupByEwallet(TopupEwalletRequest reqTopupEwalletModel)  throws TmnServiceException;

}
