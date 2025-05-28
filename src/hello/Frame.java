package hello;

import java.sql.Driver;
import java.time.Duration;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String chromeKey = "webdriver.chrome.driver";
		String chromePath = "D:\\PC\\chromedriver-win64\\chromedriver.exe";
		System.setProperty(chromeKey, chromePath);
		WebDriver driver = new ChromeDriver();
		String Url1 = "http://demo.guru99.com/test/guru99home";
		String Url2 = "https://jqueryui.com/droppable/";
		
		
		// Switch to the Frame first => then to the image.
		// You cannot access the image directly, you'll get an error "No such element";
		
/*		

// Using by id OR name:
		driver.get(Url1);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.switchTo().frame("a077aa5e"); // id OR name
		String XpathImage = "//img[@src='Jmeter720.png']";
		driver.findElement(By.xpath(XpathImage)).click();
*/	

/*		
		// Using Web Element:
		driver.get(Url1);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		String xPathFrame = "//*[@id=\"a077aa5e\"]";
		WebElement frame = driver.findElement(By.xpath(xPathFrame));
		frame.click();
		
*/		

/*
		// Using index
			//Case 1:
		driver.get(Url2);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		// Let's find how many frames we have, so that we can pass the index.
		int count = driver.findElements(By.tagName("iframe")).size();
		
		System.out.println(count); // => 1
		
		// As we have one frame in this website => the index will be 0: frame(0)
		
		driver.switchTo().frame(0);
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		
		action.clickAndHold(drag).moveToElement(drop).release().build().perform();
		
*/
		// Using index
					//Case 2:
		driver.get(Url1);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		int count = driver.findElements(By.tagName("iframe")).size();
		
				
		for (int i = 0; i < count; i++) {
			driver.switchTo().frame(i);
			int yes = driver.findElements(By.xpath("//img[@src='Jmeter720.png']")).size(); // frame index (the frame index that has this image).
			if (yes >= 1)
			{
				driver.switchTo().defaultContent();
				driver.switchTo().frame(i);
				driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
				break;
			}
			driver.switchTo().defaultContent();
		}
		
		System.out.println("END");
	}

}
