package base;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.testproject.sdk.drivers.android.AndroidDriver;
import io.testproject.sdk.internal.exceptions.AgentConnectException;
import io.testproject.sdk.internal.exceptions.InvalidTokenException;
import io.testproject.sdk.internal.exceptions.ObsoleteVersionException;
import utilities.AppiumServer;
import utilities.CommonUtils;

public class TestBase {
	
	private static AndroidDriver driver;

	
	@BeforeTest
	public void setUp() throws IOException, AgentConnectException, InvalidTokenException, ObsoleteVersionException {
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
