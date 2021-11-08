import java.util.Scanner;
public class Exercise_02_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter v0: ");
		double v0 = sc.nextDouble();
		
		System.out.println("v1: ");
		double v1 = sc.nextDouble();
		
		System.out.println("t: ");
		double t = sc.nextDouble();
		
		double acceleration = (v1 - v0) / t;
		
		System.out.println("The average acceleration is " + acceleration);
		
	}

}
