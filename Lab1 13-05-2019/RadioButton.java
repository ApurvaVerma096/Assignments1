import java.util.Scanner;

class RadioButton{
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("enter your choice : 1 for Red,2 for Yellow or 3 for Green");
			int n = scan.nextInt();

			switch(n){
				case 1:
					System.out.println("Stop");
					break;
				case 2:
					System.out.println("Ready");
					break;
				case 3:
					System.out.println("Go");
					break;
				default:
					System.out.println("You Choose the Wrong input");
			}
		}
}