package com.seleniumProject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderPage extends PageObject{

	public OrderPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]")
	private WebElement proceed;
	
	@FindBy (id = "cart_title")
	private WebElement title;
	
	@FindBy(id = "cart_summary")
	private WebElement summary;
	
	public String cartCheck() {
		return title.getText();
	}
	public Boolean checkSummary() {
		return summary.isDisplayed();
	}
	
	public SignInPage checkout() {
		this.proceed.click();
		return new SignInPage(driver);
	}
}
