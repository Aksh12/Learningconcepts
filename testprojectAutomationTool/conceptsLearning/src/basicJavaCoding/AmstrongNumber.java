package basicJavaCoding;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number to check if it is Amstrong");
		int num = sc.nextInt();
		int input=num;
		int temp;
		int sum=0;
		int amstrong=0;
		//153 = 1^3 + 5^3 + 3^3 = 153
	
		while(num != 0 ) {
			temp=num%10;//3//5//1
			sum=amstrong+temp*temp*temp;//27+5*5*5+1*1*1
			amstrong=sum;//27//152//153
			num=num/10;//15//1//0
		}
		
		if(input==amstrong) {
			System.out.println("entered number is amstong");
		}else {
			System.out.println("entered number is not an amstrong");
		}

	}

}
