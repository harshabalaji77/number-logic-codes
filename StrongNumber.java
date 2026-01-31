import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scanner.nextInt();
		
		int temp = n, sum = 0;
		
		while (temp > 0) {
			int digit = temp % 10;
            int fact = 1;

            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }
            sum += fact;
            temp /= 10;
		}
		System.out.println(sum == n ? n + " is Strong Number." : n + " is not a Strong Number.");
	}
}