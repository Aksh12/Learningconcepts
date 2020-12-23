package basicJavaCoding;

import java.util.Scanner;

public class CountTherepeatedWords {

	public static void main(String[] args) {

		String a = "Hello am akshay soni hyderabad hyderabad hyderabad hyderabad abad"; //sc.next();
		int count = 1;
		int counter=0;
		String x="";
		String[] b = a.split(" ");
		boolean flag=false;
		
		for(int i=0; i<= b.length; i++) {
			for(int j=i+1; j<b.length; j++) {
				 System.out.println("b[i] : " + b[i] + " b[j] : " + b[j]);
			if(b[i].equals(b[j])){
				System.out.println("in if");
				 x = b[i];
				 flag=true;
				counter=count++;
				
			}
			}
			
			
		}
		
		if(flag) {
			System.out.println(x + " word is repeated : " + counter +  " times" );
		}else {
			System.out.println("No word is repeated");
		}
		
		
	}

}


