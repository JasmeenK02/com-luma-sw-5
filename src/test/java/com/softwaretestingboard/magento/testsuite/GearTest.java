package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.pages.GearPage;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(CustomListeners.class)
public class GearTest extends BaseTest {
    HomePage homePage;
    ShoppingCartPage shoppingCartPage;
    GearPage gearPage;
    SoftAssert softAssert;

    @BeforeMethod(alwaysRun = true)
    public void inIT()
    {
        homePage = new HomePage();
        shoppingCartPage= new ShoppingCartPage();
        gearPage= new GearPage();
        softAssert = new SoftAssert();
    }

    //1. userShouldAddProductSuccessFullyToShoppingCart()
    @Test(groups = {"sanity","regression"})
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException
    {
        /**1.1 Mouse Hover on Gear Menu
         * 1.2 Click on Bags
         */
        homePage.clickOnDropdownGear();
        Thread.sleep(1000);

        //1.3 Click on Product Name ‘Overnight Duffle’
        gearPage.clickOnOverNightDuffle();

        //1.4 Verify the text ‘Overnight Duffle’
        softAssert.assertEquals(gearPage.verifyTextOvernightDuffle(), "Overnight Duffle","Overnight Duffle text not found");

        //1.5 Change Qty 3
        gearPage.GearchangeQuantity("3");

        //1.6 Click on ‘Add to Cart’ Button.
        gearPage.userClickOnAddToCart();

        //1.7 Verify the text ‘You added Overnight Duffle to your shopping cart.’
        softAssert.assertEquals(gearPage.verifyTextAddDuffle(),"You added Overnight Duffle to your shopping cart.","Overnight Duffle text not found in cart");

        //1.8 Click on ‘shopping cart’ Link into message
        gearPage.clickOnShoppingCart();

        //1.9 Verify the product name ‘Overnight Duffle’
        //Assert.assertEquals(shoppingCartPage.verifyTextShoppingCart(), "Overnight Duffle", "Overnight Duffle not found");

        //1.10 Verify the Qty is ‘3’
        //Assert.assertEquals(shoppingCartPage.verifyQuantity(), "3","Quantity 3 not found");

        //1.11 Verify the product price ‘$135.00’
        softAssert.assertEquals(shoppingCartPage.verifyProductPrice(), "$135.00","Product price not found");

        //1.12 Change Qty to ‘5’
        shoppingCartPage.changeQuantity("5");

        //1.13 Click on ‘Update Shopping Cart’ button
        shoppingCartPage.clickOnUpdateButton();
        Thread.sleep(2000);

        //1.14 Verify the product price ‘$225.00’
        softAssert.assertEquals(shoppingCartPage.verifyProductPriceChange(),"$225.00", "Product price not Updated");
        softAssert.assertAll();
    }


}
