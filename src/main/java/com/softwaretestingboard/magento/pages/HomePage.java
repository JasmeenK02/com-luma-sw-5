package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    /** Mouse Hover on Women Menu
     * Mouse Hover on Tops
     * Click on Jackets*/
    @CacheLookup
    @FindBy(xpath="//span[contains(text(),'Women')]")
    WebElement dropDownWomen;
    @CacheLookup
    @FindBy(xpath="//a[@id='ui-id-9']")
    WebElement dropDownTops;
    @CacheLookup
    @FindBy(xpath="//a[@id='ui-id-11']//span[contains(text(),'Jackets')]")
    WebElement productWomenLink;

    /** Mouse Hover on Men Menu
     * Mouse Hover on Bottoms
     * Click on Pants*/
    @CacheLookup
    @FindBy(xpath="//span[normalize-space()='Men']")
    WebElement dropDownMen;
    @CacheLookup
    @FindBy(xpath="//a[@id='ui-id-18']//span[contains(text(),'Bottoms')]")
    WebElement dropDownBottoms;
    @CacheLookup
    @FindBy(xpath="//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement productMenLink;

    /** Mouse Hover on Gear Menu
     * Click on Bags
     * Click on Product Name ‘Overnight Duffle*/
    @CacheLookup
    @FindBy(xpath="//span[contains(text(),'Gear')]")
    WebElement dropDownGear;
    @CacheLookup
    @FindBy(xpath="//span[contains(text(),'Bags')]")
    WebElement dropDownBags;
    public void clickOnDropdownWomen()
    {
        mouseHoverActionforThree(dropDownWomen,dropDownTops,productWomenLink);
        waitUntilVisibilityOfElementLocated(By.xpath("//span[contains(text(),'Women')]"),5);
    }

    public void clickOnDropdownMen()
    {
        mouseHoverActionforThree(dropDownMen,dropDownBottoms,productMenLink);
    }

    public void clickOnDropdownGear()
    {
        mouseHoverAction(dropDownGear,dropDownBags);
    }
}
