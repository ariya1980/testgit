package com.tmn.service.user.task.endpoint;

import com.tmn.service.exception.TmnServiceException;
import com.tmn.service.user.domain.CreateUserProfileRequest;
import com.tmn.service.user.domain.CreateUserProfileResponse;
import com.tmn.service.user.domain.IsUserProfileExistRequest;
import com.tmn.service.user.domain.IsUserProfileExistResponse;
import com.tmn.service.user.task.TmnUserProfileTS;

public class TmnUserProfileTSEndPoint {
	
	private TmnUserProfileTS tmnUserProfileTS;
	
	public IsUserProfileExistResponse isUserProfileExist(IsUserProfileExistRequest isUserProfileExistRequest) {
		
		IsUserProfileExistResponse isUserProfileExistResponse = new IsUserProfileExistResponse();
		try{
			isUserProfileExistResponse =  this.tmnUserProfileTS.isUserProfileExist(isUserProfileExistRequest);
		}catch(TmnServiceException tse){
			tse.printStackTrace();
			//set http code = 500 to REST
			//send message by using tse.getMessage(); to REST
		}catch(Exception e){
			e.printStackTrace();
			//set http code = 500 to REST
			//send message by using tse.getMessage(); to REST
		}
		return isUserProfileExistResponse;
		
	}
	
	public CreateUserProfileResponse createUserProfile(CreateUserProfileRequest createUserProfileRequest) {
		
		
		CreateUserProfileResponse createUserProfileResponse = new CreateUserProfileResponse();
		try{
			createUserProfileResponse =  this.tmnUserProfileTS.createUserProfile(createUserProfileRequest);
		}catch(TmnServiceException tse){
			tse.printStackTrace();
			//set http code = 500 to REST
			//send message by using tse.getMessage(); to REST
		}catch(Exception e){
			e.printStackTrace();
			//set http code = 500 to REST
			//send message by using tse.getMessage(); to REST
		}
		return createUserProfileResponse;

		
	} 
	
}