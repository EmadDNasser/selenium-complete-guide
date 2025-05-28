package hello;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelements {

	public static void main(String[] args) {

		String chromeKey = "webdriver.chrome.driver";
		String chromePath = "D:\\PC\\chromedriver-win64\\chromedriver.exe";
		System.setProperty(chromeKey, chromePath);
		WebDriver driver = new ChromeDriver();
		String url ="https://echoecho.com/htmlforms09.htm";
		driver.get(url);
		driver.manage().window().maximize();
		String Xpath = "//input[@name='Checkbox']";
		
		List <WebElement> chckboxesElements = driver.findElements(By.xpath(Xpath));
		chckboxesElements.get(0).click();
		// OR
		// driver.findElements(By.xpath(Xpath)).get(0).click();
		driver.navigate().refresh();
		
		int count = driver.findElements(By.xpath(Xpath)).size();
		for (int i = 0; i < count; i++) {
			driver.findElements(By.xpath(Xpath)).get(i).click();
		}
		
	}

}
