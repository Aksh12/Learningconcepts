package basicJavaCoding;

import java.util.Scanner;

public class SwapNumber_withoutTempVaraible {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value a : ");
		int a = sc.nextInt();
		
		System.out.print("Enter value b : ");
		int b = sc.nextInt();
		//5,10
		a = a-b; //-5
		b = a+b; // 5
		a = b-a; // 5+5
		
		System.out.println("After swap a : " + a);
		System.out.println("After swap b : " + b);
	}

}
