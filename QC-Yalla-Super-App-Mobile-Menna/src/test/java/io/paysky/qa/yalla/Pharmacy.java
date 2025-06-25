package io.paysky.qa.yalla;

import io.paysky.qa.pages.HomePage;
import io.paysky.qa.pages.LoginPage;
import io.paysky.qa.pages.OnboardingPage;
import io.paysky.qa.pages.PinPaymentVerfication;
import io.paysky.qa.pages.pharmacy.*;
import io.paysky.qa.utilities.sharedComponent.SharedComponent;
import io.paysky.qa.utilities.testdata.Constant;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Pharmacy {


    final OnboardingPage onboardingPage = new OnboardingPage();
    final LoginPage loginPage = new LoginPage();
    final HomePage homePage = new HomePage();
    final PharmacyHomeScreen pharmacyHomeScreen= new PharmacyHomeScreen() ;
    final pharmacyStoreCategories pharmacyStores = new pharmacyStoreCategories() ;
    final MaskCategory maskCategory = new MaskCategory() ;
    final PharmacyPayment pharmacyPayment = new PharmacyPayment() ;
    final PinPaymentVerfication pinPaymentVerfication = new PinPaymentVerfication() ;
    final YallaPharmacyReciepet yallaPharmacyReciepet = new YallaPharmacyReciepet() ;
    final SharedComponent sharedComponent=new SharedComponent() ;


    @DataProvider(name = "BuyProductFromThePharamcy")
    public Object[][] buyMasksFromThePharamcyCategories() {
        return new Object[][]{
                {Constant.MSISDN, Constant.PIN_NUMBER , "Tahrir" , "Transaction completed successfully" },
        };
    }

    @Test(dataProvider = "BuyProductFromThePharamcy")
    public void buyMasksFromThePharamcyCategories( String mobileNum , String pin  , String location , String successMessage) throws Exception {
        sharedComponent.loginToMainMenu(mobileNum,pin);
        homePage.clickOnYallaPharmacyMiniApp();
        pharmacyHomeScreen.clickOnPharmacyStoreButton();
        pharmacyStores.clickOnMaskCategory();
        maskCategory.clickOnMasksProductIcon();
        homePage.scrollDown();
        maskCategory.clickOnTermsAndConditionCheckBox();
        maskCategory.clickOnAddToCartButton();
        maskCategory.clickOnGotoCartButtonInCartOverRelay();
        maskCategory.clickOnPayNowButton();
        pharmacyPayment.clickOnAddAdressButton();
        pharmacyPayment.enterLocationInSearchLocationBar(location );
        pharmacyPayment.ClickOnSelectLOcationButton();
        pharmacyPayment.clickOnConfirmButton();
        pinPaymentVerfication.enterPinInPinField(pin);
        Assert.assertEquals(yallaPharmacyReciepet.getSuccessMessage() , successMessage);
    }
}
