package base;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;
import utilities.AppiumServer;
import utilities.CommonUtils;

public class TestBase {
	
	private static AndroidDriver driver;

	
	@BeforeTest
	public void setUp() throws IOException {
		System.out.println("1");
		AppiumServer.start();
		System.out.println("2");
		CommonUtils.loadConfig("fittr_app.properties");
		CommonUtils.loadCapabilities();
		driver = CommonUtils.getDriver();
		System.out.println("loaded");
		
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.quit();
		AppiumServer.stop();
		System.out.println("Stopped");
		
	}

}
