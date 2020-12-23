//package localRunner;
//
//import java.awt.Point;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import com.google.gson.annotations.Until;
//
//import io.appium.java_client.TouchAction;
//import io.appium.java_client.android.AndroidElement;
//import io.appium.java_client.android.nativekey.AndroidKey;
//import io.appium.java_client.android.nativekey.KeyEvent;
//import io.appium.java_client.functions.ExpectedCondition;
//import io.appium.java_client.touch.LongPressOptions;
//import io.appium.java_client.touch.WaitOptions;
//import io.appium.java_client.touch.offset.ElementOption;
//import io.appium.java_client.touch.offset.PointOption;
//import io.testproject.java.sdk.v2.Runner;
//import io.testproject.java.sdk.v2.drivers.AndroidDriver;
//import io.testproject.java.sdk.v2.enums.BrowserName;
//import io.appium.java_client.MultiTouchAction;
//import io.appium.java_client.TouchAction;
//import io.appium.java_client.android.AndroidElement;
//import org.openqa.selenium.Dimension;
//
//import java.time.Duration;
//
//import static io.appium.java_client.touch.TapOptions.tapOptions;
//import static io.appium.java_client.touch.WaitOptions.waitOptions;
//import static io.appium.java_client.touch.offset.ElementOption.element;
//import static io.appium.java_client.touch.offset.PointOption.point;
//import static java.time.Duration.ofMillis;
//import static java.time.Duration.ofSeconds;
//
//public class LocalRunner {
//
//	public static final String developerToken = "4ieRzR7cfQuQwpHvaZbGoJ7954y5IQT5XXWOvPZYRtA";
//	public static final String deviceUDID = "74ad6a6a";
//	public static String androidPackage = "com.android.launcher3";
//	public static String androidActivity = "com.android.searchlauncher.SearchLauncher";
//	public static Dimension screenSize;
//	public static int startX, startY, endX, endY;
//	public static AndroidDriver driver;
//	public static WebDriverWait wait ;
//
//	public static void main(String[] args) throws InstantiationException, InterruptedException {
//
//		Runner run = Runner.createAndroid(developerToken, deviceUDID, androidPackage, androidActivity);
//		//Runner run1 = Runner.createAndroidWeb(developerToken, deviceUDID,  BrowserName.Chrome);
//		driver = run.getDriver();
//	//	driver = run1.getDriver();
//		driver.setTimeout(3000);
//		 wait =new WebDriverWait(driver, 10);
//		
//		verify_MobileData_ON_OFF_Functionality();
//
//	}
//
//	public static void dragDownNotification() {
//		TouchAction ac1 = new TouchAction(driver);
//		PointOption point = new PointOption();
//		screenSize = driver.manage().window().getSize();
//		System.out.println("Window size is : " + screenSize);
//		startX = (int) (screenSize.width * 0.80);
//		endX = (int) (screenSize.width * 0.80);
//		startY = (int) (screenSize.height / 2);
//		TouchAction vs1 = new TouchAction(driver);
//		TouchAction vs2 = new TouchAction(driver);
//		vs1.press(point(23, endY)).waitAction(waitOptions(ofMillis(1000))).moveTo(point(23, startX)).release()
//				.perform();
//		vs2.press(point(23, endY)).waitAction(waitOptions(ofMillis(1000))).moveTo(point(23, startX)).release()
//				.perform();
//
//	}
//
//	public static void verify_MobileData_ON_OFF_Functionality() throws InterruptedException {
//		
//		int mobiledataCount=0;
//		
//		dragDownNotification();
//		
//		while(mobiledataCount<=10) {
//
//		if(driver.findElements(By.xpath("//android.widget.Switch[@content-desc = \"Mobile data, LTE\"]")).size() > 0 ){
//			
//			driver.findElement(By.xpath("//android.widget.Switch[@content-desc = \"Mobile data, LTE\"]")).click();
//			
//		}else {
//			
//			driver.findElement(By.xpath("//android.widget.Switch[@content-desc=\"Mobile data, Mobile data off\"]")).click();  
//			
//		}
//		mobiledataCount++;
//		System.out.println("count : " + mobiledataCount);
//		
//		if(mobiledataCount==10) {
//			if(driver.findElements(By.xpath("//android.widget.Switch[@content-desc=\"Mobile data, LTE\"]")).size()>0) {
//			driver.pressKey(new KeyEvent(AndroidKey.HOME));
//			driver.pressKey(new KeyEvent(AndroidKey.HOME));
//			try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			TouchAction vs2 = new TouchAction(driver);
//			vs2.tap(point(679,1534)).perform().release();
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			driver.findElement(By.id("com.android.chrome:id/url_bar")).sendKeys("www.gmail.com");
//		//	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(driver.findElement(By.id("com.android.chrome:id/url_bar")).sendKeys("www.gmail.com")))
//			
//			try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			driver.pressKey(new KeyEvent(AndroidKey.ENTER));
//		
//			
//			driver.findElement(By.xpath("//android.view.View[@text=\"Sign in\"]")).getText().equals("Sign in");
//			System.out.println("Mobile data is ON Sign In is displayed");
//		break;
//			}else {
//				driver.pressKey(new KeyEvent(AndroidKey.HOME));
//				driver.pressKey(new KeyEvent(AndroidKey.HOME));
//				TouchAction vs2 = new TouchAction(driver);
//				vs2.tap(point(679,1534)).perform().release();
//				driver.findElement(By.id("com.android.chrome:id/url_bar")).sendKeys("www.gmail.com");
//				driver.pressKey(new KeyEvent(AndroidKey.NUMPAD_ENTER));
//				if(driver.findElements(By.xpath("//android.widget.TextView[@text=\"No Internet Connection\"]")).size() > 0 || (driver.findElements(By.xpath("//android.view.View[@text=\"No Internet\"]")).size() > 0)){ 
//					System.out.println("Mobile data is OFF");
//			}else {
//				System.out.println("cant execute");
//			}
//		}
//		
//		}
//		
//
//		
//	}
//
//
//}
//}
