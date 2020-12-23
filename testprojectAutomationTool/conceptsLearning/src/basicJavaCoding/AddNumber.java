package basicJavaCoding;

import java.util.Scanner;

public class AddNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number a");
		int a = sc.nextInt();
		System.out.println("enter number b");
		int b =sc.nextInt();
		
		System.out.println("Sum of a and b is : " + (a+b));

	}

}
