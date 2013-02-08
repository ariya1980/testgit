package com.tmn.service.task.topupairtime;

import com.tmn.service.exception.TmnServiceException;
import com.tmn.service.task.topupairtime.domain.TopupEwalletResponse;

public interface RetryTopupAirtimeTS {
	
	public TopupEwalletResponse retryTopup (String retryTxn)  throws TmnServiceException;

}
