import java.util.Scanner;

public class PerfectCube {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = scanner.nextInt();
		
		boolean isPerfect = false;
		
        for (int i = 1; i * i * i <= n; i++) {
            if (i * i * i == n) {
                isPerfect = true;
                break;
            }
        }
        
        if (isPerfect)
            System.out.println(n + " is a Perfect Cube.");
        else
            System.out.println(n + " is not a Perfect Cube.");

	}
}
