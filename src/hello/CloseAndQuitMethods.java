package hello;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuitMethods {

	public static void main(String[] args) {

		String chromeKey = "webdriver.chrome.driver";
		String chromePath = "D:\\PC\\chromedriver-win64\\chromedriver.exe";
		System.setProperty(chromeKey, chromePath);
		WebDriver driver = new ChromeDriver();
			
		// Open https://www.facebook.com/
		driver.get("https://www.facebook.com/");
		
		// close the current window.
		driver.close();
		
		// close all windows.
		driver.quit();
		

	}

}
