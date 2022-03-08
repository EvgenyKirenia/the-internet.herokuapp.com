package pageObject.addRemoveElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObject.projectData.HelperData;

import java.util.List;

public class AddRemoveElements extends HelperData {

    public AddRemoveElements(WebDriver dr) {
        super(dr);
    }

    @FindBy(xpath = "//button[contains(text(),'Add Element')]")
    private static WebElement addElementBtn;

    @FindBy(xpath = "//h3[contains(text(),'Add/Remove Elements')]")
    private static WebElement addRemoveTitle;

    @FindBy(xpath = "//button[contains(text(),'Delete')]")
    private static List<WebElement> deleteBtn;

    public static WebElement getAddElementBtn() {
        return addElementBtn;
    }
    static int deleteBtnListSizeBefore;

    public static WebElement getAddRemoveTitle() {
        return addRemoveTitle;
    }

    public static List<WebElement> getDeleteBtn() {
        return deleteBtn;
    }

    public static int getDeleteBtnListSizeBefore() {
        return deleteBtnListSizeBefore;
    }

    public static void setDeleteBtnListSizeBefore(int deleteBtnBefore) {
        deleteBtnListSizeBefore = deleteBtnBefore;
    }


}
