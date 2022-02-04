package pageObject.projectData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.abTesting.AB_TestingObject;
import pageObject.homePage.HomePageObject;
import utils.ConfProperties;
import utils.Log;

import java.time.Duration;

public class ProjectData {
    public WebDriver dr;
    private HomePageObject homePageObject;
    private AB_TestingObject abTestingObject;

    public void startDriver() {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("DriverPath"));
        dr = new ChromeDriver();
        dr.manage().window().maximize();
        dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Log.info("Driver was started");
        dr.get(ConfProperties.getProperty("HomePageURL"));
        homePageObject = new HomePageObject(dr);
        abTestingObject = new AB_TestingObject(dr);
    }

    public void quitDriver() {
        dr.quit();
        Log.info("Driver quit");
    }

    public HomePageObject getHomePageObject() {
        return homePageObject;
    }

    public AB_TestingObject getAbTestingObject() {
        return abTestingObject;
    }
}
