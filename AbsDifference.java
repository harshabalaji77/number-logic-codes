import java.util.Scanner;

public class AbsDifference {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int diff = a - b;

        if (diff < 0)
            diff = -diff;

        System.out.println("Absolute difference of " + a + " and " + b + " is "+ diff + ".");
	}
}