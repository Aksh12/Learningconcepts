package basicJavaCoding;

import java.util.Scanner;

public class CheckSumOfPrimeNumber {

	public static void main(String[] args) {

		//34 : 3+31 5+29 11+23 17+17

//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter number");
//		int num = sc.nextInt();
		int num=34;
		boolean flag=false;

		
		for(int i=2; i<=num/2; i++) {
		
		if(isPrime(i)) {
			System.out.println("i : " + i);
			if(isPrime(num-i)) {
				System.out.println("(num-i) " + (num-i));
				System.out.println(i +  "+" + (num-i) + " = " + num);
				flag=true;
			}
			
		}
		
		}
		
		if(!flag) {
			System.out.println(num + ":Cannot be expressed as sum of two numbers");
		}

}
	
	
	public static boolean  isPrime(int num) {
		boolean isprime = true;
		
		for(int i=2; i<num/2; i++) {
			if(num%i==0) {
				isprime=false;
				break;
			}
		
		}
		return isprime;
		
		
		
	}
	
}














	
	/*
	 * 		int a [] = new int[num];;
		int i;
		int b;
		int count=0;
		int sum=0;
		int m,n;

		for( i=2; i<=num; i++) {
			boolean flag=false;
			for(int j=2; j<=i/2; j++) 	{
				if(i%j==0) {
					flag=true;
					break;
				}
			}

			if(flag==true) {

			}else {
				
				count++;
				b=i;
				a[count]=b;
				System.out.println("Given number is a prime number : " + i);
			}
		}
		
		for(n=1; n<a.length; n++) {
			for( m=1; m<=n; m++) {
				 sum = a[n] + a[m];
				if(sum == num) {
					System.out.println("sum of " + a[n] + " + " + a[m] + " : " + sum + " & " + num);
				}
			}
			
	}
}
	 * 
	 * 
	 */




