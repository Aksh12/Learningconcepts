package rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class TestPropertyFile {
	private static int IMPLICIT_WAIT;
	private static URL serverUrl;
	private static String APPIUM_PORT_NUMBER;
	
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\fittr_app.properties");
		Properties pro = new Properties();
		pro.load(fis);
		
		IMPLICIT_WAIT = Integer.parseInt(pro.getProperty("explicit.wait"));
		System.out.println(IMPLICIT_WAIT);
		APPIUM_PORT_NUMBER = pro.getProperty("appium.port");
		
		
		String x ="https://0.0.0.0:"+APPIUM_PORT_NUMBER+"/wd/hub";
		System.out.println("x : " + x);
		

	}

}
