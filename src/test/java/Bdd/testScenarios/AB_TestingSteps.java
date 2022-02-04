package Bdd.testScenarios;

import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import pageObject.abTesting.AB_TestingObject;

public class AB_TestingSteps {
    @Then("AB Testing page has content")
    public void contentIsDisplayed() {
        Assertions.assertTrue(AB_TestingObject.getContent().isDisplayed(), "Content doesn't Displayed");
    }
}
