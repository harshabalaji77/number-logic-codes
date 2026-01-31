import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scanner.nextInt();
		
		int sum = 0, product = 1, temp = n;
		
		while (temp > 0) {
            int d = temp % 10;
            sum += d;
            product *= d;
            temp /= 10;
        }
        System.out.println(sum == product ? n + " is a Spy Number." : n + " is not a Spy Number.");
	}
}