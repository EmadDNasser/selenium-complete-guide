package com.freecrm.testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Example {

	@Test
	public void printValues() throws IOException {
		
		Properties properties = new Properties();
		
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
		
		String url = properties.getProperty("URL");
		String Username = properties.getProperty("username");
		String Password = properties.getProperty("password");
		System.out.println(url + "\n" + Username + "\n" + Password);
	
	}
}
