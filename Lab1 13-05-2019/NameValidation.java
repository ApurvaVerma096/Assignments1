import java.util.Scanner;





class NameValidation extends Exception{
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter First name");	
	String fName = s.nextLine();
	System.out.println("Enter Last name");
	String lName = s.nextLine();
	try{
		if(fName.isEmpty() && lName.isEmpty()){
			System.out.println("First and Last name can't be empty");
		}
	}
		catch(NullPointerException e){
			System.out.println(e);
		}
	}
	
}