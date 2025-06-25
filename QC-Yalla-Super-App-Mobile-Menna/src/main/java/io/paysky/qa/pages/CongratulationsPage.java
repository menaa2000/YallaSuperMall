package io.paysky.qa.pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class CongratulationsPage extends AbstractClass {

    private final By goToHomeButton = AppiumBy.id("io.paysky.yalla:id/tv_skip_for_now");

    public HomePage clickOnGoToHome() throws Exception {
        clickOnElement(goToHomeButton, 10);
        return new HomePage();
    }
}
