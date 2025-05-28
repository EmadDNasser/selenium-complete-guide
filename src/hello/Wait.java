package hello;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String chromeKey = "webdriver.chrome.driver";
		String chromePath = "D:\\PC\\chromedriver-win64\\chromedriver.exe";
		System.setProperty(chromeKey, chromePath);
		String url = "https://library-app.firebaseapp.com/";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		
		
// Thread sleep: provided by Java, Static.
			 driver.findElement(By.linkText("Libraries")).click();
			 Thread.sleep(9000);
			 driver.findElement(By.linkText("Abc")).click();
		 
		
		
		
// Implicit wait: provided by Selenium, Dynamic, Global.
		 
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
			driver.findElement(By.linkText("Libraries")).click();
			driver.findElement(By.linkText("Abc")).click();
		
	
// Explicit wait: provided by Selenium, Dynamic, Private.
		
		 WebDriverWait wait = new WebDriverWait(driver, null);
		 driver.findElement(By.linkText("Libraries")).click();
		 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Abc"))));
		
		
	}

}
