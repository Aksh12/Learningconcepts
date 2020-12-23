package dsandalgorithm;

public class MinAndMaxArray {

	public static void main(String[] args) {
		int a [] = {-1,22,3,4,5,6};
		
		int min=a[0];
		int max=a[0];
		
		for(int i=1; i<=a.length-1; i++) {
			if(a[i]>max) {
				max=a[i];
			}else if(a[i]<min) {
				min=a[i];
			}
			
		}
		System.out.println("min : " + min);
		System.out.println("max : " + max);
	//	System.out.println(middle(1,909,100));
		
	}
	
//	public static int middle(int A, int B, int C) {
//		
//		 if (A < B) {
//			 
//			 if(B<C) {
//				 return B;
//			 }else {
//				 return C;
//			 }
//		 }else {
//
		    
	

}
