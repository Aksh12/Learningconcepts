package basicJavaCoding;

public class NaturalNumbersUsingRecursion {

	
	public static void main(String[] args) {
		
		System.out.println(addNumbers(2));
		
		

	}
	
	public static int addNumbers(int num) {
		
		if(num!=0) {
			
			return num = num + addNumbers(num-1);
		}else {
			return 0;
		}
		
	}

}
