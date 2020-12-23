package com.techm.testamazon;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBys;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class TestRoughClass {
	
	public static AndroidDriver<AndroidElement> driver;
	public DesiredCapabilities caps = new DesiredCapabilities();
	
	
	@BeforeTest
	public void setUp() throws IOException {
		
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "Android");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
		caps.setCapability("appPackage", "in.amazon.mShop.android.shopping");
		caps.setCapability("appActivity", "com.amazon.mShop.android.home.HomeActivity");
		//caps.setCapability(, value);
		
		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
		
	}
	
	@Test
	public void test() {
//		@AndroidFindBys{
//			(id=""),
//			(id="")
//			}
		
		AndroidElement pName;
		driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"Continue in English\"]").click();
		driver.findElementById("in.amazon.mShop.android.shopping:id/skip_sign_in_button").click();
		//driver.findElementById("in.amazon.mShop.android.shopping:id/rs_search_src_text").click();
	
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText[@text=\"Search\"]"))).click();
		//driver.findElementByXPath("//android.widget.EditText[@text=\"Search\"]").click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.EditText"))).sendKeys("1 KG Almonds");
		
	
		//driver.findElementByClassName("android.widget.EditText").sendKeys("1 KG Almonds");
		List <AndroidElement> list = driver.findElementsById("in.amazon.mShop.android.shopping:id/iss_search_dropdown_item_text");
		System.out.println(1);
		int size=list.size();
		System.out.println("size : " + size );
		
		for(int i=0; i<=size; i++) {
			System.out.println("text is : " + list.get(i).getText());
			if(list.get(i).getText().contains("almonds")) {
				list.get(i).click();
				break;
			}
		}
			
		
		scrollUp(1, driver);
		
		List<AndroidElement> exlist =driver.findElementsByClassName("android.view.View");
		
		for(int i=0; i<=exlist.size(); i++) {
			if(exlist.get(i).getText().contains("Almond")){
				exlist.get(i).click();
				System.out.println("am inside click");
				break;
			}else {
			
		}
		}
		
		if(driver.findElementById("in.amazon.mShop.android.shopping:id/loc_ux_gps_auto_detect").isDisplayed()){
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View\r\n" + 
					""))).isDisplayed();
			String bigXpath = driver.findElementByXPath(("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View\r\n" + 
					"")).getText();
			
			System.out.println("bigxpath : " + bigXpath);
		}else {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View\r\n" + 
					""))).isDisplayed();
			String bigXpath = driver.findElementByXPath(("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View\r\n" + 
					"")).getText();
			
			System.out.println("bigxpath : " + bigXpath);
		}
		
//		String expected = driver.findElementByClassName("android.view.View").getText();
//		System.out.println(3);
//		System.out.println("expected is : " + expected);
//		if(expected.contains("Almond")) {
//			driver.findElementByClassName("android.view.View").click();
//		}else {
//			System.out.println("nothing found here");
//		}
		

	//	TouchAction press = new TouchAction(driver);
	//	press.press(new PointOption().withCoordinates(3,3)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).moveTo(new PointOption().withCoordinates(3, 3)).release();
	
	
	}
	
	@AfterTest
	public void afterTest() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.quit();
		//if(driver.findElementById("in.amazon.mShop.android.shopping:id/loc_ux_gps_auto_detect").isDisplayed()){
				//	((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.BACK));
				//}else {
	}
	

	public static void scrollDown(int howManySwipes,AndroidDriver driver) {
		org.openqa.selenium.Dimension size = driver.manage().window().getSize();
		// calculate coordinates for vertical swipe
		int startVerticalY = (int) (size.height * 0.8);
		int endVerticalY = (int) (size.height * 0.21);
		int startVerticalX = (int) (size.width / 2.1);
		  try {
		      for (int i = 1; i <= howManySwipes; i++) {
						new TouchAction(driver).press(PointOption.point(startVerticalX, endVerticalY))
								.waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).moveTo(PointOption.point(startVerticalX, startVerticalY)).release()
								.perform();
					}
				} catch (Exception e) {
					//print error or something
				}
	}
	
	public static void scrollUp(int howManySwipes,AndroidDriver driver) {
		org.openqa.selenium.Dimension size = driver.manage().window().getSize();
		// calculate coordinates for vertical swipe
		int startVerticalY = (int) (size.height * 0.8);
		int endVerticalY = (int) (size.height * 0.21);
		int startVerticalX = (int) (size.width / 2.1);
		  try {
		      for (int i = 1; i <= howManySwipes; i++) {
						new TouchAction(driver).press(PointOption.point(startVerticalX, startVerticalY))
								.waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).moveTo(PointOption.point(startVerticalX, endVerticalY)).release()
								.perform();
					}
				} catch (Exception e) {
					//print error or something
				}
	}

}
