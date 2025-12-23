import java.util.Scanner;

public class LargestDigit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = scanner.nextInt();
		
		int originalNum = n;
		int largest = 0;
		
		while (n > 0) {
			int digit = n % 10;
			if (digit > largest) {
				largest = digit;
			}
			n /= 10;
		}
		System.out.println("The largest number in " + originalNum + " is " + largest + ".");
	}
}