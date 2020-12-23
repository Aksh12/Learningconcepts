package base;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;
import utility.AppiumServer;
import utility.CommonUtils;

public class TestBase {

	private static AndroidDriver driver;
	
	@BeforeTest
	public void setup() throws IOException {
		
		AppiumServer.start();
		CommonUtils.loadProperties(System.getProperty("user.dir")+"//src//test/resources//properties//Amazon.properties");
		CommonUtils.loadCapabilities();
		driver = CommonUtils.getDriver();
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
		AppiumServer.stop();
	}
}
