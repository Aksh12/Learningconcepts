package basicJavaCoding;

import java.util.Scanner;

public class CheckNumberEvenOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		
		int num = sc.nextInt();
		
		if(num%2 == 0) {
			System.out.println("Entered number is  : " + num + " is even");
		}else {
			System.out.println("Entered number is  : " + num + " is odd");
		}

	}

}
