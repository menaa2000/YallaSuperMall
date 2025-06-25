package io.paysky.qa.pages.pharmacy;

import io.appium.java_client.AppiumBy;
import io.paysky.qa.pages.AbstractClass;
import org.openqa.selenium.By;

public class pharmacyStoreCategories extends AbstractClass {
    private final By masksCategory = AppiumBy.xpath("//android.widget.TextView[@text=\"Masks\"]");
    private final By shampooCategory = AppiumBy.xpath("//android.widget.TextView[@text=\"Shampoo\"]") ;

    public void clickOnMaskCategory() throws Exception {
        findElementByLocatorWithVisibility(masksCategory , 10 ).click();
    }

    public void clickOnShampooCategory() throws Exception {
        findElementByLocatorWithVisibility(shampooCategory , 1 ).click();
    }
}
