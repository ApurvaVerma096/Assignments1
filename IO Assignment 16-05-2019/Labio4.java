import java.io.*;
import java.util.Scanner;

class Labio4{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the word you want to replace");
		String word1 = s.nextLine();
		System.out.println("Enter the word you want to replace with");
		String word2 = s.nextLine();
		
		try{
			File file1 = new File("LabIo1.txt");
			FileReader fr = new FileReader(file1);
			BufferedReader br = new BufferedReader(fr);
			String str = "";
			String newword = "";
			while((str = br.readLine()) != null)
			{
			    str = str.replace(word1,word2);
			    newword = newword + str + "\n";
			 	 
			}
			br.close();
    		BufferedWriter bw = new BufferedWriter(new FileWriter(file1));
    		bw.write(newword);
    		bw.flush();
			bw.close();
			br.close();
			fr.close();
		}catch(IOException e){
			System.out.println(e);
		}




	}
}