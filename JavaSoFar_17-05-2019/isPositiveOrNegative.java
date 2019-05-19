import java.util.Arrays; 
import java.util.Scanner; 
  
 class isPositiveOrNegative { 
    static boolean positiveOrNegative(String s)  
    {   
        int n = s.length();  
        char c[] = new char [n];    
        for (int i = 0; i < n; i++) {  
            c[i] = s.charAt(i);  
        }    
        Arrays.sort(c);   
        for (int i = 0; i < n; i++)  
            if (c[i] != s.charAt(i))   
                return false;  
                
        return true;      
    }  
      
    public static void main(String args[]) 
    { 
        do{
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = scan.nextLine(); 
        if (positiveOrNegative(s))  
           System.out.println("Positive");  
        else
            System.out.println("Nagetive"); 

        }while(true);
    } 
    }
