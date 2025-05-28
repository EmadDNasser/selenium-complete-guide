package hello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) {
		
		String chromeKey = "webdriver.chrome.driver";
		String chromePath = "D:\\PC\\chromedriver-win64\\chromedriver.exe";
		System.setProperty(chromeKey, chromePath);
		WebDriver driver = new ChromeDriver();
		String url ="https://www.expedia.ae/Flights";
		driver.get(url);
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.xpath("//button[@aria-label='Leaving from']")).isDisplayed());
		
		
	}

}
