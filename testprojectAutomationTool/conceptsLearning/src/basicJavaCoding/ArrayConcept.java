package basicJavaCoding;

import java.util.Scanner;

public class ArrayConcept {

		public static int i;
		
		public static void main (String[] args) {
		Scanner in=new Scanner (System.in);
        int num[]=new int[4];
        int average=0;
        int i=0;
        int sum=0;

        for (i=0;i<num.length;i++) {
            System.out.println("enter a number");
            num[i]=in.nextInt();
           // sum=sum+num[i];
        }
        
        for(int j =0; j>num.length; j++) {
        
        	 System.out.println( num[i] + " ");
        }
       
    }

	
	}

