import java.util.Scanner;
class SumOfNaturalNumbers{

	static int calculateSum(int n){
			int sum = 0;
			for(int i =1 ; i < n ; i++){
				if(i%3 == 0 || i%5 == 0){
					sum += i;
				}
			}
			return sum;
	}





	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.println("Enter the number till you want the sum");
        int n = s.nextInt();
       
        System.out.println("SUM of Div by 3 or 5 " + calculateSum(n));
	}
}
