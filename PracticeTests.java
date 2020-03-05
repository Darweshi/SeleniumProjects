package com.seleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.seleniumProject.FunctionalTest;
import com.seleniumProject.HomePage;
public class PracticeTests {

	public static void main(String[] args) {
		WebDriver driver;
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Weshi\\Desktop\\java\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://automationpractice.com/index.php");

		HomePage homePage = new HomePage(driver);
    	homePage.show();
	}

}
