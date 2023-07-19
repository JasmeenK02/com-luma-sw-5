package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class GearPage extends Utility {

    @CacheLookup
    @FindBy(xpath="//a[normalize-space()='Overnight Duffle']")
    WebElement productGearLink;
    @CacheLookup
    @FindBy(xpath="//span[contains(text(),'Overnight Duffle')]")
    WebElement actualTextOvernightDuffle;
    @CacheLookup
    @FindBy(xpath="//input[@id='qty']")
    WebElement changeQuantity;
    @CacheLookup
    @FindBy(xpath="//span[contains(text(),'Add to Cart')]")
    WebElement clickOnAddToCartButton;
    @CacheLookup
    @FindBy(xpath="//div[@class='message-success success message']")
    WebElement actualTextDuffleAdded;
    @CacheLookup
    @FindBy(xpath="//a[contains(text(),'shopping cart')]")
    WebElement clickOnShoppingCartLink;

    public void clickOnOverNightDuffle()
    {
        //1.3 Click on Product Name ‘Overnight Duffle’
        clickOnElement(productGearLink);
    }

    public String verifyTextOvernightDuffle()
    {
        //1.4 Verify the text ‘Overnight Duffle’
        return getTextFromElement(actualTextOvernightDuffle);
    }

    public void GearChangeQuantity(String changeQty)
    {
        //1.5 Change Qty 3
        changeQuantity.clear();
        sendTextToElement(changeQuantity,changeQty);
    }
    public void userClickOnAddToCart()
    {
        //1.6 Click on ‘Add to Cart’ Button.
        clickOnElement(clickOnAddToCartButton);
    }

    public String verifyTextAddDuffle()
    {
        //1.7 Verify the text ‘You added Overnight Duffle to your shopping cart.’
        return getTextFromElement(actualTextDuffleAdded);
    }
    public void clickOnShoppingCart()
    {
        //1.8 Click on ‘shopping cart’ Link into message
        clickOnElement(clickOnShoppingCartLink);
    }
}
