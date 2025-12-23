import java.util.Scanner;

public class DigitCounter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = scanner.nextInt();
		
		int originalNum = n;
		int count = 0;
		
		if (n == 0) {
			count = 1;
		}
		else {
			while (n > 0) {
				n /= 10;
				count++;
			}
		}
		System.out.println("The number " + originalNum + " has " + count +" digits.");
	}
}