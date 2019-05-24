package com.ibm.test.service;

import com.ibm.test.dao.DaoClass;

public class ServiceClass implements ServiceInterface {
	
	DaoClass dc = new DaoClass();
	
	public void storeIntoAccountDetail() {
		
	}
	
	public void stroreIntoUserDetails(String fname,String lname,long mobno,String ib,String passwrd) {
		dc.storeUserDetails(fname, lname, mobno, ib, passwrd);
		
	}

	@Override
	public boolean validatePassword(int uid, String paswrd) {
		return dc.validatePassword(uid,paswrd);
	}

	public String viewCurrentAcount(int uid) {
		
		return dc.viewCurrentAcount(uid);
	}

	public int withdrawAmt(int uid,int amt) {
		return dc.WithdrawAmt(uid,amt);
	}

	public int depositAmt(int uid, int amt) {
		return dc.depositAmt(uid,amt);
	}

	public String transferAmt(int uid, int acc, int amt) {
		return dc.tranferAmt(uid,acc,amt);
	}
	
	
	
}
