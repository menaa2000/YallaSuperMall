package io.paysky.qa.pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class RegisterPage extends AbstractClass{

    private final By registerationTitle = AppiumBy.id("io.paysky.yalla:id/custom_toolbar_title_tv");
    private final By firstNameField = AppiumBy.id("io.paysky.yalla:id/et_firstName");
    private final By lastNameField = AppiumBy.id("io.paysky.yalla:id/et_last_name");
    private final By femaleRadioButton = AppiumBy.id("io.paysky.yalla:id/radio_female");
    private final By maleRadioButton = AppiumBy.id("io.paysky.yalla:id/radio_female");
    private final By termsAndConditionsCheckBox = AppiumBy.id("io.paysky.yalla:id/terms_condition_cb");
    private final By userAgreementCheckBox = AppiumBy.id("io.paysky.yalla:id/user_agreement_cb");
    private final By dateOfBirthField = AppiumBy.id("io.paysky.yalla:id/et_birthDate");
    private final By completeButton = AppiumBy.id("io.paysky.yalla:id/btn_complete_register");
    private final By birthdateClanderIcon = AppiumBy.id("io.paysky.yalla:id/img_birthDate");
    private final By okayButtonInCalnder = AppiumBy.id("android:id/button1");
    private final By verficationCodeField = AppiumBy.id("io.paysky.yalla:id/sms_verification_et");
    private final By pinCodeField = AppiumBy.id("io.paysky.yalla:id/pin_verification_et") ;
    private  final By saveButton = AppiumBy.id("io.paysky.yalla:id/save_btn") ;


    public String getRegisterationTitle() throws Exception {
        return getTextFromElement(registerationTitle,5);
    }
    public void enterFirstName(String firstName) throws Exception {
        typeText(firstNameField,firstName,3);    }

    public void enterLastName(String lastName) throws Exception {
        typeText(lastNameField,lastName,3);    }
    public void selectMaleRadioButton() throws Exception {
        clickOnElement(maleRadioButton,20);    }
    public void selectFemaleRadioButton() throws Exception {
        clickOnElement(femaleRadioButton,20);    }

    public void selectRandomGenderButton(String randomGender) throws Exception {
        if (randomGender.equals("Male")) {
            selectMaleRadioButton();
        } else if (randomGender.equals("Female")) {
            selectFemaleRadioButton();
        }
    }
    public void enterCodeInVerficationCodeField(String verificationCode) throws Exception {
        typeText(verficationCodeField,verificationCode,3);    }
    public void clickOnTermsAndConditionsAndUserAgreement() throws Exception {
        clickOnElement(termsAndConditionsCheckBox,5);
        clickOnElement(userAgreementCheckBox,5);
    }
    public void clickOnCompleteButton() throws Exception {
        clickOnElement(completeButton,10);
    }
    public void clickOnBirthdateClanderIcon() throws Exception {
        clickOnElement(birthdateClanderIcon,5);
        clickOnElement(okayButtonInCalnder,3);
    }
    public void enterNewPin(String newPin) throws Exception {
        typeText(pinCodeField,newPin,10);
        clickOnElement(saveButton,3);
    }
}
