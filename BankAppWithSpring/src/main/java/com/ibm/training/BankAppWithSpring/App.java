package com.ibm.training.BankAppWithSpring;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
    	ServiceClass serv = context.getBean("srvce1",ServiceClass.class);
    	
    	Scanner s = new Scanner(System.in);
    	while(true) {
    	System.out.println("Enter your choice: 1.view Acc Bal 2.withdrawal bal 3.Transfer Bal 4.Create new Acc");
    	int n = s.nextInt();
    	
    	switch(n) {
    	case 1:System.out.println("Enter the acc number");
    			int account_no = s.nextInt();
    			System.out.println("your acc bal is :" + serv.viewAccBal(account_no));
    			break;
    	case 2 :System.out.println("Enter the acc number");
    			int withdraw_acc = s.nextInt();
    			System.out.println("enter the amount");
    			int withdraw_amt = s.nextInt();
    			System.out.println("Amount is withdrawal successfully"+serv.withdrawBal(withdraw_acc, withdraw_amt));
    			break;
    	case 3 :System.out.println("Enter the acc number from you want to send amount");
    			int from_acc = s.nextInt();
    			System.out.println("enter the acc number to which you want to send");
    			int  to_acc = s.nextInt();
    			System.out.println("enter the bal");
    			int  transfer_bal = s.nextInt();
    			System.out.println("Amount is transfer successfully" + serv.transferBal(from_acc, to_acc, transfer_bal));
    			break;
    	case 4 : System.out.println("enter the acc number");
    			int cr_acc = s.nextInt();
    			System.out.println("enter your name");
    			String cr_cust_name = s.next();
    			System.out.println("enter your current bal");
    			int cr_acc_bal  = s.nextInt();
    			serv.insertCust(cr_acc , cr_cust_name , cr_acc_bal);
    			System.out.println("account is created successfully" );
    	
    	}
    	}
    }
}
