package Bdd.testScenarios;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.NoSuchElementException;
import pageObject.abTesting.AB_TestingObject;
import utils.Log;

public class AB_TestingSteps {
    @Then("AB Testing page has content")
    public void contentIsDisplayed() {
        Assertions.assertTrue(AB_TestingObject.getContent().isDisplayed(), "Content doesn't Displayed");
    }

    @And("Content contains text {string}")
    public void contentContainsText(String arg0) {
        Assertions.assertEquals(AB_TestingObject.getContentText().getText(),arg0,"Text is not equals");
    }

    @Then("Content title get text {string} or {string}")
    public void contentTitleGetText(String argControl, String argVariant) {
        try {
            Assertions.assertEquals(AB_TestingObject.getTitleControl().getText(),argControl, "Text is not equals");
        }
        catch (NoSuchElementException e){
            Log.warn("Element 'TitleControl' not found");
            Log.info("Expected element is 'TitleVariant'");
            Assertions.assertEquals(AB_TestingObject.getTitleVariant().getText(),argVariant,"Text is not equals");
        }
        }
}
