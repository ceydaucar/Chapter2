import java.util.*;
public class Exercise_02_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the subtotal: ");
		double subtotal = sc.nextDouble();
		
		System.out.println("Enter a gratuity rate: ");
		double gratuityRate = sc.nextDouble();
		
		double gratuity = subtotal * (gratuityRate / 100);
		double total = subtotal + gratuity;
		
		System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
		
	}

}
