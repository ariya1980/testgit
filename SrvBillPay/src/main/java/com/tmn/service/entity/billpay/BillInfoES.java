package com.tmn.service.entity.billpay;

import com.tmn.service.task.billpay.domain.BillInfoEwalletRequest;
import com.tmn.service.task.billpay.domain.BillInfoEwalletResponse;

public interface BillInfoES {

	public BillInfoEwalletResponse getBillInfo(BillInfoEwalletRequest reqBillPayEwalletModel);

}
