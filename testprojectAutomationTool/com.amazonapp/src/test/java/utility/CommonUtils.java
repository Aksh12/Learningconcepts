package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.apache.tools.ant.taskdefs.optional.PropertyFile;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class CommonUtils {

	private static AndroidDriver driver;
	private static String APP_PACKAGE;
	private static String APP_ACTIVITY;
	private static String APPIUM_PORT_NUMBER;
	private static String DEVICE_NAME;
	private static String DEVICE_VERSION;
	private static String PLATFOTM_VERSION;
	private static int IMPLICIT_WAIT;
	private static int EXPLICIT_WAIT;
	private static URL serverURL;
	private static DesiredCapabilities capabilities = new DesiredCapabilities();
	private static Properties prop = new Properties();
	
	public static void loadProperties(String propertiesFileName) throws IOException {
		
		FileInputStream fis = new FileInputStream(propertiesFileName);
		prop.load(fis);
		DEVICE_NAME=prop.getProperty("deviceName");
		DEVICE_VERSION=prop.getProperty("deviceVersion");
		PLATFOTM_VERSION=prop.getProperty("platformVersion");
		APP_PACKAGE=prop.getProperty("appPackage");
		APP_ACTIVITY=prop.getProperty("appActivity");
		APPIUM_PORT_NUMBER=prop.getProperty("appium_port_number");
		IMPLICIT_WAIT=Integer.parseInt(prop.getProperty("implicit.Wait"));
		EXPLICIT_WAIT=Integer.parseInt(prop.getProperty("explicit.wait"));
	}
	
	public static void loadCapabilities() {
		
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, DEVICE_NAME);
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, PLATFOTM_VERSION);
		capabilities.setCapability("appPackage", APP_PACKAGE);
		capabilities.setCapability("appActivity", APP_ACTIVITY);
		
	}
	
	public static AndroidDriver getDriver() throws IOException {
		
		serverURL=new URL("http://0.0.0.0:"+prop.getProperty(APPIUM_PORT_NUMBER)+"wd/hub");
		driver=new AndroidDriver(serverURL,capabilities);
		return driver;
	}
	
}
