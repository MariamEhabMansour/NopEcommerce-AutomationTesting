package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static org.example.stePdefination.Hooks.driver;

public class p01_login {
    public WebElement loginBtn(){

        return driver.findElement(By.className("ico-login"));
    }
    public WebElement EmailFiled(){

      return driver.findElement(By.id("Email"));
    }
    public WebElement PasswordFiled(){

        return  driver.findElement(By.id("Password"));

    }

    public WebElement LoginButton(){

        return driver.findElement(By.className("login-button"));

    }

    public WebElement myaccount(){

        return driver.findElement(By.className("ico-account"));

    }

    public WebElement Error(){

        return driver.findElement(By.className("message-error"));

    }

//    public WebElement AssertionButton(){
//     return boolean logout_btn=driver.findElement(By.cssSelector(""));
//       Assert.assertTrue(logout_btn);
//    }

}
