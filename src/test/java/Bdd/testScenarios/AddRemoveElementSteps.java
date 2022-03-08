package Bdd.testScenarios;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import pageObject.addRemoveElements.AddRemoveElements;

public class AddRemoveElementSteps {

    @Then("AddRemove Elements page has content title {string}")
    public void addRemoveElementsPageHasContentTitle(String arg0) {
        Assertions.assertEquals(AddRemoveElements.getAddRemoveTitle().getText(), arg0, "Title text isn't correct");
    }

    @And("'Add Element' button is displayed")
    public void buttonIsDisplayed() {
        Assertions.assertTrue(AddRemoveElements.getAddElementBtn().isDisplayed(),
                "Add Element button is not displayed");
    }

    @Then("'Delete' button is not displayed")
    public void deleteButtonIsNotDisplayed() {
        Assertions.assertTrue(AddRemoveElements.getDeleteBtn().isEmpty(), "Delete button is present");
    }

    @And("I click 'Add Element' button")
    public void iClickAddElementButton() {
        AddRemoveElements.getAddElementBtn().click();
        AddRemoveElements.setDeleteBtnListSizeBefore(AddRemoveElements.getDeleteBtn().size());
    }

    @Then("'Delete' button is displayed")
    public void deleteButtonIsDisplayed() {
        Assertions.assertEquals(AddRemoveElements.getDeleteBtnListSizeBefore(), AddRemoveElements.getDeleteBtn().size(),
                "Delete button is not displayed");
    }

    @And("I click 'Delete' button")
    public void iClickDeleteButton() {
        AddRemoveElements.getDeleteBtn().get(0).click();
    }

    @Then("'Delete' button does not displayed")
    public void deleteButtonDoesNotDisplayed() {
        Assertions.assertTrue(AddRemoveElements.getDeleteBtn().isEmpty(), "Delete button list is not empty");
    }

    @Then("List of elements contained {int} 'Delete' buttons")
    public void listOfElementsContainedTwoDeleteButtons(int arg0) {
        Assertions.assertEquals(arg0, AddRemoveElements.getDeleteBtn().size(),
                "Next Delete button does not added");
    }
}
