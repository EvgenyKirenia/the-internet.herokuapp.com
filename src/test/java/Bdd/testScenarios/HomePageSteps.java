package Bdd.testScenarios;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageObject.homePage.HomePage;
import pageObject.projectData.ProjectData;
import utils.ConfProperties;

import java.util.List;

import static pageObject.homePage.HomePage.getForkMeOnGitHubLink;

public class HomePageSteps {

    ProjectData projectData = new ProjectData();

    @After
    public void quitDriver() {
        projectData.quitDriver();
    }

    @Given("Home Page is open")
    public void openHomePage() {
        projectData.startDriver();
        Assertions.assertEquals(projectData.dr.getCurrentUrl(), ConfProperties.getProperty("HomePageURL"),
                "Browser URL doesn't open");
    }

    @Then("Welcome message is displayed")
    public void welcomeMessageIsDisplayed() {
        Assertions.assertTrue(HomePage.getWelcomeLable().isDisplayed(),
                "Welcome label is not displayed");
    }

    @Then("Welcome message contains text {string}")
    public void welcomeMessageIsDisplayedAndContainsText(String text) {
        Assertions.assertEquals(HomePage.getWelcomeLable().getText(), text,
                "Welcome message text is not euqals 'Welcome to the-internet'");
    }

    @Then("^Available Examples list contains links$")
    public void availableExamplesListContainsLinks(List<String> arg) {
        Assertions.assertEquals(HomePage.getExamplestList(), arg, "Collections not Equals");
    }

    @When("I am opening {string} page")
//    @And("I am opening {string} page")
    public void iAmOpeningPage(String linkText) {
        WebElement examplesLink = projectData.dr.findElement(By.xpath("//a[contains(text(),'" + linkText + "')]"));
        examplesLink.click();
    }

    @When("Click on 'Fork me on GitHub' link")
    public void clickOnLink() {
        projectData.wait.until(ExpectedConditions.elementToBeClickable(getForkMeOnGitHubLink()));
        getForkMeOnGitHubLink().click();
    }

    @Then("GitHub repository is open")
    public void githubRepositoryIsOpen() {
        String gitRepositoriesURL = ConfProperties.getProperty("GitRepositoriesURL");
        Assertions.assertEquals(gitRepositoriesURL, projectData.dr.getCurrentUrl(),
                "Git repository doesn't open");
    }

    @Then("{string} link is displayed")
    public void forkMeOnGitHubLinkIsDisplayed() {
        Assertions.assertTrue(getForkMeOnGitHubLink().isDisplayed(),
                "'Fork me on GitHub' link does not displayed");
    }
}
