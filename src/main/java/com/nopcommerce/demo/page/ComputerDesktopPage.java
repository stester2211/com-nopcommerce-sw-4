package com.nopcommerce.demo.page;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ComputerDesktopPage extends Utility
{
    By position= By.xpath("//select[@id='products-orderby']");
    By filterName = By.xpath("//select[@id='products-orderby']");
    By verifyProductInOrder = By.xpath("//h2[@class='product-title']");
    By clickOnAddCart = By.xpath("//div[@class='buttons']//button[text()='Add to cart']");

    public void productByPosition()
    {
        //1.3 Select Sort By position "Name: Z to A"
        selectByVisibleTextFromDropDown(position,"Name: Z to A");
    }
    public void productInDecending()
    {
        //1.4 Verify the Product will arrange in Descending order.
        listOfElementVerifyInReverse(verifyProductInOrder, filterName,"Name: Z to A",verifyProductInOrder);
    }
    public void productByPositionAtoZ()
    {
        // 2.3 Select Sort By position "Name: A to Z"
        selectByVisibleTextFromDropDown(position,"Name: A to Z");
    }
    public void clickOnAddToCart()
    {
        //2.4 Click on "Add To Cart"
        clickOnElement(clickOnAddCart);
    }
}
