package com.ibm.test.dao;

public interface DaoInterface {

	void storeUserDetails(String fname,String lname,long mobno,String ib,String passwrd);
	boolean validatePassword(int uid,String paswrd);
}
