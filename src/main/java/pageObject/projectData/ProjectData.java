package pageObject.projectData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfProperties;
import utils.Log;

import java.time.Duration;

public class ProjectData {
    public WebDriver dr;

    public void startDriver() {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("DriverPath"));
        dr = new ChromeDriver();
        dr.manage().window().maximize();
        dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Log.info("Driver was started");
        dr.get(ConfProperties.getProperty("HomePageURL"));
    }

    public void quitDriver() {
        dr.quit();
        Log.info("Driver quit");
    }
}
