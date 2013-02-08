package com.ppgw.service.utility.proxy;

public interface PpgwProxy {
	
	// xml request and response to PPGW
	public String credit(String xml);
	
	public String getBalance(String xml);

}
