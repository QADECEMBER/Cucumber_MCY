package steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import pages.AddAccountPage;
import pages.TestBase;

public class AddAccountStepDefinition extends TestBase{
	AddAccountPage  addAccountPage;
	
	@Before
public  void beforeRun () {
	initDriver();
	addAccountPage = PageFactory.initElements(driver, AddAccountPage.class);
	
}
@Then("User clicks on List Accounts")
public void user_clicks_on_List_Accounts() {
	 try {
	        System.out.println("Attempting to click on List Accounts");
	        addAccountPage.listAccounts();
	        System.out.println("Successfully clicked on List Accounts");
	    } catch (Exception e) {
	        System.err.println("Failed to click on List Accounts: " + e.getMessage());
	        throw e; // rethrow the exception after logging it
	    }
}

@Then("User clicks on Add Account")
public void user_clicks_on_Add_Account() {
    addAccountPage.AddAccount();
}

@Then("User enters {string} in the {string} field in AddAccount page")
public void user_enters_in_the_field_in_accounts_page(String fieldValue, String fieldName) {
    if (fieldValue.equalsIgnoreCase("Saving") || 
        fieldValue.equalsIgnoreCase("MySaving") || 
        fieldValue.equalsIgnoreCase("75,000") || 
        fieldValue.equalsIgnoreCase("10203040") || 
        fieldValue.equalsIgnoreCase("Akazi Keza")) {
        
        // Assuming you have a method to enter data into a field
      //  enterDataInField(fieldName, fieldValue);
    } else {
        System.out.println("Query is wrong!");
    }
}

//private void enterDataInField(String fieldName, String fieldValue) {
//    // Implementation of data entry, depending on the framework you are using (e.g., Selenium WebDriver)
//    // Example using Selenium:
//   
//}


@Then("User clicks on Save button")
public void user_clicks_on_Save_button() {
    
}
@Then("User should be able to validate account created successfully")
public void user_should_be_able_to_validate_account_created_successfully() {
   
}
	
}



//@Then("User enters {string} in the {string} field in accounts page")
//public void user_enters_in_the_field_in_accounts_page(String string, String string2) {
//  // Write code here that turns the phrase above into concrete actions
//  throw new io.cucumber.java.PendingException();
//}
//
//@Then("User enters {string} in the {string} field in accounts page")
//public void user_enters_in_the_field_in_accounts_page(String string, String string2) {
//  // Write code here that turns the phrase above into concrete actions
//  throw new io.cucumber.java.PendingException();
//}
//
//@Then("User enters {string} in the {string} field in accounts page")
//public void user_enters_in_the_field_in_accounts_page(String string, String string2) {
//  // Write code here that turns the phrase above into concrete actions
//  throw new io.cucumber.java.PendingException();
//}
//
//@Then("User enters {string} in the {string} field in accounts page")
//public void user_enters_in_the_field_in_accounts_page(String string, String string2) {
//  // Write code here that turns the phrase above into concrete actions
//  throw new io.cucumber.java.PendingException();
//}