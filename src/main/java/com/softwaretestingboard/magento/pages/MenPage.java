package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MenPage extends Utility {
    @CacheLookup
    @FindBy(xpath="//a[contains(text(),'Cronus Yoga Pant')]")
    WebElement productName;
    @CacheLookup
    @FindBy(xpath="//div[@class='swatch-opt-880']//div[@id='option-label-size-143-item-175']")
    WebElement clickOnsize;
    @CacheLookup
    @FindBy(xpath="//div[@id='option-label-color-93-item-49']")
    WebElement clickOnColor;
    @CacheLookup
    @FindBy(xpath="//span[text()='Add to Cart']")
    WebElement clickOnAddToCart;
    @CacheLookup
    @FindBy(xpath="//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement actualText;
    @CacheLookup
    @FindBy(xpath="//a[contains(text(),'shopping cart')]")
    WebElement clickOnShoppingCartLink;

    public void verifyUserSelectSize()
    {
        mouseHoverAction(productName, clickOnsize);
    }

    // 1.5  Mouse Hover on product name‘Cronus Yoga Pant’ and click on colour Black.
    public void verifyUserClickOnColor()
    {
        mouseHoverAction(productName,clickOnColor);
    }
    // 1.7 Mouse Hover on product name ‘Cronus Yoga Pant’ and click on ‘Add To Cart’ Button.
    public void verifyUserClickOnAddToCart()
    {
        mouseHoverAction(productName,clickOnAddToCart);
    }

    // 1.8 Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
    public String verifyTextAddedToCart()
    {
        return getTextFromElement(actualText);
    }

    // 1.9 Click on ‘shopping cart’ Link into message
    public void verifyUserclickOnShoppingCartLink()
    {
        clickOnElement(clickOnShoppingCartLink);
    }
}
