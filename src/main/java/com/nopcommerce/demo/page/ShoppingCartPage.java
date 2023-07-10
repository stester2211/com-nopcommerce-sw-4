package com.nopcommerce.demo.page;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility
{
    By actualShoppingText = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By changeQty = By.xpath("//input[contains(@class, 'qty-input')]");
    By updatedPrice= By.xpath("//button[@id='updatecart']");
    By actualTotalText = By.xpath("//span[@class='product-subtotal']");
    By clickAgreeCheckBox = By.xpath("//input[@id='termsofservice']");
    By clickOnCheckOut =By.xpath("//button[@id='checkout']");
    By actualquantityTextTwo = By.xpath("//input[@id='itemquantity11229']");
    By actualTotalTextOfCellPhone = By.xpath("//span[@class='product-subtotal']");

    public void verifyMessageShoppingCart()
    {
        //2.15 Verify the message "Shopping cart" ----------- Computer Desktop
        //2.12 Verify the message "Shopping cart"------------ Electronic
        //2.24 Verify the text “Shopping card” --------------- Electronic after Registration
        assertVerifyText(actualShoppingText,"Shopping cart", "Shopping cart text not found");
    }
    public void changeQtyClickOnUpdateCart()
    {
        //2.16 Change the Qty to "2" and Click on "Update shopping cart"
        driver.findElement(By.xpath("//input[contains(@class, 'qty-input')]")).clear();
        sendTextToElement(changeQty,"2");
        clickOnElement(updatedPrice);
    }
    public void verifyTotalText()
    {
        //2.17 Verify the Total"$2,950.00"
        assertVerifyText(actualTotalText,"$2,950.00","Total text not found");
    }
    public void clickOnCheckBox()
    {
        //2.18 click on checkbox “I agree with the terms of service”---------computer
        //2.15 click on checkbox “I agree with the terms of service”---------Electronic cell phone
        clickOnElement(clickAgreeCheckBox);
    }
    public void clickOnCheckOutButton()
    {
        //2.19 Click on “CHECKOUT”----------Computer DeskTop
        //2.16 Click on “CHECKOUT”---------Electronic cellphone
        clickOnElement(clickOnCheckOut);
    }
   public void verifyQtyText()
   {
       //2.13 Verify the quantity is 2
       assertVerifyText(actualquantityTextTwo,"2","Quantity text not found");
   }
   public void verifyTotalCellPhoneText()
   {
       //2.14 Verify the Total $698.00
       assertVerifyText(actualTotalTextOfCellPhone,"$698.00","Total text not found");
   }


}
