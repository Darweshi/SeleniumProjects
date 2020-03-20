package com.seleniumProject;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SubPage extends PageObject {

	public SubPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(className = "grower")
	private List<WebElement> categories;
	
	@FindBy(tagName = "input")
	private List<WebElement> checkBox;
	
	@FindBy(xpath = "//*[@id=\"subcategories\"]/ul/li[2]/div[1]/a")
	private WebElement subcategories;
	
	@FindBy(tagName = "option")
	private List<WebElement> sort;
	
	@FindBy(xpath = "//*[@id=\"list\"]/a/i")
	private WebElement view;
	
	@FindBy(tagName = "img")
	private List<WebElement> viewProduct;
	
	@FindBy(xpath ="//*[@id=\"categories_block_left\"]/div/ul/li[1]/a")
	private WebElement tops;
	
	@FindBy(xpath ="//*[@id=\"subcategories\"]/ul/li[1]/div[1]/a/img")
	private WebElement dresses;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/div/div/div[3]/h1")
	private WebElement pageCheck;
	public void menu() {
		for(int i = 0; i < 2; i++){
			categories.get(i).click();
		}
	}
	public void fliter() {
		
		checkBox.get(5).click();
		checkBox.get(7).click();
		checkBox.get(26).click();
		checkBox.get(28).click();
	}
	public boolean filterCheck() {
		return checkBox.get(26).isSelected();
	}
	public boolean dressesIsDisplayed() {
		return dresses.isDisplayed();
	}
	public void subcategory() {
		subcategories.click();
	}
	public void sort() {
		sort.get(3).click();
		view.click();
	}
	public boolean checkView() {
		return view.isSelected();
	}
	public void clickProduct() {
		viewProduct.get(12).click();
	}
	public Object PageCheck() {
		return pageCheck.getText();
	}
	public boolean isTopsSelected() {
		return tops.isSelected();
	}
}
