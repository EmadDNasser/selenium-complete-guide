package hello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalassName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String chromeKey = "webdriver.chrome.driver";
		String chromePath = "D:\\PC\\chromedriver-win64\\chromedriver.exe";
		System.setProperty(chromeKey, chromePath);
		WebDriver driver = new ChromeDriver();
			
		// Open https://www.facebook.com/
		driver.get("https://www.facebook.com/");	
		
		// the following will not work because of this error "Compound class names not permitted" which means there's spaces in the name:
		driver.findElement(By.className("inputtext _55r1 _6luy _9npi")).sendKeys("Test@example.com"); 
		
		

	}

}
