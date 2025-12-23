import java.util.Scanner;

public class FirstNEven {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scanner.nextInt();
		
		System.out.println("The first " + n + " even numbers are:");
		for (int i = 1; i <= n; i++) {
			System.out.print(i * 2 + " ");
		}
	}
}