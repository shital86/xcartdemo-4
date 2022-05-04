package com.cartx.mobile.pages;

import com.cartx.mobile.utility.Utility;
import org.openqa.selenium.By;

public class BestSellers extends Utility {
    By bestSellers = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]");
    By bestSellersText=By.xpath("//h1[@id='page-title']");

    public void mouseHoverOnBestSellers() {
        mouseHoverToElementAndClick(bestSellers);

    }public String bestSellerText(){
        return getTextFromElement(bestSellersText);
    }
}
