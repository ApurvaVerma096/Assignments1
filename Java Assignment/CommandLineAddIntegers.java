import java.util.Scanner;

class CommandLineAddIntegers{
public static void main(String[] args) {
	int sum = 0;
	if(args.length<1){
		System.out.println("Error,one Integer is not Acceptable");
	}
	for(int i= 0;i<args.length;i++){
		sum = sum + Integer.parseInt(args[i]);
	}
	System.out.println(sum);
}
}