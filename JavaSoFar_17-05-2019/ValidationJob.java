import java.util.Scanner;

class ValidationJob{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Empoyee name");
		String empname = s.nextLine();
		int i = 0;
		if(empname.endsWith("_job") && empname.length() == 12  ){
			
			System.out.println("Employee Exist");
		}
		else{
			System.out.println("wrong input");
		}
	}
}