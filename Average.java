import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		System.out.println("Enter the numbers:");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int avg = (a + b) / 2;
		
		System.out.println("Average of numbers are " + avg + ".");
	}
}