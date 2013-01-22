package com.tmn.service.user.entity;

import com.tmn.service.user.domain.IsUserProfileExistRequest;
import com.tmn.service.user.domain.IsUserProfileExistResponse;
import com.tmn.service.user.entity.domain.CreateTmnProfileRequest;
import com.tmn.service.user.entity.domain.LinkToTmnIdRequest;
import com.tmn.service.user.entity.domain.ModifyAccountRequest;
import com.tmn.service.user.entity.domain.RegisterEwalletEmailRequest;
import com.tmn.service.user.entity.domain.RegisterEwalletMobileRequest;
import com.tmn.service.user.entity.domain.RegisterEwalletTmnIdRequest;
import com.tmn.service.user.entity.domain.Result;

public interface TmnUserProfileES {
	
	public IsUserProfileExistResponse isUserProfileExist(IsUserProfileExistRequest isUserProfileExistRequest);
	
	public boolean isValidEmailPattern(String email);
	
	public boolean isValidMobilePattern(String mobile);
	
	public boolean isValidPasswordPattern(String password);
	
	public boolean isValidThaiIdPattern(String thaiId);
	
	public boolean isValidFullnamePattern(String fullName);
	
	public String createTmnId();
	
	public Result registerEwalletTmnId(RegisterEwalletTmnIdRequest registerEwalletTmnIdRequest);
	
	public Result registerEwalletEmail(RegisterEwalletEmailRequest registerEwalletEmailRequest);
	
	public Result registerEwalletMobile(RegisterEwalletMobileRequest registerEwalletMobileRequest);
	
	public Result linkToTmnId(LinkToTmnIdRequest linkToTmnIdRequest);
	
	public Result modifyAccount(ModifyAccountRequest modifyAccountRequest);
	
	public Result deactivateEwallet(String ewalletAccount);
	
	public Result createTmnProfile(CreateTmnProfileRequest createTmnProfileRequest);
	
}
