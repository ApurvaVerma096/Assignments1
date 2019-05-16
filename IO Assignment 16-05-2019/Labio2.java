import java.io.*;

class Labio2{
	public static void main(String[] args) {
		 int charCount = 0,count =0;
		 int i=0,c=0,l=0;
		 //String[] word = new String[]{};
		try{
			File file1 = new File("LabIo1.txt");
			FileReader fr = new FileReader(file1);
			BufferedReader br = new BufferedReader(fr);

			String str = "";
			
			while((str = br.readLine()) != null)
			{
				i++;
				if(!(str.equals(""))){
					charCount += str.length();

					String[] word = str.split("\\s+"); 
                  
                	count += word.length; 
				}

			}
			// while((str = br.readLine()) != null){
			// 	word = str.split(" ");
			// 	l=word.length;
			// 	}
				

			System.out.println("No. of Lines : "+i);
			System.out.println("No. of Character : " + charCount);
			System.out.println("No. of words : "+ count);


			br.close();
			fr.close();
		}catch(IOException e){
			System.out.println(e);
		}
	}
}