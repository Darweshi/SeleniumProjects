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
	
	@FindBy(partialLinkText = "id")
	private List<WebElement> showMore;
	
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
	public void checkCart() {
		this.cart.click();
	}
	public void clickItem() {
		for(int i = 0; i < items.size(); i++){
			items.get(i).click();
		}
 	}
	public void show() {
		showMore.get(1).click();
	}
}
