import java.util.*;

class Replace{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a string");
		String str = s.nextLine();
		String rep = "";
		rep = str.replace('r' , 't');
		
		System.out.println(rep);
	}
}
=