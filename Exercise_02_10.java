import java.util.*;
public class Exercise_02_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the amount of water in kilograms: ");
		double M = sc.nextDouble();
		
		System.out.println("Enter the initial temperature: ");
		double T0 = sc.nextDouble();
		
		System.out.println("Enter the final temperature: ");
		double Tf = sc.nextDouble();
		
		double Q = M * (Tf - T0) * 4184;
		
		System.out.println("The energy needed is " + Q);
		
	}

}
