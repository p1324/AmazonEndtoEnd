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
		String actPrice=homepage.getProductPrice();//70,900 from amazon
		String actualPrice=actPrice.replaceAll("[^A-Za-z0-9]", "");//70900
	
		Integer price=databaseReader.getPriceData();
		String expectedPrice=String.valueOf(price);//70900 from db
		
		Assert.assertEquals(actualPrice, expectedPrice);
		
		 
		
		 
	}
}
