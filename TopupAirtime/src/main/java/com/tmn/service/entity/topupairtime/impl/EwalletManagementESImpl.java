package com.tmn.service.entity.topupairtime.impl;

import com.ewallet.service.utility.proxy.EwalletProxy;
import com.tmn.service.entity.topupairtime.EwalletManagementES;
import com.tmn.service.task.topupairtime.domain.TopupEwalletRequest;
import com.tmn.service.task.topupairtime.domain.TopupEwalletResponse;
import com.tmn.service.task.topupairtime.domain.VerifyEwalletRequest;
import com.tmn.service.task.topupairtime.domain.VerifyEwalletResponse;

public class EwalletManagementESImpl implements EwalletManagementES {
	
	private EwalletProxy ewalletProxy;

	public VerifyEwalletResponse checkBalance(VerifyEwalletRequest verifyEwalletRequest) {
		//parser model to xml
			String xml = "";
		//call EwalletProxy to getBalance
			ewalletProxy.getBalance(xml);
		//check balance >= amt + fee

		return null;
	}

	public TopupEwalletResponse debitBuy(TopupEwalletRequest topupEwalletRequest) {
		//parser model to xml
			String xml = "";
		//call EwalletProxy to getBalance
			ewalletProxy.debitBuy(xml);
		return null;
	}

}
