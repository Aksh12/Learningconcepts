package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Asser_Test1 {
	
	@Test
	public void testNumber() {
	//	Assert.assertTrue(numberGreater(4, 3), "Number x is smaller than y");
		Assert.assertEquals(numberGreater(4, 3), true);
	}
	
	public boolean numberGreater(int x, int y) {
	
		boolean result;
		
		if(x>y) {
			result = true;
		}else {
			result = false;
		}
		
		return result;
	}

}
