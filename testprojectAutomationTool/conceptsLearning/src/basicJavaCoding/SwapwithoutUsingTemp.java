package basicJavaCoding;

public class SwapwithoutUsingTemp {

	public static void main(String[] args) {
		
		int a = 22;
		int b = 23;
	
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		
//		System.out.println("a : " + a);
//		System.out.println("b : " + b);
		
//		a=a*b;
//		b=a/b;
//		a=a/b;
//		
//		System.out.println("a : " + a);
//		System.out.println("b : " + b);


		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		String x = "hello";
		String y = "world";
		
		x=x+y;
		System.out.println("x : " +x);
		System.out.println("x.length : " + x.length());
		System.out.println("y.length : " + y.length());
		y=x.substring(0, x.length()-y.length());
		System.out.println("y : " +y);
		System.out.println("y.lengths : " + y.length());
		x=x.substring(y.length());
		
		System.out.println("x : " + x);
		System.out.println("y: " + y);
		
	}

}
