import java.util.Scanner;

public class SecondLargestDigit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scanner.nextInt();
		
		int originalNum = n;
		int largest = -1, secondLargest = -1;
		
		while (n > 0) {
			int digit = n % 10;
			if (digit < largest) {
				secondLargest = largest;
				largest = digit;
			}
			else if (digit > secondLargest && digit != largest) {
				secondLargest = digit;
			}
			n /= 10;
		}
		
		if (secondLargest == -1) {
			System.out.println("No second largest digit.");
		}
		else {
			System.out.println("The second largest digit in " + originalNum + " is " + secondLargest + ".");
		}
	}
}