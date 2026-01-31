import java.util.Scanner;

public class DuckNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		String n = scanner.next();
		
		boolean hasZero = false;

        for (int i = 1; i < n.length(); i++) {
            if (n.charAt(i) == '0') {
                hasZero = true;
                break;
            }
        }
        System.out.println(hasZero ? n + " is a Duck Number." : n + " is not a Duck Number.");
	}
}