package io.paysky.qa.yalla;

import io.paysky.qa.pages.HomePage;
import io.paysky.qa.pages.LoginPage;
import io.paysky.qa.pages.OnboardingPage;
import io.paysky.qa.pages.yalla_money.SendMoneyBillScreen;
import io.paysky.qa.pages.yalla_money.SendMoneyCheckout;
import io.paysky.qa.pages.yalla_money.YallaKhairScreen;
import io.paysky.qa.pages.yalla_money.YallaMoneyHomeScreen;
import io.paysky.qa.utilities.DataFaker;
import io.paysky.qa.utilities.sharedComponent.SharedComponent;
import io.paysky.qa.utilities.testdata.Constant;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SendMoney {
    final OnboardingPage onboardingPage = new OnboardingPage();
    final LoginPage loginPage = new LoginPage();
    final HomePage homePage = new HomePage();
    final YallaMoneyHomeScreen yallaMoneyHomeScreen = new YallaMoneyHomeScreen();
    final SendMoneyBillScreen sendMoneyBillScreen = new SendMoneyBillScreen() ;
    final SendMoneyCheckout sendMoneyCheckout = new SendMoneyCheckout() ;

    final YallaKhairScreen YallaKhair= new YallaKhairScreen();
    final DataFaker dataFaker = new DataFaker();
    final SharedComponent sharedComponent=new SharedComponent() ;
    @DataProvider(name = "SendMoneyThroughEmail")
    public static Object[][] SendMoneyThroughEmail() {
        return new Object[][]{{Constant.MSISDN, Constant.PIN_NUMBER  , "Transaction completed successfully", Constant.EMAIL},

        };
    }

    @DataProvider(name = "DonateThroughYallaKhair")
    public static Object[][] DonateThroughYallaKhair() {
        return new Object[][]{{Constant.MSISDN, Constant.PIN_NUMBER  , ""},

        };
    }

    @DataProvider(name = "SendMoneyThroughInvalidEmail")
    public static Object[][] SendMoneyThroughInvalidEmail() {
        return new Object[][]{{Constant.MSISDN, Constant.PIN_NUMBER  , "Invalid email address"},

        };
    }
    @DataProvider(name = "SendMoneyThroughMobileNumber")
    public Object[][] SendMoneyThroughMobileNumber() {
        return new Object[][]{
                {Constant.MSISDN, Constant.PIN_NUMBER  , "Transaction completed successfully"},
        };
    }

    @Test(dataProvider = "SendMoneyThroughMobileNumber")
    public void sendMoneyToRegisteredMobileNumber( String mobileNum , String pin  , String successMessage ) throws Exception {
        sharedComponent.loginToMainMenu(mobileNum,pin);
        sharedComponent.goToYallaMoneyMiniApp();
        yallaMoneyHomeScreen.clickOnPayAndSendIcon();
        yallaMoneyHomeScreen.enterMsidinInMobileNumberField(Constant.registeredMsisdin);
        sharedComponent.sendAmount();
        Assert.assertEquals( sendMoneyBillScreen.getTotalAmount(),String.valueOf(sendMoneyBillScreen.billCheck()));
        sharedComponent.sendMoneyCheckout(pin);
        Assert.assertEquals(sendMoneyCheckout.getSucessMessage() ,successMessage);
    }


    @Test(dataProvider = "SendMoneyThroughMobileNumber")
    public void sendMoneyToPreviousTransactionThroughMobile(String mobileNum, String pin, String successMessage) throws Exception {
        sharedComponent.loginToMainMenu(mobileNum,pin);
        sharedComponent.goToYallaMoneyMiniApp();
        yallaMoneyHomeScreen.clickOnPayAndSendIcon();
        yallaMoneyHomeScreen.clickOnSavedNumber();
        sharedComponent.sendAmount();
        Assert.assertEquals( sendMoneyBillScreen.getTotalAmount(),String.valueOf(sendMoneyBillScreen.billCheck()));
        sharedComponent.sendMoneyCheckout(pin);
        Assert.assertEquals(sendMoneyCheckout.getSucessMessage() ,successMessage);
    }

    @Test(dataProvider = "SendMoneyThroughEmail")
    public void sendMoneyThroughEmail(String mobileNum, String pin, String successMessage,String email) throws Exception {
        sharedComponent.loginToMainMenu(mobileNum,pin);
        sharedComponent.goToYallaMoneyMiniApp();
        yallaMoneyHomeScreen.clickOnPayAndSendIcon();
        yallaMoneyHomeScreen.clickOnEmailOption();
        //yallaMoneyHomeScreen.enterEmailInEmailField(dataFaker.createEmail());
        yallaMoneyHomeScreen.enterEmailInEmailField(email);
        sharedComponent.sendAmount();
        yallaMoneyHomeScreen.confirmEmail();
        Assert.assertEquals( sendMoneyBillScreen.getTotalAmount(),String.valueOf(sendMoneyBillScreen.billCheck()));
        sharedComponent.sendMoneyCheckout(pin);
        Assert.assertEquals(sendMoneyCheckout.getSucessMessage() ,successMessage);
    }
    @Test(dataProvider = "SendMoneyThroughInvalidEmail")
    public void sendMoneyWihInvalidData(String mobileNum, String pin, String errorMessage) throws Exception {
        sharedComponent.loginToMainMenu(mobileNum,pin);
        sharedComponent.goToYallaMoneyMiniApp();
        yallaMoneyHomeScreen.clickOnPayAndSendIcon();
        yallaMoneyHomeScreen.clickOnEmailOption();
        yallaMoneyHomeScreen.enterEmailInEmailField(dataFaker.createInvalidEmail());
        sharedComponent.sendAmount();
        Assert.assertTrue(sendMoneyCheckout.getErrorMessage().contains("Invalid email address"));

    }

    @Test(dataProvider = "DonateThroughYallaKhair")
    public void  payThroughYallaKhair(String mobileNum, String pin, String successMessage) throws Exception {
        sharedComponent.loginToMainMenu(mobileNum,pin);
        homePage.clickOnYallaKhairIcon();
        YallaKhair.clickOnDarOrmanIcon();
        YallaKhair.chooseService();
        YallaKhair.clickonSakBaladi();
        YallaKhair.clickOnPayButton();
        YallaKhair.scrollDown();
        YallaKhair.clickOnConfirmButton();
        Assert.assertEquals(sendMoneyCheckout.getSucessMessage(),successMessage);

    }


}
