
package com.tmn.service.task.topupairtime.endpoint;

import com.tmn.service.task.topupairtime.TopupAirtimeTS;
import com.tmn.service.task.topupairtime.message.TopupEwalletRequest;
import com.tmn.service.task.topupairtime.message.VerifyEwalletRequest;
import com.tmn.service.task.topupairtime.message.TopupEwalletResponse;
import com.tmn.service.task.topupairtime.message.VerifyEwalletResponse;

public class TopupByEwalletTSEndPoint {
	
	TopupAirtimeTS topupAirtimeTS;
	
	//Service Inventory first to receive from Product API to service topup air time on TMV/TMVH by ewallet
	
	public VerifyEwalletResponse verifyTopupByEwallet(VerifyEwalletRequest reqVerifyEwalletModel){
		return topupAirtimeTS.verifyTopupByEwallet(reqVerifyEwalletModel);
	}
	
	public TopupEwalletResponse topupByEwallet(TopupEwalletRequest reqTopupEwalletModel){
		return topupAirtimeTS.topupByEwallet(reqTopupEwalletModel);	
	}

}
