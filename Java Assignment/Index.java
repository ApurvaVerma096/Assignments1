import java.util.Scanner;


class Index{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a string");
		String str = s.nextLine();
		System.out.println("enter a index");
		int ind = s.nextInt();

			System.out.println(str.charAt(ind-1));



	}
}