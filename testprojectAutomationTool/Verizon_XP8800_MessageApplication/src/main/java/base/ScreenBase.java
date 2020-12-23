package base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import io.testproject.java.sdk.v2.drivers.AndroidDriver;

public class ScreenBase {
	
	public static AndroidDriver  driver ;
	//public static WebDriverWait wait;
	
	public ScreenBase(AndroidDriver  driver) {
		this.driver=driver;
	}
	
	public static void hideKeyboard() {
		driver.hideKeyboard();
	}
	
	public static void enter() {
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
	}
	
	public static void back() {
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
	}
	
	public static void longPressElement(AndroidElement element) {
		TouchAction press = new TouchAction(driver);
		press.longPress(element(element)).perform().release();
	}
	
	public static ElementOption element(AndroidElement element) {
		
		return new ElementOption().withElement(element);
	}

}
