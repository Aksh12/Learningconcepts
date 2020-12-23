package basicJavaCoding;

import java.util.Scanner;

public class SumOfNaturalNumbers {
	public static int num, forSum, whileSum;

	public static void main(String[] args) {
		
		//1+2+3+4+5......num


		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number");

		 num = sc.nextInt();

		 forSum = 0;

		for(int i=1; i<=num; i++) {
			forSum=forSum+i;
		}
		
		System.out.println("for loop : " +  forSum);
	
	
	int k=1;
	
	while(k<=num) {
		whileSum = whileSum+k;
		k++;
	}
	
	System.out.println("While loop : " + whileSum);

	
}
}