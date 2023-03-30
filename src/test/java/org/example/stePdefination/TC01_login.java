package org.example.stePdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.p01_login;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.example.stePdefination.Hooks.driver;

public class TC01_login {
    p01_login loginn =new p01_login();
    SoftAssert soft=new SoftAssert();
@Given("navigate to url")
    public void urlwebsite(){
    driver.navigate().to("https://demo.nopcommerce.com/");

}
    @And("Go to login page")
    public void loginpage(){

    loginn.loginBtn().click();

    }
    @When("Enter valid email and valid password")
    public void entervaliddata(){
    loginn.EmailFiled().sendKeys("test1@example.com");
    loginn.PasswordFiled().sendKeys("P@ssw0rd");

    }
    @And("click on login button")
    public void buttonlogin(){
     loginn.LoginButton().click();
    }
    @Then("verify the user login successfully")
    public void signin(){
        Assert.assertTrue(loginn.myaccount().isDisplayed());

        soft.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/");
        soft.assertAll();

    }


    @When("Enter invalid email and valid password")
    public void invalid_email(){
        loginn.EmailFiled().sendKeys("test@gmail");
        loginn.PasswordFiled().sendKeys("123456");

    }

    @Then("verify the user don't login successfully")
    public void dontlogin(){
//
//    Assert.assertTrue(loginn.Error().isDisplayed());
        String text =driver.findElement(By.className("message-error")).getText();
        soft.assertEquals(text,"Your registration completed");
        soft.assertEquals(text,"red");




    }
}
