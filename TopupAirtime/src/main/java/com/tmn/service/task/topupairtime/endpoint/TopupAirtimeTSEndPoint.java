package com.tmn.service.task.topupairtime.endpoint;

import com.tmn.service.task.topupairtime.TopupAirtimeTS;
import com.tmn.service.task.topupairtime.message.TopupEwalletRequest;
import com.tmn.service.task.topupairtime.message.VerifyEwalletRequest;
import com.tmn.service.task.topupairtime.message.TopupEwalletResponse;
import com.tmn.service.task.topupairtime.message.VerifyEwalletResponse;

public class TopupAirtimeTSEndPoint {
	
	TopupAirtimeTS topupAirtimeTS;
	
	//Service Inventory first to receive from Product API to service topup air time on TMV/TMVH by ewallet
	
	public VerifyEwalletResponse verifyTopupAirtimeEwallet(VerifyEwalletRequest reqVerifyEwalletModel){
		return topupAirtimeTS.verifyTopupAirtimeEwallet(reqVerifyEwalletModel);
	}
	
	public TopupEwalletResponse topupAirtimeEwallet(TopupEwalletRequest reqTopupEwalletModel){
		return topupAirtimeTS.topupAirtimeEwallet(reqTopupEwalletModel);	
	}

}
