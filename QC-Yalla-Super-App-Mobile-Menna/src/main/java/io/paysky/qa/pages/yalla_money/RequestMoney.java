package io.paysky.qa.pages.yalla_money;

import io.appium.java_client.AppiumBy;
import io.paysky.qa.pages.AbstractClass;
import org.openqa.selenium.By;

public class RequestMoney extends AbstractClass {

    private final By Message = AppiumBy.id("io.paysky.yalla:id/toast_text") ;
    public String getHnadlingMessage() throws Exception {
        return   findElementByLocatorWithVisibility(Message , 3 ).getText();
    }
}
