package org.example.Pages;

import org.example.stePdefination.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

import java.util.List;

import static org.example.stePdefination.Hooks.driver;

public class p00_register {

    public WebElement registerBtn(){

        return driver.findElement(By.className("ico-register"));
    }

    public WebElement genderType(){
        return driver.findElement(By.id("gender-female"));
    }
    public WebElement enterFirstName(){

        return driver.findElement(By.id("FirstName"));
    }

    public WebElement enterLastName(){

        return driver.findElement(By.id("LastName"));
    }

    public WebElement dayDropDown(){

//        return driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
        return driver.findElement(By.name("DateOfBirthDay"));
    }
    public WebElement monthDropDown (){

//        return driver.findElement(By.xpath("\"//select[@name='DateOfBirthMonth']\""));
        return driver.findElement(By.name("DateOfBirthMonth"));
    }
    public WebElement yearDropDown(){

//        return driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
        return driver.findElement(By.name("DateOfBirthYear"));
    }

    public WebElement enterEmail(){

        return driver.findElement(By.id("Email"));
    }

    public WebElement enterPassword(){
        return driver.findElement(By.id("Password"));
    }

    public WebElement enterConfirmPassword(){
        return driver.findElement(By.id("ConfirmPassword"));
    }

    public WebElement RegisterButton(){
        return driver.findElement(By.id("register-button"));
    }

    public WebElement registerResult(){
        return driver.findElement(By.className("result"));

    }

}
