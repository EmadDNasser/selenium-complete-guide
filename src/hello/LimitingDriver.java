package hello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LimitingDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String chromeKey = "webdriver.chrome.driver";
		String chromePath = "D:\\PC\\chromedriver-win64\\chromedriver.exe";
		
		System.setProperty(chromeKey, chromePath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://bbc.com");
	
		String xPath = "//footer[@class='sc-c05885a3-0 bbntGk']";
		
		WebElement footer = driver.findElement(By.xpath(xPath));
		System.out.println(footer.findElements(By.tagName("a")).size());
		
	
	}

}
