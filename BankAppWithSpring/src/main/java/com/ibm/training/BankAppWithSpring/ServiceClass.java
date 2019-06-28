package com.ibm.training.BankAppWithSpring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;



public class ServiceClass{
	
	@Autowired
	DaoClass dao;

	public DaoClass getDao() {
		return dao;
	}

	public void setDao(DaoClass dao) {
		this.dao = dao;
	}
	
	
	public List<Customer> viewCustomers(){
		return dao.viewCustomer();
	}
	public int viewAccBal(int account_no) {
		return dao.viewAccBal(account_no);
	}
	public boolean withdrawBal(int withdraw_acc,int withdraw_amt) {
		return dao.withdrawBal(withdraw_acc,withdraw_amt);
	}
	public boolean transferBal(int from_acc,int to_acc,int transfer_bal) {
		return dao.transferBal(from_acc,to_acc,transfer_bal);
	}
	public void insertCust(int cr_acc,String cr_cust_name,int cr_acc_bal) {
		 dao.insertCust(cr_acc,cr_cust_name,cr_acc_bal);
	}
}
