package com.tmn.service.task.topupairtime.impl;

import com.tmn.service.entity.topupairtime.TopupAirtimeES;
import com.tmn.service.exception.TmnServiceException;
import com.tmn.service.task.topupairtime.TopupAirtimeTS;
import com.tmn.service.task.topupairtime.domain.TopupEwalletRequest;
import com.tmn.service.task.topupairtime.domain.TopupEwalletResponse;
import com.tmn.service.task.topupairtime.domain.VerifyEwalletRequest;
import com.tmn.service.task.topupairtime.domain.VerifyEwalletResponse;

public class TopupAirtimeTSImpl implements TopupAirtimeTS {
	
	TopupAirtimeES topupAirtimeES;

	public VerifyEwalletResponse verifyTopupByEwallet(VerifyEwalletRequest reqVerifyEwalletModel)  throws TmnServiceException {
		// TODO Auto-generated method stub
		return topupAirtimeES.verifyTopupByEwallet(reqVerifyEwalletModel);
	}

	public TopupEwalletResponse topupByEwallet(TopupEwalletRequest reqTopupEwalletModel)   throws TmnServiceException{
		// TODO Auto-generated method stub
		return topupAirtimeES.topupByEwallet(reqTopupEwalletModel);
	}

}
