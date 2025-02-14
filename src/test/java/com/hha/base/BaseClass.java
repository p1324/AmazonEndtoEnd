package com.hha.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.hha.utility.DatabaseReader;

public class BaseClass {

	public static WebDriver driver;
	public static DatabaseReader databaseReader= new DatabaseReader();
	@BeforeClass
	public void setUp()
	{
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.amazon.in/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
	}
	@AfterClass
	public void tearDown()
	{
		//driver.quit();
	}
	
}
