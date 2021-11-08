import java.util.*;
public class Exercise_02_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a value for feet: ");
		double feet = sc.nextDouble();
		
		double meters = feet * 0.305;
		
		System.out.println(feet + " feet is " + meters + " meters.");
		
	}

}
