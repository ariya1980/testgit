package com.tmn.service.user.domain;

public class IsUserProfileExistRequest {
	
	private String userReference;		// email or mobile

	public String getUserReference() {
		return userReference;
	}

	public void setUserReference(String userReference) {
		this.userReference = userReference;
	}

}
