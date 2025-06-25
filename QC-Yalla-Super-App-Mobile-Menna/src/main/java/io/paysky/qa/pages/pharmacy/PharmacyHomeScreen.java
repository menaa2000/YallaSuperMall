package io.paysky.qa.pages.pharmacy;

import io.appium.java_client.AppiumBy;
import io.paysky.qa.pages.AbstractClass;
import org.openqa.selenium.By;

public class PharmacyHomeScreen extends AbstractClass {
    private final By pharmacyStoreButton = AppiumBy.xpath("//android.widget.TextView[@text=\"Pharmacy Store\"]");
    private final By scanYourPrescriptionButton = AppiumBy.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]") ;


    public void clickOnPharmacyStoreButton() throws Exception {
        findElementByLocatorWithVisibility(pharmacyStoreButton , 10 ).click();
    }
    public void clickOnScanYourPrescriptionButton() throws Exception {
        findElementByLocatorWithVisibility(scanYourPrescriptionButton , 1 ) .click();
    }
}
