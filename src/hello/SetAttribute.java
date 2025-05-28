package hello;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// this would help in case we have a calendar, we set the date value.
		
		//
		

		String chromeKey = "webdriver.chrome.driver";
		String chromePath = "D:\\PC\\chromedriver-win64\\chromedriver.exe";
		System.setProperty(chromeKey, chromePath);
		WebDriver driver = new ChromeDriver();
		driver.get(" https://the-internet.herokuapp.com/login");
		
		
		 try {
	            // Go to the login page
	            driver.get("https://the-internet.herokuapp.com/login");

	            // Locate username and password fields
	            WebElement usernameField = driver.findElement(By.id("username"));
	            WebElement passwordField = driver.findElement(By.id("password"));

	            // Use JavaScript to set the 'value' attribute
	            JavascriptExecutor js = (JavascriptExecutor) driver;
	            js.executeScript("arguments[0].setAttribute('value', 'tomsmith')", usernameField);
	            js.executeScript("arguments[0].setAttribute('value', 'SuperSecretPassword!')", passwordField);

	            // Click the login button
	            WebElement loginButton = driver.findElement(By.className("radius"));
	            loginButton.click();

	            // Optional wait
	            Thread.sleep(3000);

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            driver.quit();
	        }
	}

}
