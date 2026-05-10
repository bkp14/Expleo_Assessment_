package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountInfo extends BasePage {
	public AccountInfo(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}
	@FindBy(xpath = "//a[normalize-space()='Signup / Login']")
	WebElement loginbtn;
	@FindBy(xpath = "//input[@name='name']")
	WebElement username;
	@FindBy(xpath = "//input[@data-qa='signup-email']")
	WebElement signemail;
	@FindBy(xpath = "//button[normalize-space()='Signup']")
	WebElement click;
	@FindBy(xpath = "//input[@id='id_gender1']")
	WebElement gender;
	@FindBy(xpath = "//input[@id='password']")
	WebElement pass;
	@FindBy(xpath = "//input[@id='first_name']")
	WebElement firstname;
	@FindBy(xpath = "//input[@id='last_name']")
	WebElement lastname;
	@FindBy(xpath = "//input[@id='address1']")
	WebElement add;
	@FindBy(xpath = "//input[@id='state']")
	WebElement state;
	@FindBy(xpath = "//input[@id='city']")
	WebElement city;
	@FindBy(xpath = "//input[@id='zipcode']")
	WebElement zipcode;
	@FindBy(xpath = "//input[@id='mobile_number']")
	WebElement mob;
	@FindBy(xpath = "//button[normalize-space()='Create Account']")
	WebElement button;
	@FindBy(xpath = "//b[text()='Account Created!']")
	WebElement acc;
	@FindBy(xpath = "//p[text()='Email Address already exist!']")
	WebElement emailExists;

	public void accdata(String uname, String email, String password, String fname, String lname, String address,String stat, String cit, String code, String mobile) {
		loginbtn.click();
		username.sendKeys(uname);
		signemail.sendKeys(email);
		click.click();

		if (driver.getPageSource().contains("Email Address already exist!")) {
			return;
		}
		gender.click();
		pass.sendKeys(password);
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		add.sendKeys(address);
		state.sendKeys(stat);
		city.sendKeys(cit);
		zipcode.sendKeys(code);
		mob.sendKeys(mobile);
		button.click();
	}

	public String gettext() {
		return acc.getText();
	}

	public String getEmailExistsMsg() {
		return emailExists.getText();
	}
}