package Bdd.testScenarios;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.NoSuchElementException;
import pageObject.abTesting.AB_Testing;
import utils.Log;

public class AB_TestingSteps {
    @Then("AB Testing page has content")
    public void contentIsDisplayed() {
        Assertions.assertTrue(AB_Testing.getContent().isDisplayed(), "Content doesn't Displayed");
    }

    @And("Content contains text {string}")
    public void contentContainsText(String arg0) {
        Assertions.assertEquals(AB_Testing.getContentText().getText(),arg0,"Text is not equals");
    }

    @Then("Content title get text {string} or {string}")
    public void contentTitleGetText(String argControl, String argVariant) {
        try {
            Assertions.assertEquals(AB_Testing.getTitleControl().getText(),argControl, "Text is not equals");
        }
        catch (NoSuchElementException e){
            Log.warn("Element 'TitleControl' not found");
            Log.info("Expected element is 'TitleVariant'");
            Assertions.assertEquals(AB_Testing.getTitleVariant().getText(),argVariant,"Text is not equals");
        }
        }
}
