import java.util.Scanner;

public class FloorCeil {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter numerator: ");
        int a = scanner.nextInt();
        System.out.println("Enter denominator: ");
        int b = scanner.nextInt();
        
        int floor = a / b;
        int ceil = (a % b == 0) ? floor : floor + 1;

        System.out.println("Floor = " + floor);
        System.out.println("Ceil = " + ceil);
	}
}