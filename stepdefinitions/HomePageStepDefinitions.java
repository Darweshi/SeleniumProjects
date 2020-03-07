package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.seleniumProject.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDefinitions {
	WebDriver driver;

	@Given("^the user is on home page$")
	public void the_user_is_on_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Weshi\\Desktop\\java\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
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
		driver.close();
	}

	@Given("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Weshi\\Desktop\\java\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
	}

	@When("^user clicks the slide$")
	public void user_clicks_the_slide() throws Throwable {
		HomePage homePage = new HomePage(driver);
		homePage.chooseSlide();
	}

	@Then("^the user is redirected to a different page$")
	public void the_user_is_redirected_to_a_different_page() throws Throwable {
		driver.close();
	}

	@Given("^user is on the home page$")
	public void user_is_on_the_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Weshi\\Desktop\\java\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
	}

	@When("^user clicks the sign in tab$")
	public void user_clicks_the_sign_in_tab() throws Throwable {
		HomePage homePage = new HomePage(driver);
		homePage.signIn();
	}

	@Then("^the user is redirected to the login page$")
	public void the_user_is_redirected_to_the_login_page() {
		driver.close();
	}

	@Given("^the user is on the home page$")
	public void the_user_is_on_the_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Weshi\\Desktop\\java\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");

	}

	@When("^user clicks the cart tab$")
	public void user_clicks_the_cart_tab() throws Throwable {
		HomePage homePage = new HomePage(driver);
		homePage.checkCart();
	}

	@Then("^the user is redirected to respective cart$")
	public void the_user_is_redirected_to_respective_cart() throws Throwable {
		driver.close();
	}

	@Given("^User chooses item from home page$")
	public void user_chooses_item_from_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Weshi\\Desktop\\java\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
	}

	@When("^user clicks button add to cart$")
	public void user_clicks_button_add_to_cart() throws Throwable {
		HomePage homePage = new HomePage(driver);
		homePage.clickItems();
	}

	@Then("^the user checks cart$")
	public void the_user_checks_cart() throws Throwable {
		HomePage homePage = new HomePage(driver);
		homePage.checkCart();
	}

	@Then("^the item is in users cart$")
	public void the_item_is_in_users_cart() throws Throwable {
		driver.close();
	}
	
}
