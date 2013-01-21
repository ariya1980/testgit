package com.tmn.service.task.topupairtime.impl;

import com.tmn.service.entity.topupairtime.TopupAirtimeES;
import com.tmn.service.task.topupairtime.TopupAirtimeTS;
import com.tmn.service.task.topupairtime.message.TopupEwalletRequest;
import com.tmn.service.task.topupairtime.message.VerifyEwalletRequest;
import com.tmn.service.task.topupairtime.message.TopupEwalletResponse;
import com.tmn.service.task.topupairtime.message.VerifyEwalletResponse;

public class TopupAirtimeTSImpl implements TopupAirtimeTS {
	
	TopupAirtimeES topupAirtimeES;

	public VerifyEwalletResponse verifyTopupByEwallet(
			VerifyEwalletRequest reqVerifyEwalletModel) {
		// TODO Auto-generated method stub
		return topupAirtimeES.verifyTopupByEwallet(reqVerifyEwalletModel);
	}

	public TopupEwalletResponse topupByEwallet(
			TopupEwalletRequest reqTopupEwalletModel) {
		// TODO Auto-generated method stub
		return topupAirtimeES.topupByEwallet(reqTopupEwalletModel);
	}

}
