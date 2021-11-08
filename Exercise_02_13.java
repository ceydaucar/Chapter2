import java.util.*;
public class Exercise_02_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		final double MONTHLY_INTEREST_RATE = 0.00417;	// Initialize constant value

		// Prompt the user to enter a montly saving amount
		System.out.print("Enter the monthly saving amount: ");
		double savingAmount = sc.nextDouble();

		// Compute first month account value
		double total = 100 * (1 + MONTHLY_INTEREST_RATE);
		
		// Compute second month account value
		total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
		
		// Compute third month account value
		total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
		
		// Compute forth month account value
		total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
		
		// Compute fifth month account value
		total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
		
		// Compute sixth month account value
		total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
		
		// Display result
		System.out.println("After the sixth month, the account value is " + total);
	}

}
