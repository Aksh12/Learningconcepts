package basicJavaCoding;

import java.util.Scanner;

public class NumberOfDigitInInteger {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		long num = sc.nextLong();
		long temp, count=0;

	
		while(num != 0) {
			num=num/10;
			count++;
		}
		System.out.println("number of integer are : " + count);
		
	}
	}
