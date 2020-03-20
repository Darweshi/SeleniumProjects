package stepdefinitions;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.seleniumProject.HomePage;
import com.seleniumProject.OrderPage;
import com.seleniumProject.SignInPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDefinitions {
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
	 
	@Given("^the user is on home page$")
	public void the_user_is_on_home_page() throws Throwable {
		driver.navigate().to("http://automationpractice.com/index.php");
	}

	@When("^user clicks on search bar and inputs valid text then clicks search$")
	public void user_clicks_on_search_bar_and_inputs_valid_text_then_clicks_search() throws Throwable {
		HomePage homePage = new HomePage(driver);
		homePage.search("dress");
	}

	@When("^user clicks on search bar and inputs valid \"([^\"]*)\" then clicks search$")
	public void user_clicks_on_search_bar_and_inputs_valid_something_then_clicks_search(String text, String strArg1)
			throws Throwable {
	}

	@Then("^the user is shown consistent results$")
	public void the_user_is_shown_consistent_results() throws Throwable {
		HomePage homePage = new HomePage(driver);
		assertEquals("\"dress\"", homePage.checkSearch().toLowerCase());
	}

	@Given("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
		driver.navigate().to("http://automationpractice.com/index.php");
	}

	@When("^user clicks the slide$")
	public void user_clicks_the_slide() throws Throwable {
		HomePage homePage = new HomePage(driver);
		homePage.chooseSlide();
	}

	@Then("^the user is redirected to a different page$")
	public void the_user_is_redirected_to_a_different_page() throws Throwable {
		HomePage homePage = new HomePage(driver);
		String s = Boolean.toString(homePage.slideIsGone());
    	assertTrue(s, true);
	}

	@Given("^user is on the home page$")
	public void user_is_on_the_home_page() throws Throwable {
		driver.navigate().to("http://automationpractice.com/index.php");
	}
	
	HomePage homePage1 = new HomePage(driver);

	@When("^user clicks the sign in tab$")
	public void user_clicks_the_sign_in_tab() throws Throwable {
		HomePage home = new HomePage(driver);
		homePage1 = home;
		homePage1.signIn();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Then("^the user is redirected to the login page$")
	public void the_user_is_redirected_to_the_login_page() {
		SignInPage signInPage = homePage1.sign();
   	 	assertEquals(signInPage.checkSignIn(),"AUTHENTICATION");
	}

	@Given("^the user is on the home page$")
	public void the_user_is_on_the_home_page() throws Throwable {
		driver.navigate().to("http://automationpractice.com/index.php");

	}
	HomePage homePage = new HomePage(driver);

	@When("^user clicks the cart tab$")
	public void user_clicks_the_cart_tab() throws Throwable {
		HomePage home = new HomePage(driver);
		homePage =home;
		OrderPage orderPage = homePage.checkCart();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Then("^the user is redirected to respective cart$")
	public void the_user_is_redirected_to_respective_cart() throws Throwable {
		OrderPage orderPage = new OrderPage(driver);
		assertEquals(orderPage.cartCheck(),"SHOPPING-CART SUMMARY");
	}

	@Given("^User chooses item from home page$")
	public void user_chooses_item_from_home_page() throws Throwable {
		driver.navigate().to("http://automationpractice.com/index.php");
	}
	HomePage homePage2 = new HomePage(driver);
	@When("^user clicks button add to cart$")
	public void user_clicks_button_add_to_cart() throws Throwable {
		HomePage home = new HomePage(driver);
		homePage2 = home;
		homePage2.addItem();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@Then("^the user checks cart$")
	public void the_user_checks_cart() throws Throwable {
		HomePage home = new HomePage(driver);
		OrderPage orderPage = homePage2.checkout();
	}

	@Then("^the item is in users cart$")
	public void the_item_is_in_users_cart() throws Throwable {
		OrderPage orderPage = new OrderPage(driver);
		String s = Boolean.toString(orderPage.checkSummary());
    	assertTrue(s, true);
	}
	
}
