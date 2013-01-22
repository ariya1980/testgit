package com.tmn.service.ewallet.task.endpoint;

import com.tmn.service.ewallet.domain.RefillEwalletWithCashCardRequest;
import com.tmn.service.ewallet.domain.RefillEwalletWithCashCardResponse;
import com.tmn.service.ewallet.task.EwalletTS;

public class EwalletTSEndPoint {

	private EwalletTS ewalletTS;
	
	public RefillEwalletWithCashCardResponse refillEwalletWithCashCard(RefillEwalletWithCashCardRequest refillEwalletWithCashCardRequest) {
		
		return this.ewalletTS.refillEwalletWithCashCard(refillEwalletWithCashCardRequest);
		
	}
	
}
