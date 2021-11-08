import java.util.*;
public class Exercise_02_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter investment amount: ");
		double investmentAmount = sc.nextDouble();
		
		System.out.println("Enter annual interest rate in percentage: ");
		double annualInterestRate = sc.nextDouble();
		annualInterestRate /= 1200;
		
		System.out.println("Enter number of years: ");
		double year11 = sc.nextDouble();
		
		double accumulatedValue = investmentAmount * Math.pow((1 + annualInterestRate), year11 * 12);
		
		System.out.println("Accumulated value is $" + accumulatedValue);
		
	}

}
