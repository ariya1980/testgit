package com.tmn.service.ewallet.domain;

public class RefillEwalletWithCashCardResponse {

	private String transId;
	private String resultCode;				// 0 success, other failed
	private String resultNamespace;
	private String cardAmount;				// card value -> 50, 90, 150, 300, 500, 1000
	private String refillFee;				// refill fee (default 7% of cardAmount)
	private String remainingBalance;		// remaining balance after refill
	
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
	public String getCardAmount() {
		return cardAmount;
	}
	public void setCardAmount(String cardAmount) {
		this.cardAmount = cardAmount;
	}
	public String getRefillFee() {
		return refillFee;
	}
	public void setRefillFee(String refillFee) {
		this.refillFee = refillFee;
	}
	public String getRemainingBalance() {
		return remainingBalance;
	}
	public void setRemainingBalance(String remainingBalance) {
		this.remainingBalance = remainingBalance;
	}
	
}
