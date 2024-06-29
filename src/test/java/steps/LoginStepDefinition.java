package steps;


import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.Database;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefinition extends TestBase {
	LoginPage loginPage;
Database database;
	@Before
	public void beforeRun () {
	initDriver();
	loginPage= PageFactory.initElements(driver, LoginPage.class);
	
}
	@Given("User is on the codefios login page")
	public void user_is_on_the_codefiosl_ogin_page() {
		driver.get("https://codefios.com/ebilling/");

	}

	@When("User enters username as{string}")
	public void user_enters_username_as(String username) {
		loginPage = PageFactory.initElements(driver, LoginPage.class); // page object model
		loginPage.enterUserName(username);
	}
	

//	@When ("^User enters username as\"([^\"]*)\"$")
//	public void user_enters_username_as(String username) {
//		
//	}
	@When("User enters password as {string}")
	public void user_enters_password_as(String password) {
		loginPage.enterPassword(password);

	}
	@When("User enters {string} from database")
	public void user_enters_from_database(String loginData) {
	 if (loginData.equalsIgnoreCase("username")) {
	 loginPage.enterUserName(database.getDataFromDb("user_name"));
	 System.out.println("User_name from DB:"+ database.getDataFromDb("user_name"));
	 }else if (loginData.equalsIgnoreCase("password")) {
	 loginPage.enterPassword(database.getDataFromDb("password"));
	 System.out.println("Password from DB:"+ database.getDataFromDb("password"));
	 }else {
		 System.out.println("unable to retrieve login data!");
	 }
	 
//	 switch (loginData) {
//	 case"username":
//		 loginPage.enterUserName(getDataFromDb);	 
//	 }
	 }
	
	@When("User clicks on the Sign in button")
	public void userClicksOnTheSignInButton() {
		loginPage.clickSignInButton();
	}

	@Then("User lands on dashboard page")
	public void user_lands_on_dashboard_page() {
		takeScreenShot(driver);
		String expectedTitle = "Codefios";
		String actualTitle = loginPage.getPageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}




	@After
	public void tearDown () {
		driver.close();
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	// }
//	@When("User enters username as\"demo@codefios,com\"")
//	public void user_enters_username_as_demo_codefios_com() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	    loginPage.enterUserName(username);
//	}
//
//	@When("User enters password as {string}")
//	public void user_enters_password_as(String string) {
//		
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
////	    loginPage = PageFactory.initElements(driver, LoginPage.class);
//	    loginPage.enterPassword(password);
//	}
//
//	@When("User clicks on the Sign in button")
//	public void user_clicks_on_the_Sign_in_button() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	   loginPage.click
//	}
//
//	@Then("User lands on dashboard page")
//	public void user_lands_on_dashboard_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	
}
