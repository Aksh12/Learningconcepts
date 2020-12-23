package basicJavaCoding;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("eneter number to get FibonacciSeries : ");
		
		int num = sc.nextInt();
		int sum;
		int t1=0;
		int t2=1;
		//0,   1,   1,  2,  3,  5,   8.....
		//0+1, 1+1, 
		
		for(int i=1; i<=num; i++) {
			
			System.out.println(t1);//011235
			sum=t1+t2;//12358
			t1=t2;//11235
			t2=sum;//12358
			
			
		}
		
	
			
		}
		
		

	}


