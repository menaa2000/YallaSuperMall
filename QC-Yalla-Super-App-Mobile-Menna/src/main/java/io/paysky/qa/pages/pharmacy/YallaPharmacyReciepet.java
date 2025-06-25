package io.paysky.qa.pages.pharmacy;

import io.appium.java_client.AppiumBy;
import io.paysky.qa.pages.AbstractClass;
import org.openqa.selenium.By;

public class YallaPharmacyReciepet extends AbstractClass {

    private final By successMessage = AppiumBy.id("io.paysky.yalla:id/textStatus");
    private final By amountValue = AppiumBy.id("io.paysky.yalla:id/tvField") ;
    private final By yallaFees = AppiumBy.id("io.paysky.yalla:id/tvFeesValue") ;
    public String getSuccessMessage() throws Exception {
       return findElementByLocatorWithVisibility(successMessage , 1 ).getText() ;
    }
    public void getAmountValu() throws Exception {
        findElementByLocatorWithVisibility(amountValue , 1 ).getText() ;
    }
    public void getYallaFees() throws Exception {
        findElementByLocatorWithVisibility(yallaFees , 1 ).getText() ;
    }

}
