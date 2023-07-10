package com.nopcommerce.demo.page;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class SignInPage extends Utility
{
    By actualSignInMessage= By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By clickOnCheckout = By.xpath("//button[contains(text(),'Checkout as Guest')]");
    By clickOnRegister = By.xpath("//button[contains(text(),'Register')]");

    public void verifyMessageSignIn()
    {
        //2.20 Verify the Text “Welcome, Please Sign In!”
        assertVerifyText(actualSignInMessage,"Welcome, Please Sign In!","Welcome Text not found");
    }
    public void clickOnCheckOutAsGuestButton()
    {
        //2.21Click on “CHECKOUT AS GUEST” Tab
        clickOnElement(clickOnCheckout);
    }
    public void clickOnRegister()
    {
        //2.18 Click on “REGISTER” tab
        clickOnElement(clickOnRegister);
    }
}
