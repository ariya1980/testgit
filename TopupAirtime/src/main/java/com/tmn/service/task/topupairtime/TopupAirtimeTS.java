package com.tmn.service.task.topupairtime;

import com.tmn.service.task.topupairtime.model.ReqTopupEwalletModel;
import com.tmn.service.task.topupairtime.model.ReqVerifyEwalletModel;
import com.tmn.service.task.topupairtime.model.RespTopupEwalletModel;
import com.tmn.service.task.topupairtime.model.RespVerifyEwalletModel;

public interface TopupAirtimeTS {
	
	public RespVerifyEwalletModel verifyTopupAirtimeEwallet(ReqVerifyEwalletModel reqVerifyEwalletModel);
	public RespTopupEwalletModel topupAirtimeEwallet(ReqTopupEwalletModel reqTopupEwalletModel);

}
