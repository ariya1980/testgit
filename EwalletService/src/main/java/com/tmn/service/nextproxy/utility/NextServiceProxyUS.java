package com.tmn.service.nextproxy.utility;

import com.tmn.service.nextproxy.utility.domain.CreateTmnIdResponse;
import com.tmn.service.nextproxy.utility.domain.CreateTmnProfileRequest;
import com.tmn.service.nextproxy.utility.domain.DeactivateEwalletRequest;
import com.tmn.service.nextproxy.utility.domain.GetEwalletBalanceRequest;
import com.tmn.service.nextproxy.utility.domain.GetEwalletBalanceResponse;
import com.tmn.service.nextproxy.utility.domain.IsEwalletExistRequest;
import com.tmn.service.nextproxy.utility.domain.LinkToTmnIdRequest;
import com.tmn.service.nextproxy.utility.domain.ModifyAccountRequest;
import com.tmn.service.nextproxy.utility.domain.NextServiceResponse;
import com.tmn.service.nextproxy.utility.domain.RefillEwalletWithCashCardRequest;
import com.tmn.service.nextproxy.utility.domain.RefillEwalletWithCashCardResponse;
import com.tmn.service.nextproxy.utility.domain.RegisterEwalletEmailRequest;
import com.tmn.service.nextproxy.utility.domain.RegisterEwalletMobileRequest;
import com.tmn.service.nextproxy.utility.domain.RegisterEwalletTmnIdRequest;

public interface NextServiceProxyUS {
	
	public NextServiceResponse isEwalletExist(IsEwalletExistRequest isEwalletExistRequest);
	
	public CreateTmnIdResponse createTmnId();
	
	public NextServiceResponse registerEwalletTmnId(RegisterEwalletTmnIdRequest registerEwalletTmnIdRequest);
	
	public NextServiceResponse registerEwalletEmail(RegisterEwalletEmailRequest registerEwalletEmailRequest);
	
	public NextServiceResponse registerEwalletMobile(RegisterEwalletMobileRequest registerEwalletMobileRequest);
	
	public NextServiceResponse linkToTmnId(LinkToTmnIdRequest linkToTmnIdRequest);
	
	public NextServiceResponse modifyAccount(ModifyAccountRequest modifyAccountRequest);
	
	public NextServiceResponse deactivateEwallet(DeactivateEwalletRequest deactivateEwalletRequest);
	
	public NextServiceResponse createTmnProfile(CreateTmnProfileRequest createTmnProfileRequest);
	
	public RefillEwalletWithCashCardResponse refillEwalletWithCashCard(RefillEwalletWithCashCardRequest refillEwalletWithCashCardRequest);
	
	public GetEwalletBalanceResponse getEwalletBalance(GetEwalletBalanceRequest getEwalletBalanceRequest);
	
}