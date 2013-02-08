package com.ccp.service.utility.proxy;

public interface CcpProxy {
	
	// xml request and response to CCP
	public String recharging(String xml);
	
	public String reverse(String xml);
	
	public String queryUserProfile(String xml);
	
	
	

}
