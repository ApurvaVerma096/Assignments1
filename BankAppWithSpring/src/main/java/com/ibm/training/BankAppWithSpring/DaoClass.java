package com.ibm.training.BankAppWithSpring;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DaoClass {

	List<Customer> customers;

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public List<Customer> viewCustomer() {
		return getCustomers();
	}

	public int viewAccBal(int account_no) {

		List<Customer> custm = getCustomers();
		for (Customer c : custm) {
			if (c.getAccount_no() == account_no) {
				return c.getBalance();
			}
		}
		return 0;
	}

	public boolean withdrawBal(int withdraw_acc, int withdraw_amt) {
		List<Customer> custm = getCustomers();
		for (Customer c : custm) {
			if (c.getAccount_no() == withdraw_acc) {
				if (c.getBalance() >= withdraw_amt) {
					c.setBalance(c.getBalance() - withdraw_amt);
					return true;
				} else {
					return false;
				}
			}
		}
		return false;
	}

	public boolean transferBal(int from_acc, int to_acc, int transfer_bal) {
		List<Customer> custm = getCustomers();
			Customer from = null, to = null;
			for(Customer c : custm) {
				if(c.getAccount_no() == from_acc) {
					from = c;
				}
				if(c.getAccount_no() == to_acc) {
					to = c;
				}
				
			}
			from.setBalance(from.getBalance() - transfer_bal );
			to.setBalance(to.getBalance() + transfer_bal);
			return true;
			
		}

public void insertCust(int cr_acc, String cr_cust_name, int cr_acc_bal) {
		Customer c = new Customer();
		c.setAccount_no(cr_acc);
		c.setBalance(cr_acc_bal);
		c.setCustomer_name(cr_cust_name);
		
		customers.add(c);
}
}
