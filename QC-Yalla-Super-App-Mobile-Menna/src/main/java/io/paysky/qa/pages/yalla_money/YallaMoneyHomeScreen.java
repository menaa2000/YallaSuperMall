package io.paysky.qa.pages.yalla_money;

import io.appium.java_client.AppiumBy;
import io.paysky.qa.pages.AbstractClass;
import org.openqa.selenium.By;

public class YallaMoneyHomeScreen  extends AbstractClass {
    private final By PaySendIcon = AppiumBy.id("io.paysky.yalla:id/desc20");
    private final By mobileNumberField = AppiumBy.id("io.paysky.yalla:id/mobile_number") ;
    private final By amountField = AppiumBy.id("io.paysky.yalla:id/et_amount") ;
    private final By sendButton = AppiumBy.id("io.paysky.yalla:id/btn_request") ;
    private final By requestMoneyIcon = AppiumBy.xpath("//androidx.cardview.widget.CardView[@resource-id=\"io.paysky.yalla:id/con_collect_money\"]/android.view.ViewGroup") ;
    private final By invalidPhoneValidationMessage = AppiumBy.id("io.paysky.yalla:id/toast_text");
    private final By savedNumber = AppiumBy.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"io.paysky.yalla:id/rvPrevious\"]/androidx.appcompat.widget.LinearLayoutCompat[1]/android.widget.ImageView") ;
    private final By emailOption = AppiumBy.xpath("(//androidx.appcompat.widget.LinearLayoutCompat[@resource-id=\"io.paysky.yalla:id/constraint\"])[2]");
    private final By emailTextField = AppiumBy.id("io.paysky.yalla:id/email");
    private final By emailConfirmButton = AppiumBy.id("io.paysky.yalla:id/btn_positive");

    public void clickOnPayAndSendIcon() throws Exception {
        findElementByLocatorWithVisibility(PaySendIcon,15).click();
    }
    public void enterMsidinInMobileNumberField(String msisdin) throws Exception {
        typeText(mobileNumberField,msisdin , 10);
    }
    public void enterAmountInAmountField(String amount) throws Exception {
        typeText(amountField,amount , 10);
    }
    public void clickOnSendButton() throws Exception {
        findElementByLocatorWithVisibility(sendButton,5).click();
    }
    public void  clickOnRequestIcon() throws Exception {
        findElementByLocatorWithVisibility(requestMoneyIcon ,15).click();
    }
    public String getErrorMessageWhenEnterInvalidPhone() throws Exception {
        return findElementByLocatorWithVisibility(invalidPhoneValidationMessage, 20).getText();
    }
    public void clickOnSavedNumber() throws Exception {
        clickOnElement(savedNumber,5);
    }
    public void clickOnEmailOption() throws Exception {
        clickOnElement(emailOption,5);
    }
    public void enterEmailInEmailField(String email) throws Exception{
        typeText(emailTextField,email,5);
    }
    public void confirmEmail() throws Exception
    {
      clickOnElement(emailConfirmButton,5);
    }
}
