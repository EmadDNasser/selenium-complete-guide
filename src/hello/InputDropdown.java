package hello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InputDropdown {

	public static void main(String[] args) {

		// Input DropDown
		
		String chromeKey = "webdriver.chrome.driver";
		String chromePath = "D:\\PC\\chromedriver-win64\\chromedriver.exe";
		System.setProperty(chromeKey, chromePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.agoda.com/en-gb/?cid=1888052&tag=Xcl968Tr1k3MBJYggorALqUvYCPHpAuxl3K1YrDiiYAxNzQxNTM2ODE2&ds=uX%2FaHfMWTw6UA%2FpY");
		driver.findElement(By.id("textInput")).click();
		WebElement select = driver.findElement(By.xpath("//button[@data-element-object-id='8105']"));
		select.click();
		//tagname[contains(@attribute, ‘value’)]
	}

}