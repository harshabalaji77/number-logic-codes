import java.util.Scanner;

public class SingleDigitSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scanner.nextInt();
		
		int originalNum = n;
		
		while (n >= 10) {
			int sum = 0;
			while (n > 0) {
				sum += n % 10;
				n /= 10;
			}
			n = sum;
		}
		System.out.println("The single digit sum of digits of " + originalNum + " is " + n + ".");
	}
}