package com.tmn.service.entity.topupairtime.impl;

import com.tmn.service.comon.SpringServiceProxy;
import com.tmn.service.entity.topupairtime.TopupAirtimeES;
import com.tmn.service.entity.topupairtime.facade.TopupAirtimeLogicFacade;
import com.tmn.service.exception.TmnServiceException;
import com.tmn.service.task.topupairtime.domain.TopupEwalletRequest;
import com.tmn.service.task.topupairtime.domain.TopupEwalletResponse;
import com.tmn.service.task.topupairtime.domain.VerifyEwalletRequest;
import com.tmn.service.task.topupairtime.domain.VerifyEwalletResponse;

public class TopupAirtimeESImpl implements TopupAirtimeES {


	
	public VerifyEwalletResponse verifyTopupByEwallet(
		VerifyEwalletRequest reqVerifyEwalletModel)
		throws TmnServiceException  {
		// TODO Auto-generated method stub
		VerifyEwalletResponse verifyEwalletResponse = new VerifyEwalletResponse();
		try{
			//call verify topup
			TopupAirtimeLogicFacade topupAirtimeLogicFacade = new 	TopupAirtimeLogicFacade();
			 topupAirtimeLogicFacade.verifyTopup(reqVerifyEwalletModel);
		}catch(Exception e){
			e.printStackTrace();
			throw new TmnServiceException("bus error message");
		}finally{
			
		}
		return verifyEwalletResponse;
	}

	public TopupEwalletResponse topupByEwallet(
			TopupEwalletRequest reqTopupEwalletModel) {
		// TODO Auto-generated method stub
		TopupAirtimeLogicFacade topupAirtimeLogicFacade = new 	TopupAirtimeLogicFacade();
		//call topup
		TopupEwalletResponse respTopupEwalletModel = topupAirtimeLogicFacade.topup(reqTopupEwalletModel);
		//call Ewallet get current balance (REST to ewallet service)
		SpringServiceProxy springServiceProxy = new SpringServiceProxy();
		springServiceProxy.call("/xxxx/xxxx/{xxxx}", "POST", null);
		
		//set current balance to RespTopupEwalletModel
		
		return respTopupEwalletModel;
	}





}
