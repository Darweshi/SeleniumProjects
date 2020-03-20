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
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/h1")
	private WebElement checkPage;
	public void createEmail() {
		this.createEmail.sendKeys("drob54@gmail.com");
	}
	
	public CreateAccountPage account() {
		this.createAccount.click();
		return new CreateAccountPage(driver);
	}
	
	public void signInEmail() {
		this.email.sendKeys("drob@gmail.com");
	}
	public String checkSignIn() {
		return checkPage.getText();
	}
	public void signInPasswd() {
		this.password.sendKeys("hello123");
	}
	public AddressPage addressPage() {
		this.submit.click();
		return new AddressPage(driver);
	}
	
	
}
