package com.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.pages.Payment;
import com.pages.Search;
import com.pages.Wishlist;

@Listeners(com.utilities.Listener.class)
public class SearchpaymentTest extends BaseTest {

	Search s;
	Wishlist w;
	Payment p;

	@BeforeMethod
	public void setupPages() {
		s = new Search(driver, wait);
		w = new Wishlist(driver, wait);
		p = new Payment(driver, wait);
	}
	@Test(priority = 1)
	public void searchProduct() {

	    s.searching("shirt");

	    Assert.assertTrue(
	            s.pageloaded().toLowerCase().contains("shirt"));
	}

	@Test(priority = 2, dependsOnMethods = "searchProduct")
	public void wishlistTest() {
	    s.chooseProduct();
	    w.addCart();
	    Assert.assertTrue(driver.getCurrentUrl().contains("view_cart"));
	}
	@Test(priority = 3, dependsOnMethods = "wishlistTest")
	public void paymentTest() {
	    p.pay("muhi","1234567890123456","123","01","2040");
	    Assert.assertTrue(
	            driver.getPageSource().contains("Order"));
	}
}