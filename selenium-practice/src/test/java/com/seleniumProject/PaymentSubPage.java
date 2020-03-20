package com.seleniumProject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PaymentSubPage extends PageObject {

	public PaymentSubPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*[@id=\"cart_navigation\"]/button")
	private WebElement proceed;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/h1")
	private WebElement confirmation;
	
	public String checkConfirmation() {
		return confirmation.getText();
	}
	
	public void confirm() {
		this.proceed.click();
	}
}
