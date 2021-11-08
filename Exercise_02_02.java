import java.util.*;
public class Exercise_02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the radius of a cylinder: ");
		double radius = sc.nextDouble();
		System.out.println("Enter the height of a cylinder: ");
		double height = sc.nextDouble();
		
		final double PI = 3.14159;
		double area = radius * radius * PI;
		double volume = area * height;
		
		System.out.println("The area is " + area + "\nThe volume is: " + volume);
		
	}

}
