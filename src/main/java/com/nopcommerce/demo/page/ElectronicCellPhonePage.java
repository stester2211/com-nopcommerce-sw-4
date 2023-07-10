package com.nopcommerce.demo.page;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ElectronicCellPhonePage extends Utility
{
    By actualTextCellPhone = By.xpath("//h1[contains(text(),'Cell phones')]");
    By listView =By.xpath("//a[contains(text(),'List')]");
    By clickProduct = By.xpath("//a[contains(text(),'Nokia Lumia 1020')]");
    By actualTextNokia = By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]");
    By actualPrice =By.xpath("//span[@id='price-value-20']");
    By changeQty = By.xpath("//input[@id='product_enteredQuantity_20']");
    By clickAddToCart = By.xpath("//button[@id='add-to-cart-button-20']");
    By actualTextProductAdded= By.xpath("//p[@class='content']");
    By clickCloseButton = By.xpath("//span[@title='Close']");
    By mouseHoverShoppingCart =By.xpath("//span[contains(text(),'Shopping cart')]");
    By clickOnGoToCart = By.xpath("//button[contains(text(),'Go to cart')]");
    public void verifyTextCellPhone()
    {
        // 1.3 Verify the text “Cell phones”
        assertVerifyText(actualTextCellPhone,"Cell phones","Cell Phone text not found");
    }

    public void clickOnlistviewTab()
    {
        //2.4 Click on List View Tab
        clickOnElement(listView);
    }
    public void clickOnNokiaProduct()
    {
        //2.5 Click on product name “Nokia Lumia 1020” link
        clickOnElement(clickProduct);
    }
    public void verifyTextNokia()
    {
        //2.6 Verify the text “Nokia Lumia 1020”
        clickOnElement(actualTextNokia);
    }
    public void verifyTextPrice()
    {
        //2.7 Verify the price “$349.00”
        clickOnElement(actualPrice);
    }
    public void changeQTYToTwo()
    {
        //2.8 Change quantity to 2
        driver.findElement(By.xpath("//input[@id='product_enteredQuantity_20']")).clear();
        sendTextToElement(changeQty,"2");
    }
    public void clickAddToShoppingCart()
    {
        //2.9 Click on “ADD TO CART” tab
        clickOnElement(clickAddToCart);
    }
    public void verifyTextProductAdded()
    {
        //2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar After that close the bar clicking on the cross button.
        assertVerifyText(actualTextProductAdded,"The product has been added to your shopping cart","Product added message not display");
        clickOnElement(clickCloseButton);
    }
    public void mouseHoverToCartAndClick()
    {
        //2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        mouseHoverAction(mouseHoverShoppingCart,clickOnGoToCart);
    }

}
