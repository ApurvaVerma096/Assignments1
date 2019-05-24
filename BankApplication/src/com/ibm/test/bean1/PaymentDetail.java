package com.ibm.test.bean1;

import java.util.Date;

public class PaymentDetail {

	private String uid;
	private Date date;
	private String paymenttype;
	private int withdrawamt;
	private int depositamt;
	private int bal;
	
	public String getUId() {
		return uid;
	}
	public String setUId(String uid) {
		return this.uid= uid;
	}
	
	public Date getDate() {
		return date;
	}
	public Date setDate(Date date) {
		return this.date= date;
	}
	
	public String getPaymentType() {
		return paymenttype;
	}
	public String setPaymentType(String paymenttype) {
		return this.paymenttype = paymenttype;
	}
	
	public int getWithdrawAmt() {
		return withdrawamt;
	}
	public int setWithdrawAmt(int withdrawamt) {
		return this.withdrawamt= withdrawamt;
	}
	
	public int getDepositAmt() {
		return depositamt;
	}
	public int setDepositAmt(int  depositamt) {
		return this.depositamt= depositamt;
	}
	
	public int getBal() {
		return bal;
	}
	public int setBal(int  bal ) {
		return this.bal = bal;
	}
	
}              
