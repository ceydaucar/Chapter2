import java.util.*;
public class Exercise_02_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter balance and interest rate (e.g., 3 for 3%): ");
		double balance = sc.nextDouble();
		double interestRate = sc.nextDouble();
		
		double interest = balance * (interestRate/1200);
		
		System.out.println("The interest is " + interest);
		
	}

}
