package com.seleniumProject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignInPage extends PageObject {

	public SignInPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy( id = "email_create")
	private WebElement createEmail;
	
	@FindBy( id = "SubmitCreate")
	private WebElement createAccount;
	
	@FindBy(id = "email")
	private WebElement email;
	
	@FindBy(id = "passwd")
	private WebElement password;
	
	@FindBy(id = "SubmitLogin")
	private WebElement submit;
	
	public void createEmail() {
		this.createEmail.sendKeys("dirk20@gmail.com");
	}
	
	public CreateAccountPage account() {
		this.createAccount.click();
		return new CreateAccountPage(driver);
	}
	
	public void signInEmail() {
		this.email.sendKeys("drob@gmail.com");
	}
	
	public void signInPasswd() {
		this.password.sendKeys("hello123");
	}
	public AddressPage addressPage() {
		this.submit.click();
		return new AddressPage(driver);
	}
	
	
}
