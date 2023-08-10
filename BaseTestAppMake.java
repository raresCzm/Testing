package abac_Software;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTestAppMake {

    //create a webDriver object
    public WebDriver driver;
    protected FirstPage firstPage;

    @BeforeClass
    public void setup() {
        //System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://appmake.io/estimate/");

        firstPage = new FirstPage(driver);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }



}
