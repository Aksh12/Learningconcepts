package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class CommonUtitlities {

	public static AndroidDriver driver;
	public static long IMPLICIT_WAIT;
	private static String DEVICE_NAME;
	private static String PLATFORM_NAME;
	private static String PLATFORM_VERSION;
	private static String APP_PACKAGE;
	private static String APP_ACTIVITY;
	private static String APPIUM_PORT_NUMBER;
	//private static String ACCESS_KEY_SAUCE;
	//private static String USERNAME_SAUCE;
	public static URL serverUrl;
	public static DesiredCapabilities capabilities = new DesiredCapabilities();
	//public static MutableCapabilities sauceOptions = new MutableCapabilities();


	public static void loadConfig(String fileName ) throws IOException {

		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/properties/"+fileName);
		Properties pro = new Properties();
		pro.load(fis);

		IMPLICIT_WAIT = (long)Integer.parseInt(pro.getProperty("implicit.wait"));
		DEVICE_NAME = pro.getProperty("device.name");
		PLATFORM_NAME = pro.getProperty("platform.name");
		PLATFORM_VERSION = pro.getProperty("platform.version");
		APP_PACKAGE = pro.getProperty("base.pkg");
		APP_ACTIVITY = pro.getProperty("activity.pkg");
	//	ACCESS_KEY_SAUCE = pro.getProperty("access.key");
	//	USERNAME_SAUCE = pro.getProperty("user.name");
		APPIUM_PORT_NUMBER = pro.getProperty("appium.port.number");

	}

	public static void loadCapabilities() {


		//		sauceOptions.setCapability(MobileCapabilityType.DEVICE_NAME, DEVICE_NAME);
		//		sauceOptions.setCapability(MobileCapabilityType.PLATFORM_VERSION, PLATFORM_VERSION);
		//		sauceOptions.setCapability(MobileCapabilityType.PLATFORM_NAME, PLATFORM_NAME);
		//		sauceOptions.setCapability("appPackage", APP_PACKAGE);
		//		sauceOptions.setCapability("appActivity", APP_ACTIVITY);
		//		capabilities.setCapability("username", USERNAME_SAUCE);
		//		capabilities.setCapability("accessKey", ACCESS_KEY_SAUCE);
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, DEVICE_NAME);
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, PLATFORM_VERSION);
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, PLATFORM_NAME);
		capabilities.setCapability("appPackage", APP_PACKAGE);
		capabilities.setCapability("appActivity", APP_ACTIVITY);


	}

	public static AndroidDriver getDriver() throws IOException {

		serverUrl=new URL("http://0.0.0.0:"+APPIUM_PORT_NUMBER+"/wd/hub");
		System.out.println("---------am in d1------------");
		driver=new AndroidDriver(serverUrl,capabilities);
		System.out.println("---------am in d2-----");
		//driver=  new AndroidDriver(new URL("https://" + USERNAME_SAUCE + ":" + "ACCESS_KEY_SAUCE + ondemand.us-west-1.saucelabs.com:443/wd/hub"),capabilities);
		driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
		return driver;

	}

}