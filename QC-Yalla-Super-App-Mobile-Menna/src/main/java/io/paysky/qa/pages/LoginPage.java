package io.paysky.qa.pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class LoginPage extends AbstractClass {

    private final By msisdnInput = AppiumBy.id("io.paysky.yalla:id/mobileNumber");
    private final By loginButton = AppiumBy.id("io.paysky.yalla:id/btn_login");
    private final By pinField = AppiumBy.id("io.paysky.yalla:id/et_otp");
    private final By yallaAppLogo = AppiumBy.id("io.paysky.yalla:id/iv_yalla");
    private static final By UpdatePopup = AppiumBy.id("io.paysky.yalla:id/btn_switch1");


    public void clickOnNoThanksButton() throws Exception {
        clickOnElement(UpdatePopup,25);
    }

    public void enterMobileNumberOnLoginScreen(String mobileNumber) throws Exception {

       typeText(msisdnInput,mobileNumber,30);
    }
    public void clickOnLoginButton() throws Exception {
        clickOnElement(loginButton,50);
    }
    public void enterLoginPin(String pin) throws Exception {
        typeText(pinField,pin,30);    }
    public boolean getYallaMiniAppsHeader() throws Exception {
        return findElementByLocatorWithVisibility(yallaAppLogo,5) .isDisplayed();
    }
    public void getMobileNumberOnLoginScreen() throws Exception{
        findElementByLocatorWithVisibility(msisdnInput, 50).isDisplayed();
    }
}
