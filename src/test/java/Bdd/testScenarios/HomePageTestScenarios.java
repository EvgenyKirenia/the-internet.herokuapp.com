package Bdd.testScenarios;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObject.homePage.HomePageObject;
import pageObject.projectData.ProjectData;
import utils.ConfProperties;
import utils.Log;

import java.util.List;

public class HomePageTestScenarios {

    ProjectData projectData = new ProjectData();

    @Given("Home Page is open")
    public void openHomePage() {
        projectData.startDriver();
        Assertions.assertEquals(projectData.dr.getCurrentUrl(), ConfProperties.getProperty("HomePageURL"),
                "Browser URL doesn't open");
        Log.info("Home Page is opened");
    }


    @Then("Welcome message is displayed")
    public void welcomeMessageIsDisplayed() {
        Assertions.assertTrue(HomePageObject.getWelcomeLable().isDisplayed(),
                "Welcome label is not displayed");
        Log.info("Welcome label is displayed");
    }


    @Then("Welcome message contains text {string}")
    public void welcomeMessageIsDisplayedAndContainsText(String text) {
        Assertions.assertEquals(HomePageObject.getWelcomeLable().getText(), text,
                "Welcome message text is not euqals 'Welcome to the-internet'");
        Log.info("Welcome text is correct");
    }


    @After
    public void quitDriver() {
        projectData.quitDriver();
    }

    @Then("^Available Examples list contains links$")
    public void availableExamplesListContainsLinks(List<String> arg) {
        Assertions.assertEquals(HomePageObject.getExamplestList(), arg, "Collections not Equals");
        Log.info("Available Examples list is correct");
    }

    @When("I am opening {string} page")
    public void iAmOpeningPage(String linkText) {
        WebElement examplesLink = projectData.dr.findElement(By.xpath("//a[contains(text(),'" + linkText + "')]"));
        examplesLink.click();

    }
}
