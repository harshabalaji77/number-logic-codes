import java.util.Scanner;

public class TribonacciSeries {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scanner.nextInt();
		
		int a = 0, b = 1, c = 1;
        System.out.println("Tribonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b + c;
            a = b;
            b = c;
            c = next;
        }

	}

}
