import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = scanner.nextInt();
		
		if (n <= 1) {
			System.out.println(n + " is not a prime number.");	
		}
		else {
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					System.out.println(n + " is not a prime number.");
					return;
				}
			}
			System.out.println(n + " is a prime number.");
		}
	}
}