package com.tmn.service.nextproxy.utility.domain;

public class RefillEwalletWithCashCardResponse extends NextServiceResponse {

	private String cardAmount;				// card value -> 50, 90, 150, 300, 500, 1000
	private String refillFee;				// refill fee (default 7% of cardAmount)
	private String remainingBalance;		// remaining balance after refill
	
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
