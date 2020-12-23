package basicJavaCoding;

import java.util.Scanner;

public class FindFactorialOfNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to get its factorial");
		int num=sc.nextInt();
		int fact=1;

		//5*4*3*2*1
		
		for(int i=num; i<=num; i--) {
			fact=fact*i;
			if(i==1) {
				break;
			}
			
		}
		System.out.println("Factorial of given number is : " + fact);
		
		
	}

}
