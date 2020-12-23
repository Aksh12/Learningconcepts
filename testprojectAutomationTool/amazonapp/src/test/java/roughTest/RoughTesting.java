package roughTest;

import java.io.IOException;

import commonUtils.AppiumServer;
import commonUtils.CommonUtility;
import io.appium.java_client.android.AndroidDriver;
import testBase.TestBase;

public class RoughTesting {
	public static AndroidDriver driver;

	public static void main(String[] args) throws IOException {

		String abc_x="10";
		String abc_y="20";
		String abc_z="30";

	print_String(abc_x);

		}
	
	
	public static void print_String(String text) {
	
		
	}
	}


//if(driver != null) {
//AppiumServer.stop();
//}else {
//
//System.out.println("here");
//
//System.out.println("1");
//AppiumServer.start();
//System.out.println("2");
//CommonUtility.loadConfig("amazonapp_Android.properties");
//System.out.println("3");
//CommonUtility.loadCapabilities();
//System.out.println("4");
//driver=CommonUtility.getDriver();
//System.out.println("5");
//
//driver.quit();
//AppiumServer.stop();
//System.out.println("6");
