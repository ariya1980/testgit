package com.tmn.service.nextproxy.utility.domain;

public class RegisterEwalletMobileRequest {

	private String tmnId;			// maximum 100 char
	private String email;			// maximum 100 char
	private String mobile;			// number(10)
	private String pin;
	private String thaiId;			// 13 Digit
	private String fullName;		// maximum 100 char
	
	public String getTmnId() {
		return tmnId;
	}
	public void setTmnId(String tmnId) {
		this.tmnId = tmnId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
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
