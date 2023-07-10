package com.nopcommerce.demo.testsuit;

import com.nopcommerce.demo.page.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest
{
    HomePage homePage = new HomePage();

    @Test
    //1.3. create the @Test method name verifyPageNavigation.use selectMenu method to select the Menu and click on it and verify the page navigation.
    public void verifyPageNavigation()
    {
        //1.1 create method with name "selectMenu" it has one parameter name "menu" of type string
        //1.2 This method should click on the menu whatever name is passed as parameter.
       homePage.selectMenu("Electronics");
    }

}
