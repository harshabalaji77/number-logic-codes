import java.util.Scanner;

public class GreatestOfThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the numbers:");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		
		int greatest;
		
		if (num1 > num2 && num1 > num3) {
			greatest = num1;
		} 
		else if (num2 > num1 && num2 > num3) {
			greatest = num2;
		}
		else {
			greatest = num3;
		}
		System.out.println("The greatest of given three numbers is " + greatest + ".");
	}

}
