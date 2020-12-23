package com.qa.test;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.client.RestClient;

public class GETTestApi extends TestBase{

	public TestBase testBase = new TestBase();
	public String Url;
	String serviceUrl;
	String apiUrl;
	
	public GETTestApi() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void setUp() throws IOException {

		serviceUrl = prop.getProperty("Url");
		apiUrl = prop.getProperty("serviceUrl");
		 Url = serviceUrl+apiUrl;

	}

	@Test
	public void test() throws IOException {

		RestClient restClient = new RestClient();
		restClient.get(Url);
	}

}
