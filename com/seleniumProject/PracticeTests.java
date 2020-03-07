package com.seleniumProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.seleniumProject.FunctionalTest;
import com.seleniumProject.HomePage;
public class PracticeTests {

	public static void main(String[] args) {
		WebDriver driver;
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Weshi\\Desktop\\java\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.get("http://automationpractice.com/index.php");
			
			HomePage homePage = new HomePage(driver);
			homePage.addItem();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			OrderPage orderPage=homePage.checkout();	
			
			SignInPage signInPage =orderPage.checkout();
			signInPage.signInEmail();
			signInPage.signInPasswd();
			AddressPage addressPage =signInPage.addressPage();
			
		}

}
