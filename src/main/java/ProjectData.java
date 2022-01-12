import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfProperties;

import java.time.Duration;

public class ProjectData {

    public WebDriver dr;

    public void initDriver() {
        System.setProperty("webdriver.crome.driver", ConfProperties.getProperty("DriverPath"));
        dr = new ChromeDriver();
        dr.manage().window().maximize();
        dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        dr.get(ConfProperties.getProperty("HomeURL"));

    }Driver
}
