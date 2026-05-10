package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Payment extends BasePage {
	public Payment(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}
	@FindBy(xpath="/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")
	WebElement cartbtn;
	@FindBy(xpath="//a[@class='btn btn-default check_out']")
	WebElement checkout;
	@FindBy(xpath = "//a[text()='Place Order']")
	WebElement plorder;
	@FindBy(xpath = "//input[@name='name_on_card']")
	WebElement namecard;
	@FindBy(xpath = "//input[@name='card_number']")
	WebElement cardnum;
	@FindBy(xpath = "//input[@name='cvc']")
	WebElement cvc;
	@FindBy(xpath = "//input[@name='expiry_month']")
	WebElement month;
	@FindBy(xpath = "//input[@name='expiry_year']")
	WebElement year;
	@FindBy(xpath = "//button[@id='submit']")
	WebElement pay;
	public void pay(String namec, String cardn, String cvcnum, String mnth, String yr){
		cartbtn.click();
		checkout.click();
		plorder.click();
		namecard.sendKeys(namec);
		cardnum.sendKeys(cardn);
		cvc.sendKeys(cvcnum);
		month.sendKeys(mnth);
		year.sendKeys(yr);

		pay.click();
	}
}