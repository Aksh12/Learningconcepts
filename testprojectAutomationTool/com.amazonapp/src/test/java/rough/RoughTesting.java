package rough;

import java.io.IOException;

import utility.AppiumServer;
import utility.CommonUtils;

public class RoughTesting {

	public static void main(String[] args) throws IOException {
		CommonUtils.loadProperties(System.getProperty("user.dir")+"//src//test/resources//properties//Amazon.properties");
		//System.out.println(CommonUtils.DEVICE_NAME);
		AppiumServer.start();
		System.out.println("once started");
		AppiumServer.stop();

	}

}
