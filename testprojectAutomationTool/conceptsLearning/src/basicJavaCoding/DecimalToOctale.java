package basicJavaCoding;

import java.util.Scanner;

public class DecimalToOctale {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a octale number to get its Decimal");
		int num = sc.nextInt();
		int rem = num;
		int result=0;
		int temp=0;
		int i=1;
		
		while(num != 0) {
			temp=num%8;
			result=result+temp*i;
			i *= 10;	
			num=num/8;
		}
		
		System.out.println("result : " + result);

	}

}
