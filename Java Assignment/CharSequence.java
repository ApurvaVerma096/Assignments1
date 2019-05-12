import java.util.Scanner;


class CharSequence{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter A String");
		String str = s.nextLine();
		System.out.println("Enter a char seq");
		String seq = s.nextLine();

		if(str.contains(seq)){
			System.out.println(str + " contains " + seq );
		}
		else{
			System.out.println("not contains");
		}
	}
}