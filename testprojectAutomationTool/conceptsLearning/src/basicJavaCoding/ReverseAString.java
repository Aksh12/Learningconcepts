package basicJavaCoding;

import java.util.Scanner;

public class ReverseAString {

	public static char reverse, result;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string which needs to be reversed");
		String s = sc.next();
		String rev = "";
//		
//		int j = s.length();
//		
//		for(int i=j-1; i>=0; i--) {
//			
//			rev = rev + s.charAt(i);
//			
//			
//		}
//		
//		System.out.print(rev);
//	

		StringBuffer sf = new StringBuffer(s);
		System.out.println(sf.reverse());
	}

}
