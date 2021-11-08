import java.util.*;
public class Exercise_02_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the numbers of minutes: ");
		int minute = sc.nextInt();
		
		int day = minute / 1440;
		int year = day / 365;
		int remainingDay = day % 365;
		
		System.out.println(minute + " minutes is approximately " + year + " years and " + remainingDay + " days");
		
	}

}
