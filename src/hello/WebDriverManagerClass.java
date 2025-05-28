package hello;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class WebDriverManagerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriverManager.chromedriver().setup();
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("Toyota");

        String ulXpath = "//ul[@jsname='bw4e9b']";

        // Use WebDriverWait to wait for the suggestion list to appear
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement list = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ulXpath)));

        List<WebElement> liList = list.findElements(By.tagName("span"));

        for (int i = 0; i < liList.size(); i++) {
        	String suggestion = liList.get(i).getText();
        	if (!suggestion.isEmpty()) {
        	    System.out.println(suggestion);
        	}
        	
		}
       System.out.println("----END----");

        // Close the browser
        driver.quit();
		
	}

}
