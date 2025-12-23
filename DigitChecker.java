import java.util.Scanner;

public class DigitChecker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = scanner.nextInt();
		System.out.println("Enter digit to check:");
		int digit = scanner.nextInt();
		
		boolean found = false;
		int num = n;
		
		while (n > 0) {
			if (n % 10 == digit) {
				found = true;
				break;
			}
			n /= 10;
		}
		System.out.println(found ? "Digit found." : "Digit not found.");
	}
}