package com.ibm.test.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ibm.test.bean1.UserDetail;

import jdbc.jdbcConn;

public class DaoClass implements DaoInterface{
	
	java.util.Date date=new java.util.Date();
	
	java.sql.Date sqlDate=new java.sql.Date(date.getTime());
	java.sql.Timestamp sqlTime=new java.sql.Timestamp(date.getTime());
	
	Connection dbConn;
	public DaoClass() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			dbConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdetails", "root", "");
			System.out.println("1");
			if(dbConn == null) {
				System.out.println("Some issue ");
				
			}else {
				System.out.println("Database connected");
			}
		}catch(SQLException | ClassNotFoundException e) {
			System.out.println("Some issue occured "+ e);
		}
	}
//	jdbcConn con = new jdbcConn();	
//	
//	Connection conf = con.connectdb();
	
	UserDetail ud = new UserDetail();

	private PreparedStatement theStatement;
	
//	static int uid = 1200001;
   static long accountno = 12300010;

	public void storeUserDetails(String fname, String lname, long mobno, String ib, String passwrd) {
		String fname1 = ud.setFname(fname);
		String lname1 = ud.setLname(lname);
		long mobno1= ud.setMobNo(mobno);
		String ib1 = ud.setPanCrd(ib);
		String passwrd1 = ud.setPswrd(passwrd);
		
		this.insertValues(fname1,lname1,mobno1,ib1,passwrd1);
		
		
	}

	private void insertValues(String f,String l,long m,String ib,String ps) {
		int UID =0;
		String insertQry = "insert into userdetail (FirstName,LastName,MobileNumber,Balance,Password,AccountNumber) values (?,?,?,?,?,?)";
		try {
			theStatement = this.dbConn.prepareStatement(insertQry);
			
			theStatement.setString(1, f);
			theStatement.setString(2, l);
			//theStatement.setInt(3, uid);
			theStatement.setLong(3,m);
			theStatement.setString(4, ib);
			theStatement.setString(5, ps);
			theStatement.setLong(6,accountno);
			
			this.theStatement.executeUpdate();
			
			
			String fetchAcc = "select UserId from userdetail where AccountNumber = ?";               
			theStatement = this.dbConn.prepareStatement(fetchAcc);
			theStatement.setLong(1, accountno);
			ResultSet rs = theStatement.executeQuery();
			if(rs.next())
			{
				UID = rs.getInt("UserId");
			}
			
			
//			uid++;
			accountno++;
			
			
			
			//if(((PreparedStatement) this.theStatement).executeUpdate() > 0) {
				System.out.println("User details inserted...");
				System.out.println("your UserId : "+ UID);
				System.out.println("your Account Number : " + accountno);
				
			//String accinsert = "insert into paymentdetail (UserId)"
				
			//}
				
//				String insertintopay = "insert into paymentdetails(UserId,Date,PaymentType,WithdrawalAmount,DepositAmount,Balance,AccountNumber)values(?,?,?,?,?,?,?)";
//				theStatement =this.dbConn.prepareStatement(insertintopay);
//				theStatement.
			
		}catch (SQLException e) {
			//System.out.println("Issues while updating : " + e);
			e.printStackTrace();
		}
		 
	}
	
	public boolean validatePassword(int uid,String paswrd) {
		String pas = "";
		String validatePaswrdQry = "Select UserId,Password from userdetail where UserId = ? ";
		try {
			theStatement = this.dbConn.prepareStatement(validatePaswrdQry);
			
			theStatement.setInt(1, uid);
			ResultSet rs = theStatement.executeQuery();
			if(rs.next())
			{
				pas = rs.getString("Password");
			}
			if(pas.equals(paswrd))
				return true;
			else {
				System.out.println("Wrong password. Try entering correct password");
					return false;
				
			}
			
			
		}catch(SQLException e) {
			System.out.println("Not Validate" + e);
		}
		
		return false;
		
	}

	public String viewCurrentAcount(int uid) {
		String balance ="";
		String viewCurAmt = "Select Balance from userdetail where UserId = ?";
		try {
			theStatement = this.dbConn.prepareStatement(viewCurAmt);
			theStatement.setInt(1, uid);
			ResultSet rs = theStatement.executeQuery();
			if(rs.next()) {
				balance = rs.getString("Balance");
			}
			
		}catch(SQLException e) {
			System.out.println("Some ISsue"+e);
		}
		return balance;
	}

	public int WithdrawAmt(int uid,int amt) {
		int bal=0;
		int newBal = 0,acc=0;
		String fetchbal = "select Balance,AccountNumber from userdetail where UserId = ?";
		try {
			theStatement = this.dbConn.prepareStatement(fetchbal);
			theStatement.setInt(1,uid);
			ResultSet rs = theStatement.executeQuery();
			if(rs.next()) {
				bal = rs.getInt("Balance");
				acc= rs.getInt("AccoutNumber");
			}
			if(bal>amt) {
			newBal = bal - amt;
			String newBalQry = "update userdetail SET Balance = ? where UserId= ?";
			theStatement = this.dbConn.prepareStatement(newBalQry);
			theStatement.setInt(1,newBal);
			theStatement.setInt(2,uid);
			
			String insertInPay = "insert into paymentdetails(UserId,Date,PaymentType,WithdrawalAmount,DepositAmount,Balance,AccountNumber)values(?,?,?,?,?,?,?)";
			theStatement = this.dbConn.prepareStatement(insertInPay);
			theStatement.setInt(1,uid);
			theStatement.setDate(2,sqlDate);
			theStatement.setString(3,"Withdrwal");
			theStatement.setInt(4,amt);
			theStatement.setInt(5,0);
			theStatement.setInt(6,newBal);
			theStatement.setInt(7,acc);
			
			
			}
			
		}catch(SQLException e) {
			System.out.println("Some Issue Occured "+e);
		}
		return newBal;
	}

	public int depositAmt(int uid, int amt) {
		int bal = 0,newBal = 0,acc=0;
		String fetchbal = "select Balance,AccountNumber from userdetail where UserId = ?";
		try {
			theStatement = this.dbConn.prepareStatement(fetchbal);
			theStatement.setInt(1, uid);
			ResultSet rs = theStatement.executeQuery();
			if(rs.next()) {
				bal =rs.getInt("Balance");
				acc= rs.getInt("AccoutNumber");
			}
			newBal= bal+amt;
			String newBalQry = "update userdetail set Balance = ? where UserId = ?";
			theStatement = this.dbConn.prepareStatement(newBalQry);
			theStatement.setInt(1, newBal);
			theStatement.setInt(2, uid);
			
			String insertInPay = "insert into paymentdetails(UserId,Date,PaymentType,WithdrawalAmount,DepositAmount,Balance,AccountNumber)values(?,?,?,?,?,?,?)";
			theStatement = this.dbConn.prepareStatement(insertInPay);
			theStatement.setInt(1,uid);
			theStatement.setDate(2,sqlDate);
			theStatement.setString(3,"Deposit");
			theStatement.setInt(4,0);
			theStatement.setInt(5,amt);
			theStatement.setInt(6,newBal);
			theStatement.setInt(7,acc);
		}catch(SQLException e) {
			System.out.println("Some Issue Occured" + e);
		}
		return newBal;
	}

	public String tranferAmt(int uid, int acc, int amt) {
		
		int bal = 0,newBal = 0,bal1= 0,newBal1=0;
		String st="";
		String newfetchQry = "select Balance,AccountNumber from userdetail where UserId = ?";
		try {
			theStatement = this.dbConn.prepareStatement(newfetchQry);
			theStatement.setInt(1, uid);
			ResultSet rs = theStatement.executeQuery();
			if(rs.next()) {
				bal = rs.getInt("Balance");
				acc = rs.getInt("AccountNumber");
			}
			newBal = bal - amt;
			String updateBal  = "update userdetail set Balance = ? where UserId= ?";
			theStatement = this.dbConn.prepareStatement(updateBal);
			theStatement.setInt(1, newBal);
			theStatement.setInt(2, uid);
			
			String fetchBalQry = "Select Balance from paymentdetail where AccountNumber = ?";
			theStatement.setInt(1,acc);
			ResultSet rs1 = theStatement.executeQuery();
			if(rs1.next()) {
				bal1 = rs.getInt("Balance");
			}
			newBal1 = bal1+amt;
			String UpdateNewAccQry = "update paymentdetail set Balance = ? where AccountNumber =? ";
			theStatement = this.dbConn.prepareStatement(UpdateNewAccQry);
			theStatement.setInt(1, newBal1);
			theStatement.setInt(2, acc);
			 st = "Tranfer is done";
		}catch(SQLException e) {
			System.out.println("Some Issue Occured" +e);
		}
		
		return st;
	}
	}
	
	
	
	


