package io.paysky.qa.pages.yalla_money;

import io.appium.java_client.AppiumBy;
import io.paysky.qa.pages.AbstractClass;
import org.openqa.selenium.By;

public class YallaInvestReg extends AbstractClass {
    private final By FirstProductItem = AppiumBy.xpath("//android.widget.GridView[@resource-id=\"io.paysky.yalla:id/rv_products\"]/androidx.cardview.widget.CardView[1]/android.view.ViewGroup");
    private final By TermsAndConditionsArrow = AppiumBy.id("io.paysky.yalla:id/terms_show_arrow");
    private final By AgreeOnTermsCheckBox = AppiumBy.id("io.paysky.yalla:id/terms_checkbox");
    private final By AddToCartButton = AppiumBy.id("io.paysky.yalla:id/add_product_to_cart_btn");
    private final By CheckoutButton = AppiumBy.id("io.paysky.yalla:id/btn_positive");
    private final By Checkout = AppiumBy.id("io.paysky.yalla:id/btn_checkout");
    private final By ConfirmButton = AppiumBy.id("io.paysky.yalla:id/btn_comfirm");

    public void ClickOnFirstItemInInvest() throws Exception {
        clickOnElement(FirstProductItem,50);
    }
    public void scrollToEnd(){
        scrollDown(50);
    }
    public void ClickOnTermsAndConditionArrow () throws Exception{
        clickOnElement(TermsAndConditionsArrow,50);
    }
    public void ClickOnAgreeOnTerms() throws Exception {
        clickOnElement(AgreeOnTermsCheckBox,30);
    }
    public void ClickOnAddToCartButton() throws Exception {
        clickOnElement(AddToCartButton,30);
    }
    public void ClickOnCheckoutButton() throws Exception {
        clickOnElement(CheckoutButton,30);
    }
    public void ClickOnCheckoutCart () throws Exception{
        clickOnElement(Checkout,15);
    }
    public void ClickOnConfirmButton() throws Exception{
        clickOnElement(ConfirmButton,15);
    }
}
