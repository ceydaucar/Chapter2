import java.util.*;
public class Exercise_02_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the driving distance: ");
		double distance1 = sc.nextDouble();
		
		System.out.println("Enter miles per gallon: ");
		double milesPerGallon = sc.nextDouble();
		
		System.out.println("Enter price per gallon: ");
		double pricePerGallon = sc.nextDouble();
		
		double costOfDriving = (distance1 / milesPerGallon) * pricePerGallon;
		
		System.out.println("The cost of driving is $" + (int)(costOfDriving*100)/100.0);
		
	}

}
