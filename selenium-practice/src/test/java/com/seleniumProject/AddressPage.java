package com.seleniumProject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressPage extends PageObject {

	public AddressPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button")
	private WebElement proceed;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/h1")
	private WebElement address;
	
	public String checkPage() {
		return address.getText();
	}
	public ShippingPage proceedToCheckout() {
		this.proceed.click();
		return new ShippingPage(driver);
	}
}
