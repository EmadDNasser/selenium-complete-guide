package hello;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String chromeKey = "webdriver.chrome.driver";
		String chromePath = "D:\\PC\\chromedriver-win64\\chromedriver.exe";
		System.setProperty(chromeKey, chromePath);
		String url = "https://demo.guru99.com/popup.php";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		
	}

}
