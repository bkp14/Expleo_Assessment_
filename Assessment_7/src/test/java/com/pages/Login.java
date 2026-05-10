package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login extends BasePage {
    public Login(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    @FindBy(xpath = "//a[normalize-space()='Signup / Login']")
    WebElement loginBtn;
    @FindBy(xpath = "//input[@data-qa='login-email']")
    WebElement username;
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement password;
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement clickLogin;
    @FindBy(xpath = "//p[normalize-space()='Your email or password is incorrect!']")
    WebElement invalid;
    @FindBy(xpath = "//a[contains(text(),'Logged in as')]")
    WebElement loggedIn;
    public void senddata(String user, String pass) {
        loginBtn.click();
        username.sendKeys(user);
        password.sendKeys(pass);
        clickLogin.click();
    }

    public void inValidLogin(String user, String pass) {
        senddata(user, pass);
    }
    public String getLoginText() {
        return loggedIn.getText();
    }
    public String getInvalidCreation() {
        return invalid.getText();
    }
}