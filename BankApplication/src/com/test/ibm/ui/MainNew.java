package com.test.ibm.ui;

import java.util.Scanner;

import com.ibm.test.service.ServiceClass;

public class MainNew {
	
	private static ServiceClass sc = new ServiceClass();

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		do {
		System.out.println("Enter your choice : 1. Create A new Account 2. Log In");
		int n1 = s.nextInt();
		s.nextLine();
		switch(n1) {
		
		case 1: System.out.println("Enter Your first Name");
				String fname = s.nextLine();
				System.out.println("Enter your Last Name");
				String lname =  s.nextLine();
				System.out.println("Enter your Mobile Number");
				long mobno = s.nextLong(); 
				s.nextLine();
				System.out.println("Enter your Initial bal  Amount ");
				String ib = s.nextLine();
				System.out.println("Enter the Password");
				String passwrd = s.nextLine();
				
				sc.stroreIntoUserDetails(fname,lname,mobno,ib,passwrd);
				break;
				
		case 2: System.out.println("Please enter your UserId");
				int uid = s.nextInt();
				s.nextLine();
				System.out.println("Enter your Password");
				String paswrd = s.nextLine();
				if(sc.validatePassword(uid,paswrd)) {
					
					System.out.println("Enter your choice :1.View Amount 2.withdraw Amount 3.Deposit Amout 4.Transfer Amount 5.");
					int n2 = s.nextInt();
							switch(n2) {
							
							case 1 : System.out.println("your Current Account Balance is : "+ sc.viewCurrentAcount(uid));
									break;
							
							case 2 : System.out.println("Enter the Amount you want to withdraw");
									int amt = s.nextInt();
								
									System.out.println("your withdrawal amount is : "+amt+sc.withdrawAmt(uid,amt));
									System.out.println("your Available Balance id  : " + sc.viewCurrentAcount(uid));
									break;
									
							case 3 : System.out.println("Enter Amount you want to Deposit");
									int amt1 = s.nextInt();
									System.out.println("your New amount is : "+ sc.depositAmt(uid,amt1));
									break;
							
							case 4 :	System.out.println("Enter the account number in which you want to send money");
										int acc = s.nextInt();
										System.out.println("Enter the amount you want to send");
										int amt2 = s.nextInt();
										System.out.println("Your new Account Balance is :" + sc.transferAmt(uid,acc,amt2) );
								
							
				}
				}
				
		}
		

		}while(true);
		}

}
