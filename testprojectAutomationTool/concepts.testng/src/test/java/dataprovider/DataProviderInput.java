package dataprovider;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviderInput {
	
	@DataProvider(name="inputData")
	public Object[][] inputData(Method M) {
		
		if(M.getName().equalsIgnoreCase("calculateab")) {
		return new Object[][] {
			{22,23},
			{1,2},
			{3,-3}
		};
		}else {
			
			return new Object[][] {
				{22,23,25},
				{1,2,0},
				{3,-3,3}
			};
		}
		}
	}