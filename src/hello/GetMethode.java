package hello;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethode {

	public static void main(String[] args) {

		String chromeKey = "webdriver.chrome.driver";
		String chromePath = "D:\\PC\\chromedriver-win64\\chromedriver.exe";
		System.setProperty(chromeKey, chromePath);
		WebDriver driver = new ChromeDriver();
		
		// Open https://www.facebook.com/
		driver.get("https://www.facebook.com/");
		
		// Get the current URL
		System.out.println(driver.getCurrentUrl());
		
		// Get page title
		System.out.println(driver.getTitle());
		
		// Get page source
		System.out.println(driver.getPageSource());
		
		System.out.println("Hello World");
	}

}
