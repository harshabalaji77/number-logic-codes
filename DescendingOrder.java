import java.util.Scanner;

public class DescendingOrder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scanner.nextInt();
		
		boolean descending = true;
		int prev = -1;
		
		while (n > 0) {
			int curr = n % 10;
			if (curr < prev) {
				descending = false;
				break;
			}
			prev = curr;
			n /= 10;
		}
		System.out.println(descending ? "Digits are in descending order." : "Digits are not in descending order.");
	}
}