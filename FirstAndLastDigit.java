import java.util.Scanner;

public class FirstAndLastDigit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scanner.nextInt();
		
		int first = n;
		while (first >= 10) {
			first /= 10;
		}
		
		int last = n % 10;
		
		System.out.println("First digit of "+ n + " is " + first + ".");
        System.out.println("Last digit of " + n + " is " + last + ".");
	}
}