package com.tmn.service.task.billpay;

import com.tmn.service.task.billpay.domain.ConfirmBillEwalletRequest;
import com.tmn.service.task.billpay.domain.ConfirmBillEwalletResponse;
import com.tmn.service.task.billpay.domain.VerifyBillEwalletRequest;
import com.tmn.service.task.billpay.domain.VerifyBillEwalletResponse;

public interface BillPayTS {
	
	public VerifyBillEwalletResponse verifyBillByEwallet(VerifyBillEwalletRequest reqVerifyBillEwalletModel);
	public ConfirmBillEwalletResponse confirmBillByEwallet(ConfirmBillEwalletRequest reqConfirmBillEwalletModel);

}
