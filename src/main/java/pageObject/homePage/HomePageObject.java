package pageObject.homePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObject.projectData.HelperData;

import java.util.ArrayList;
import java.util.List;

public class HomePageObject extends HelperData {
    public HomePageObject(WebDriver dr) {
        super(dr);
    }

    @FindBy(xpath = "//h1[contains(text(),'Welcome to the-internet')]")
    private static WebElement welcomeLable;

    @FindBy(xpath = "//body/div[2]/a[1]/img[1]")
    private static WebElement forkMeOnGitHubLink;

    @FindBy(xpath = "//body[1]/div[2]/div[1]/ul[1]/li")
    private static List<WebElement> examplestList;


    public static WebElement getWelcomeLable() {
        return welcomeLable;
    }

    public static WebElement getForkMeOnGitHubLink() {
        return forkMeOnGitHubLink;
    }

    public static List<String> getExamplestList() {

        List<String> itemList = new ArrayList<>();
        for (int i = 0; i < examplestList.size(); i++) {
            itemList.add(examplestList.get(i).getText());
        }
        return itemList;
    }


}
