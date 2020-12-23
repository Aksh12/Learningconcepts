package com.qa.client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class RestClient {
	
	//1. get method
	
	public void get(String url) throws IOException {
		
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet(url);
		CloseableHttpResponse closableHttpResponse =  httpClient.execute(httpGet);
		
		//1. Hit the api using execute method and get the reponse object>> get status code, jason string and all headers
		
		//1.Status code
		int statusCode = closableHttpResponse.getStatusLine().getStatusCode();
		System.out.println("Status code : " + statusCode);
		
		String response = EntityUtils.toString(closableHttpResponse.getEntity(), "UTF-8").toString();
		System.out.println("Response  = " + response);
		
		//2.Jason string
		JSONObject responseJson = new JSONObject(response);
		System.out.println("Response jason from api : " + responseJson);
		
		Header[] headerArray = closableHttpResponse.getAllHeaders();
		
		HashMap<String, String> allHeader = new HashMap<String, String>();
		for(Header header : headerArray) {
			
			allHeader.put(header.getName(), header.getValue());
			
		}
		
		//3.All header
		
		System.out.println("header Arrays : " + allHeader);
	}

}
