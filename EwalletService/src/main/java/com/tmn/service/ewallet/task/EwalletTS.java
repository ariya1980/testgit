package com.tmn.service.ewallet.task;

import com.tmn.service.ewallet.domain.RefillEwalletWithCashCardRequest;
import com.tmn.service.ewallet.domain.RefillEwalletWithCashCardResponse;

public interface EwalletTS {

	public RefillEwalletWithCashCardResponse refillEwalletWithCashCard(RefillEwalletWithCashCardRequest refillEwalletWithCashCardRequest);
	
}
