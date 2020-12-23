package base;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidElement;
import io.testproject.sdk.drivers.android.AndroidDriver;



public class ScreenBase {
	private static AndroidDriver driver;
	
	public ScreenBase(AndroidDriver driver) {
		this.driver = driver;
	}
	
	public void waitForElement(AndroidElement Locator) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(Locator));
	}

}
