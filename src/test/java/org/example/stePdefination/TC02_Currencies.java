package org.example.stePdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Pages.p00_register;
import org.example.Pages.p02_homePage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class TC02_Currencies {
    p02_homePage homePage=new p02_homePage();


    @Given("change current currency to EURO")
    public void userChangeCurrentCurrencyToEURO()
    {
        homePage.switchCurrencies().selectByVisibleText("Euro");
    }

    @Then("verify Euro Symbol is shown on the products")
    public void userShouldFoundAllProductsPricesInEURO()
    {
        int numberOfProducts=homePage.productPrices().size();
        for(int i=0;i<numberOfProducts;i++)
        {
            //      Assert.assertEquals(homePage.productPrices().get(i).getText().substring(0,1),"€","One Of Products Prices In Different Currency From The Selected One");
            SoftAssert productsPrices=new SoftAssert();
            productsPrices.assertEquals(homePage.productPrices().get(i).getText().substring(0,1),"€","One Of Products Prices In Different Currency From The Selected One");
            productsPrices.assertAll();
        }
    }
}
