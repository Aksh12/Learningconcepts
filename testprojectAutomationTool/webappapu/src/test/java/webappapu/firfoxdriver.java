package webappapu;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class firfoxdriver {
	
	static HashMap<String, String> logindata()
	 {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("x", "akshaysoni36@yahoo.com_4arclr26@");
		hm.put("y", "akshaysoni@yahoo.com_4arclr26");
		return hm;
	}
	

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\2.Learning_Paths\\eclipse-workspace\\testprojectAutomationTool\\webappapu\\src\\test\\resources\\firefox\\geckodriver.exe" );  
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();  
		WebDriver driver= new FirefoxDriver(capabilities);  
		capabilities.setCapability("marionette",true);  
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.navigate().to("https://login.yahoo.com/?.src=ym&.lang=en-US&.intl=us&.done=https%3A%2F%2Flocalhost%3A4080%2Fd");

		
		String [] data = firfoxdriver.logindata().get("y").split("_");
		System.out.println(data[0]);
		System.out.println(data[1]);
		
		
		driver.findElement(By.id("login-username")).sendKeys(data[0]);
		driver.findElement(By.id("login-signin")).click();
		driver.findElement(By.id("login-passwd")).sendKeys(data[1]);
		driver.findElement(By.id("login-signin")).click();
		
		List<WebElement> l1 = driver.findElements(By.className("rtlI_dz_sSg"));
		
		Iterator<WebElement> l = l1.iterator();
		while(l.hasNext()) {
			System.out.println(l.next().getAttribute("data-test-folder-name").equals("Inbox"));
			System.out.println("pass");
			break;
		}
		
		
		//driver.findElement(By.id("")).click();
//		if(driver.findElement(By.linkText("/d/compose/")).isDisplayed()){
//         System.out.println("Pass");
//         
//		}else {
//			System.out.println("Fail");
//		}

	}

}