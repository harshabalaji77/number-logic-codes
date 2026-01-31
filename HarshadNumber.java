import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scanner.nextInt();
		
		int temp = n, sum = 0;
		
		while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println(n % sum == 0 ? n + " is Harshad Number." : n + " is not a Harshad Number.");
	}
}