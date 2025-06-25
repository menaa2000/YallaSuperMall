package io.paysky.qa.yalla;

import io.paysky.qa.pages.HomePage;
import io.paysky.qa.pages.LoginPage;
import io.paysky.qa.pages.LogoutPage;
import io.paysky.qa.pages.OnboardingPage;
import io.paysky.qa.utilities.sharedComponent.SharedComponent;
import io.paysky.qa.utilities.testdata.Constant;
import org.testng.annotations.Test;

public class LogoutTest { final OnboardingPage onboardingPage = new OnboardingPage();
    final LoginPage loginPage = new LoginPage();
    final HomePage homePage = new HomePage();
    final LogoutPage logoutPage = new LogoutPage();
    final SharedComponent sharedComponent=new SharedComponent() ;

    @Test
    public void validLogOut() throws Exception {
        onboardingPage.clickOnEgyptCountryRadioButton();
        onboardingPage.clickOnStartButton();
        loginPage.enterMobileNumberOnLoginScreen(Constant.MSISDN);
        loginPage.clickOnLoginButton();
        loginPage.enterLoginPin(Constant.PIN_NUMBER);
        loginPage.clickOnLoginButton();
        logoutPage.clickOnSideMenuButton();
        logoutPage.clickOnSignOutButton();
        logoutPage.clickOnYesSignOutButton();
        loginPage.getMobileNumberOnLoginScreen();
    }
}
