package com.nopcommerce.demo.page;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility
{
    By allTopListMenu =By.xpath("//div[@class='header-menu']");

    //*************************Computer Tab *****************************************************
    By computerMenu =By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");
    By desktopTab = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Desktops']");

    //************************** After checkOut Homepage***************************************
    By actualWelcomeStoretext =By.xpath("//h2[contains(text(),'Welcome to our store')]");

    //*************************Electronics Class************************************************
    By electronicMouseHover= By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");
    By cellPhoneMouseHover = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']");

    //************************* Top Menu Tab*****************************************************

    // 1.1 create method with name "selectMenu" it has one parameter name "menu" of type string
    public void selectMenu(String menu)
    {
        //1.2 This method should click on the menu whatever name is passed as parameter.
        List<WebElement> topMenuList = getListOfElements(allTopListMenu);
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = getListOfElements(allTopListMenu);
        }
        clickOnElement(By.linkText(menu));
    }

    //****************************** Computer tab **************************************
    public void clickOnDesktop()
    {
        mouseHoverAction(computerMenu,desktopTab);
    }

    //****************************After checkout Homepage verification text***********************
    public void verifyWelcomeText()
    {
        //2.37 Verify the text “Welcome to our store”
        assertVerifyText(actualWelcomeStoretext,"Welcome to our store","Welcome Text not found");
    }

    //*************************Electronic class method*********************************************
    public void clickOnElectronics()
    {
        mouseHoverAction(electronicMouseHover,cellPhoneMouseHover);
    }
}
