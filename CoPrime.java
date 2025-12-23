import java.util.Scanner;

public class CoPrime {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int x = a;
		int y = b;
		
		while (y != 0) {
			int temp = y;
			y = x % y;
			x = temp;
		}
		
		if (x == 1) {
			System.out.println(a + " and " + b + " are coprime.");
		}
		else {
			System.out.println(a + " and " + b + " are not coprime.");
		}
	}
}