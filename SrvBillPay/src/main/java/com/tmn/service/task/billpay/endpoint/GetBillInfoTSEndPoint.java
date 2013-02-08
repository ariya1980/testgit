package com.tmn.service.task.billpay.endpoint;

import com.tmn.service.task.billpay.BillInfoTS;
import com.tmn.service.task.billpay.domain.BillInfoEwalletRequest;
import com.tmn.service.task.billpay.domain.BillInfoEwalletResponse;

public class GetBillInfoTSEndPoint {
	
	private BillInfoTS billInfoTS;
	
	//Service Inventory first to receive from Product API to service get bill information

	public BillInfoEwalletResponse getBillInfo(BillInfoEwalletRequest reqBillPayEwalletModel){
		return billInfoTS.getBillInfo(reqBillPayEwalletModel);
	}

}
