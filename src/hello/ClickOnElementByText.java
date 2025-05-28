package hello;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickOnElementByText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().deleteAllCookies();
	     
	     driver.get("http://bbc.com");
	     //driver.findElement(By.xpath("//*[text()='News'")).click();
	     
	     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	     WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='News']")));
	     element.click();
	     
	     // if there's a white spaces we my use "contains"
	     //   WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'News')]")));
	     //  element.click();
	     
	}

}
