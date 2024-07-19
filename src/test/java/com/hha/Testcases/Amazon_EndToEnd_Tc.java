package com.hha.Testcases;

import org.testng.annotations.Test;

import com.hha.base.BaseClass;
import com.hha.pages.HomePage;

public class Amazon_EndToEnd_Tc extends BaseClass{
	
	HomePage homepage;
	@Test
	public void test1()
	{
		 homepage= new HomePage(driver);
		 homepage.searchProduct();
		 homepage.selectProduct();
		 homepage.switchToChildWindow();
		 homepage.addProductToCart();
		 HomePage.proceedToBuy();
		 
	}

}
