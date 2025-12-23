import java.util.Scanner;

public class SmallestDigit {

	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = scanner.nextInt();
		
		int originalNum = n;
		int smallest = 9;
		
		while (n > 0) {
			int digit = n % 10;
			if (digit < smallest) {
				smallest = digit;
			}
			n /= 10;
		}
		System.out.println("The smallest digit in " + originalNum + " is " + smallest + ".");
	}
}