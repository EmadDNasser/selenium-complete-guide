package hello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {

		// Static DropDown
		
		String chromeKey = "webdriver.chrome.driver";
		String chromePath = "D:\\PC\\chromedriver-win64\\chromedriver.exe";
		System.setProperty(chromeKey, chromePath);
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/r.php?entry_point=login");
		WebElement day = driver.findElement(By.id("day"));
		Select dayValue = new Select(day);
		dayValue.selectByIndex(5);
		dayValue.selectByValue("9");
		dayValue.selectByVisibleText("2");
	}

}
