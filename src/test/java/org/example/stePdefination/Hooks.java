package org.example.stePdefination;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
   public static WebDriver driver;
    @Before
    public void openBrowser(){
        driver = new EdgeDriver();
        // 3- configuration to your driver
        driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
//    @After (order=1)
//    public static void user_close_the_driver(Scenario scenario)
//    {
//        if(scenario.isFailed())
//        {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            TakesScreenshot ts= (TakesScreenshot) driver;
//            byte [] src=ts.getScreenshotAs(OutputType.BYTES);
//            scenario.attach(src,"image/png","screenshot");
//        }
//    }
  @After
    public void quit(){
        driver.quit();
    }
}
