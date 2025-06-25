package io.paysky.qa.pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class HomePage extends AbstractClass {
    private final By yallaAppLogo = AppiumBy.id("io.paysky.yalla:id/iv_yalla");
    private final By yallaMoneyMiniApp = AppiumBy.id("io.paysky.yalla:id/con_money");
    private final By yallaPharmacyMiniApp = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"io.paysky.yalla:id/category_title\" and @text=\"Yalla Pharmacy\"]") ;

    private final By Yalla_Khair = AppiumBy.xpath("(//android.widget.ImageView[@resource-id=\"io.paysky.yalla:id/category_image\"])[7]");

    private final By Wheel_popup_dismiss_Button = AppiumBy.id("io.paysky.yalla:id/ic_close");
    private final By yallaInvestAppIcon = AppiumBy.xpath("//android.widget.GridView[@resource-id=\"io.paysky.yalla:id/services_rv\"]/android.widget.FrameLayout[2]/androidx.cardview.widget.CardView/androidx.appcompat.widget.LinearLayoutCompat");
    private final By AdDismissButton = AppiumBy.id("io.paysky.yalla:id/btn_negative");
    public void ClickOnInvestAppIcon() throws Exception {
        clickOnElement(yallaInvestAppIcon,30);
    }
    public boolean getYallaMiniAppsHeader() throws Exception {
        boolean YallaAppLogo = findElementByLocatorWithVisibility(yallaAppLogo,40) .isDisplayed();
        return YallaAppLogo;
    }
    public void clickOnWheelDismissButton() throws Exception {
        clickOnElement(Wheel_popup_dismiss_Button,50);
    }
    public void clickOnAdDismissButton() throws Exception {
        clickOnElement(AdDismissButton,50);
    }
    public void clickOnYallaMoneyMiniApp() throws Exception {
        clickOnElement(yallaMoneyMiniApp,20);
    }
    public void clickOnYallaPharmacyMiniApp () throws Exception {
        clickOnElement(yallaPharmacyMiniApp,20);
    }

    public void scrollDown() throws Exception {
        scrollDown(20);
    }

    public void clickOnYallaKhairIcon() throws Exception {

        clickOnElement(Yalla_Khair,5);
    }


}
