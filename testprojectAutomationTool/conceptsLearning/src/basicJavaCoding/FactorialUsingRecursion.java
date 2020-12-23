package basicJavaCoding;

public class FactorialUsingRecursion {
	static int temp = 1;
	public static void main(String[] args) {
		
		System.out.println(findFactrial(5));
	
	}
	
	//calling the same method within the method and decreasing the value.
	
	public static int findFactrial(int num) {

		
		if(num>=1) {
			
			//System.out.println(num);
			return num = num * findFactrial(num-1);
			
		}else {
			
			return 1;
		}
	}

}
