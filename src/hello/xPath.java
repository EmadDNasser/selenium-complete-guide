package hello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPath {

	public static void main(String[] args) {
		
		
		/* 
		 * The syntax is as follows:
		 * //tagname[@attribute = 'value']
		 * EX: //input[@name="ss"]
		 * 
		 * <input name="ss" class="eb46370fe1" placeholder="Where are you going?" data-destination="1" autocomplete="off" aria-autocomplete="list"
		 *  aria-controls="autocomplete-results" aria-haspopup="listbox" aria-label="Where are you going?"
		 *  aria-expanded="true" role="combobox" id=":rh:" value="" spellcheck="false" data-ms-editor="true">
		 * 
		 * */
		String chromeKey = "webdriver.chrome.driver";
		String chromePath = "D:\\PC\\chromedriver-win64\\chromedriver.exe";
		System.setProperty(chromeKey, chromePath);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.booking.com/");
		
		String Xpath = "//input[@name='ss']";
		
		driver.findElement(By.xpath(Xpath)).sendKeys("Dubai");
		
		// Navigate refresh
		driver.navigate().refresh(); 
		
		String Xpath2 = "//*[@name='ss']";
		driver.findElement(By.xpath(Xpath2)).sendKeys("Abu Dhabi");
		

		// this is to solve error "Compound class names not permitted" which means there's spaces in the name:
		String Xpath3 = "(//*[@class='inputtext _55r1 _6luy _9npi'])[2]";
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.xpath(Xpath3)).sendKeys("pass");
		
		/* Use “contains” in xPath.
		* //tagname[contains(@attribute, ‘value’)]
		*/
		String Xpath4 = "//input[contains(@class,'inputtext _55r1 _6luy _9npi')]";
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.xpath(Xpath4)).sendKeys("PassWord");
		
		
		/* Absolute xPath */
		String Xpath5 = "//body/div/div/div/div/div/div/div/div/div/form/div/div/input";
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.xpath(Xpath5)).sendKeys("PassWord123456");
		
		
		
		
	}

}
