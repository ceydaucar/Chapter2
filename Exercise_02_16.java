import java.util.*;
public class Exercise_02_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the side: ");
		double side = sc.nextDouble();
		
		double area1 = Math.pow(27, 0.5) * Math.pow(side, 2) /2;

		System.out.println("The area of the hexagon is " + area1);
		
	}

}
