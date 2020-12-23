package basicJavaCoding;

import java.util.Scanner;

public class CheckLeapYear {

	public static void main(String[] args) {
		
		//leap year = dvisible by 4.
		//for all the century year -- ending with 00; Century year is a Leap year only when it is perfectly divisble by 400
				
		//1900 is not leap year because it is not divisble by 400
		//2012 is a leap year because divisble by 4 and not a century year
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter year in format YYYY");
		int enterYear = sc.nextInt();
		
		if(enterYear%100==0) {
			if(enterYear%400==0 && enterYear%4==0) {
				System.out.println("entered year is Century Leap Year");
			}else {
				System.out.println("entered year is not Leap Year");
			}
		}else {
			if(enterYear%4==0) {
				System.out.println("entered year is a leap year");
			}else {
				System.out.println("entered year is not a leap year");
			}
		}


}
}
