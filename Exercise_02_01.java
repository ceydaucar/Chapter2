import java.util.*;
public class Exercise_02_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a degree in Celcius: ");
		double celcius = sc.nextDouble();
		
		double fahrenheit = (9.0 / 5) * celcius + 32;
		
		System.out.println(celcius + " Celcius is " + fahrenheit + " Fahrenheit");
		
	}

}
