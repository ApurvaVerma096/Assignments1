import java.util.Scanner;

class MyException extends Exception{
	public MyException(String s){
		super(s);
	}
}


class validateAge{
	public static void main(String[] args) throws MyException{
		Scanner s = new Scanner(System.in);
		System.out.println("enter your age");
		int n = s.nextInt();
		if(n<15){
			throw new MyException("Age of a person should be above 15");
		}
		else{
			System.out.println("");
		}
	}
}