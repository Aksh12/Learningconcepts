package basicJavaCoding;

public class Recurssion_ApowerB {

	public static void main(String[] args) {
		
		System.out.println(power(8, 3));
	}
	
	public static int power(int a , int b) {
		
		if(b == 0) {
			return 1;
		}else {
			
			return a * power(a , b-1);
		}
		
	}

}