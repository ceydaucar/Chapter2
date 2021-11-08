import java.util.*;
public class Exercise_02_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number in pounds: ");
		double pounds = sc.nextDouble();
		
		double kilograms = pounds * 0.454;
		
		System.out.println(pounds + " pounds is " + kilograms + " kilograms.");
		
	}

}
