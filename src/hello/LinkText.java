package hello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String chromeKey = "webdriver.chrome.driver";
		String chromePath = "D:\\PC\\chromedriver-win64\\chromedriver.exe";
		System.setProperty(chromeKey, chromePath);
		WebDriver driver = new ChromeDriver();
			
		// Open https://www.linkedin.com/
		driver.get("https://www.linkedin.com/");	
		// match the whole text
		driver.findElement(By.linkText("Articles")).click();
		
		// Open https://www.linkedin.com/
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		// match at least one word from the string
		driver.findElement(By.partialLinkText("Forgot")).click();
		
	}

}
