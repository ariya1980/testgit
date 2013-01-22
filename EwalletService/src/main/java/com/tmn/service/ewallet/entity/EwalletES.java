package com.tmn.service.ewallet.entity;

import com.tmn.service.ewallet.domain.RefillEwalletWithCashCardRequest;
import com.tmn.service.ewallet.domain.RefillEwalletWithCashCardResponse;

public interface EwalletES {

	public RefillEwalletWithCashCardResponse refillEwalletWithCashCard(RefillEwalletWithCashCardRequest refillEwalletWithCashCardRequest);
	
}
