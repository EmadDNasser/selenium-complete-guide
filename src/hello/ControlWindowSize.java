package hello;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ControlWindowSize {

	public static void main(String[] args) {

		String chromeKey = "webdriver.chrome.driver";
		String chromePath = "D:\\PC\\chromedriver-win64\\chromedriver.exe";
		System.setProperty(chromeKey, chromePath);
		WebDriver driver = new ChromeDriver();
			
		// Open https://www.facebook.com/
		driver.get("https://www.facebook.com/");
		
		// Maximize the page
		driver.manage().window().maximize();
		
		// Minimize the page
	    driver.manage().window().minimize();
		
		// Full screen
	    driver.manage().window().fullscreen();

	
	}

}
