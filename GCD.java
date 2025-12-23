import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1 = scanner.nextInt();
		System.out.println("Enter second number:");
		int num2 = scanner.nextInt();
		
		int n1 = num1;
		int n2 = num2;
		
		while (num2 > 0) {
			int rem = num1 % num2;
			num1 = num2;
			num2 = rem;
		}
		System.out.println("The GCD of " + n1 + " and " + n2 + " is " + num1 + ".");
	}
}