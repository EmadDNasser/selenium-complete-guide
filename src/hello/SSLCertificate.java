package hello;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class SSLCertificate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *  List of Chromium Command Line Switches
			https://peter.sh/experiments/chromium-command-line-switches/
		*/
		ChromeOptions options = new ChromeOptions();
		options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		options.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(options);
	    driver.manage().window().maximize();
	    driver.get("http://google.com");
	   
	     
	}

}
