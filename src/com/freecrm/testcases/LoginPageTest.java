package com.freecrm.testcases;
import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.freecrm.base.TestBase;
import com.freecrm.util.TestUtils;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class LoginPageTest extends TestBase {
	
	public LoginPageTest() throws IOException {
		super(); // call the constructor from the base class
		// TODO Auto-generated constructor stub
	}

	@Test (priority = 1)
	public void titleTest(Method method) throws IOException {
	
		String ExpectedResultString = "Cogmento CRM";
		String ActualResultString = driver.getTitle(); // "Cogmento CRM"
		System.out.println(ExpectedResultString.equals(ActualResultString));
		Assert.assertEquals(ActualResultString, ExpectedResultString);
		//TestUtils.takePicture(method.getName());

	}

	@Test (priority = 2)
	public void urlCheck(Method method) throws IOException {

		String ExpectedResultString = "https://ui.cogmento.com/";
		String ActualResultString = driver.getCurrentUrl();
		
		System.out.println(ExpectedResultString.equals(ActualResultString));
		Assert.assertEquals(ActualResultString, ExpectedResultString);
		//TestUtils.takePicture(method.getName());
	}
	
	@Test (priority = 3)
	public void logoTest(Method method) throws IOException {

		String freecrmURL = "https://classic.freecrm.com/index.html";
		driver.get(freecrmURL);
		WebElement logoElement = driver.findElement(By.xpath("//img[@src='https://classic.freecrm.com/img/logo.png']"));
		boolean ExpectedResultBoolean = true;
		boolean ActualResultBoolean = logoElement.isDisplayed();
		System.out.println(ExpectedResultBoolean == ActualResultBoolean);
		Assert.assertEquals(ActualResultBoolean, ExpectedResultBoolean);
		//TestUtils.takePicture(method.getName());
	}
	
	
	@Test (priority = 4)
	public void loginTest(Method method) throws IOException {
				
		WebElement usernameElement = driver.findElement(By.name("email"));
		WebElement passwordElement = driver.findElement(By.name("password"));
		WebElement buttonElement = driver.findElement(By.cssSelector("#ui > div > div > form > div > div.ui.fluid.large.blue.submit.button"));
		String username = "emad.naser1@gmail.com";
		String password = "Emad@123";
		usernameElement.sendKeys(username); 
		passwordElement.sendKeys(password);
		buttonElement.click();
		
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        WebElement userDisplayElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".user-display")));
		String ActualResultString =  userDisplayElement.getText();
		
		String ExpectedResultString = "Emad Nasser";		
		System.out.println(ActualResultString.equals(ExpectedResultString));
		Assert.assertEquals(ActualResultString, ExpectedResultString, "Username or password are not correct! ");
		//TestUtils.takePicture(method.getName());
	}

	@Test (priority = 2, enabled = false)
	public void titleTest1() {

		// the result of the following test is fail
		SoftAssert softAssert = new SoftAssert();
		String freecrmURL = "https://ui.cogmento.com/";
		driver.get(freecrmURL);
		String ExpectedResultString = "Cogmento";
		String ActualResultString = driver.getTitle(); // "Cogmento CRM"
		System.out.println(ExpectedResultString.equals(ActualResultString));
		softAssert.assertEquals(ActualResultString, ExpectedResultString); // Otput: fail
		softAssert.assertAll(); // You must add assertAll(); in order to print Pass  / Fail, otherwise will print pass even though the test is fail.	
		System.out.println("This line was printed eventhough the output is false");
		
	}
	
	@DataProvider
	public Object [][] MayData() {
		
		Object data [][] = new Object [4][2];
		
		data[0][0] = "emad.naser1@gmail.com";
		data[0][1] = "Emad@123";
		data[1][0] = "emad.naser@gmail.com";
		data[1][1] = "Emad12345";
		data[2][0] = "emad.nas@gmail.com";
		data[3][0] = "emad.naser@gmail.com";
		data[3][1] = "Ema123";
		
		return data;
	}
	
	@Parameters({"browser"})
	@BeforeMethod
	public void setUP(String browser, Method method) throws ATUTestRecorderException {
		initialization(browser);
		recorder = new ATUTestRecorder("C:\\Users\\Emad\\eclipse-workspace\\hello\\Videos", method.getName(),false);
		recorder.start();
	}
	
	@AfterMethod
	public void tearDown(Method method) throws ATUTestRecorderException, IOException {
		TestUtils.takePicture(method.getName());
		driver.quit();
		recorder.stop();
	}
}

