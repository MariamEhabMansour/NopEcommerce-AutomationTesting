package org.example.stePdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.p00_register;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.awt.*;
import java.util.Objects;

import static org.example.stePdefination.Hooks.driver;

public class TC00_Register {
    p00_register registerObj=new p00_register();

    @Given("navigate to url website")
    public void urlwebsite(){
        driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @And("Go to register page")
    public void registerPage(){
        registerObj.registerBtn().click();
    }

    @When("Enter valid Data")
    public void entervalidData(){
        registerObj.genderType().click();
        registerObj.enterFirstName().sendKeys("automation");
        registerObj.enterLastName().sendKeys("tester");

        Select dayDropDown = new Select(registerObj.dayDropDown());
        dayDropDown.selectByIndex(16);

        Select monthDropDown = new Select(registerObj.monthDropDown());
        monthDropDown.selectByIndex(4);

        Select yearDropDown = new Select(registerObj.yearDropDown());
        yearDropDown.selectByIndex(5);

        registerObj.enterEmail().sendKeys("test1@example.com");
        registerObj.enterPassword().sendKeys("P@ssw0rd");
        registerObj.enterConfirmPassword().sendKeys("P@ssw0rd");

    }

    @And("click on Register button")
    public void createAccount(){
        registerObj.RegisterButton().click();
    }
    @Then("verify that account created successfully")
    public void registerSuccessfully(){
        SoftAssert soft=new SoftAssert();
        String text =driver.findElement(By.className("result")).getText();
        soft.assertEquals(text,"Your registration completed");
        soft.assertEquals(text,"rgba(76, 177, 124, 1)");

    }

    }


