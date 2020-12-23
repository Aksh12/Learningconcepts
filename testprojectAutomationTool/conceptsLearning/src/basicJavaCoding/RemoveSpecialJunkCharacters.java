package basicJavaCoding;

import java.util.Scanner;

public class RemoveSpecialJunkCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string with special juncharacters");
		String s = "%^%^%this ^&*^&^ akshaysoni1234*(*(*";//sc.next();// ###this is akshay#@*#*
		
		int len = s.length();
		
		s = s.replaceAll("[^A-Za-z0-9]", " ");
		System.out.println(s);

	}

}
