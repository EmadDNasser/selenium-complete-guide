package hello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class webElement {

	public static void main(String[] args) {
		

		
		String chromeKey = "webdriver.chrome.driver";
		String chromePath = "D:\\PC\\chromedriver-win64\\chromedriver.exe";
		System.setProperty(chromeKey, chromePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");	
		
		WebElement emailbutton = driver.findElement(By.id("email"));
		emailbutton.sendKeys("emad@example.com");
			
	}

}
