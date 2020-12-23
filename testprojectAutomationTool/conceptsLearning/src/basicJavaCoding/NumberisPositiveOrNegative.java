package basicJavaCoding;

import java.util.Scanner;

public class NumberisPositiveOrNegative {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number to check its positive or negative");
		double num = sc.nextDouble();
		
		if(num>0) {
			System.out.println("entered number is Positive");
		}else if(num<0) {
			System.out.println("entered number is negative");
		}else {
			System.out.println("entered number is Zero");
		}
		
	}

}
