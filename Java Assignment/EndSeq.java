import java.util.Scanner;

class EndSeq{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter A string");
		String str = s.nextLine();
		System.out.println("Enter A end seq");
		String endSeq = s.nextLine();


		if(str.endsWith(endSeq)){
			System.out.println(str + " is ends with " + endSeq);
		}
		else{
			System.out.println("not ends with " + endSeq);
		}
	}
}