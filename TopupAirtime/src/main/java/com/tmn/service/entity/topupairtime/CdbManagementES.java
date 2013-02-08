package com.tmn.service.entity.topupairtime;

import com.tmn.service.task.topupairtime.domain.VerifyEwalletRequest;
import com.tmn.service.task.topupairtime.domain.VerifyEwalletResponse;

public interface CdbManagementES {
	
	public VerifyEwalletResponse verify(VerifyEwalletRequest xml);
	

}
