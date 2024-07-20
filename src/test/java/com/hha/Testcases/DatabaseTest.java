package com.hha.Testcases;

import java.sql.SQLException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hha.base.BaseClass;
import com.hha.pages.HomePage;

public class DatabaseTest extends BaseClass {
	
	HomePage homepage;
	@Test
	public void test1() throws SQLException
	{
		 homepage= new HomePage(driver);
		 homepage.searchProduct();
		String actualPrice=homepage.getProductPrice();
	
		Integer Price=databaseReader.getPriceData();
		String expectedPrice=String.valueOf(Price);
		
		Assert.assertEquals(actualPrice, expectedPrice);
		
		 
		
		 
	}
}
