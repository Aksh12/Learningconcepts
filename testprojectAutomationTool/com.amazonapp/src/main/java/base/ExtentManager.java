package base;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
	
	private static ExtentReports extent;
	public static String screenShotName;
	
	public static ExtentReports createInstances(String fileName) {
		ExtentSparkReporter htmlReporter = new ExtentSparkReporter(fileName);
		
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setDocumentTitle(fileName);
		htmlReporter.config().setReportName(fileName);
		htmlReporter.config().setTheme(Theme.STANDARD);
		
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Automation Tester", "Akshay Soni");
		extent.setSystemInfo("Build Info", "Android 10");
	
		return extent;
		
	}
	
	public static void takeScreenShot() {
		
		File srcFile = ((TakesScreenshot)ScreenBase.driver).getScreenshotAs(OutputType.FILE);
		Date date = new Date();
		screenShotName = date.toString().replace(" ", "_").replace(":", "_") + ".jpg";
		
		try {
			FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir")+"//src//test//resources//reports//"+screenShotName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
