package com.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.pages.AccountInfo;
import com.pages.Login;
import com.utilities.Datas;

@Listeners(com.utilities.Listener.class)
public class AccountInfoTest extends BaseTest {
    @Test(priority = 1, dataProvider="RegisterData", dataProviderClass=Datas.class)
    public void register(String uname, String email, String password,String fname, String lname, String address,String stat, String cit, String code, String mobile) {
        AccountInfo acc = new AccountInfo(driver, wait);
        acc.accdata(uname, email, password, fname, lname,address, stat, cit, code, mobile);
        Assert.assertTrue(acc.gettext().equalsIgnoreCase("Account Created!"));
        System.out.println("test 1 passed");
    }
    @Test(priority = 2, dataProvider="RegisterData", dataProviderClass=Datas.class)
    public void registerExisting(String uname, String email, String password,String fname, String lname, String address, String stat, String cit, String code, String mobile) {
        AccountInfo acc = new AccountInfo(driver, wait);
        acc.accdata(uname, email, password, fname, lname,address, stat, cit, code, mobile);
        Assert.assertEquals(acc.getEmailExistsMsg(),"Email Address already exist!");
        System.out.println("test 2 passed");
    }

    @Test(priority = 3, dataProvider="Logindata", dataProviderClass=Datas.class)
    public void validlog(String email, String password) {
        Login l = new Login(driver, wait);
        l.senddata(email, password);
        Assert.assertTrue(l.getLoginText().contains("Logged in as"));
        System.out.println("test 3 passed");
    }

    @Test(priority = 4, dataProvider="InvalidLogin", dataProviderClass=Datas.class)
    public void Invalidlog(String email, String password) {
        Login l = new Login(driver, wait);
        l.inValidLogin(email, password);
        Assert.assertEquals(l.getInvalidCreation(),"Your email or password is incorrect!");
        System.out.println("test 4 passed");
    }
}