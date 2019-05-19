import java.util.Scanner;
import java.util.StringTokenizer;

class SumOfInt{
	public static void main(String[] args) {
		
	int sum= 0;
	Scanner scan =  new Scanner(System.in);
	System.out.print("Enter the numbers using space : ");
	String n = scan.nextLine();
	StringTokenizer tokenizer = new StringTokenizer(n," ");
	while(tokenizer.hasMoreTokens()) {
     int convertedToInt = Integer.parseInt(tokenizer.nextToken());
     sum += convertedToInt; 
	}
	System.out.println(sum);
	}
}