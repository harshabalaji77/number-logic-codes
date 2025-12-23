import java.util.Scanner;

public class AscendingOrder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scanner.nextInt();
		
		boolean ascending = true;
		int prev = 10;
		
		while (n > 0) {
			int curr = n % 10;
			if (curr > prev) {
				ascending = false;
				break;
			}
			prev = curr;
			n /= 10;
		}
		System.out.println(ascending ? "Digits are in ascending order." : "Digits are not in ascending order.");
	}
}