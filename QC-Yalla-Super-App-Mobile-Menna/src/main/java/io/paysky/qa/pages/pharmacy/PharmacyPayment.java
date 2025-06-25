package io.paysky.qa.pages.pharmacy;

import io.appium.java_client.AppiumBy;
import io.paysky.qa.pages.AbstractClass;
import org.openqa.selenium.By;

public class PharmacyPayment extends AbstractClass {
    private final By addAdressButton  = AppiumBy.id("io.paysky.yalla:id/btn_add_address");
    private final By confirmButton = AppiumBy.id("io.paysky.yalla:id/btn_confirm") ;
    private final By searchLocationBar = AppiumBy.id("io.paysky.yalla:id/et_search_location") ;
    private final By firstLocationOption = AppiumBy.xpath("(//android.widget.TextView[@resource-id=\"io.paysky.yalla:id/text_view_title\"])[1]") ;
    private final By selectLocationButton = AppiumBy.id("io.paysky.yalla:id/btn_select_current_location") ;


    public void clickOnAddAdressButton () throws Exception {
        findElementByLocatorWithVisibility(addAdressButton, 10 ).click();
    }
    public void clickOnConfirmButton() throws Exception {
        findElementByLocatorWithVisibility(confirmButton , 1 ).click();
    }

    public void enterLocationInSearchLocationBar(String location) throws Exception {
        findElementByLocatorWithVisibility(searchLocationBar , 1 ).click();
        typeText(searchLocationBar , location , 1 ) ;
    }
//    public void clickOnFirstLocationOption() throws Exception {
//        findElementByLocatorWithVisibility(firstLocationOption , 1 ).click();
//    }
    public void ClickOnSelectLOcationButton() throws Exception {
        findElementByLocatorWithVisibility(selectLocationButton , 1 ).click();
    }
}
