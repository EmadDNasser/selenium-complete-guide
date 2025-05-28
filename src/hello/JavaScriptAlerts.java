package hello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlerts {

	public static void main(String[] args) {


		String chromeKey = "webdriver.chrome.driver";
		String chromePath = "D:\\PC\\chromedriver-win64\\chromedriver.exe";
		System.setProperty(chromeKey, chromePath);
		WebDriver driver = new ChromeDriver();
		String url = "https://echoecho.com/javascript4.htm";
		driver.get(url);
		driver.manage().window().maximize();
		String Xpath = "//input[@value='alert box']";
		driver.findElement(By.xpath(Xpath)).click();
		driver.switchTo().alert().accept();
		
		

	}

}
