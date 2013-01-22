
package com.tmn.service.task.topupairtime.endpoint;

import com.tmn.service.exception.TmnServiceException;
import com.tmn.service.task.topupairtime.TopupAirtimeTS;
import com.tmn.service.task.topupairtime.domain.TopupEwalletRequest;
import com.tmn.service.task.topupairtime.domain.TopupEwalletResponse;
import com.tmn.service.task.topupairtime.domain.VerifyEwalletRequest;
import com.tmn.service.task.topupairtime.domain.VerifyEwalletResponse;

public class TopupByEwalletTSEndPoint {
	
	TopupAirtimeTS topupAirtimeTS;
	
	//Service Inventory first to receive from Product API to service topup air time on TMV/TMVH by ewallet
	
	public VerifyEwalletResponse verifyTopupByEwallet(VerifyEwalletRequest reqVerifyEwalletModel){
		VerifyEwalletResponse verifyEwalletResponse = new VerifyEwalletResponse();
		try{
			verifyEwalletResponse =  topupAirtimeTS.verifyTopupByEwallet(reqVerifyEwalletModel);
		}catch(TmnServiceException tse){
			tse.printStackTrace();
			//set http code = 500 to REST
			//send message by using tse.getMessage(); to REST
		}catch(Exception e){
			e.printStackTrace();
			//set http code = 500 to REST
			//send message by using tse.getMessage(); to REST
		}
		return verifyEwalletResponse;
	}
	
	public TopupEwalletResponse topupByEwallet(TopupEwalletRequest reqTopupEwalletModel){
		TopupEwalletResponse topupEwalletResponse = new TopupEwalletResponse();
		try{
			topupEwalletResponse =  topupAirtimeTS.topupByEwallet(reqTopupEwalletModel);
		}catch(TmnServiceException tse){
			tse.printStackTrace();
			//set http code = 500 to REST
			//send message by using tse.getMessage(); to REST
		}catch(Exception e){
			e.printStackTrace();
			//set http code = 500 to REST
			//send message by using tse.getMessage(); to REST
		}
		return topupEwalletResponse;
	}

}
