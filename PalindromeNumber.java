import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = scanner.nextInt();
		
		int originalNum = n;
		int reverse = 0;
		
		while (n > 0) {
			int digit = n % 10;
			reverse = reverse * 10 + digit;
			n /= 10;
		}
		
		if (originalNum == reverse) {
			System.out.println(originalNum + " is a palindrome number.");
		}
		else {
			System.out.println(originalNum + " is not a palindrome number.");
		}
	}
}