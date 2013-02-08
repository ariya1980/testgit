
package com.tmn.service.task.topupairtime.endpoint;

import com.tmn.service.exception.TmnServiceException;
import com.tmn.service.task.topupairtime.RetryTopupAirtimeTS;
import com.tmn.service.task.topupairtime.TopupAirtimeTS;
import com.tmn.service.task.topupairtime.domain.TopupEwalletRequest;
import com.tmn.service.task.topupairtime.domain.TopupEwalletResponse;
import com.tmn.service.task.topupairtime.domain.VerifyEwalletRequest;
import com.tmn.service.task.topupairtime.domain.VerifyEwalletResponse;

public class RetryTopupTSEndPoint {
	
	RetryTopupAirtimeTS retryTopupAirtimeTS;
	
	public TopupEwalletResponse retryTopup(String retryTxn){
		TopupEwalletResponse topupEwalletResponse = new TopupEwalletResponse();
		try{
			topupEwalletResponse =  retryTopupAirtimeTS.retryTopup(retryTxn);
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
