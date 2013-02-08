package com.tmn.service.entity.billpay.impl;

import com.tmn.service.entity.billpay.BillPayES;
import com.tmn.service.entity.billpay.EwalletManagementES;
import com.tmn.service.entity.billpay.PcsManagementES;
import com.tmn.service.entity.billpay.TransactionManagementES;
import com.tmn.service.task.billpay.domain.ConfirmBillEwalletRequest;
import com.tmn.service.task.billpay.domain.ConfirmBillEwalletResponse;
import com.tmn.service.task.billpay.domain.VerifyBillEwalletRequest;
import com.tmn.service.task.billpay.domain.VerifyBillEwalletResponse;

public class BillPayESImpl implements BillPayES {
	
	private TransactionManagementES transactionManagementES;
	private EwalletManagementES ewalletManagementES;
	private PcsManagementES pcsManagementES;

	@Override
	public VerifyBillEwalletResponse verifyBillByEwallet(
			VerifyBillEwalletRequest reqVerifyBillEwalletModel) {
		
		//validate data

		//call ES : init transaction
		transactionManagementES.generateTransId("");
		
		//call ES : call check balance ewallet
		ewalletManagementES.getEwalletBalance("");

		//call ES : verify PCS
		pcsManagementES.verifyPCS("");

		//call ES : insert activity into trans_act table
		
		//call ES : update transaction
		
		return null;
	}

	@Override
	public ConfirmBillEwalletResponse confirmBillByEwallet(
			ConfirmBillEwalletRequest reqConfirmBillEwalletModel) {
		// TODO Auto-generated method stub
		transactionManagementES.generateTransId("");
		ewalletManagementES.debitBillPay("");
		pcsManagementES.confirmPCS("");
		return null;
	}

}
