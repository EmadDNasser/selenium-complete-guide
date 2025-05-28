package hello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MsEdge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Key = "webdriver.edge.driver";
		String Path = "C:\\edgedriver\\msedgedriver.exe";
		System.setProperty(Key, Path);
		
		WebDriver driver  = new EdgeDriver();
		
		driver.get("https://www.google.com");
		driver.findElement(By.id("APjFqb")).sendKeys("Toyota");

	}

}
