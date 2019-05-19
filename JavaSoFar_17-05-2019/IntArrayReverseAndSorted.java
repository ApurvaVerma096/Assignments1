import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
class IntArrayReverseAndSorted{

         static void Reverse(int a[]){
            int n = a.length;
             int[] b = new int[n]; 
                int j = n; 
                 for (int i = 0; i < n; i++) { 
                     b[j - 1] = a[i]; 
                        j = j - 1; 
            
                    }
                    
                Arrays.sort(b);
                System.out.println("Sorted Array in reverse order");
                for ( int i : b ) {
                    System.out.println(i);
                }

}



    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many elements you want to enter");
        int n = s.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the numbers");
        for (int i = 0; i < n; i++) {
            if (s.hasNextInt()) {
                arr[i] = s.nextInt();
            } else {
                System.out.println("You didn't provide enough numbers");
                break;
            }
        }
        Reverse(arr);
        


}
}