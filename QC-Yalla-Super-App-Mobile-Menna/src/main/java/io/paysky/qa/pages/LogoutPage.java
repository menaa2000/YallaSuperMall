package io.paysky.qa.pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class LogoutPage extends AbstractClass {

    private final By sideMenuButton = AppiumBy.id("io.paysky.yalla:id/open_side_nav");
    private final By signOutButton = AppiumBy.id("io.paysky.yalla:id/logout_btn");
    private final By confirmSignOutButton = AppiumBy.id("io.paysky.yalla:id/btn_positive");

    public void clickOnSideMenuButton() throws Exception {
        clickOnElement(sideMenuButton, 30);
    }
    public void clickOnSignOutButton() throws Exception{
        clickOnElement(signOutButton,30);
    }
    public void clickOnYesSignOutButton() throws Exception{
        clickOnElement(confirmSignOutButton,30);
    }
}
