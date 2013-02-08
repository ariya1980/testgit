package com.tmn.service.task.billpay;

import com.tmn.service.task.billpay.domain.BillInfoEwalletRequest;
import com.tmn.service.task.billpay.domain.BillInfoEwalletResponse;

public interface BillInfoTS {
	
	public BillInfoEwalletResponse getBillInfo(BillInfoEwalletRequest reqBillPayEwalletModel);

}
