package com.seleniumProject;
import java.util.List;
import java.util.concurrent.TimeUnit;

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
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		OrderPage orderPage=homePage.checkout();	
		
		SignInPage signInPage =orderPage.checkout();
		signInPage.signInEmail();
		signInPage.signInPasswd();
		AddressPage addressPage =signInPage.addressPage();
		ShippingPage shippingPage = addressPage.proceedToCheckout();
		PaymentPage paymentPage = shippingPage.checkout();
		PaymentSubPage paymentSubPage =paymentPage.pay();
		paymentSubPage.confirm();
	}
}
