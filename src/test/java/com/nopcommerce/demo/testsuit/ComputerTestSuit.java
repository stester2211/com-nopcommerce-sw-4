package com.nopcommerce.demo.testsuit;

import com.nopcommerce.demo.page.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.Test;

public class ComputerTestSuit extends BaseTest
{
    HomePage homePage = new HomePage();
    ComputerDesktopPage computerDesktopPage = new ComputerDesktopPage();
    BuildComputerPage buildComputerPage = new BuildComputerPage();
    ShoppingCartPage shoppingCartPage= new ShoppingCartPage();
    SignInPage signInPage=new SignInPage();
    CheckOutPage checkOutPage= new CheckOutPage();

    @Test
    //1.Test name verifyProductArrangeInAlphaBaticalOrder()
    public void verifyProductArrangeInAlphaBaticalOrder() throws InterruptedException
    {
        //1.1 Click on Computer Menu.
        //1.2 Click on Desktop
        homePage.clickOnDesktop();
        Thread.sleep(2000);

        //1.3 Select Sort By position "Name: Z to A"
        computerDesktopPage.productByPosition();
        Thread.sleep(2000);

        //1.4 Verify the Product will arrange in Descending order.
        computerDesktopPage.productInDecending();
        Thread.sleep(2000);
    }

    //2. Test name verifyProductAddedToShoppingCartSuccessFully()
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        //2.1 Click on Computer Menu.
        //2.2 Click on Desktop
        homePage.clickOnDesktop();

        //2.3 Select Sort By position "Name: A to Z"
        computerDesktopPage.productByPositionAtoZ();
        Thread.sleep(1000);

        //2.4 Click on "Add To Cart"
        computerDesktopPage.clickOnAddToCart();
        Thread.sleep(1000);

        //2.5 Verify the Text "Build your own computer"
        buildComputerPage.verifyTextBuild();
        Thread.sleep(1000);

        //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        buildComputerPage.selectCoreDropdown();
        Thread.sleep(1000);

        //2.7.Select "8GB [+$60.00]" using Select class.
        buildComputerPage.selectRamDropdown();
        Thread.sleep(1000);

        //2.8 Select HDD radio "400 GB [+$100.00]"
        buildComputerPage.selectHddList();
        Thread.sleep(1000);

        //2.9 Select OS radio "Vista Premium [+$60.00]"
        buildComputerPage.clickOs();
        Thread.sleep(1000);

        //2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
        buildComputerPage.clickCheckBox();
        Thread.sleep(2000);

        // 2.11 Verify the price "$1,475.00"
        buildComputerPage.actualPrice();
        Thread.sleep(2000);

        // 2.12 Click on "ADD TO CARD" Button.
        buildComputerPage.clickOnAddToCart();
        Thread.sleep(3000);

        // 2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar After that close the bar clicking on the cross button.
        buildComputerPage.actualProductAdded();
        Thread.sleep(1000);

        //2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        buildComputerPage.mouseHoverToCartAndClick();
        Thread.sleep(1000);

        //2.15 Verify the message "Shopping cart"
        shoppingCartPage.verifyMessageShoppingCart();
        Thread.sleep(1000);

        //2.16 Change the Qty to "2" and Click on "Update shopping cart"
        shoppingCartPage.changeQtyClickOnUpdateCart();
        Thread.sleep(1000);

        //2.17 Verify the Total"$2,950.00"
        shoppingCartPage.verifyTotalText();

        //2.18 click on checkbox “I agree with the terms of service”
        shoppingCartPage.clickOnCheckBox();
        Thread.sleep(1000);

        //2.19 Click on “CHECKOUT”
        shoppingCartPage.clickOnCheckOutButton();
        Thread.sleep(1000);

        //2.20 Verify the Text “Welcome, Please Sign In!”
        signInPage.verifyMessageSignIn();
        Thread.sleep(1000);

        //2.21 Click on “CHECKOUT AS GUEST” Tab
        signInPage.clickOnCheckOutAsGuestButton();
        Thread.sleep(1000);

        //2.22 Fill the all mandatory field
        checkOutPage.checkOutInfo();
        Thread.sleep(1000);

        //2.23 Click on “CONTINUE”
        checkOutPage.clickContinue();
        Thread.sleep(1000);

        //2.24 Click on Radio Button “Next Day Air($0.00)”
        checkOutPage.clickRadioButtonNextDay();
        Thread.sleep(1000);

        //2.25 Click on “CONTINUE”
        checkOutPage.clickContinueTwo();
        Thread.sleep(1000);

        //2.26 Select Radio Button “Credit Card”
        checkOutPage.selectRadioCreditCard();
        Thread.sleep(1000);

        //2.27 Select “Master card” From Select credit card dropdown
        checkOutPage.selectMasterCard();
        Thread.sleep(1000);

        //2.28 Fill all the
        checkOutPage.fillAllDetailMasterCard();
        Thread.sleep(1000);

        //2.29 Click on “CONTINUE”
        checkOutPage.clickContinueFourButton();
        Thread.sleep(1000);

        //2.30 Verify “Payment Method” is “Credit Card”
        checkOutPage.verifyPaymentCreditCard();
        Thread.sleep(1000);

        //2.32 Verify “Shipping Method” is “Next Day Air”
        checkOutPage.verifyShippingMethod();
        Thread.sleep(1000);

        //2.33 Verify Total is “$2,950.00”
        checkOutPage.verifyTotalText();
        Thread.sleep(1000);

        //2.34 Click on “CONFIRM”
        checkOutPage.clickOnConfirmButton();
        Thread.sleep(2000);

        //2.35 Verify the Text “Thank You”
        checkOutPage.verifyTextThankYou();
        Thread.sleep(1000);

        //2.36 Verify the message “Your order has been successfully processed!”
        checkOutPage.verifyTextOrderSuccessfully();
        Thread.sleep(1000);

        //2.37 Click on “CONTINUE”
        checkOutPage.clickContinueFive();
        Thread.sleep(1000);

        //2.37 Verify the text “Welcome to our store”
        homePage.verifyWelcomeText();
        Thread.sleep(1000);
    }

}
