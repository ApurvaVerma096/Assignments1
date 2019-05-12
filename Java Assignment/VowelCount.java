
import java.util.*;

class VowelCount{
	public static void main(String[] args) {
		String str = "";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string");
		str = s.nextLine();


		int len = str.length();
		int count = 0;

		for(int i = len-1 ; i >= 0 ; i--){
			char ch = str.charAt(i);
			if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'o' || ch =='O' || ch == 'I' || ch == 'u' || ch == 'U')
							count++;
		}
		System.out.println(count + " vowel present in " + str);
	}
}
