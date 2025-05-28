package hello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseInteractions {

	public static void main(String[] args) {

		String chromeKey = "webdriver.chrome.driver";
		String chromePath = "D:\\PC\\chromedriver-win64\\chromedriver.exe";
		System.setProperty(chromeKey, chromePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.linkText("Electronics"));
		Actions action = new Actions (driver);
		action.moveToElement(element).build().perform();
		
		driver.navigate().refresh();
		WebElement element2 = driver.findElement(By.id("gh-ac"));
		Actions action2 = new Actions(driver);
		action2.moveToElement(element2).click().sendKeys("test").doubleClick().build().perform();
		
		driver.navigate().refresh();
		WebElement element3 = driver.findElement(By.linkText("Fashion"));
		Actions action3 = new Actions(driver);
		action3.moveToElement(element3).click().contextClick().build().perform();
		
		
		
	}

}
