package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Search extends BasePage{

	public Search(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		// TODO Auto-generated constructor stub
	}
	 @FindBy(xpath = "//a[contains(text(),'Products')]")
	 WebElement proBtn;
	 @FindBy(xpath="//input[@id='search_product']")
	 WebElement searchbar;
	 @FindBy(xpath="//button[@id='submit_search']")
	 WebElement clickicon;
	 @FindBy(xpath="//div[@class='productinfo text-center']/p")
	 WebElement check;
	 @FindBy(xpath="//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[2]//ul[1]//li[1]//a[1]")
	 WebElement firstProduct;
	 @FindBy(xpath="//button[@type='button']")
	 WebElement addtocartbtn;
	 @FindBy(xpath="//button[text()='Continue Shopping']")
	 WebElement continuebtn;
	 public void searching(String item) {
		 proBtn.click();
		 searchbar.click();
		 searchbar.sendKeys(item);
		 clickicon.click();
	 }
	 public String pageloaded() {
		 return check.getText();
	 }
	 public void chooseProduct() {
	        firstProduct.click();
	        addtocartbtn.click();
	        continuebtn.click();
	    }
}
