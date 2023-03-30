package org.example.stePdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Pages.p02_homePage;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;

import static org.example.stePdefination.Hooks.driver;

public class TC03_Search {
    p02_homePage homePage=new p02_homePage();
    p02_homePage searchResultPage=new p02_homePage();
    SoftAssert searchResult= new SoftAssert();
    String searchTerm=null;
    @Given("navigate to search page in website")
    public void urlwebsite(){
        driver.navigate().to("https://demo.nopcommerce.com/search?q=");
    }
    @And("user click on search field")
    public void userClickOnSearchField()
    {
        homePage.searchField().click();
    }
    @And("^user type what he or she want to search \"(.*?)\"")
    public void userTypeWhatHeOrSheWantToSearch(String searchTerm)
    {
        homePage.searchField().sendKeys(searchTerm);
        this.searchTerm=searchTerm;
    }
    @And("user click on search button")
    public void userClickOnSearchButton()
    {
        homePage.searchButton().click();

    }
    @And("user click on search result")
    public void userClickOnSearchResult()
    {
        homePage.productCard().click();

    }
    @Then("user could find relative results")
    public void userCouldFindRelativeResults()
    {
        int numberOfItems =searchResultPage.productList().size();
        int check;
        searchResult.assertFalse(numberOfItems<=0,"No Relevant Search Items For This Search Term");
        searchResult.assertAll();
        ArrayList<String> productListS=new ArrayList();
        for(int i =0;i<numberOfItems;i++)
        {
            productListS.add(searchResultPage.productList().get(i).getText());
            check= productListS.get(i).toLowerCase().indexOf(searchTerm.toLowerCase());
            searchResult.assertFalse( check==-1,"One Of Search Results Is Irrelevant To Search Term");
            searchResult.assertAll();
        }
    }

    @Then("user could find relative results for sku")
    public void userCouldFindRelativeResultsForSku()
    {
        int numberOfItems =searchResultPage.productList2().size();
        int check;
        searchResult.assertFalse(numberOfItems<=0,"No Relevant Search Items For This Search Term");
        searchResult.assertAll();

        ArrayList<String> productList=new ArrayList();
        for(int i =0;i<numberOfItems;i++)
        {
            productList.add(searchResultPage.productList2().get(i).getText());
            check= productList.get(i).toUpperCase().indexOf(searchTerm.toUpperCase());
            searchResult.assertFalse( check==-1,"One Of Search Results Is Irrelevant To Search Term");
            searchResult.assertAll();
        }
    }
}
