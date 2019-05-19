import java.util.Scanner;
class CalculateDiff{

	static int calculateDiffSum(int n){
		int sum1 = 0;
		int sum2 = 0;
		int diffSum = 0;
		for(int i = 1 ; i <= n ; i++){
			sum1+=(i^2);
		}
		for(int i =1; i<= n; i++){
			sum2 += i;
		}
		sum2 = (sum2^2); 

		
		diffSum = sum1 - sum2;

		return diffSum;
	}

	public static void main(String[] args) {
		Scanner s =  new Scanner(System.in);
		System.out.println("enter the number till you want to find the diff");
		int n = s.nextInt();
		System.out.println("Difference between the sum of square of perticular number and sum of square of all numbers = "+calculateDiffSum(n));

	}
}