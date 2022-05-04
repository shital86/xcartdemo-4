package com.cartx.mobile.testsuite;

import com.cartx.mobile.pages.BestSellers;
import com.cartx.mobile.pages.HomePage;
import com.cartx.mobile.pages.HotDealsTest;
import com.cartx.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShippingMenu extends TestBase {
    HomePage homePage = new HomePage();
    HotDealsTest hotDealsTest = new HotDealsTest();
    BestSellers bestSellers=new BestSellers();

    @Test
    public void shippingbtn() {
        homePage.clickOnShippingText();
        String expected = "Shipping";
        String actual = homePage.verifyingTextShipping();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void newBtn() {
        homePage.clickOnNew();
        String expectedMsg = "New arrivals";
        String actualMsg = homePage.verifyingTextNew();
        Assert.assertEquals(expectedMsg, actualMsg);
    }

    @Test
    public void comingSoonBtn() {
        homePage.clickOnComingSoonMenu();
        String expected = "Coming soon";
        String actual = homePage.verifyingComingSoonText();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void contactUsBtn() {
        homePage.contactusMenu();
        String expected = "Contact us";
        String actual = homePage.verifyingContactUsText();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void verifyingsaleProductLowtoHigh() {

        hotDealsTest.getItemsListByPrice();
    }
    @Test
    public void verifySaleProductsArrangeByRates() {

        hotDealsTest.getRatesOrderList();

    }@Test
    public void verifyingBestSeller()throws InterruptedException{
        hotDealsTest.mouseHoverOnHotDeals();
        Thread.sleep(1000);
        bestSellers.mouseHoverOnBestSellers();
        String expected="Bestsellers";
        String actual= bestSellers.bestSellerText();
        Assert.assertEquals(expected,actual);
    }
}




