import java.util.*;
public class Exercise_02_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter weight in pounds: ");
		double weightInPounds = sc.nextDouble();
		
		System.out.println("Enter height in iches: ");
		double heightInIncehs = sc.nextDouble();
		
		double weight = weightInPounds * 0.45359237;
		double height1 = heightInIncehs * 0.0254;
		
		double BMI = weight / Math.pow(height1,2);
		
		System.out.println(BMI);
		
	}

}
