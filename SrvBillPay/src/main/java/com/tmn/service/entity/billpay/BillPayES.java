package com.tmn.service.entity.billpay;

import com.tmn.service.task.billpay.domain.ConfirmBillEwalletRequest;
import com.tmn.service.task.billpay.domain.ConfirmBillEwalletResponse;
import com.tmn.service.task.billpay.domain.VerifyBillEwalletRequest;
import com.tmn.service.task.billpay.domain.VerifyBillEwalletResponse;

public interface BillPayES {

	public VerifyBillEwalletResponse verifyBillByEwallet(VerifyBillEwalletRequest reqVerifyBillEwalletModel);
	public ConfirmBillEwalletResponse confirmBillByEwallet(ConfirmBillEwalletRequest reqConfirmBillEwalletModel);

}
