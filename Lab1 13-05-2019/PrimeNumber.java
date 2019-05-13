import java.util.Scanner;

class Prime{
	int  count, c = 0;
	void primeNum(int n){
		for (int i = 2; i <= n; i++) {
            count = 2;
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    count++;
            }
            if (count == 2) {
                System.out.print(i + " ");
                c++;
            }
        }
	}

	}
class PrimeNumber{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the no. till you want prime numbers");
		int n = s.nextInt();
		Prime p = new Prime();
		p.primeNum(n);
	}
}