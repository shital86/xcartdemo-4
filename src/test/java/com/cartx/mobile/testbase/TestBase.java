package com.cartx.mobile.testbase;

import com.cartx.mobile.propertyreader.PropertyReader;
import com.cartx.mobile.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase extends Utility {
    String browser= PropertyReader.getInstance().getProperty("browser");
    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);

    }
    @AfterMethod
    public void tearDown(){
        closeBrowser();
    }

}
