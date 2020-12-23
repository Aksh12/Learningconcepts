package basicJavaCoding;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,7,8,9,10};
		int sum=0;
		int expected=0;
		for(int i=0; i<=a.length-1; i++) {
			 sum = sum+a[i];
			 
		}
		System.out.println("Sum of given Array : " + sum);
		
		for(int j=1; j<=10; j++) {
			
			expected=expected+j;
			
		}
		System.out.println("Expected : " + expected);
		
		if(expected != sum) {
			
			System.out.println("Missing number is : " + (expected-sum));
			
		}
		
		}
		

	}

//int a[] = {1,2,3,4,6,8,9};
//
//int b1 = a[0]%10;
//
//int count = 1;
//
//for(int i=1; i<=a.length-1; i++) {
//	
//	int b2=a[i]%10;
//	if((b1+count) != b2) {
//		System.out.println("missing number is : " + (b1+count));
//		count++;
//	}else {
//	 System.out.println("Number is order are : " + b2);
//	}
//	count++;