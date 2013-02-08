package com.tmn.service.task.billpay.impl;

import com.tmn.service.entity.billpay.BillPayES;
import com.tmn.service.task.billpay.BillPayTS;
import com.tmn.service.task.billpay.domain.ConfirmBillEwalletRequest;
import com.tmn.service.task.billpay.domain.ConfirmBillEwalletResponse;
import com.tmn.service.task.billpay.domain.VerifyBillEwalletRequest;
import com.tmn.service.task.billpay.domain.VerifyBillEwalletResponse;

public class BillPayTSImpl implements BillPayTS {
	
	private BillPayES billPayES;

	@Override
	public VerifyBillEwalletResponse verifyBillByEwallet(
			VerifyBillEwalletRequest reqVerifyBillEwalletModel) {
		// TODO Auto-generated method stub
		return billPayES.verifyBillByEwallet(reqVerifyBillEwalletModel);
	}

	@Override
	public ConfirmBillEwalletResponse confirmBillByEwallet(
			ConfirmBillEwalletRequest reqConfirmBillEwalletModel) {
		// TODO Auto-generated method stub
		return billPayES.confirmBillByEwallet(reqConfirmBillEwalletModel);
	}

}
