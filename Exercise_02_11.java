import java.util.*;
public class Exercise_02_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double secToYear = 31536000;
		double birthInYear = secToYear / 7;
		double deathInYear = secToYear / 13;
		double immigrantInYear = secToYear / 45;
		double effection = birthInYear - deathInYear + immigrantInYear;
		double populationNow = 312032486;
		
		System.out.println("Enter the number of years: ");
		int year1 = sc.nextInt();
		
		int populationFinal = (int) (populationNow + (year1 * effection));
		
		System.out.println("The population in 5 years is " + populationFinal);
		
	}

}
