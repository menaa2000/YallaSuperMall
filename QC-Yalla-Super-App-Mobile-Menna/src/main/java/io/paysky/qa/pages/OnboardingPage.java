package io.paysky.qa.pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class OnboardingPage extends AbstractClass {

    private final By egyptCountryRadioButton = AppiumBy.id("io.paysky.yalla:id/countries_Eg");
    private final By exploreButton = AppiumBy.id("io.paysky.yalla:id/explore_btn");

    public void clickOnEgyptCountryRadioButton() throws Exception {
        clickOnElement(egyptCountryRadioButton,100);
    }
    public void clickOnStartButton() throws Exception {
        clickOnElement(exploreButton,70);
    }

}
