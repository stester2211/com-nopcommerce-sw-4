package com.nopcommerce.demo.page;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class RegistrationPage extends Utility
{
    By actualRegisterText= By.xpath("//h1[contains(text(),'Register')]");
    By firstName = By.xpath("//input[@id='FirstName']");
    By lastName =By.xpath("//input[@id='LastName']");
    By email = By.xpath("//input[@id='Email']");
    By password= By.xpath("//input[@id='Password']");
    By confirmPassword = By.xpath("//input[@id='ConfirmPassword']");
    By clickRegisterButton = By.xpath("//button[@id='register-button']");
    By actualRegisterCompleteMessage = By.xpath("//div[contains(text(),'Your registration completed')]");
    By continueButton = By.xpath("//a[contains(text(),'Continue')]");

    public void verifyRegisterText()
    {
        //2.19 Verify the text “Register”
        assertVerifyText(actualRegisterText,"Register","Register text not found");
    }
    public void fillAllRegisterField()
    {
        //2.20 Fill the mandatory fields
        sendTextToElement(firstName,"Vishwa");

        sendTextToElement(lastName,"Patel");

        sendTextToElement(email,"va@gmail.com");

        sendTextToElement(password,"v123456");

        sendTextToElement(confirmPassword,"v123456");
    }
    public void clickRegisterButton()
    {
        //2.21 Click on “REGISTER” Button
        clickOnElement(clickRegisterButton);
    }
    public void verifyRegistrationCompleted()
    {
        //2.22 Verify the message “Your registration completed”
        assertVerifyText(actualRegisterCompleteMessage,"Your registration completed","Registration complete message not found");
    }
    public void clickContinue()
    {
        //2.23 Click on “CONTINUE” tab
        clickOnElement(continueButton);
    }

}
