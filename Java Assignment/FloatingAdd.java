import java.util.Scanner;

class FloatingAdd{
	public static void main(String[] args) 
	{	
		float sum = 0.0f;
		if(args.length <= 1){
    		System.out.println("Error");
    	}
        
        
		for (int i = 0; i < args.length; i++) {
            sum = sum + Float.parseFloat(args[i]);
        }
       
        System.out.printf("%.2f", sum);

}
}