package com.tmn.service.entity.topupairtime;

import com.tmn.service.task.topupairtime.model.ReqTopupEwalletModel;
import com.tmn.service.task.topupairtime.model.ReqVerifyEwalletModel;
import com.tmn.service.task.topupairtime.model.RespTopupEwalletModel;
import com.tmn.service.task.topupairtime.model.RespVerifyEwalletModel;

public interface TopupAirtimeES {
	
	public RespVerifyEwalletModel verifyTopupAirtimeEwallet(ReqVerifyEwalletModel reqVerifyEwalletModel);
	public RespTopupEwalletModel topupAirtimeEwallet(ReqTopupEwalletModel reqTopupEwalletModel);

}
