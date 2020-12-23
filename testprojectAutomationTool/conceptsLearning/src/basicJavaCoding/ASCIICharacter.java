package basicJavaCoding;

import java.util.Scanner;

public class ASCIICharacter {
	public static void main(String[] args) {
	
		Scanner sc  = new Scanner(System.in);

		System.out.println("enter any character");
		String ascii = sc.next();
		char c = ascii.charAt(0);
		int asciinumber = (int)c;
		System.out.println("Character entered : " + c);
		System.out.println("ASCII for entered character : " + ascii + ": is = " + asciinumber);
		
	}

}
