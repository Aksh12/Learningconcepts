package basicJavaCoding;

import java.util.Scanner;

public class MultiplyTwoFloatingPointNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Floating number : a");
		float a = sc.nextFloat();
		
		System.out.println("Enter second Floating number : b");
		float b = sc.nextFloat();
		
		System.out.println("Multiplication of two floating point number is : " + (a*b));

	}

}
