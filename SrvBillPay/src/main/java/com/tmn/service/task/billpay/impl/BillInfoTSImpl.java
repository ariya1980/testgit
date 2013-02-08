package com.tmn.service.task.billpay.impl;

import com.tmn.service.entity.billpay.BillInfoES;
import com.tmn.service.task.billpay.BillInfoTS;
import com.tmn.service.task.billpay.domain.BillInfoEwalletRequest;
import com.tmn.service.task.billpay.domain.BillInfoEwalletResponse;

public class BillInfoTSImpl implements BillInfoTS {
	
	private BillInfoES billInfoES;

	@Override
	public BillInfoEwalletResponse getBillInfo(
			BillInfoEwalletRequest reqBillPayEwalletModel) {
		// TODO Auto-generated method stub
		return billInfoES.getBillInfo(reqBillPayEwalletModel);
	}

}
