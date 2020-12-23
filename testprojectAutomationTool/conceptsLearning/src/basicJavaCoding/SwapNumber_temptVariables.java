package basicJavaCoding;

import java.util.Scanner;

public class SwapNumber_temptVariables {

	public static void main(String[] args) {
		int temp =0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value a : ");
		int a = sc.nextInt();
		
		System.out.print("Enter value b : ");
		int b = sc.nextInt();
		
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("After swap a : " + a);
		System.out.println("After swap b : " + b);

		

	}

}
