package com.cartx.mobile.pages;

import com.cartx.mobile.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By shipping = By.linkText("Shipping");
    By shippingText = By.xpath("//h1[@id='page-title']");
    By newOnTopMenu = By.linkText("New!");
    By newText = By.xpath("//h1[@id='page-title']");
    By comingsoon = By.linkText("Coming soon");
    By comingsoonText = By.xpath("//h1[@id='page-title']");
    By contactus = By.linkText("Contact us");
    By contactUsText = By.xpath("//h1[@id='page-title']");

    public void clickOnShippingText() {
        clickOnElement(shipping);
    }

    public String verifyingTextShipping() {
        return getTextFromElement(shippingText);

    }

    public void clickOnNew() {
        clickOnElement(newOnTopMenu);
    }

    public String verifyingTextNew() {
        return getTextFromElement(newText);
    }

    public void clickOnComingSoonMenu() {
        clickOnElement(comingsoon);
    }

    public String verifyingComingSoonText() {
        return getTextFromElement(comingsoonText);
    }

    public void contactusMenu() {
        clickOnElement(contactus);
    }

    public String verifyingContactUsText() {
        return getTextFromElement(contactUsText);
    }


}
