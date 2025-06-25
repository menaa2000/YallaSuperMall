package io.paysky.qa.pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class PinPaymentVerfication extends AbstractClass{
    private final By pinField = AppiumBy.id("io.paysky.yalla:id/sms_verification_et");
    public void enterPinInPinField(String pin) throws Exception {
        typeText(pinField, pin, 5);
    }
}
