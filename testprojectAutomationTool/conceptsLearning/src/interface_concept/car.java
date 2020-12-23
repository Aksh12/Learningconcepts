package interface_concept;

public interface car {

	//Always define only abstract methods
	//Only final and static variables can be defined
	
	int Wheels = 4;//by default it is final and static

	public void start();
	public void stop();
	public void fuel();
	
	
	
	 static void typeOfEngine() {
		
	}
	
}
