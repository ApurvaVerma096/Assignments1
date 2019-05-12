import java.util.Scanner;
class RemoveDuplicates{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = s.nextLine();

		System.out.println("after removing duplicate is: " + new RemoveDuplicates().removeDup(str));
	}

	String removeDup(String str){
		String result = "";
	    for (int i = 0; i < str.length(); i++) {
	        if(!result.contains(String.valueOf(str.charAt(i)))) {
	            result += String.valueOf(str.charAt(i));
	        }
	    }
	    return result;
	
	}
}
