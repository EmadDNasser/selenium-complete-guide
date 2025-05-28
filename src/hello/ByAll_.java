package hello;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.pagefactory.ByChained;

public class ByAll_ {

	public static void main(String[] args) {
		
		// By All, By Chained, By Name or ID 

		String chromeKey = "webdriver.chrome.driver";
		String chromePath = "D:\\PC\\chromedriver-win64\\chromedriver.exe";
		System.setProperty(chromeKey, chromePath);
		WebDriver driver = new ChromeDriver();
		String Url1 = "https://www.facebook.com/";
		driver.get(Url1);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// By All
		// if id found then will execute, if not, then will wait 10 seconds then find by name
		//driver.findElement(new ByAll(By.id("emad"), By.name("email"))).sendKeys("emad@example.com");
		
		// By Chained
		// the first element is the parent, the second one is the child
		driver.findElement(new ByChained(By.className("_6ltg"), By.tagName("button"))).click();
		
	}

}
