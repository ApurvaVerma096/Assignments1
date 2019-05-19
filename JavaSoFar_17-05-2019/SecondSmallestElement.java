import java.util.Scanner;
import java.util.Arrays;


class SecondSmallestElement{


		static Integer getSecondSmallest(Integer[] a){
			Arrays.sort(a);
			return a[1];

		}


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.println("How many elements you want to enter");
        Integer n = s.nextInt();
        Integer [] arr = new Integer[n];
        System.out.println("enter the numbers");
        for (int i = 0; i < n; i++) {
            if (s.hasNextInt()) {
                arr[i] = s.nextInt();
            } else {
                System.out.println("You didn't provide enough numbers");
                break;
            }
        }
        System.out.println("Second smallest number " + getSecondSmallest(arr));
	}
}