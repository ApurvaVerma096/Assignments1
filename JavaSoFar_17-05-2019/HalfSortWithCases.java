import java.util.Arrays; 
import java.util.Scanner;

class HalfSortWithCases{

    static void sortWithCases(String str){
        char arr[] = str.toCharArray(); 
        Arrays.sort(arr);
        int l = arr.length;
        if((l%2) == 0){
            System.out.println("a");
            char[] a = Arrays.copyOfRange(arr,0,l/2);
            String str1 = new String(a);
            str1.toUpperCase();
        
            char[] b = Arrays.copyOfRange(arr,l/2,l);
            String str2 = new String(b);
            str2.toLowerCase();
            System.out.println(str1 + str2);

        }
        else{
            System.out.println("b");
            char[] a = Arrays.copyOfRange(arr,0,(l/2+1));
            String str1 = new String(a);
            str1.toUpperCase();
        
            char[] b = Arrays.copyOfRange(arr,(l/2+1),l);
            String str2 = new String(b);
            str2.toLowerCase();
            System.out.println(str1 + str2);
        }
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = s.nextLine();
        sortWithCases(str);
    }
}
