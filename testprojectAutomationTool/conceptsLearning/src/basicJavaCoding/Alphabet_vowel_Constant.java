package basicJavaCoding;

import java.util.Scanner;

public class Alphabet_vowel_Constant {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Eneter a Alphabet : ");
		
		String Alphabet = sc.nextLine();
		
		switch(Alphabet) {
		
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
			System.out.println("Entered Alphabet is : " + Alphabet + " : Vowel");
		break;
		
		default:
			System.out.println("Entered Alphabet is : " + Alphabet + " : constant");
		}
		
	}
}
