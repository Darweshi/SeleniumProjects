package com.seleniumProject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends PageObject {

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy (id = "homepage-slider")
	private WebElement clickSlide;
	
	@FindBy(how = How.CLASS_NAME, using = "login")
	private WebElement signIn;
	
	@FindBy(xpath =("//*[@id=\"search_query_top\"]"))
	private WebElement searchBox;

	@FindBy(xpath = ("//*[@id=\"searchbox\"]/button"))
	private WebElement searchButton;
	
	@FindBy(xpath = ("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a"))
	private WebElement cart;
	
	@FindBy(partialLinkText = "cart")
	private List<WebElement> items;
	
	@FindBy(linkText = "")
	private List<WebElement> showMore;
	
	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
	private WebElement proceedToCheckout;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/h1/span[1]")
	private WebElement searchCheck;

	@FindBy(xpath = "//*[@id=\"header\"]/div[2]/div[1]/div/div/div[1]/div/a[2]/img")
	private WebElement slidePage;
	
	public void search (String searchBox) {
		this.searchBox.click();
		this.searchBox.clear();
		this.searchBox.sendKeys(searchBox);
		this.searchButton.click();
	}
	
	public void chooseSlide() {
		this.clickSlide.click();
		
	}
	public void signIn() {
		this.signIn.click();
	}
	public SignInPage sign() {
		this.signIn.click();
		return new SignInPage(driver);
	}
	public OrderPage checkCart() {
		this.cart.click();
		return new OrderPage(driver);
	}
	public void addItem() {
		items.get(2).click();
	}
	public void clickItems() {
		for(int i = 0; i < items.size(); i++){
			items.get(i).click();
		}
 	}
	public void show() {
		showMore.get(1).click();
	}
	public OrderPage checkout() {
		this.proceedToCheckout.click();
		return new OrderPage(driver);
	}
	public String checkSearch() {
		return searchCheck.getText();
	}
	public Boolean slideIsGone() {
		return slidePage.isDisplayed();
	}
}
