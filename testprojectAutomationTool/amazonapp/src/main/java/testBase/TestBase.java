package testBase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonUtils.AppiumServer;
import commonUtils.CommonUtility;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TestBase {

public static AndroidDriver driver;
public static WebDriverWait wait;
	
	public static void setUp() throws IOException {
		AppiumServer.start();
		CommonUtility.loadConfig("amazonapp_Android.properties");
		CommonUtility.loadCapabilities();
		driver=CommonUtility.getDriver();	
	}
	
	
	public static void tearDown() {
		driver.quit();
		AppiumServer.stop();
	}
	
	public static void waitForElement(String locator, String elementType) {
		
		switch(elementType) {
		
		case "XPATH":
			wait = new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
		break;
		
		case "ID":
			wait = new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
		break;
		
		case "CLASSNAME":
			wait = new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(locator)));
		break;
		
		default:
		System.out.println("Element type mentioned is wrong");	
		
		}
		
	
		
	}

	
//	public static void waitForElement(String locator) {
//		String loc = locator;
//		switch(loc) {
//	\
//		
//		}
//		
//		wait = new WebDriverWait(driver,20);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
//	}
	
	

	
}
