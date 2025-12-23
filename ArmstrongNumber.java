import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = scanner.nextInt();
		
		int originalNum = n;
		int temp = n;
		int digits = 0;
		
		while (temp > 0) {
			temp /= 10;
			digits++;
		}
		
		temp = n;
		int sum = 0;
		
		while (temp > 0) {
			int digit = temp % 10;
			sum += Math.pow(digit, digits);
			temp /= 10;
		}
		
		if (sum == originalNum) {
			System.out.println(originalNum + " is an Armstrong number.");
		}
		else {
			System.out.println(originalNum + " is not an Armstrong number.");
		}
	}
}