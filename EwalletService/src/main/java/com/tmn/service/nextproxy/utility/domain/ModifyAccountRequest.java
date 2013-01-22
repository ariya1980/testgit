package com.tmn.service.nextproxy.utility.domain;

public class ModifyAccountRequest {

	private String tmnId;			// maximum 100 char
	private String capSet;			// 
	private String upperLimit;		//
	private String lowerLimit;		//
	
	public String getTmnId() {
		return tmnId;
	}
	public void setTmnId(String tmnId) {
		this.tmnId = tmnId;
	}
	public String getCapSet() {
		return capSet;
	}
	public void setCapSet(String capSet) {
		this.capSet = capSet;
	}
	public String getUpperLimit() {
		return upperLimit;
	}
	public void setUpperLimit(String upperLimit) {
		this.upperLimit = upperLimit;
	}
	public String getLowerLimit() {
		return lowerLimit;
	}
	public void setLowerLimit(String lowerLimit) {
		this.lowerLimit = lowerLimit;
	}
	
}
