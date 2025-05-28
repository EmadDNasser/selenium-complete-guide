package com.freecrm.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;

import com.freecrm.util.WebListener;

import atu.testrecorder.ATUTestRecorder;

public class TestBase {

	public static WebDriver driver;
	public static Properties properties;
	public static ATUTestRecorder recorder;
	
	
	// constructor
	public TestBase () throws IOException
	{
		properties = new Properties();
		
		try 
		{
			FileInputStream file = new FileInputStream("C:\\Users\\Emad\\eclipse-workspace\\hello\\src\\com\\freecrm\\config\\config.properties");
			properties.load(file);
		} 
		
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void initialization(String browser) {
		String ChromeDriverPath = "D:\\PC\\chromedriver-win64\\chromedriver.exe";
	    String chromeDriverKey = "webdriver.chrome.driver";    
	    String EdgeDriverPath = "D:\\PC\\edgedriver_win64\\msedgedriver.exe";
	    String EdgeDriverKey = "webdriver.edge.driver";
	    WebDriver baseDriver = null;
	    
		if (browser.equalsIgnoreCase("chrome")) {
			 System.setProperty(chromeDriverKey, ChromeDriverPath);
			 baseDriver  = new ChromeDriver();
		}
		
		else if (browser.equals("edge")) {
			 System.setProperty(EdgeDriverKey,EdgeDriverPath);
			 baseDriver = new EdgeDriver();
		}

        // Attach listener
        WebListener listener = new WebListener();
        driver = new EventFiringDecorator(listener).decorate(baseDriver);

        // Regular setup
        driver.get(properties.getProperty("URL"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
}
