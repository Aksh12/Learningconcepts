package basicJavaCoding;

import java.util.Scanner;

public class DecimalToBinary {
	static long result=0;
	static long rev=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Decimal number to get binary (Example : 9)");
		long binary = sc.nextLong();
		long remainder = binary;
		long Quotient;
		long i=1;
		
		while(binary != 0) {
			remainder = binary;
			Quotient=binary/2;
			//System.out.println("Quotiend : " + Quotient);
			binary=Quotient;

			remainder= remainder%2;//1
			System.out.println("-----remainder----- : " + remainder);
		
			//result=result*10+remainder;
			result = result+remainder*i;
			i *= 10;
			System.out.println("*******Result******** : " + result);
			
		}

		System.out.println("Decimal to Binary : " + result);
		System.out.println("Decimal to Binary : " + reverseResult(result));

	}
	
	public static long reverseResult(long number) {
		
		while(number != 0) {
			long quo = number;
			number = number%10;//1001
			 rev = rev*10+number;//1//10//100//
			 number=quo/10;//100//10//1
			
		}
		return rev;
		
	}

}