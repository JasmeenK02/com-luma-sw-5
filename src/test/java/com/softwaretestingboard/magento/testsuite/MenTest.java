package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.MenPage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(CustomListeners.class)
public class MenTest extends BaseTest {

    HomePage homePage;
    MenPage menPage;
    ShoppingCartPage shoppingCartPage;
    SoftAssert softAssert;

    @BeforeMethod(alwaysRun = true)
    public void inIT()
    {
        homePage = new HomePage();
        menPage=new MenPage();
        shoppingCartPage = new ShoppingCartPage();
        softAssert = new SoftAssert();
    }

    //1. userShouldAddProductSuccessFullyToShoppinCart()
    @Test(groups = {"sanity","regression"})
    public void userShouldAddProductSuccessFullyToShoppinCart()
    {
        /**1.1 Mouse Hover on Men Menu
         * 1.2 Mouse Hover on Bottoms
         * 1.3 Click on Pants**/
        homePage.clickOnDropdownMen();

        //1.4 Mouse Hover on product name ‘Cronus Yoga Pant’ and click on size 32.
        menPage.verifyUserSelectSize();

        //1.5 Mouse Hover on product name‘Cronus Yoga Pant’ and click on colour Black.
        menPage.verifyUserClickOnColor();

        //1.7 Mouse Hover on product name‘Cronus Yoga Pant’ and click on‘Add To Cart’ Button.
        menPage.verifyUserClickOnAddToCart();

        //1.8 Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
        softAssert.assertEquals(menPage.verifyTextAddedToCart(),"You added Cronus Yoga Pant to your shopping cart.","Added message not found");

        //1.9 Click on ‘shopping cart’ Link into message
        menPage.verifyUserclickOnShoppingCartLink();

        //1.10 Verify the text ‘Shopping Cart.’
        softAssert.assertEquals(shoppingCartPage.verifyTextShoppingCart(),"Shopping Cart","Shopping cart text not found");

        //1.11 Verify the product name ‘Cronus Yoga Pant’
        softAssert.assertEquals(shoppingCartPage.verifyTextCronusPant(),"Cronus Yoga Pant","Cronus Pant text not found");

        //1.12 Verify the product size ‘32’
        softAssert.assertEquals(shoppingCartPage.verifyTextOfSize(),"32","Size text not found");

        //1.13 Verify the product colour ‘Black’
        softAssert.assertEquals(shoppingCartPage.verifyTextOfColor(),"Black","Black text not found");
    }
}
