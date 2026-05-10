package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wishlist extends BasePage {
	public Wishlist(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    @FindBy(xpath="//button[contains(text(),'Add to cart')]")
    WebElement addCart;
    @FindBy(xpath="//u[contains(text(),'View Cart')]")
    WebElement viewCart;

    public void addCart() {
        wait.until(ExpectedConditions.elementToBeClickable(addCart));
        addCart.click();

        wait.until(ExpectedConditions.elementToBeClickable(viewCart));
        viewCart.click();
    }
}