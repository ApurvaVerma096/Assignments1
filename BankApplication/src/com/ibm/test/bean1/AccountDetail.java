package com.ibm.test.bean1;

public class AccountDetail {
	private String uid;
	private String acctyp;
	private int ifsc;
	private int accno;
	private int initialbal;
	
	public String getUId() {
		return uid;
	}
	public String setUId(String uid) {
		return this.uid = uid;
	}
	
	public String getAccType() {
		return acctyp;
	}
	public String setAccType(String acctyp) {
		return this.acctyp = acctyp;
	}
	
	public int getIFSC() {
		return ifsc ;
	}
	public int setIFSC(int ifsc) {
		return this.ifsc = ifsc;
	}
	
	public int getAccNo() {
		return accno;
	}
	public int setAccNo(int accno) {
		return this.accno = accno;
	}
	
	public int getInitialBal() {
		return initialbal;
	}
	public int setInitialBal(int initialbal) {
		return this.initialbal = initialbal;
	}
}
