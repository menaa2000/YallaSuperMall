package io.paysky.qa.yalla;

import io.paysky.qa.pages.*;
import io.paysky.qa.utilities.DataFaker;
import io.paysky.qa.utilities.testdata.Constant;
import org.testng.annotations.Test;

public class RegistrationTrialTest {
    final OnboardingPage onboardingPage = new OnboardingPage();
    final LoginPage loginPage = new LoginPage();
    final HomePage homePage = new HomePage();
    final DataFaker dataFaker = new DataFaker();
    final RegisterPage registerPage = new RegisterPage();
    final CongratulationsPage congratulationsPage = new CongratulationsPage();
    @Test(priority = 1)
    public void registerUsingNewMsisdin() throws Exception {
        onboardingPage.clickOnEgyptCountryRadioButton();
        onboardingPage.clickOnStartButton();
        loginPage.enterMobileNumberOnLoginScreen(dataFaker.generateEGMSISDN());
        loginPage.clickOnLoginButton();
        registerPage.enterCodeInVerficationCodeField(Constant.PHONE_VERIFICATION_CODE);
        registerPage.enterFirstName(dataFaker.firstAndLastName());
        registerPage.enterLastName(dataFaker.firstAndLastName());
        registerPage.selectRandomGenderButton(dataFaker.generateRandomGender());
        registerPage.clickOnBirthdateClanderIcon();
        registerPage.clickOnTermsAndConditionsAndUserAgreement();
        registerPage.clickOnCompleteButton();
        registerPage.enterNewPin(dataFaker.createNewPIN());
        congratulationsPage.clickOnGoToHome();
        homePage.getYallaMiniAppsHeader();
    }
}
