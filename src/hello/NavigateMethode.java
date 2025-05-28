package hello;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethode {
	
	public static void main(String[] args) {

		String chromeKey = "webdriver.chrome.driver";
		String chromePath = "D:\\PC\\chromedriver-win64\\chromedriver.exe";
		System.setProperty(chromeKey, chromePath);
		WebDriver driver = new ChromeDriver();
		
		// Open https://www.facebook.com/
		driver.get("https://www.facebook.com/");
		
		// Navigate to
		driver.navigate().to("https://www.google.com");
		
		// Navigate back
		driver.navigate().back();
		
		// Navigate refresh
		driver.navigate().refresh(); 
		
		// Navigate forward
		driver.navigate().forward(); 
				
		
		System.out.println("Hello World");
	}

}
