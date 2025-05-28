package hello;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardInteractions2 {

	public static void main(String[] args) {

		String chromeKey = "webdriver.chrome.driver";
		String chromePath = "D:\\PC\\chromedriver-win64\\chromedriver.exe";
		System.setProperty(chromeKey, chromePath);
		WebDriver driver = new ChromeDriver();
		
		/*driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Hello Google");
		driver.findElement(By.name("q")).clear();
		WebElement googlElement = driver.findElement(By.name("q"));
		googlElement.sendKeys("Tokyo");*/
		
		
		driver.get("https://www.booking.com/");
		driver.manage().window().maximize();
	    WebElement element = driver.findElement(By.name("ss"));
		Actions action = new Actions(driver);
		action.moveToElement(element).click().sendKeys("Tokyo").build().perform();		

		 for (int i = 0; i < 7; i++)
		 {
			 action.sendKeys(Keys.TAB).build().perform();
		 }
		 
		 action.sendKeys(Keys.ENTER).build().perform();
	}

}
