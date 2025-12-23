import java.util.Scanner;

public class ReplaceDigit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		String n = scanner.nextLine();
		System.out.println("Enter the digit to replace:");
		char oldDigit = scanner.next().charAt(0);
		System.out.println("Enter the new digit:");
		char newDigit = scanner.next().charAt(0);
		
		String result = n.replace(oldDigit, newDigit);
		System.out.println("Replaced number of " + n + " is " + result + ".");
		
	}
}