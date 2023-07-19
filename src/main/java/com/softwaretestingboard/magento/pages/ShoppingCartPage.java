package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends Utility {
    //********************************Men's Shopping cart ***********************************************
    @CacheLookup
    @FindBy(xpath="//span[text()='Shopping Cart']")
    WebElement actualTextShoppingCart;
    @CacheLookup
    @FindBy(xpath="//div[@class='product-item-details']//a[text()='Cronus Yoga Pant ']")
    WebElement actualTextCronusPant;
    @CacheLookup
    @FindBy(xpath="//dd[contains(text(),'32')]")
    WebElement actualTextSize;
    @CacheLookup
    @FindBy(xpath="//dd[contains(text(),'Black')]")
    WebElement actualTextColor;

    //********************************Gears Shopping cart ***********************************************

    @CacheLookup
    @FindBy(xpath="/td[@class='col item']//a[normalize-space()='Overnight Duffle']")
    WebElement actualTextOvernightDuffleInCart;
    @CacheLookup
    @FindBy(xpath="//input[@class='input-text qty']")
    WebElement actualQuantity;
    @CacheLookup
    @FindBy(xpath="(//span[@class='cart-price']//span)[2]")
    WebElement actualProductPrice;
    @CacheLookup
    @FindBy(xpath="//input[@class='input-text qty']")
    WebElement quantityChangeToFive;
    @CacheLookup
    @FindBy(xpath="//span[contains(text(),'Update Shopping Cart')]")
    WebElement clickOnUpdateShoppingCart;
    @CacheLookup
    @FindBy(xpath="(//span[@class='cart-price']//span)[2]")
    WebElement actualProductPriceChange;

    //********************************Men's Shopping cart method ****************************************

    // 1.10 Verify the text ‘Shopping Cart.’
    public String verifyTextShoppingCart()
    {
        return getTextFromElement(actualTextShoppingCart);
    }

    // 1.11 Verify the product name ‘Cronus Yoga Pant’
    public String verifyTextCronusPant()
    {
        return getTextFromElement(actualTextCronusPant);
    }

    // 1.12 Verify the product size ‘32’
    public String verifyTextOfSize()
    {
        return getTextFromElement(actualTextSize);
    }

    // 1.13 Verify the product colour ‘Black’
    public String verifyTextOfColor()
    {
        return getTextFromElement(actualTextColor);
    }

    //******************************Gears shopping cart methods**************************************

    //1.9 Verify the product name ‘Overnight Duffle’
    public String verifyTextOvernightDuffle()
    {
        return getTextFromElement(actualTextOvernightDuffleInCart);
    }

    //1.10 Verify the Qty is ‘3’
    public String verifyQuantity()
    {
        return getTextFromElement(actualQuantity);
    }

    //1.11 Verify the product price ‘$135.00’
    public String verifyProductPrice()
    {
        return getTextFromElement(actualProductPrice);
    }

    //1.12 Change Qty to ‘5’
    public void changeQuantity(String changeQty)
    {
        quantityChangeToFive.clear();
        sendTextToElement(quantityChangeToFive,changeQty);
    }

    //1.13 Click on ‘Update Shopping Cart’ button
    public void clickOnUpdateButton()
    {
        clickOnElement(clickOnUpdateShoppingCart);
    }

    //1.14 Verify the product price ‘$225.00’
    public String verifyProductPriceChange()
    {
        return getTextFromElement(actualProductPriceChange);
    }
}
