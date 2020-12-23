package basicJavaCoding;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Character_AlphabetOrNot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character");
		
		char c = sc.next().charAt(0);
		
		if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'a')) {
			System.out.println("Entered character is an Alphabet");
		}else {
			
			System.out.println("entered character is not an Alphabet");
		}
}
}