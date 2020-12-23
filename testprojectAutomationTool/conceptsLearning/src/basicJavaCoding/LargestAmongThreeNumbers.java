package basicJavaCoding;

import java.util.Scanner;

public class LargestAmongThreeNumbers {

	public static void main(String[] args) {
		
		int a,b,c;
		int temp=0;
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter 3 numbers to find the largest");
		a = sc.nextInt(); //200
		b = sc.nextInt(); //300
		c = sc.nextInt(); //300
		
		if(a>=b && a==c) {
			System.out.println("a,b,c values are equal");
		}else if (a>b && a>c){
			System.out.println("a is greater : " + a);
		}else if(b>=c) {
			System.out.println("b is greater : " + b);
		}else {
			System.out.println("c is greater : " + c);
		}
		}
	
}
