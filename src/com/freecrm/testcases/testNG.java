package com.freecrm.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNG {

	// suite
	  // Multi tests
	   // Multi classes
	    // Multi Methods (Test Cases).
	
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I will execute before suite (Before all the tests, classes and methods)");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("I will execute after suite (After all the tests, classes and methods)");
	}
		
	@BeforeTest
	public void beforeTest() {
		System.out.println("I will execute before test (After all the classes and methods)");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("I will execute after test (After all the classes and methods");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("I will execute before this class (Before all the methods)");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("I will execute After this class (After all the methods)");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I will execute before method (Before any methods in this class)");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("I will execute after method (After every methods in this class)");
	}
	
	@Test
	public void testCase1() {
		System.out.println("This is the first test case");
	}
	
	@Test
	public void testCase2() {
		System.out.println("This is the second test case");
	}
	
	@Test
	public void testCase3() {
		System.out.println("This is the third test case");
	}
	
	@Test
	public void testCase4() {
		System.out.println("This is the fourth test case");
	}
}
