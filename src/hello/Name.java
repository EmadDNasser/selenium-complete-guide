package hello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String chromeKey = "webdriver.chrome.driver";
		String chromePath = "D:\\PC\\chromedriver-win64\\chromedriver.exe";
		System.setProperty(chromeKey, chromePath);
		WebDriver driver = new ChromeDriver();
			
		// Open https://www.facebook.com/
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("email")).sendKeys("emad@example.com");
		driver.findElement(By.name("pass")).sendKeys("testtest");
		
	}

}
