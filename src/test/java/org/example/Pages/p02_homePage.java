package org.example.Pages;

import org.example.stePdefination.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.example.stePdefination.Hooks.driver;

public class p02_homePage {
    public Select switchCurrencies()
    {
        WebElement switchCurrencies= Hooks.driver.findElement(By.cssSelector("select[id=\"customerCurrency\"]"));
        Select Currencies = new Select(switchCurrencies);
        return Currencies;
    }
    public List <WebElement> productPrices ()
    {
        List <WebElement> productPrices = Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
        return productPrices;
    }
    public WebElement searchField ()
    {
        WebElement searchField= Hooks.driver.findElement(By.cssSelector("input[id=\"small-searchterms\"]"));
        return searchField;
    }
    public WebElement searchButton ()
    {
        WebElement searchButton= Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
        return searchButton;
    }
    public WebElement productCard ()
    {
        WebElement productCard= Hooks.driver.findElement(By.cssSelector("img[title=\"Show details for Apple MacBook Pro 13-inch\" ]"));
        return productCard;
    }
    public List <WebElement> productList ()
    {
        List <WebElement> productTitles = Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"] a"));
        return productTitles;
    }
    public List <WebElement> productList2 ()
    {
        List <WebElement> productTitles2 = Hooks.driver.findElements(By.cssSelector("span[id=\"sku-4\" ]"));
        return productTitles2;
    }

    public List<WebElement> categories ()
    {
        List <WebElement> categories = Hooks.driver.findElements(By.xpath("//div[@class=\"header-menu\"]//child::ul[@class=\"top-menu notmobile\"]/li/a"));
        return categories;
    }
    public List<WebElement> allSubCategories ()
    {
        List <WebElement> allSubCategories = Hooks.driver.findElements(By.xpath("//div[@class=\"header-menu\"]//child::ul[@class=\"top-menu notmobile\"]//li//ul//li//a"));
        return allSubCategories;
    }



}
