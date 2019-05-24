package com.ibm.test.service;

public interface ServiceInterface {
	
	void storeIntoAccountDetail();
	void stroreIntoUserDetails(String fname,String lname,long mobno,String ib,String passwrd);
	boolean validatePassword(int uid, String paswrd);
	
}
