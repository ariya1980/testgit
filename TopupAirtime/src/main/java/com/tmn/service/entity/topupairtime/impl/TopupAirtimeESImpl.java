package com.tmn.service.entity.topupairtime.impl;

import com.tmn.service.entity.topupairtime.CcpManagementES;
import com.tmn.service.entity.topupairtime.CdbManagementES;
import com.tmn.service.entity.topupairtime.EwalletManagementES;
import com.tmn.service.entity.topupairtime.PpgwManagementES;
import com.tmn.service.entity.topupairtime.TopupAirtimeES;
import com.tmn.service.exception.TmnServiceException;
import com.tmn.service.task.topupairtime.domain.TopupEwalletRequest;
import com.tmn.service.task.topupairtime.domain.TopupEwalletResponse;
import com.tmn.service.task.topupairtime.domain.VerifyEwalletRequest;
import com.tmn.service.task.topupairtime.domain.VerifyEwalletResponse;

public class TopupAirtimeESImpl implements TopupAirtimeES {


	private EwalletManagementES ewalletManagementES;
	private CcpManagementES ccpManagementES;
	private CdbManagementES cdbManagementES;
	private PpgwManagementES ppgwManagementES;
	
	public VerifyEwalletResponse verifyTopupByEwallet(
		VerifyEwalletRequest reqVerifyEwalletModel)
		throws TmnServiceException  {
		VerifyEwalletResponse verifyEwalletResponse = new VerifyEwalletResponse();
		try{
			//validate data
			
			//call ES : init txn
			
			//call ES : call verify cdb
			 	verifyEwalletResponse = cdbManagementES.verify(reqVerifyEwalletModel);
			//call ES : insert trans_act
			
			//call ES : call check balance ewallet
				verifyEwalletResponse = ewalletManagementES.checkBalance(reqVerifyEwalletModel);
			//call ES : insert trans_act
				
			//call ES : update txn
				
		}catch(Exception e){
			e.printStackTrace();
			throw new TmnServiceException("bus error message");
		}finally{
			
		}
		return verifyEwalletResponse;
	}

	public TopupEwalletResponse topupByEwallet(
			TopupEwalletRequest reqTopupEwalletModel)throws TmnServiceException  {
		TopupEwalletResponse respTopupEwalletModel = new TopupEwalletResponse();
		try{
			//validate data
			
			//call ES : init txn
			
			//call ES : debit buy ewallet
				respTopupEwalletModel = ewalletManagementES.debitBuy(reqTopupEwalletModel);
			//call ES : insert trans_act
				
			//call ES : insert trans_value >> payment_id
				
			//call ES : topup air time
				
			//call ES : insert trans_act
				
			//call ES : insert trans_value >> product_id
			
			//call ES : Ewallet get current balance 
				
			//call ES : insert trans_act
				
			//call ES : insert trans_value >> current_balance
			
			//set current balance to RespTopupEwalletModel
			
			//call ES : update txn
			
		}catch(Exception e){
			e.printStackTrace();
			throw new TmnServiceException("bus error message");
		}finally{
			
		}
		return respTopupEwalletModel;
	}





}
