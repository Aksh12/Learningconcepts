package basicJavaCoding;

import java.util.Scanner;

public class ReverseAnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		long num = sc.nextLong();
//		long temp=0, count=0;
//		long rev=0;
//		//12345
//		while(num != 0) {
//			temp=num%10;//543
//			rev=rev*10+temp;//5*10+4=543;
//			num=num/10;//1234
//			
//		}
//		
//		System.out.println(rev);
//
//	}
		StringBuffer s = new StringBuffer(String.valueOf(num)).reverse();
		System.out.println(s);

	}
}
