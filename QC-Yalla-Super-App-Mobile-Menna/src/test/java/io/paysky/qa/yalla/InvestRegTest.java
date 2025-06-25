package io.paysky.qa.yalla;

import io.paysky.qa.pages.YallaInvest;
import io.paysky.qa.pages.yalla_money.YallaInvestReg;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.testng.Tag;
import org.testng.annotations.Test;

public class InvestRegTest {
    final YallaInvestReg investReg = new YallaInvestReg();
    @Description("Invest with Registered user")
    @Owner("Amira Ayman")
    @Tag("End-To-End")
    @Test
    public void InvestRegTest() throws Exception{
        investReg.ClickOnFirstItemInInvest();
        investReg.scrollToEnd();
        investReg.ClickOnTermsAndConditionArrow();
        investReg.scrollToEnd();
        investReg.ClickOnAgreeOnTerms();
        investReg.ClickOnAddToCartButton();
        investReg.ClickOnCheckoutButton();
        investReg.ClickOnCheckoutCart();
        investReg.ClickOnConfirmButton();
    }
}
