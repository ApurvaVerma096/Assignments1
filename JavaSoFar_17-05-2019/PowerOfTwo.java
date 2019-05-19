import java.util.Scanner;

class PowerOfTwo{
		static boolean checkNumber(int n){
			if (n == 0) 
   				 return false; 
  			while(n != 1) 
  			{ 
      			if (n%2 != 0) 
        		 return false; 
     			 n = n/2; 
  			} 
  				return true; 
		}         
			

		

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number to check number is power of 2 or not");
		int n = s.nextInt();
		System.out.println("number is power of 2 "+checkNumber(n));
	}
}

