package interface_concept;

public class TestCar {

	public static void main(String[] args) {
		BMW bm = new BMW();
		bm.fuel();
		bm.start();
		bm.stop();
		bm.Key();

		    car c = new BMW(); //Dynamic polymorphism or over casting.
		    c.fuel();
		    c.start();
		    c.stop();
		    
	}

}
