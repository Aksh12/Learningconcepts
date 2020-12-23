package basicJavaCoding;

import java.util.Scanner;

public class GenerateMultiPlicationTable {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("eneter number to get its multiplication table : ");
		
		int num = sc.nextInt();
		int table;
		
		for(int i=1; i<=10; i++) {
			
			System.out.println(num + " x "+ i +" = " + num*i);
			
		}

	}

}
