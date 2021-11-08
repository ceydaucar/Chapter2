import java.util.*;
public class Exercise_02_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three points for a triangle: ");
		double x11 = sc.nextDouble();
		double y11 = sc.nextDouble();
		double x21 = sc.nextDouble();
		double y21 = sc.nextDouble();
		double x3 = sc.nextDouble();
		double y3 = sc.nextDouble();
		
		double side1 = Math.pow(Math.pow(x21 - x11, 2) + Math.pow(y21 - y11, 2), 0.5);
		double side2 = Math.pow(Math.pow(x3 - x21, 2) + Math.pow(y3 - y21, 2), 0.5);
		double side3 = Math.pow(Math.pow(x11 - x3, 2) + Math.pow(y11 - y3, 2), 0.5);
		
		double s = (side1 + side2 + side3) / 2;
		
		double area11 = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);

		System.out.println("The area of the triangle is " + area11);
		
	}

}
