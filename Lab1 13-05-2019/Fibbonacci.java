//without Recursion

import java.util.Scanner;


// class Fib{
// 	 void fibb(int p){
// 	int a = 0, b = 1,c=0,i=2;
// 	while(i<=p){
// 		c = a+b;
// 		a = b ; 
// 		b = c;
// 		i++;
// 	}
// 	System.out.println( p+"th " + "term of Fibbonacci is " + c );
// 	}
// }


// with recursion

class Fib{
	  int fibb(int n){
        if (n <= 1) 
       return n; 
    return fibb(n-1) + fibb(n-2); 
    }  
  }




class Fibbonacci{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the nth no. of Fibbonacci");
		int n = s.nextInt();
		Fib f = new Fib();
		int k = f.fibb(n);
		System.out.println( n+"th " + "term of Fibbonacci is " + k);

	}
}

//