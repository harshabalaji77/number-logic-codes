import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scanner.nextInt();
		
		int square = n * n, sum = 0;

        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        System.out.println(sum == n ? n + " is a Neon Number." : n + " is not a Neon Number.");
	}
}