package basicJavaCoding;

import java.util.Scanner;

public class ComputeQuotientandReminder {
	public static void main(String[] args) {

		Scanner sc  = new Scanner(System.in);
		System.out.println("enter Dividend");
		int a = sc.nextInt();
		System.out.println("enter Divisor");
		int b = sc.nextInt();
		int quotient = a/b;
		int reminder = a%b;
		
		System.out.println("Quotient is : " + quotient);
		System.out.println("Reminder is : " + reminder);
	
	

}
}
