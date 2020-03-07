package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.seleniumProject.SubPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class SubPageSteps {
	WebDriver driver;

	@Given("^user is on sub page$")
    public void user_is_on_sub_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Weshi\\Desktop\\java\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?id_category=3&controller=category");

    }

    @When("^the user clicks the \\+ symbol$")
    public void the_user_clicks_the_symbol() throws Throwable {
    	SubPage subPage = new SubPage(driver);
    	subPage.menu();
    }
	
    @Then("^user is able to see specific options$")
    public void user_is_able_to_see_specific_options() throws Throwable {
    	driver.close();
    }
	
    @Given("^user on sub page$")
    public void user_on_sub_page() throws Throwable {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Weshi\\Desktop\\java\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?id_category=3&controller=category");

    }

    @When("^user clicks filters$")
    public void user_clicks_filters() throws Throwable {
    	SubPage subPage = new SubPage(driver);
    	subPage.fliter();
    }
   
    @Then("^results corresponding to the filters are shown$")
    public void results_corresponding_to_the_filters_are_shown() throws Throwable {
    	driver.close();
    }
  
    @Given("^the user is on sub page$")
    public void the_user_is_on_sub_page() throws Throwable {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Weshi\\Desktop\\java\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?id_category=3&controller=category");
    }

    @When("^user clicks a subcategory$")
    public void user_clicks_a_subcategory() throws Throwable {
    	SubPage subPage = new SubPage(driver);
    	subPage.subcategory();
    }
    
    @Then("^the user is redirected to desired category$")
    public void the_user_is_redirected_to_desired_category() throws Throwable {
    	driver.close();
    }
   
    @Given("^the user on sub page$")
    public void the_user_on_sub_page() throws Throwable {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Weshi\\Desktop\\java\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?id_category=3&controller=category");
    }
    
    @When("^the user clicks the alternate view and the user chooses how to sort the products$")
    public void the_user_clicks_the_alternate_view_and_the_user_chooses_how_to_sort_the_products() {
    	SubPage subPage = new SubPage(driver);
    	subPage.sort();
    }

     @Then("^the changes are displayed$")
    public void the_changes_are_displayed() throws Throwable {
    	 driver.close();
    }

    @Given("^the user chooses product from sub page$")
     public void the_user_chooses_product_from_sub_page() throws Throwable {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Weshi\\Desktop\\java\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?id_category=3&controller=category");
    }
   
    @When("^the user clicks a product$")
    public void the_user_clicks_a_product() throws Throwable {
    	SubPage subPage = new SubPage(driver);
    	subPage.clickProduct();
    }
   

    @Then("^the user is directed to page for product$")
    public void the_user_is_directed_to_page_for_product() throws Throwable {
    	driver.close();
    }

}
