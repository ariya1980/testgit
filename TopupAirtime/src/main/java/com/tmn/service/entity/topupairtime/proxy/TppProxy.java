package com.tmn.service.entity.topupairtime.proxy;

public interface TppProxy {
	
	// xml request and response to TPP 
	public String verifyTopup(String xml);
	
	// xml request and response to TPP 
	public String topup(String xml);

}
