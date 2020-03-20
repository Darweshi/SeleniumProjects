package com.seleniumProject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ShippingPage extends PageObject {

	public ShippingPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "cgv")
	private WebElement terms;
	
	@FindBy(xpath = "//*[@id=\"form\"]/p/button")
	private WebElement proceed;

	public 	PaymentPage checkout() {
		this.terms.click();
		this.proceed.click();
		return new PaymentPage(driver);
	}
}
