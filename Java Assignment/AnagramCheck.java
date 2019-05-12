import java.util.Scanner;

class AnagramCheck{
	public static void main(String... args)	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String1 ");
		String str1 = s.nextLine();
		System.out.println("Enter String2 ");
		String str2 = s.nextLine();

		if(Anagram(str1, str2))	{
			System.out.println(" it is anagram");
		}
		else	{
			System.out.println("it is not anagram");
		}
	}

	public static boolean Anagram(String str1, String str2)	{
		int num = str2.length();
		for(int i=0; i<str2.length(); ++i)	{
			for(int j=0; j<str1.length(); ++j)	{
				if(str1.charAt(j) == str2.charAt(i))	
					--num;
				if(num == 0)	
					return true;
			}
		}
		return false;
	}
}