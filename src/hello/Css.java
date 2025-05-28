package hello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {

	public static void main(String[] args) {
		
		
		/* 
		 * The syntax is as follows: tagname[attribute = 'value']
		 * EX: input[name="email"]
		 * 
		 * */

		String chromeKey = "webdriver.chrome.driver";
		String chromePath = "D:\\PC\\chromedriver-win64\\chromedriver.exe";
		System.setProperty(chromeKey, chromePath);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://gitlab.com/users/sign_up");
		String css = "input[class='form-control gl-form-input top js-block-emoji js-validate-length js-track-error']";
		driver.findElement(By.cssSelector(css)).sendKeys("Emad");
		
		// Using #id
		// the syntax: tagename#id
		String css_id = "input#new_user_first_name";
		driver.navigate().refresh();
		driver.findElement(By.cssSelector(css_id)).sendKeys("Emad1");
		
		// we can use without the tag name, we just put the hash follows by the id: #id
		String css_id2 = "#new_user_first_name";
		driver.navigate().refresh();
		driver.findElement(By.cssSelector(css_id2)).sendKeys("Emad2");
		
		
		// Using tagname.className
		String css_id3 = "input.gl-form-input";
		driver.navigate().refresh();
		driver.findElement(By.cssSelector(css_id3)).sendKeys("Emad3");
		
		// we can use without the tag name, we just put the dot follows by the id: .id
		String css_id4 = ".gl-form-input";
		driver.navigate().refresh();
		driver.findElement(By.cssSelector(css_id4)).sendKeys("Emad4");
				

		
	}

}
