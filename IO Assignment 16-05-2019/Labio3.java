import java.io.*;
import java.util.Scanner;


class Labio3
{
	public static void main(String[] args) {
		System.out.println("Enter file ");
		Scanner sc =  new Scanner(System.in);
		String filename = sc.nextLine();
		File file = new File(filename);     
		if(file.exists())
		{
			System.out.println("Can Read : "+file.canRead());
			System.out.println("Can Write : "+file.canWrite());
			System.out.println("Length of file : "+file.length() + "byte");
			String type = file.getName();
			int index = type.indexOf(".");
			type = type.substring(index+1);
			System.out.println("Type of file : "+type);
		}
		else
		{
			System.out.println("File not found");
		}
	}
}







