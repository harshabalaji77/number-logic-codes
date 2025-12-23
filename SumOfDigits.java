import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scanner.nextInt();
		
		int originalNum = n;
		int sum = 0;
		
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}
		System.out.println("Sum of digits of " + originalNum + " is " + sum + ".");
	}
}