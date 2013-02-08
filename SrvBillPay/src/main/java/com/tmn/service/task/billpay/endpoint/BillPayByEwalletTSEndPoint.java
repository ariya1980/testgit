package com.tmn.service.task.billpay.endpoint;

import com.tmn.service.task.billpay.BillPayTS;
import com.tmn.service.task.billpay.domain.ConfirmBillEwalletRequest;
import com.tmn.service.task.billpay.domain.ConfirmBillEwalletResponse;
import com.tmn.service.task.billpay.domain.VerifyBillEwalletRequest;
import com.tmn.service.task.billpay.domain.VerifyBillEwalletResponse;

public class BillPayByEwalletTSEndPoint {

	private BillPayTS billPayTS;
	
	//Service Inventory first to receive from Product API to service bill pay by ewallet
	
	public VerifyBillEwalletResponse verifyBillByEwallet(VerifyBillEwalletRequest reqVerifyBillEwalletModel){
		return billPayTS.verifyBillByEwallet(reqVerifyBillEwalletModel);
	}
	
	public ConfirmBillEwalletResponse confirmBillByEwallet(ConfirmBillEwalletRequest reqConfirmBillEwalletModel){
		return billPayTS.confirmBillByEwallet(reqConfirmBillEwalletModel);
	}

}
