package com.freecrm.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;

public class WebListener implements WebDriverListener
{

	 @Override
	    public void beforeGet(WebDriver driver, String url) {
	        System.out.println("Before navigating to: " + url);
	    }

	    @Override
	    public void afterGet(WebDriver driver, String url) {
	        System.out.println("Navigated to: " + url);
	    }

	    @Override
	    public void beforeGetCurrentUrl(WebDriver driver) {
	        System.out.println("Trying to get current URL");
	    }

	    @Override
	    public void afterGetCurrentUrl(WebDriver driver, String result) {
	        System.out.println("Current URL is: " + result);
	    }

	    @Override
	    public void beforeGetTitle(WebDriver driver) {
	        System.out.println("Trying to get page title");
	    }

	    @Override
	    public void afterGetTitle(WebDriver driver, String result) {
	        System.out.println("Page title is: " + result);
	    }

	    @Override
	    public void beforeFindElement(WebDriver driver, By locator) {
	        System.out.println("Trying to find element by: " + locator.toString());
	    }

	    @Override
	    public void afterFindElement(WebDriver driver, By locator, WebElement result) {
	        System.out.println("Found element by: " + locator.toString());
	    }
	
}
