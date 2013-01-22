package com.tmn.service.ewallet.task;

import com.tmn.service.ewallet.domain.GetEwalletBalanceRequest;
import com.tmn.service.ewallet.domain.GetEwalletBalanceResponse;
import com.tmn.service.ewallet.domain.RefillEwalletWithCashCardRequest;
import com.tmn.service.ewallet.domain.RefillEwalletWithCashCardResponse;

public interface EwalletTS {

	public RefillEwalletWithCashCardResponse refillEwalletWithCashCard(RefillEwalletWithCashCardRequest refillEwalletWithCashCardRequest);
	
	public GetEwalletBalanceResponse getEwalletBalance(GetEwalletBalanceRequest getEwalletBalanceRequest);
	
}
