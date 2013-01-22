package com.tmn.service.user.entity.impl;

import com.tmn.service.nextproxy.utility.NextServiceProxyUS;
import com.tmn.service.user.domain.IsUserProfileExistRequest;
import com.tmn.service.user.domain.IsUserProfileExistResponse;
import com.tmn.service.user.entity.TmnUserProfileES;
import com.tmn.service.user.entity.domain.CreateTmnProfileRequest;
import com.tmn.service.user.entity.domain.LinkToTmnIdRequest;
import com.tmn.service.user.entity.domain.ModifyAccountRequest;
import com.tmn.service.user.entity.domain.RegisterEwalletEmailRequest;
import com.tmn.service.user.entity.domain.RegisterEwalletMobileRequest;
import com.tmn.service.user.entity.domain.RegisterEwalletTmnIdRequest;
import com.tmn.service.user.entity.domain.Result;

public class TmnUserProfileESImpl implements TmnUserProfileES {

	private NextServiceProxyUS nextServiceProxyUS;
	

	public IsUserProfileExistResponse isUserProfileExist(
			IsUserProfileExistRequest isUserProfileExistRequest) {
		// Call NextServiceProxyUS.isEwalletExist()
		return null;
	}


	public boolean isValidEmailPattern(String email) {
		// Verify Email Pattern
		return false;
	}


	public boolean isValidMobilePattern(String mobile) {
		// Verify Mobile Pattern
		return false;
	}


	public boolean isValidPasswordPattern(String password) {
		// Verify Password Pattern
		return false;
	}


	public boolean isValidThaiIdPattern(String thaiId) {
		// Verify Thai ID pattern
		return false;
	}


	public boolean isValidFullnamePattern(String fullName) {
		// Verify fullName Pattern
		return false;
	}


	public String createTmnId() {
		// Call NextServiceProxyUS.createTmnId()
		return null;
	}

	
	public Result registerEwalletTmnId(
			RegisterEwalletTmnIdRequest registerEwalletTmnIdRequest) {
		// Call NextServiceProxyUS.registerEwalletTmnId()
		return null;
	}

	
	public Result registerEwalletEmail(
			RegisterEwalletEmailRequest registerEwalletEmailRequest) {
		// Call NextServiceProxyUS.registerEwalletEmail()
		return null;
	}

	
	public Result registerEwalletMobile(
			RegisterEwalletMobileRequest registerEwalletMobileRequest) {
		// Call NextServiceProxyUS.registerEwalletMobile()
		return null;
	}

	
	public Result linkToTmnId(LinkToTmnIdRequest linkToTmnIdRequest) {
		// Call NextServiceProxyUS.linkToTmnId()
		return null;
	}

	
	public Result modifyAccount(ModifyAccountRequest modifyAccountRequest) {
		// Call NextServiceProxyUS.modifyAccount()
		return null;
	}

	
	public Result deactivateEwallet(String ewalletAccount) {
		// Call NextServiceProxyUS.deactivateEwallet()
		return null;
	}

	
	public Result createTmnProfile(
			CreateTmnProfileRequest createTmnProfileRequest) {
		// TODO Auto-generated method stub
		return null;
	}

}
