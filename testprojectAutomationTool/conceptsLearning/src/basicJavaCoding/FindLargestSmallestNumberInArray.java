package basicJavaCoding;

import java.util.HashSet;
import java.util.Set;

public class FindLargestSmallestNumberInArray {

	public static void main(String[] args) {
		
		int numbers[] = {24,24};
		int largest = numbers[0];
		int smallest = numbers[0];
		boolean flag=false;
		
		//Set<Integer> num = new HashSet<Integer>();
		
		for(int i=1; i<numbers.length; i++) {
			if(numbers[i]>largest) {
				largest=numbers[i];
			} if(numbers[i]<smallest) {
				smallest=numbers[i];
			}
		}
		
		System.out.println("largest : " + largest);
		System.out.println("Smallest : " + smallest);
		
		
//		if(flag==true) {
//			System.out.println("largest : " + largest);
//		}else {
//			System.out.println("Smallest : " + smallest);
//		}
		
		String s = "this is akshahy";
		System.out.println(s.indexOf('h', s.indexOf('h')+1));
	//	System.out.println(s.charAt(13));
		StringBuffer sb = new StringBuffer(s);
		
		System.out.println(sb.reverse());

	}

}
