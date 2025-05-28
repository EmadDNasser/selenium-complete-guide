package hello;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) {
		
		String chromeKey = "webdriver.chrome.driver";
		String chromePath = "D:\\PC\\chromedriver-win64\\chromedriver.exe";
		
		System.setProperty(chromeKey, chromePath);
		
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Hello World");
		
		
	}

}
