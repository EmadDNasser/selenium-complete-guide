package com.freecrm.testcases;
import static org.testng.Assert.assertTrue;
import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.freecrm.base.TestBase;
import com.freecrm.util.TestUtils;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class HomePage extends TestBase {
		
	public HomePage() throws IOException {
		super(); // call the constructor from the base class
		// TODO Auto-generated constructor stub
	}

	@Parameters({"browser"})
	@BeforeMethod
	public void login(String browser, Method method) throws IOException, ATUTestRecorderException {
		initialization(browser);
		recorder = new ATUTestRecorder("C:\\Users\\Emad\\eclipse-workspace\\hello\\Videos", method.getName(),false);
		WebElement usernameElement = driver.findElement(By.name("email"));
		WebElement passwordElement = driver.findElement(By.name("password"));
		WebElement buttonElement = driver.findElement(By.cssSelector("#ui > div > div > form > div > div.ui.fluid.large.blue.submit.button"));
		usernameElement.sendKeys("emad.naser1@gmail.com");
		passwordElement.sendKeys("Emad@123");
		buttonElement.click();
		//TestUtils.takePicture(method.getName());
	}
	
	@AfterMethod
	public void tearDown(Method method) throws ATUTestRecorderException, IOException {
		TestUtils.takePicture(method.getName());
		driver.quit();
		recorder.stop();
	}
	
	
	@Test 
	public void clickOnContactTest(Method method) throws IOException {
		WebElement contactsElement = driver.findElement(By.xpath("//span[text()='Contacts']"));
		contactsElement.click();
		WebElement statusLablElement = driver.findElement(By.xpath("//th[text()='Status']"));
		boolean ActualResultBooloean = statusLablElement.isDisplayed();
		assertTrue(ActualResultBooloean, "The status lable text not displayed");
		//TestUtils.takePicture(method.getName());
	}
	
	@Test 
	public void clickOnDealsTest(Method method) throws IOException {
		WebElement contactsElement = driver.findElement(By.xpath("//span[text()='Deals']"));
		contactsElement.click();
		WebElement statusLablElement = driver.findElement(By.xpath("//th[text()='Status']"));
		boolean ActualResultBooloean = statusLablElement.isDisplayed();
		assertTrue(ActualResultBooloean, "The status lable text not displayed");
		//TestUtils.takePicture(method.getName());
		
	}
		
	@Test 
	public void clickOnTasksTest(Method method) throws IOException {
		WebElement contactsElement = driver.findElement(By.xpath("//span[text()='Tasks']"));
		contactsElement.click();
		WebElement statusLablElement = driver.findElement(By.xpath("//th[text()='Status']"));
		boolean ActualResultBooloean = statusLablElement.isDisplayed();
		assertTrue(ActualResultBooloean, "The status lable text not displayed");
		//TestUtils.takePicture(method.getName());
	}
	
}
