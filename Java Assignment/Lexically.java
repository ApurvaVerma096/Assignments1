import java.util.Scanner;

class Lexically{
	public static void main(String[] args) {
		String str1, str2;
		int cmp;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first string: ");
		str1 = s.nextLine();
		System.out.println("Enter second string");
		str2 = s.nextLine();
		cmp = str1.compareTo(str2);

		if(cmp < 0){
			System.out.println(str1+ " is less than " +str2);
		}

		if(cmp == 0){
			System.out.println(str1+ " is equal to " +str2);
		}

		if(cmp > 0){
			System.out.println(str1+ " is greater than " +str2);
		}

		
	}
}