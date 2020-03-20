package com.seleniumProject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PaymentPage extends PageObject {

	public PaymentPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
	private WebElement payment;
	
	public PaymentSubPage pay() {
		this.payment.click();
		return new PaymentSubPage(driver);
	}
}
