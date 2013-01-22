package com.tmn.service.ewallet.task.impl;

import com.tmn.service.ewallet.domain.RefillEwalletWithCashCardRequest;
import com.tmn.service.ewallet.domain.RefillEwalletWithCashCardResponse;
import com.tmn.service.ewallet.entity.EwalletES;
import com.tmn.service.ewallet.task.EwalletTS;

public class EwalletTSImpl implements EwalletTS {

	private EwalletES ewalletES;
	
	public RefillEwalletWithCashCardResponse refillEwalletWithCashCard(
			RefillEwalletWithCashCardRequest refillEwalletWithCashCardRequest) {
		
		return this.ewalletES.refillEwalletWithCashCard(refillEwalletWithCashCardRequest);
		
	}

}
