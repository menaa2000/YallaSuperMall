package io.paysky.qa.yalla;

import io.paysky.qa.pages.*;
import io.paysky.qa.utilities.testdata.Constant;
import io.qameta.allure.Description;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.testng.Tag;
import org.testng.annotations.Test;

public class InvestTestStorage {
    final YallaInvest yallaInvest = new YallaInvest();
    final YallaIInvestCart yallaIInvestCart = new YallaIInvestCart();
    @Description("Store order invest")
    @Owner("Amira Ayman")
    @Tag("End-To-End")
    @Test
    public void Store_order_invest() throws Exception {
        yallaInvest.ClickOnFirstItemInInvest();
        yallaInvest.scrollToEnd();
        yallaInvest.ClickOnTermsAndConditionArrow();
        yallaInvest.scrollToEnd();
        yallaInvest.ClickOnAgreeOnTerms();
        yallaInvest.ClickOnAddToCartButton();
        yallaInvest.ClickOnCheckoutButton();
        yallaIInvestCart.ClickOnCheckoutCart();
        yallaIInvestCart.ClickOnStoreButton();
        yallaIInvestCart.ClickOnAgreeTermsCheckBox();
        yallaIInvestCart.ClickOnBuyAndStoreButton();
        yallaIInvestCart.ClickOnConfirmButton();
        yallaIInvestCart.enterPin(Constant.PIN_NUMBER);
        yallaIInvestCart.ClickOnReviewButton();
    }
}
