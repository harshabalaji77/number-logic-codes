import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a base:");
		int base = scanner.nextInt();
		System.out.println("Enter a exponent:");
		int exp = scanner.nextInt();
		
		int result = 1;
		for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        System.out.println("The power of " + base + " with exponent " + exp + " is " + result + ".");
	}
}