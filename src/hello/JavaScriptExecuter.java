package hello;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.JavascriptExecutor;

public class JavaScriptExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String chromeKey = "webdriver.chrome.driver";
		String chromePath = "D:\\PC\\chromedriver-win64\\chromedriver.exe";
		System.setProperty(chromeKey, chromePath);
		WebDriver driver = new ChromeDriver();
		String Url1 = "http://demo.guru99.com/test/guru99home";
		
		driver.get(Url1);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement submitElement = driver.findElement(By.id("philadelphia-field-submit"));
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		
		js.executeScript("arguments[0].scrollIntoView(true);", submitElement); // scroll
		
		js.executeScript("arguments[0].click();", submitElement); // click
		
		String pagetext = js.executeScript("return document.documentElement.innerText;").toString(); // extract text
		System.out.println(pagetext);
		
		js.executeScript("alert('"+"Hello World"+"')"); // alert
		
		js.executeScript("arguments[0].style.border='3px solid red'",submitElement); // draw a red rectangle around submit button
	}

}
