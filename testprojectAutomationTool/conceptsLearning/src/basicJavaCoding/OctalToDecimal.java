package basicJavaCoding;

import java.util.Scanner;

public class OctalToDecimal {

	public static void main(String[] args) {
		// 165 =  1*8^2+6*8^1+5*8^0=
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to get its octale");
		
		int num = sc.nextInt();
		int dec;
		int result=0;
		int count=0;
		int temp=1;
		
		while(num != 0) {
			dec=num%10;
			temp=(int) Math.pow(8, count);
			result=result+temp*dec;
			
//			if(count == 0) {
//				result = result+dec*1;
//			}else {
//				temp=1;
//				
//				for(int i=1; i<=count; i++) {
//				temp = temp*8;
//				}
//				result=result+(temp*dec);
//			}
			count++;
			num=num/10;
//			
		}
		
		System.out.println("result : " + result);

	}
	
	

}
