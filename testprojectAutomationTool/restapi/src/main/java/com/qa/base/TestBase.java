package com.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.util.Properties;

public class TestBase {
	
	public Properties prop = new Properties();
	
	public TestBase() throws IOException {
		
		FileInputStream	fis = new FileInputStream("D:\\2.Learning_Paths\\eclipse-workspace\\testprojectAutomationTool\\restapi\\src\\main\\java\\com\\qa\\configuration\\config.properties");
		prop.load(fis);
		
	//	uri = System.setProperty(uri, prop.getProperty("Url"+"serviceUrl"))
		
	}

}
