package Bdd.testScenarios;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfProperties;
import utils.Log;

import java.time.Duration;

public class HomePageTestScenarios {
    WebDriver dr;

    @Given("Home Page is open")
    public void openHomePage() {

            System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("DriverPath"));
            dr = new ChromeDriver();
            dr.manage().window().maximize();
            dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            Log.info("Driver was started");
            dr.get(ConfProperties.getProperty("HomePageURL"));
            Assertions.assertEquals(dr.getCurrentUrl(), ConfProperties.getProperty("HomePageURL"));
            Log.info("Home Page is opened");
    }
    @After
    public void quitDriver(){
        dr.quit();
        Log.info("Driver quit");
    }
}
