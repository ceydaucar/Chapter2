import java.util.*;
public class Exercise_02_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer between 0 and 1000: ");//576
		int number = sc.nextInt();

		int first = number % 10; //6
		int remainingNumber = number / 10; //57
		int second = remainingNumber % 10; //7
		remainingNumber = remainingNumber / 10; //5
		int third = remainingNumber % 10; // 5
		
		int sum = first + second + third;
		System.out.println("The sum of digits is " + sum);
	}

}
