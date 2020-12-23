package dsandalgorithm;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of input");
		int T = sc.nextInt();
		int count=0;
		int X=T;
		String result="";
		String S[] = new String[T];
		
		if(T>=1 || T<=100) {
		for(int i=0; i<T; i++) {
			S[i]=sc.next();
		}
		}else {
			System.out.println("Number of Input should be >= 1");
		}
		while(T!=0) {
		if(S[count].length()>=3 && S[count].length()<=1000) {
			for(int i=S[count].length()-1; i>=0; i--) {
			result=result+(S[count].charAt(i));
			}
			
			count++;
			T--;
		}else {
			System.out.println("Numbe of string should be more or equal to 3");
			count++;
			T--;
		}
		System.out.println(result);
		result="";
		}
		
		
	}
}