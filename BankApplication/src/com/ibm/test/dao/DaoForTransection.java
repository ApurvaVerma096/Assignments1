package com.ibm.test.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

public class DaoForTransection {
	static Connection dbCon;
	static PreparedStatement statement;
	public void DaoForTransaction() 
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			dbCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/walletdb", "root", "");
		}
		catch (ClassNotFoundException | SQLException e) 
		{
			System.out.println("Issues while connecting to databse : "+e);
		}
		
	}
	
	public void transectionDetails(int uid,Date date,String pt,int withdrawAmt,int depositAmt,int bal,int accno ) {
		String storeDetail = "insert into paymentdetail(UserId,Date,PaymentType,WithdrwalAmount,DepositAmount,Balance,AccountNumber)";
	}
	
}
