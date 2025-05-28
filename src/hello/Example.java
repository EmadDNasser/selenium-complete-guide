package hello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String chromeKey = "webdriver.chrome.driver";
		//String chromePath = "D:\\PC\\chromedriver-win64\\chromedriver.exe";
		String EdgeDriverPath = "D:\\PC\\edgedriver_win64\\msedgedriver.exe";
	    String EdgeDriverKey = "webdriver.edge.driver";
		System.setProperty(EdgeDriverKey, EdgeDriverPath);
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		String url = "https://example.com/";
		
		driver.get(url);
		driver.findElement(By.linkText("More information...")).click();
		String Currenturl = driver.getCurrentUrl();
		
		if (url != Currenturl) {
			System.out.println("URL has been changed.");
		}
		
		
	}

}
