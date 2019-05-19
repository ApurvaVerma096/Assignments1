import java.util.Scanner;

class CubeOfInt{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a digit");
		int n = s.nextInt();
		
		int sum = 0;
		while (n > 0) {
   		 int p = n % 10;
    		sum += p * p * p;
    		n /= 10;
		}
		System.out.println(sum);
	}
}