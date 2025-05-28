package hello;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://github.com/login");
		driver.manage().window().maximize();
		
		WebElement githubIcon = driver.findElement(By.className("header-logo"));

		driver.get(githubIcon.getAttribute("href"));
		
	}

}
