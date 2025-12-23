import java.util.Scanner;

public class FirstNOdd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scanner.nextInt();
		
		System.out.println("The first " + n + " odd numbers are:");
		for (int i = 1; i <= n; i++) {
			System.out.print((2 * i) - 1 + " ");
		}
	}
}