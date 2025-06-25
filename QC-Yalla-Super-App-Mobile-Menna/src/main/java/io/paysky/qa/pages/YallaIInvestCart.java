package io.paysky.qa.pages;

import io.appium.java_client.AppiumBy;
import net.datafaker.App;
import org.openqa.selenium.By;
import org.testng.internal.PackageUtils;

public class YallaIInvestCart extends AbstractClass{
    private final By Checkout = AppiumBy.id("io.paysky.yalla:id/btn_checkout");
    private final By StoreButton = AppiumBy.id("io.paysky.yalla:id/cv_storage");
    private final By AgreeTermsCheckBox = AppiumBy.id("io.paysky.yalla:id/checkbox_agree_to_agent");
    private final By BuyAndStoreButton = AppiumBy.id("io.paysky.yalla:id/btn_buy");
    private final By ConfirmButton = AppiumBy.id("io.paysky.yalla:id/btn_confirm");
    private final By pinField = AppiumBy.id("io.paysky.yalla:id/sms_verification_et");
    private final By ReviewButton = AppiumBy.id("io.paysky.yalla:id/btn_no");
    private final By BuyAndDeliveryButton = AppiumBy.id("io.paysky.yalla:id/btn_buy");
    private final By AddAddressButton = AppiumBy.xpath("//android.widget.TextView[@text=\"Add new address\"]");
    private final By PermissionAccessLocationButton = AppiumBy.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
    private final By SearchLocation = AppiumBy.id("io.paysky.yalla:id/et_search");
    private final By ChooseLocation = AppiumBy.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"io.paysky.yalla:id/recycler_view\"]/android.widget.LinearLayout[1]");
    private final By ConfirmAddressButton = AppiumBy.id("io.paysky.yalla:id/btn_select_current_location");
    private final By SelectCityButton = AppiumBy.id("io.paysky.yalla:id/cityId");
    private final By SelectALX = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"io.paysky.yalla:id/cityNameId\" and @text=\"Alexandria\"]");


    public void ClickOnCheckoutCart () throws Exception{
        clickOnElement(Checkout,15);
    }
    public void ClickOnStoreButton() throws Exception{
        clickOnElement(StoreButton,15);
    }

    public void ClickOnAgreeTermsCheckBox () throws Exception{
        clickOnElement(AgreeTermsCheckBox,15);
    }
    public void ClickOnBuyAndStoreButton () throws Exception{
        clickOnElement(BuyAndStoreButton,20);
    }
    public void ClickOnBuyAndDeliveryButton () throws Exception{
        clickOnElement(BuyAndDeliveryButton,20);
    }
    public void ClickOnAddAddressButton () throws Exception{
        clickOnElement(AddAddressButton,20);
    }
    public void ClickOnPermissionAccessLocationButton () throws Exception{
        clickOnElement(PermissionAccessLocationButton,20);
    }
    public void SearchForLocation(String Location) throws Exception {
        typeText(SearchLocation,Location,30);
    }
    public void ChooseLocation() throws Exception{
        clickOnElement(ChooseLocation,30);
    }
    public void ClickOnConfirmAddressButton() throws Exception {
        clickOnElement(ConfirmAddressButton,30);
    }
    public void ClickOnSelectCityButton() throws Exception {
        clickOnElement(SelectCityButton,30);
    }
    public void ClickOnALXCity() throws Exception {
        clickOnElement(SelectALX,30);
    }
    public void ClickOnConfirmButton () throws Exception{
        clickOnElement(ConfirmButton,30);
    }
    public void enterPin(String pin) throws Exception {
        typeText(pinField,pin,30);
    }
    public void ClickOnReviewButton () throws Exception {
        clickOnElement(ReviewButton,60);
    }
}
