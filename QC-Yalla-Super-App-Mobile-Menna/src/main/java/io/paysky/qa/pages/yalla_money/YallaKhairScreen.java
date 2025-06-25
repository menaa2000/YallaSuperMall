package io.paysky.qa.pages.yalla_money;

import io.appium.java_client.AppiumBy;
import io.paysky.qa.pages.AbstractClass;
import org.openqa.selenium.By;

public class YallaKhairScreen extends AbstractClass {

    private final By Dar_Orman = AppiumBy.id("io.paysky.yalla:id/imgBiller");

    private final By Service = AppiumBy.id("io.paysky.yalla:id/first_services");

    private final By SakBaladi = AppiumBy.name("Sak Baladi");

    private final By PayButton = AppiumBy.id("io.paysky.yalla:id/confirm_button");
    private final By ConfirmButton=AppiumBy.id("io.paysky.yalla:id/confirm_button");
    public void clickOnDarOrmanIcon() throws Exception{
        clickOnElement(Dar_Orman,10);
    }
    public void chooseService() throws  Exception{
        clickOnElement(Service,5);
    }
    public void clickonSakBaladi() throws Exception{
        clickOnElement(SakBaladi,5);
    }

    public void clickOnPayButton() throws Exception{
        clickOnElement(PayButton,5);
    }
    public void clickOnConfirmButton() throws  Exception{
        clickOnElement(ConfirmButton,5);
    }
    public void scrollDown() throws Exception {
        scrollDown(15);
    }
}
