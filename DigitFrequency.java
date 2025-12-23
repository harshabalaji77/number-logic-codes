import java.util.Scanner;

public class DigitFrequency {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = scanner.nextInt();
		
		int freq[] = new int[10];
		int num = n;
		
		while (n > 0) {
			freq[n % 10]++;
			n /= 10;
		}
		
		System.out.println("Digit frequencies of " + num + " are:");
		for (int i = 0; i < 10; i++) {
			if (freq[i] > 0) {
				System.out.println(i + " = " + freq[i]);
			}
		}
	}
}