package com.seleniumProject;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class CheckoutTest extends PageObject{

	public CheckoutTest(WebDriver driver) {
		super(driver);
	}
	
	public void checkout() {
		WebDriver driver;
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Weshi\\Desktop\\java\\chromedriver.exe");
			driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		HomePage homePage = new HomePage(driver);
		homePage.addItem();
		homePage.checkCart();
	}
}
