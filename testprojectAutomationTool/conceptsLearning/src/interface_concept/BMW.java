package interface_concept;

public class BMW implements car{

	@Override
	public void start() {
		System.out.println("BMW--start");
		
	}

	@Override
	public void stop() {
		System.out.println("BMW--stop");
		
	}

	@Override
	public void fuel() {
		System.out.println("BMW--fuel");
		
	}
	

	public void Key() {
		System.out.println("BMW--key");
		
	}

}
