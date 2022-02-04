package pageObject.projectData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HelperData {
    public WebDriver dr;

    public HelperData(WebDriver dr) {
        PageFactory.initElements(dr, this);
        this.dr = dr;
    }

    public void inputToField(WebElement locator, String text) {
        locator.sendKeys(text);
    }

    public void clickOn(WebElement locator) {
        locator.click();
    }

    public void selectInDropDown(WebElement locator, String text) {
//        {
//            WebElement dropdown = driver.findElement(By.id("address_state"));
//            dropdown.findElement(By.xpath("//option[. = " + text + "]")).click();
//        }
        locator.findElement(By.xpath(".//option[text()='" + text + "']")).click();
    }
}
