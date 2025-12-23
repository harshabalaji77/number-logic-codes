import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter a number:");
		int n = scanner.nextInt();
		
		System.out.println("Prime factors of " + n + " are:");
		for (int i = 2; i <= n / 2; i++) {
			while (n % i == 0) {
				System.out.print(i + " ");
				n /= i;
			}
		}
		if (n > 1) {
			System.out.print(n);
		}
	}
}