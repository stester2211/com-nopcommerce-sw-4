package com.nopcommerce.demo.page;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility
{
    By firstName = By.xpath("//input[@id='BillingNewAddress_FirstName']");
    By lastName = By.xpath("//input[@id='BillingNewAddress_LastName']");
    By email = By.xpath("//input[@id='BillingNewAddress_Email']");
    By countryName = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By provinceName = By.xpath("//select[@id='BillingNewAddress_StateProvinceId']");
    By cityName = By.xpath("//input[@id='BillingNewAddress_City']");
    By address = By.xpath("//input[@id='BillingNewAddress_Address1']");
    By zipCode = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By phoneNumber =By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By continueButton =By.xpath("//div[@id='billing-buttons-container']//button[text()='Continue']");
    By radioButtonAir =By.xpath("//input[@id='shippingoption_1']");
    By continueTwoButton= By.xpath("//div[@id='shipping-method-buttons-container']//button[text()='Continue']");
    By radioCreditCard =By.xpath("//input[@id='paymentmethod_1']");
    By continueThreeButton= By.xpath("//div[@id='payment-method-buttons-container']//button[text()='Continue']");
    By selectMasterCardDropDown =By.xpath("//select[@id='CreditCardType']");
    By cardHolder= By.xpath("//input[@id='CardholderName']");
    By cardNumber= By.xpath("//input[@id='CardNumber']");
    By expireMonth= By.xpath("//select[@id='ExpireMonth']");
    By expireYear = By.xpath("//select[@id='ExpireYear']");
    By cardCode = By.xpath("//input[@id='CardCode']");
    By continueFourButton= By.xpath("//div[@id='payment-info-buttons-container']//button[text()='Continue']");
    By actualTextPaymentMethod = By.xpath("//span[contains(text(),'Credit Card')]");
    By actualTextShippingMethod = By.xpath("//li[@class='shipping-method']//span[@class='value']");
    By actualTextTotal= By.xpath("//span[@class='product-subtotal']");
    By clickOnConfirm = By.xpath("//button[contains(text(),'Confirm')]");
    By actualTextThankYou =By.xpath("//h1[contains(text(),'Thank you')]");
    By actualTextSuccessfulOrder = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    By clickContinueFive= By.xpath("//button[contains(text(),'Continue')]");

    public void checkOutInfo()
    {
        //2.22 Fill the all mandatory field
        sendTextToElement(firstName,"Vishwa");
        sendTextToElement(lastName,"patel");
        sendTextToElement(email,"patelv@gmail.com");
        selectByValueFromDropDown(countryName,"153");
        selectByValueFromDropDown(provinceName,"23");
        sendTextToElement(cityName,"Windsor");
        sendTextToElement(address,"Asking");
        sendTextToElement(zipCode,"123456");
        sendTextToElement(phoneNumber,"1234567895");
    }
    public void clickContinue()
    {
        //2.23 Click on “CONTINUE”
        clickOnElement(continueButton);
    }
    public void clickRadioButtonNextDay()
    {
        //2.24 Click on Radio Button “Next Day Air($0.00)”
        clickOnElement(radioButtonAir);
    }
    public void clickContinueTwo()
    {
        //2.25 Click on “CONTINUE”
        clickOnElement(continueTwoButton);
    }
    public void selectRadioCreditCard()
    {
        //2.26 Select Radio Button “Credit Card”
        clickOnElement(radioCreditCard);
        clickOnElement(continueThreeButton);
    }
    public void selectMasterCard()
    {
        //2.27 Select “Master card” From Select credit card dropdown
        selectByVisibleTextFromDropDown(selectMasterCardDropDown,"Master card");
    }
    public void fillAllDetailMasterCard() throws InterruptedException {
        //2.28 Fill all the details
        sendTextToElement(cardHolder,"aavv");

        sendTextToElement(cardNumber,"1111222233334444");
        Thread.sleep(1000);

        selectByIndexFromDropDown(expireMonth,1);
        Thread.sleep(1000);

        selectByIndexFromDropDown(expireYear,1);
        Thread.sleep(1000);

        sendTextToElement(cardCode,"123");
        Thread.sleep(1000);
    }
    public void clickContinueFourButton()
    {
        //2.29 Click on “CONTINUE”
        clickOnElement(continueFourButton);
    }
    public void verifyPaymentCreditCard()
    {
        //2.30 Verify “Payment Method” is “Credit Card”
        assertVerifyText(actualTextPaymentMethod,"Credit Card","Payment method not found");
    }
    public void verifyShippingMethod()
    {
        //2.32 Verify “Shipping Method” is “Next Day Air”
        assertVerifyText(actualTextShippingMethod,"Next Day Air","Shipping method not found");
    }
    public void verifyTotalText()
    {
        //2.33 Verify Total is “$2,950.00”
        assertVerifyText(actualTextTotal,"$2,950.00","Total text not found");
    }
    public void clickOnConfirmButton()
    {
        //2.34 Click on “CONFIRM”
        clickOnElement(clickOnConfirm);
    }
    public void verifyTextThankYou()
    {
        //2.35 Verify the Text “Thank You”
        assertVerifyText(actualTextThankYou,"Thank you","Thank you text not found");
    }
    public void verifyTextOrderSuccessfully()
    {
        ///2.36 Verify the message “Your order has been successfully processed!”
        assertVerifyText(actualTextSuccessfulOrder,"Your order has been successfully processed!","Order sucessfully text not found");
    }
    public void clickContinueFive()
    {
        //2.37 Click on “CONTINUE”
        clickOnElement(clickContinueFive);
    }

}
