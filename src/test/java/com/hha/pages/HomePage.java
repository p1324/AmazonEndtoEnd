package com.hha.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hha.base.BaseClass;

public class HomePage extends BaseClass{
	// find xpath of all element
	@FindBy(id = "twotabsearchtextbox")
	private WebElement searchBox;
	
	@FindBy(xpath="//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_4']//span[@class='a-size-base-plus a-color-base a-text-normal']")
	private WebElement productLink;
	
	@FindBy(id="add-to-cart-button")
	private WebElement addToCartButton;
	
	@FindBy(name="proceedToRetailCheckout")
	private static WebElement proceedToBuyButton;

	// constructor - to initialize the webelements

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);//
	}

	// action methods
	public void searchProduct()
	{
		searchBox.sendKeys("shoe");
		searchBox.sendKeys(Keys.ENTER);
	}
	
	public void selectProduct()
	{
		productLink.click();
	}
	public void addProductToCart()
	{
		addToCartButton.click();
	}
	
	public void switchToChildWindow()
	{
		List<String> childwindows=new ArrayList<String>(driver.getWindowHandles());
		System.out.println(childwindows.size());//01
		driver.switchTo().window(childwindows.get(1));
	}
	public static void proceedToBuy()
	{
		proceedToBuyButton.click();
	}

}
