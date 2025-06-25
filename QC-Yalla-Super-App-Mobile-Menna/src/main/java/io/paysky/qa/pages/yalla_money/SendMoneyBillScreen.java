package io.paysky.qa.pages.yalla_money;

import io.appium.java_client.AppiumBy;
import io.paysky.qa.pages.AbstractClass;
import org.openqa.selenium.By;

public class SendMoneyBillScreen extends AbstractClass {
 double   sumOfAllValues ;
    private final By amountSentValue = AppiumBy.id("io.paysky.yalla:id/tv_amount_value") ;
    private final By yallaFeesValue = AppiumBy.id("io.paysky.yalla:id/tv_fees_value") ;
    private final By vatValue = AppiumBy.id("io.paysky.yalla:id/tv_vat_value") ;
    private final By totalAmount = AppiumBy.id("io.paysky.yalla:id/tv_total_value") ;
    private final By confirmButton = AppiumBy.id("io.paysky.yalla:id/btn_confirm") ;
    public Double billCheck() throws Exception {
        double vat = Double.parseDouble(findElementByLocatorWithVisibility(vatValue, 5).getText());
        double yallaFees = Double.parseDouble(findElementByLocatorWithVisibility(yallaFeesValue, 5).getText());
        double amountSent = Double.parseDouble(findElementByLocatorWithVisibility(amountSentValue, 5).getText());
        return  sumOfAllValues = vat + yallaFees + amountSent;
    }

    public String getTotalAmount() throws Exception {
       return findElementByLocatorWithVisibility(totalAmount,5).getText() ;

    }
    public void clickOnConfirmButton() throws Exception {
        clickOnElement(confirmButton,5);
    }
}