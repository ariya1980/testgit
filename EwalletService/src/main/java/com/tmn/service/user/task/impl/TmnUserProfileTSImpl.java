package com.tmn.service.user.task.impl;

import com.tmn.service.exception.TmnServiceException;
import com.tmn.service.user.domain.CreateUserProfileRequest;
import com.tmn.service.user.domain.CreateUserProfileResponse;
import com.tmn.service.user.domain.IsUserProfileExistRequest;
import com.tmn.service.user.domain.IsUserProfileExistResponse;
import com.tmn.service.user.entity.TmnUserProfileES;
import com.tmn.service.user.task.TmnUserProfileTS;

public class TmnUserProfileTSImpl implements TmnUserProfileTS {

	private TmnUserProfileES tmnUserProfileES;
	
	
	public IsUserProfileExistResponse isUserProfileExist (
			IsUserProfileExistRequest isUserProfileExistRequest) throws TmnServiceException{

		return this.tmnUserProfileES.isUserProfileExist(isUserProfileExistRequest);
		
	}

	public CreateUserProfileResponse createUserProfile(
			CreateUserProfileRequest createUserProfileRequest)  throws TmnServiceException{
		
		// Verification Step
		
		// Call TmnUserProfileES.isValidEmailPattern
		// Call TmnUserProfileES.isValidMobilePattern
		// Call TmnUserProfileES.isValidPasswordPattern
		// Call TmnUserProfileES.isValidThaiIdPattern
		// Call TmnUserProfileES.isValidFullnamePattern
		
		// Validation Step
		
		// Call TmnUserProfileES.isUserProfileExist (Email)
		// Call TmnUserProfileES.isUserProfileExist (Mobile)
		
		// Process Step
		
		// Call TmnUserProfileES.createTmnId
		// Call TmnUserProfileES.registerEwalletTmnId
		// Call TmnUserProfileES.registerEwalletEmail
		// Call TmnUserProfileES.registerEwalletMobile
		// Call TmnUserProfileES.linkToTmnId (Email)
		// Call TmnUserProfileES.linkToTmnId (Mobile)
		// Call TmnUserProfileES.modifyAccount
		// Call TmnUserProfileES.deactivateEwallet (Mobile)
		// Call TmnUserProfileES.createTmnProfile
		
		return null;
	}

}
