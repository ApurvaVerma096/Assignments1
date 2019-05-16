import java.io.*;
class Labio1{
	public static void main(String[] args) {
		
		try{
			File file1 = new File("LabIo1.txt");
			FileReader fr = new FileReader(file1);
			BufferedReader br = new BufferedReader(fr);

			String str = "";
			int i=0 ;
			while((str = br.readLine()) != null)
			{
			    
			 	 // str = br.readLine();
				System.out.println((i+1) + ". " + str);
				i++;
			}

			br.close();
			fr.close();
		}catch(IOException e){
			System.out.println(e);
		}
	}
} 