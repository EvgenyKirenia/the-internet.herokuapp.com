package Bdd.testScenarios;

import Bdd.Hooks;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import org.junit.jupiter.api.Assertions;
import pageObject.projectData.ProjectData;
import utils.ConfProperties;
import utils.Log;

public class HomePageTestScenarios extends Hooks {
    Hooks hooks = new Hooks();
    ProjectData projectData = new ProjectData();

    @Given("Home Page is open")
    public void openHomePage() {
        projectData.startDriver();
        Assertions.assertEquals(projectData.dr.getCurrentUrl(), ConfProperties.getProperty("HomePageURL"));
        Log.info("Home Page is opened");
    }

    @After
    public void quitDriver() {
        projectData.quitDriver();
    }
}
