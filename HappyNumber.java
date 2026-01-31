import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scanner.nextInt();
		
		int originalNum = n;
		while (n != 1 && n != 4) {
            int sum = 0;
            while (n > 0) {
                int d = n % 10;
                sum += d * d;
                n /= 10;
            }
            n = sum;
        }
        System.out.println(n == 1 ? originalNum + " is a Happy Number." : originalNum + " is not a Happy Number.");
	}
}