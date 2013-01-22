package com.tmn.service.user.domain;

public class CreateUserProfileRequest {

	private String email;			// maximum 100 char
	private String emailStatus;		// 0 not verify, 1 verified
	private String password;		
	private String mobile;			// number(10)
	private String mobileStatus;	// 0 not verify, 1 verified
	private String thaiId;			// 13 Digit
	private String fullName;		// maximum 100 char
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmailStatus() {
		return emailStatus;
	}
	public void setEmailStatus(String emailStatus) {
		this.emailStatus = emailStatus;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMobileStatus() {
		return mobileStatus;
	}
	public void setMobileStatus(String mobileStatus) {
		this.mobileStatus = mobileStatus;
	}
	public String getThaiId() {
		return thaiId;
	}
	public void setThaiId(String thaiId) {
		this.thaiId = thaiId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

}
