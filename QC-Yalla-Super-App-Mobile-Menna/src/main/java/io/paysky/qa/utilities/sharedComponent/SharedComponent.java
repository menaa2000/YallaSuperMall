package io.paysky.qa.utilities.sharedComponent;

import io.paysky.qa.pages.AbstractClass;
import io.paysky.qa.pages.HomePage;
import io.paysky.qa.pages.LoginPage;
import io.paysky.qa.pages.OnboardingPage;
import io.paysky.qa.pages.yalla_money.SendMoneyBillScreen;
import io.paysky.qa.pages.yalla_money.SendMoneyCheckout;
import io.paysky.qa.pages.yalla_money.YallaMoneyHomeScreen;
import io.paysky.qa.utilities.DataFaker;

public class SharedComponent extends AbstractClass {
    final OnboardingPage onboardingPage = new OnboardingPage();
    final LoginPage loginPage = new LoginPage();
    final HomePage homePage = new HomePage();
    final YallaMoneyHomeScreen yallaMoneyHomeScreen = new YallaMoneyHomeScreen();
    final SendMoneyBillScreen sendMoneyBillScreen = new SendMoneyBillScreen() ;
    final SendMoneyCheckout sendMoneyCheckout = new SendMoneyCheckout() ;
    final DataFaker dataFaker = new DataFaker();

    public void  loginToMainMenu(String mobileNum , String pin ) throws Exception {
        onboardingPage.clickOnEgyptCountryRadioButton();
        onboardingPage.clickOnStartButton();
        loginPage.enterMobileNumberOnLoginScreen(mobileNum);
        loginPage.clickOnLoginButton();
        loginPage.enterLoginPin(pin);
        loginPage.clickOnLoginButton();
    }
    public  void goToYallaMoneyMiniApp() throws  Exception{
        homePage.clickOnYallaMoneyMiniApp();
        homePage.scrollDown();
    }
    public void sendAmount() throws Exception{
        yallaMoneyHomeScreen.enterAmountInAmountField(dataFaker.createAmountOfMoney());
        yallaMoneyHomeScreen.clickOnSendButton();
    }
    public void sendMoneyCheckout( String pin) throws Exception{
        sendMoneyBillScreen.clickOnConfirmButton();
        sendMoneyCheckout.EnterPinInPinField(pin);
        sendMoneyCheckout.clickOnYesButtonInAppPreview();
    }
}
