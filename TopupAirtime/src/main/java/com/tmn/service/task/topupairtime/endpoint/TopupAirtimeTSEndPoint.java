package com.tmn.service.task.topupairtime.endpoint;

import com.tmn.service.task.topupairtime.TopupAirtimeTS;
import com.tmn.service.task.topupairtime.model.ReqTopupEwalletModel;
import com.tmn.service.task.topupairtime.model.ReqVerifyEwalletModel;
import com.tmn.service.task.topupairtime.model.RespTopupEwalletModel;
import com.tmn.service.task.topupairtime.model.RespVerifyEwalletModel;

public class TopupAirtimeTSEndPoint {
	
	TopupAirtimeTS topupAirtimeTS;
	
	//Service Inventory first to receive from Product API to service topup air time on TMV/TMVH by ewallet
	
	public RespVerifyEwalletModel verifyTopupAirtimeEwallet(ReqVerifyEwalletModel reqVerifyEwalletModel){
		return topupAirtimeTS.verifyTopupAirtimeEwallet(reqVerifyEwalletModel);
		
	}
	
	public RespTopupEwalletModel topupAirtimeEwallet(ReqTopupEwalletModel reqTopupEwalletModel){
		return topupAirtimeTS.topupAirtimeEwallet(reqTopupEwalletModel);	
	}

}
