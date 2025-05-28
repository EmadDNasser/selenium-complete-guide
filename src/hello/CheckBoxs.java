package hello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxs {

	public static void main(String[] args) {
		
		String chromeKey = "webdriver.chrome.driver";
		String chromePath = "D:\\PC\\chromedriver-win64\\chromedriver.exe";
		System.setProperty(chromeKey, chromePath);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		String Xpath1 = "//input[@value='2']";
		WebElement element1 =  driver.findElement(By.xpath(Xpath1));
		element1.click();
		System.out.println(element1.isSelected());
				
		String Xpath2 = "//input[@value='1']";
		WebElement element2 =  driver.findElement(By.xpath(Xpath2));
		System.out.println(element2.isSelected());
		
	}

}
