package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddAccountPage {
WebDriver driver;

public AddAccountPage(WebDriver driver) {
	this.driver = driver;
}
	
	//Element Library
	@FindBy(how= How.XPATH, using = "/html/body/div[1]/aside[1]/div/nav/ul[2]/li[3]/a/span")
	WebElement ListAccounts;
	@FindBy(how= How.XPATH, using = "/html/body/div[1]/section/div/div[2]/div/div[1]/div/div[2]/header/button")
	WebElement AddAccount;
	@FindBy(how= How.XPATH, using = "//*[@id=\"account_name\"]")
	WebElement AccountName;	
	@FindBy(how= How.XPATH, using = "//*[@id=\"description\"]")
	WebElement Description;
	@FindBy(how= How.XPATH, using = "//*[@id=\"balance\"]")
	WebElement InitialBalance;
	@FindBy(how= How.XPATH, using = "//*[@id=\"account_number\"]")
	WebElement AccountNumber;
	@FindBy(how= How.XPATH, using = "//*[@id=\"contact_person\"]")
	WebElement ContactPerson;
	@FindBy(how= How.XPATH, using ="//*[@id=\"accountSave\"]")
	WebElement Save;
	
	
	//Methods to interact with the elements
	
	public void listAccounts() {
		ListAccounts.click();
		try {
			Thread.sleep(3000);
			
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	public void AddAccount() {
		AddAccount.click();
		try {
			Thread.sleep(3000);
			
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		

		
	}
	public void accountName(String accountName) {
		AccountName.sendKeys(accountName);
		try {
			Thread.sleep(3000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
public void description(String description) {
		Description.sendKeys(description);
		try {
			Thread.sleep(3000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
public void initialBalance(String initialBalance) {
	InitialBalance.sendKeys(initialBalance);
	try {
		Thread.sleep(3000);
		
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}
public void accountNumber(String accountNumber) {
	AccountNumber.sendKeys(accountNumber);
	try {
		Thread.sleep(3000);
		
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}
public void contactPerson(String contactPerson) {
	ContactPerson.sendKeys(contactPerson);
	try {
		Thread.sleep(3000);
		
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}
public void saveButton() {
	Save.click();
	try {
		Thread.sleep(3000);
		
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}
}
