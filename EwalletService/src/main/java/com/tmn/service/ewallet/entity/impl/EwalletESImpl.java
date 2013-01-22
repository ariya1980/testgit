package com.tmn.service.ewallet.entity.impl;

import com.tmn.service.ewallet.domain.RefillEwalletWithCashCardRequest;
import com.tmn.service.ewallet.domain.RefillEwalletWithCashCardResponse;
import com.tmn.service.ewallet.entity.EwalletES;
import com.tmn.service.nextproxy.utility.NextServiceProxyUS;

public class EwalletESImpl implements EwalletES {

	private NextServiceProxyUS nextServiceProxyUS;
	
	public RefillEwalletWithCashCardResponse refillEwalletWithCashCard(
			RefillEwalletWithCashCardRequest refillEwalletWithCashCardRequest) {
		
		// Call NextServiceProxyUS.refillEwalletWithCashCard()
		return null;
		
	}

}
