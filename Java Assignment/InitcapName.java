import java.util.Scanner;

class InitcapName	{
	public static void main(String[] args)	{
		System.out.print("Enter your name : ");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();

		String name[] = str.split(" ");
		for(String n : name){
			System.out.print(Character.toUpperCase(n.charAt(0)) + " ");
		}
		
	}
}