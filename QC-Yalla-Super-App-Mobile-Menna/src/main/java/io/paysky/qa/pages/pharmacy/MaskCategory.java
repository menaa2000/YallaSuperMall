package io.paysky.qa.pages.pharmacy;

import io.appium.java_client.AppiumBy;
import io.paysky.qa.pages.AbstractClass;
import org.openqa.selenium.By;

public class MaskCategory extends AbstractClass {
    private final By masksProductIcon = AppiumBy.id("io.paysky.yalla:id/product_name");
    private final By termsAndConditionCheckBox = AppiumBy.id("io.paysky.yalla:id/terms_checkbox") ;
    private final By addToCartButton = AppiumBy.id("io.paysky.yalla:id/add_product_to_cart_btn" ) ;
    private final By goToCartButton = AppiumBy.id("io.paysky.yalla:id/btn_positive") ;
    private final By addMoreButton = AppiumBy.id("io.paysky.yalla:id/btn_negative") ;
    private final By payNowButton = AppiumBy.id("io.paysky.yalla:id/btn_checkout");

    public void clickOnMasksProductIcon () throws Exception {
        findElementByLocatorWithVisibility(masksProductIcon , 10).click();
    }
    public void scrollToEnd(){
        scrollDown(10);
    }
    public void clickOnTermsAndConditionCheckBox() throws Exception {

      //  scrollTo(termsAndConditionCheckBox , true);
        findElementByLocatorWithVisibility(termsAndConditionCheckBox , 1 ).click();
    }
    public void clickOnAddToCartButton() throws Exception {
        findElementByLocatorWithVisibility(addToCartButton , 1 ).click();
    }
    public void clickOnGotoCartButtonInCartOverRelay() throws Exception {
        findElementByLocatorWithVisibility(goToCartButton , 1 ).click();
    }

    public void clickOnAddMoreButtonInCartOverRelay() throws Exception {
        findElementByLocatorWithVisibility(addMoreButton , 1 ).click();
    }
    public void clickOnPayNowButton () throws Exception {
        findElementByLocatorWithVisibility(payNowButton , 10 ).click();

    }
}
