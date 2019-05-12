import java.util.Scanner;
import java.io.*;

class SplitFunction
{
    public static String returnSubstring(String theString,String delimeter)
    {
        final int delL = delimeter.length();
        if(theString.length() <= delL)
        {
            return theString;
        }
        for(int i=0;i<theString.length()-delL;i++)
		{
		    
		    String temp = theString.substring(i,i+delL);
		    if(temp.equals(delimeter)){
		        if(i==0){
		            System.out.println(returnSubstring(theString.substring(i+delL),delimeter));
		            return temp;
		        }
		        else{
		            System.out.println(returnSubstring(theString.substring(i),delimeter));
		            return theString.substring(0,i);
		        }
		  
		    }
		    
		    
		}
		return theString;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner  s = new Scanner(System.in);
		System.out.println("enter a string");
		String str = s.nextLine();
		System.out.println("enter a delimeter");
		String d = s.nextLine();
		System.out.println(returnSubstring(str,d));


		// String s="I am good, girl";

		// String delimeter = ",";
		// System.out.println(returnSubstring(s,delimeter));



		// class A {
	

// 	void mySplit(String s , char d){

// 			for( int i = 0 ; i<s.length() ; i++){
// 				if(s.charAt(i) == d){
// 					s=s.replace(String.valueOf(s.charAt(i)),"\n");

// 				}
// 			}
// 			System.out.println(s);
// 		}


// 		// int len = s.length();
// 		// char[] word1 = new char[len];
// 		// for(int j = 0 ; j < len ; j++){

// 		// 	word1[j] = s.charAt(j);

// 		// 	if(word1[j]==d){
// 		// 		word1.replace(String.valueOf(s.charAt(j))," ");
// 		// 	}

// 		// 	}
// 		// 	System.out.println(word1);
// 		// }



// 		/*for(int i = 0 ; i < len ; i++)
// 		{
// 			if(word1[i] == c){
// 				word1[i].replace(" ");
// 			}*/

// 		}
	


// class MySplit{
// 	public static void main(String[] args) {

// 		A a = new A();
// 		System.out.println("enter a string");
// 		Scanner scan = new Scanner(System.in);
// 		String s = scan.nextLine();
// 		System.out.println("enter a delimeter from where you want to split");
// 		Scanner v = new Scanner(System.in);
// 		char d = v.next().charAt(0);
// 		a.mySplit(s,d);


// 	}
// }
		
		
	}
}
   