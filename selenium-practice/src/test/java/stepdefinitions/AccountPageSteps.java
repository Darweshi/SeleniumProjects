package stepdefinitions;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.seleniumProject.AddressPage;
import com.seleniumProject.CreateAccountPage;
import com.seleniumProject.SignInPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountPageSteps {
	WebDriver driver;
	 @Before
		public void setUp(){ 
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Weshi\\Desktop\\java\\chromedriver.exe");
			driver = new ChromeDriver();
		   } 
	 
	 @After
	 public void afterScenario(){
		 driver.close();
	 }

	@Given("^the user is on the sign in page$")
    public void the_user_is_on_the_sign_in_page() throws Throwable {
		driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account");

    }
	SignInPage signInPage = new SignInPage(driver);

    @When("^the user enter new email$")
    public void the_user_enter_new_email() throws Throwable {
    	SignInPage signPage = new SignInPage(driver);
    	signInPage=signPage;
    	signInPage.createEmail();
    }
    
    @And("^the user navigates to create account page$")
    public void the_user_navigates_to_create_account_page() throws Throwable {
    	CreateAccountPage CreateAccountPage = signInPage.account();
    	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @And("^inputs their name$")
    public void inputs_their_name() throws Throwable {
    	CreateAccountPage accountPage = new CreateAccountPage(driver);
    	accountPage.enterName();
    }

    @And("^chooses their gender$")
    public void chooses_their_gender() throws Throwable {
    	CreateAccountPage accountPage = new CreateAccountPage(driver);
    	accountPage.chooseGender();
    }

    @And("^user enters password$")
    public void user_enters_password() throws Throwable {
    	CreateAccountPage accountPage = new CreateAccountPage(driver);
    	accountPage.enterPassword();
    }

    @And("^user enters address$")
    public void user_enters_address() throws Throwable {
    	CreateAccountPage accountPage = new CreateAccountPage(driver);
    	accountPage.enterAddress();
    }
    @Then("^user clicks submit and is redirected to their account$")
    public void user_clicks_submit_and_is_redirected_to_their_account() throws Throwable {
    	CreateAccountPage accountPage = new CreateAccountPage(driver);
    	AddressPage addressPage =accountPage.submit();
    	assertEquals(addressPage.checkPage(),"MY ACCOUNT");
    }
 
}
