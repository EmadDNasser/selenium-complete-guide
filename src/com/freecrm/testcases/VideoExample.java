package com.freecrm.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class VideoExample {

	@Test
	public void recordVideo() throws ATUTestRecorderException {
		
		ATUTestRecorder recorder = new ATUTestRecorder("C:\\Users\\Emad\\eclipse-workspace\\hello\\Videos","testcase1",false);
		recorder.start();
		
		String ChromeDriverPath = "D:\\PC\\chromedriver-win64\\chromedriver.exe";
	    String chromeDriverKey = "webdriver.chrome.driver";
        System.setProperty(chromeDriverKey, ChromeDriverPath);

        WebDriver driver = new ChromeDriver();
        driver.get("https://ui.cogmento.com/");
        driver.quit();
        recorder.stop();
		
	}
}
