package basicJavaCoding;

import java.util.Scanner;

public class PrimeNumbersBetweenIntervals {

	public static void main(String[] args) {

		Scanner sc  = new Scanner(System.in);
		System.out.println("enter starting");
		int a = sc.nextInt();
		System.out.println("enter ending");
		int b = sc.nextInt();
		boolean flag = false;
		int count = 0;
		
		//a=2;
		//b=50;
		
		while(a<=b) {
			flag=false;
			for(int i=2; i<=a/2; i++) {
				if(a%i==0) {
					flag=true;
					break;
				}
				
			}
				if(!flag) {
					System.out.println("number is a prime : " + a);
					count++;
				}	
			a++;
			
		}
		
		System.out.println("number of primes between two intervales is : " + count);



	}

}
