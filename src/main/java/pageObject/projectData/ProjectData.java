package pageObject.projectData;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import pageObject.abTesting.AB_Testing;
import pageObject.addRemoveElements.AddRemoveElements;
import pageObject.homePage.HomePage;
import utils.ConfProperties;
import utils.Log;

import java.time.Duration;

public class ProjectData {
    public WebDriver dr;
    public Wait<WebDriver> wait;
    private JavascriptExecutor js;
    private HomePage homePageObject;
    private AB_Testing abTestingObject;
    private AddRemoveElements addRemoveElements;

    public void startDriver() {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("DriverPath"));
        dr = new ChromeDriver();
        dr.manage().deleteAllCookies();
        dr.manage().window().maximize();
        wait = new FluentWait<>(dr)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(10))
                .ignoring(NoSuchElementException.class, StaleElementReferenceException.class);
        dr.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Log.info("Driver was started");
        dr.get(ConfProperties.getProperty("HomePageURL"));
        homePageObject = new HomePage(dr);
        abTestingObject = new AB_Testing(dr);
        addRemoveElements = new AddRemoveElements(dr);
    }

    public void quitDriver() {
        dr.quit();
        Log.info("Driver quit");
    }

    public HomePage getHomePageObject() {
        return homePageObject;
    }

    public AB_Testing getAbTestingObject() {
        return abTestingObject;
    }

    public AddRemoveElements getAddRemoveElements() {
        return addRemoveElements;
    }
}
