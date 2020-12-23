package basicJavaCoding;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// Prime Number : Number which is divisble by only 1 and itself 1,2,3,5,7,11,13
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number to check if it is PrimeNumber");
		int num = sc.nextInt();
		boolean flag = false;
		System.out.println("num/2 : " + num/2);
		for(int i=2; i<num/2; i++) {
			System.out.println("i inside : " + i);
			if(num%i == 0) {
				System.out.println("i : " + i);
				flag=true;
				break;
			}
			
		}
		
		if(!flag) {
			System.out.println("entered number : " + num + " : a prime");
		}else {
			System.out.println("entered number is not prime : " + num);
		}
		
		
		
		
		
		
	}
	

}
