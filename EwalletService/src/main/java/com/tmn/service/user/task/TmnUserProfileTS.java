package com.tmn.service.user.task;

import com.tmn.service.exception.TmnServiceException;
import com.tmn.service.user.domain.CreateUserProfileRequest;
import com.tmn.service.user.domain.CreateUserProfileResponse;
import com.tmn.service.user.domain.IsUserProfileExistRequest;
import com.tmn.service.user.domain.IsUserProfileExistResponse;

public interface TmnUserProfileTS {

	public IsUserProfileExistResponse isUserProfileExist(IsUserProfileExistRequest isUserProfileExistRequest) throws TmnServiceException;
	
	public CreateUserProfileResponse createUserProfile(CreateUserProfileRequest createUserProfileRequest) throws TmnServiceException;
	
}