package com.nopcommerce.demo.page;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class BuildComputerPage extends Utility
{
    By actualTextBuild = By.xpath("//h1[contains(text(),'Build your own computer')]");
    By selectCore =By.xpath("//select[@id='product_attribute_1']");
    By selectRam= By.xpath("//select[@id='product_attribute_2']");
    By selectHdd= By.xpath("//input[@id='product_attribute_3_7']");
    By selectOs= By.xpath("//input[@id='product_attribute_4_9']");
    By checkBox= By.id("product_attribute_5_12");
    By actualLastPrice = By.xpath("//span[@id='price-value-1']");
    By clickOnAddToCart = By.xpath("//button[@id='add-to-cart-button-1']");
    By actualProductAddedMessage = By.xpath("//p[@class='content']");
    By clickOnCloseButton = By.xpath("//span[@class='close']");
    By hoverMouseOnShoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");
    By clickOnShoppingCartButton = By.xpath("//button[contains(text(),'Go to cart')]");


    public void verifyTextBuild()
    {
        //2.5 Verify the Text "Build your own computer"
        assertVerifyText(actualTextBuild,"Build your own computer", "Build text not found");
    }
    public void selectCoreDropdown()
    {
        //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        selectByValueFromDropDown(selectCore,"1");
    }
    public void selectRamDropdown()
    {
        //2.7.Select "8GB [+$60.00]" using Select class.
        selectByIndexFromDropDown(selectRam,3);
    }
    public void selectHddList()
    {
        //2.8 Select HDD radio "400 GB [+$100.00]"
        clickOnElement(selectHdd);
    }

    public void clickOs()
    {
        //2.9 Select OS radio "Vista Premium [+$60.00]"
        clickOnElement(selectOs);
    }
    public void clickCheckBox()
    {
        //2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
        clickOnElement(checkBox);
    }
    public void actualPrice()
    {
        //2.11 Verify the price "$1,475.00"
        assertVerifyText(actualLastPrice,"$1,475.00", "Price is not verify");
    }
    public void clickOnAddToCart()
    {
        //2.12 Click on "ADD TO CARD" Button.
        clickOnElement(clickOnAddToCart);
    }
    public void actualProductAdded()
    {
        //2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar After that close the bar clicking on the cross button.
        driver.findElement(By.xpath("//p[@class='content']")).getText().replace("x"," ");
        assertVerifyText(actualProductAddedMessage,"The product has been added to your shopping cart","Product not added");
        clickOnElement(clickOnCloseButton);
    }
    public void mouseHoverToCartAndClick()
    {
        //2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        mouseHoverAction(hoverMouseOnShoppingCart, clickOnShoppingCartButton);
    }

}
