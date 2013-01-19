package com.tmn.service.task.topupairtime.impl;

import com.tmn.service.entity.topupairtime.TopupAirtimeES;
import com.tmn.service.task.topupairtime.TopupAirtimeTS;
import com.tmn.service.task.topupairtime.model.ReqTopupEwalletModel;
import com.tmn.service.task.topupairtime.model.ReqVerifyEwalletModel;
import com.tmn.service.task.topupairtime.model.RespTopupEwalletModel;
import com.tmn.service.task.topupairtime.model.RespVerifyEwalletModel;

public class TopupAirtimeTSImpl implements TopupAirtimeTS {
	
	TopupAirtimeES topupAirtimeES;

	public RespVerifyEwalletModel verifyTopupAirtimeEwallet(
			ReqVerifyEwalletModel reqVerifyEwalletModel) {
		// TODO Auto-generated method stub
		return topupAirtimeES.verifyTopupAirtimeEwallet(reqVerifyEwalletModel);
	}

	public RespTopupEwalletModel topupAirtimeEwallet(
			ReqTopupEwalletModel reqTopupEwalletModel) {
		// TODO Auto-generated method stub
		return topupAirtimeES.topupAirtimeEwallet(reqTopupEwalletModel);
	}

}
