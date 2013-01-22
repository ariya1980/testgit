package com.tmn.service.user.domain;

public class IsUserProfileExistResponse {
	
	private String transId;
	private String resultCode;		// 0 not register, 18 already register, other error/failed
	private String resultNamespace;
	
	public String getTransId() {
		return transId;
	}
	public void setTransId(String transId) {
		this.transId = transId;
	}
	public String getResultCode() {
		return resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultNamespace() {
		return resultNamespace;
	}
	public void setResultNamespace(String resultNamespace) {
		this.resultNamespace = resultNamespace;
	}

}
