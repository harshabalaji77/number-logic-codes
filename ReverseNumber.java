import java.util.Scanner;

public class ReverseNumber {

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
		System.out.println("The Reverse of " + originalNum + " is " + reverse + ".");
	}
}