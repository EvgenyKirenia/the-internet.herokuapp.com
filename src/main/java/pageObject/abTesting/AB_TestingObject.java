package pageObject.abTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObject.projectData.HelperData;

public class AB_TestingObject extends HelperData {
    public AB_TestingObject(WebDriver dr) {
        super(dr);
    }

    @FindBy(xpath = "//div[@id='content']")
    private static WebElement content;
    @FindBy(xpath = "//h3[contains(text(),'A/B Test Variation 1')]")
    private static WebElement title;
    @FindBy(xpath = "//p[contains(text(),'Also known as split testing. This is a way in whic')]")
    private static WebElement contentText;

    public static WebElement getContent() {
        return content;
    }

    public static WebElement getTitle() {
        return title;
    }

    public static WebElement getContentText() {
        return contentText;
    }
}
