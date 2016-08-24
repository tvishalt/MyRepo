package com.testproject;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.remote.RemoteWebDriver;


import java.net.URL;


public class SampleSauceTest {

	public static final String USERNAME = "lntinfotech";
	public static final String ACCESS_KEY = "e61042c3-ea3c-47cb-bd4f-bd4b3de453cc";

	
	//public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
	public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@localhost:4445/wd/hub";

	public static void main(String[] args) throws Exception {

		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", "Windows XP");
		caps.setCapability("version", "43.0");
		System.out.println(URL);
		//WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		System.setProperty("webdriver.ie.driver", "C:\\Users\\10637055\\Downloads\\IEDriverServer_Win32_2.53.0\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		/**

		 * Goes to Sauce Lab's guinea-pig page and prints title

		 */

		driver.get("https://saucelabs.com/test/guinea-pig");
		//driver.get("http://www.google.com");

		System.out.println("title of page is: " + driver.getTitle());

		driver.quit();

	}

}


