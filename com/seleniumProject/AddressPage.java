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
	
	public void proceedToCheckout() {
		this.proceed.click();
	}
}
