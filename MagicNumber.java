import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scanner.nextInt();
		
		int originalNum = n;
		while (n > 9) {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            n = sum;
        }
        System.out.println(n == 1 ? originalNum + " is a Magic Number." : originalNum + " is not a Magic Number.");
	}
}