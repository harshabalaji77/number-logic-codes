import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1 = scanner.nextInt();
		System.out.println("Enter second number:");
		int num2 = scanner.nextInt();
		
		int gcd = num1;
		int n2 = num2;
		
		while (num2 > 0) {
			int rem = gcd % num2;
			num1 = num2;
			num2 = rem;
		}
		
		int lcm = (num1 * n2) / gcd;
		System.out.println("LCM of " + num1 + " and " + n2 + " is " + lcm + ".");
	}
}