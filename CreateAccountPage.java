package com.seleniumProject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateAccountPage extends PageObject {

	public CreateAccountPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "id_gender1")
	private WebElement gender;
	
	@FindBy(id = "customer_firstname")
	private WebElement firstName;
	
	@FindBy(id = "customer_lastname")
	private WebElement lastName;
	
	@FindBy(id = "passwd")
	private WebElement password;
	
	@FindBy(id = "firstname")
	private WebElement first;
	
	@FindBy(id = "lastname")
	private WebElement last;
	
	@FindBy(id = "address1")
	private WebElement address;
	
	@FindBy(id = "city")
	private WebElement city;
	
	@FindBy(id = "id_state")
	private WebElement state;
	
	@FindBy(id = "postcode")
	private WebElement zip;
	
	@FindBy(id = "phone_mobile")
	private WebElement phoneNum;
	
	@FindBy(id = "submitAccount")
	private WebElement submit;
	
	public void chooseGender() {
		this.gender.click();
	}
	
	public void enterName() {
		this.firstName.sendKeys("john");
		this.lastName.sendKeys("doe");
	}
	public void enterPassword() {
		this.password.sendKeys("hello123");
	}
	public void enterAddress() {
		this.address.sendKeys("111 east 20th street");
		this.city.sendKeys("new york");
		this.zip.sendKeys("11012");
		this.state.sendKeys("n");
		this.state.click();
		this.phoneNum.sendKeys("3473033322");
	}
	public AddressPage submit() {
		this.submit.click();
		return new AddressPage(driver);
	}
}
