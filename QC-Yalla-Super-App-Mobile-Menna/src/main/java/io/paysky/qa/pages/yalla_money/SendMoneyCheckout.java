package io.paysky.qa.pages.yalla_money;

import io.appium.java_client.AppiumBy;
import io.paysky.qa.pages.AbstractClass;
import org.openqa.selenium.By;

public class SendMoneyCheckout extends AbstractClass {
    private final By pinField = AppiumBy.id("io.paysky.yalla:id/sms_verification_et");
    private final By yesButtonInAppReview = AppiumBy.id("io.paysky.yalla:id/btn_confirm");
    private final By successMessage = AppiumBy.id("io.paysky.yalla:id/textStatus");
    private final By errorMessage = AppiumBy.id("io.paysky.yalla:id/toast_icon");

    public void EnterPinInPinField(String pin) throws Exception {
        clickOnElement(pinField, 5);
        typeText(pinField, pin, 5);
    }

    public void clickOnYesButtonInAppPreview() throws Exception {
        clickOnElement(yesButtonInAppReview,10);
    }
    public String getSucessMessage() throws Exception {
    return findElementByLocatorWithVisibility(successMessage, 20).getText();
    }
    public String getErrorMessage() throws Exception {
        return findElementByLocatorWithVisibility(errorMessage, 25).getText();
    }
}