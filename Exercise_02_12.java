import java.util.*;
public class Exercise_02_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter speed: \nEnter acceleration: ");
		double speed = sc.nextDouble();
		double acceleration1 = sc.nextDouble();
		
		double length = (speed * speed) / (2 * acceleration1);
		
		System.out.println("The minimum runway length for this airplane is " + length);
		
	}

}
