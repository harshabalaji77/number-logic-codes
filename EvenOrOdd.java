import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = scanner.nextInt();
		
		if (n % 2 == 0) {
			System.out.println(n + " is an even number.");
		}
		else {
			System.out.println(n + " is an odd number.");
		}
	}
}