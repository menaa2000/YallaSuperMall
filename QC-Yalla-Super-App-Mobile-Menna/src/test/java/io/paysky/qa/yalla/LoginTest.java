package io.paysky.qa.yalla;

import io.paysky.qa.utilities.testdata.Constant;
import io.paysky.qa.pages.OnboardingPage;
import io.paysky.qa.pages.LoginPage;
import io.paysky.qa.pages.HomePage;
import org.testng.annotations.Test;


public class LoginTest {
    final OnboardingPage onboardingPage = new OnboardingPage();
    final LoginPage loginPage = new LoginPage();
    final HomePage homePage = new HomePage();


    @Test(priority = 1)
    public void ValidLoginWithMsisdn() throws Exception {

        onboardingPage.clickOnEgyptCountryRadioButton();
        onboardingPage.clickOnStartButton();
        //loginPage.clickOnNoThanksButton();
        loginPage.enterMobileNumberOnLoginScreen(Constant.registeredMsisdin2);
        loginPage.clickOnLoginButton();
        loginPage.enterLoginPin(Constant.PIN_NUMBER);
        loginPage.clickOnLoginButton();
        //homePage.clickOnWheelDismissButton();
       // homePage.clickOnAdDismissButton();
        homePage.getYallaMiniAppsHeader();
        homePage.ClickOnInvestAppIcon();
    }
}
