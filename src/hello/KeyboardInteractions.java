package hello;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardInteractions {

	public static void main(String[] args) {

		String chromeKey = "webdriver.chrome.driver";
		String chromePath = "D:\\PC\\chromedriver-win64\\chromedriver.exe";
		System.setProperty(chromeKey, chromePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		WebElement element1 = driver.findElement(By.id("gh-ac"));
		Actions action1 = new Actions(driver);
		//action1.moveToElement(element1).click().sendKeys("testtest").build().perform();
		action1.moveToElement(element1).click().keyDown(Keys.SHIFT).sendKeys("testtest").build().perform();

		
		
	}

}
