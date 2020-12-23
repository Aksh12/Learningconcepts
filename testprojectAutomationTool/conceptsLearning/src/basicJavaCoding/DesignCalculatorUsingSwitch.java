package basicJavaCoding;

import java.util.Scanner;

public class DesignCalculatorUsingSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number a ");
		int a = sc.nextInt();
		System.out.println("enter number b n");
		int b = sc.nextInt();
		//String [] operand = {"*X", "/" , "-", "+"};
		System.out.println("enter Operator");
		char c= sc.next().charAt(0);
		
				
		
		switch(c) {
		
		case '*' :
			System.out.println(a*b);
		break;
		
		case '+' :
			System.out.println(a+b);
		break;
		
		case '/' :
			System.out.println(a/b);
		break;
			
		case '-' :
			System.out.println(a-b);
		break;
		
		default :
			System.out.println("Operator is not correct");
		}
		

	}

}
