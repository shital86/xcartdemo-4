package com.cartx.mobile.pages;

import com.cartx.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class HotDealsTest extends Utility {
    By hotdeals = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]");
    By sale = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[1]");
    By sortby = By.xpath("//span[contains(text(),'Sort by:')]");
    By aTozOption = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]");
    By zToaOption = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[6]/a[1]");
    By lowToHigh = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]");
    By rates = By.xpath("//span[contains(text(),'Rates')]");
    By productOrderByName = By.xpath("//ul[@class='products-grid grid-list']/li/div/h5/a");
    By productOrderByPrice = By.xpath("//ul[@class='products-grid grid-list']/li/div/div[2]//span[@class='price product-price']");
    By productOrderByRates = By.xpath("//ul[@class='products-grid grid-list']/li/div/div[2]//div[@class='stars-row full']");


    public void mouseHoverOnHotDeals() {

        mouseHoverToElement(hotdeals);
    }

    public void clickOnSale() {

        mouseHoverToElementAndClick(sale);
    }

    public void sortBy() {
        mouseHoverToElement(sortby);
    }

    public void aTozoption() {
        mouseHoverToElementAndClick(aTozOption);
    }

    public void zToaoption() {
        clickOnElement(zToaOption);
    }

    public void byRates() {
        clickOnElement(rates);
    }

    public void lowToHigh() {
        clickOnElement(lowToHigh);
    }

    public List<WebElement> getItemsListByName() {
        return listOfWebElementsList(productOrderByName);
    }

    public List<WebElement> getItemsListByPrice() {
        return listOfWebElementsList(productOrderByPrice);
    }

    public List<WebElement> getItemsListByRates() {
        return listOfWebElementsList(productOrderByRates);
    }

    public List<WebElement> aTozOrderList() {
        List<WebElement> lisTOSort = getItemsListByName();
        List<Double> myList = new ArrayList<>();
        for (WebElement data : lisTOSort) {
            String a = data.getText().substring(1).replace(".", "");
            Double a1 = Double.valueOf(a);
            myList.add(a1);
        }
        return lisTOSort;
    }

    public List<Double> orderByPriceList() {
        List<WebElement> list = getItemsListByPrice();
        List<Double> myList = new ArrayList<>();
        for (WebElement data : list) {
            String a = data.getText().substring(1).replace(".", "");
            Double a1 = Double.valueOf(a);
            myList.add(a1);
        }
        return myList;
    }

    public List<String> getRatesOrderList() {
        List<WebElement> lisTOSort = getItemsListByRates();
        List<String> myList = new ArrayList<>();
        for (WebElement data : lisTOSort) {
            String a = data.getDomAttribute("Style");
            myList.add(a);
        }
        return myList;
    }

}






