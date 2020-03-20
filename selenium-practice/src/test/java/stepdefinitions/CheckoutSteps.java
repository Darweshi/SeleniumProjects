package stepdefinitions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.seleniumProject.AddressPage;
import com.seleniumProject.HomePage;
import com.seleniumProject.OrderPage;
import com.seleniumProject.PaymentPage;
import com.seleniumProject.PaymentSubPage;
import com.seleniumProject.ShippingPage;
import com.seleniumProject.SignInPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutSteps {
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
	@Given("^the user starts on the home page$")
	public void the_user_is_on_the_home_page() throws Throwable {
		driver.navigate().to("http://automationpractice.com/index.php");
	}

	HomePage homePage = new HomePage(driver);

	@When("^the user adds an item to cart$")
	public void the_user_adds_an_item_to_cart() throws Throwable {
		HomePage home = new HomePage(driver);
		homePage = home;
		homePage.addItem();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	OrderPage orderPage = new OrderPage(driver);

	@And("^the user clicks on the cart$")
	public void the_user_clicks_on_the_cart() throws Throwable {
		OrderPage order = homePage.checkout();
		orderPage = order;
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	SignInPage signInPage = new SignInPage(driver);

	@And("^the user navigates to sign in tab$")
	public void the_user_navigates_to_sign_in_tab() throws Throwable {
		SignInPage signIn = orderPage.checkout();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@And("^the user signs in to their account$")
	public void the_user_signs_in_to_their_account() throws Throwable {
		SignInPage signIn = new SignInPage(driver);
		signInPage = signIn;
		signInPage.signInEmail();
		signInPage.signInPasswd();
	}

	AddressPage addressPage = new AddressPage(driver);

	@Then("^the user proceeds to the address page$")
	public void the_user_proceeds_to_the_address_page() throws Throwable {
		AddressPage address = signInPage.addressPage();
		addressPage = address;
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	ShippingPage shippingPage = new ShippingPage(driver);

	@Then("^the user procceds to the shipping page$")
	public void the_user_procceds_to_the_shipping_page() throws Throwable {
		ShippingPage shipping = addressPage.proceedToCheckout();
		shippingPage = shipping;
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	PaymentPage paymentPage = new PaymentPage(driver);

	@Then("^the user proceeds to payment page$")
	public void the_user_proceeds_to_payment_page() throws Throwable {
		PaymentPage payment = shippingPage.checkout();
		paymentPage = payment;
	}

	@Then("^the user chooses the prefered way to pay$")
    public void the_user_chooses_the_prefered_way_to_pay() throws Throwable {
		PaymentSubPage paymentSubPage = paymentPage.pay();
		
	}
	@And("^the user confirms payment$")
	public void the_user_confirms_payment() throws Throwable {
		PaymentSubPage paymentSubPage = new PaymentSubPage(driver);
		paymentSubPage.confirm();

	}

	@Then("^the user is given a reciept with confirmation$")
	public void the_user_is_given_a_reciept_with_confirmation() throws Throwable {
		PaymentSubPage paymentSubPage = new PaymentSubPage(driver);
		assertEquals(paymentSubPage.checkConfirmation(),"ORDER CONFIRMATION");
	}

}
