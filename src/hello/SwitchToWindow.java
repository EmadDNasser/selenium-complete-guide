package hello;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String chromeKey = "webdriver.chrome.driver";
		String chromePath = "D:\\PC\\chromedriver-win64\\chromedriver.exe";
		System.setProperty(chromeKey, chromePath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/popup.php");
		
		driver.findElement(By.linkText("Click Here")).click();
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		
		//driver.findElement(By.name("emailid")).sendKeys("test@example.com");
		
		Set<String> ids = driver.getWindowHandles();
		Iterator <String> it = ids.iterator();
		String parentID = it.next();
		String childID = it.next();
		
		driver.switchTo().window(childID);
	}

}
