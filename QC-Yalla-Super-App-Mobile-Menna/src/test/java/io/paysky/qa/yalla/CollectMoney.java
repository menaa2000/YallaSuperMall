package io.paysky.qa.yalla;
import io.paysky.qa.pages.yalla_money.RequestMoney;
import io.paysky.qa.pages.HomePage;
import io.paysky.qa.pages.LoginPage;
import io.paysky.qa.pages.OnboardingPage;
import io.paysky.qa.pages.yalla_money.YallaMoneyHomeScreen;
import io.paysky.qa.utilities.DataFaker;
import io.paysky.qa.utilities.sharedComponent.SharedComponent;
import io.paysky.qa.utilities.testdata.Constant;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CollectMoney {
    final DataFaker dataFaker = new DataFaker();
    final OnboardingPage onboardingPage = new OnboardingPage();
    final LoginPage loginPage = new LoginPage();
    final HomePage homePage = new HomePage();
    final YallaMoneyHomeScreen yallaMoneyHomeScreen = new YallaMoneyHomeScreen();
    final RequestMoney requestMoney = new RequestMoney() ;
    final SharedComponent sharedComponent=new SharedComponent() ;
    @DataProvider(name = "collectMoneyFromValidMobileNumber")
    public Object[][] collectMoneyFromRegisteredMobileNUm() {
        return new Object[][]{
                {Constant.MSISDN, Constant.PIN_NUMBER, Constant.registeredMsisdin, "Request Sent Successfully"},
        };
    }
    @Test(dataProvider = "collectMoneyFromValidMobileNumber")
    public void collectMoneyFromRegisteredMobileNumber( String mobileNum , String pin , String registeredMobileNUM , String successMessage ) throws Exception {
        sharedComponent.loginToMainMenu(mobileNum,pin);
        sharedComponent.goToYallaMoneyMiniApp();
        yallaMoneyHomeScreen.clickOnRequestIcon();
        yallaMoneyHomeScreen.enterMsidinInMobileNumberField(registeredMobileNUM);
        yallaMoneyHomeScreen.enterAmountInAmountField(dataFaker.createAmountOfMoney());
        yallaMoneyHomeScreen.clickOnSendButton();
        Assert.assertEquals(requestMoney.getHnadlingMessage() , successMessage);
    }

    @DataProvider(name = "collectMoneyFromInValidMobileNumber")
    public Object[][] collectMoneyFromUNRegisteredMobileNUm() {
        return new Object[][]{
                {Constant.MSISDN, Constant.PIN_NUMBER ,Constant.unregisteredMsisdin , "Invalid Phone"},
        };
    }

    @Test(dataProvider = "collectMoneyFromInValidMobileNumber")
    public void collectMoneyFromUnRegisteredMobileNumber( String mobileNum , String pin , String unregisteredMobileNUM , String failureMessage ) throws Exception {
        sharedComponent.loginToMainMenu(mobileNum,pin);
        sharedComponent.goToYallaMoneyMiniApp();
        yallaMoneyHomeScreen.clickOnRequestIcon();
        yallaMoneyHomeScreen.enterMsidinInMobileNumberField(unregisteredMobileNUM);
        yallaMoneyHomeScreen.enterAmountInAmountField(dataFaker.createAmountOfMoney());
        yallaMoneyHomeScreen.clickOnSendButton();
        Assert.assertEquals(requestMoney.getHnadlingMessage() , failureMessage);
    }
}
