package abac_Software;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class StartNowTest extends BaseTestAppMake{

    private By startButton=By.id("start-estimate_sub");
    private WebElement subtitleElement;

    @BeforeEach
    public void initWebDriver(){
        driver=new ChromeDriver();

    }

    @Test
    public void startNow(){

        // Find the <p> element with the class "subtitle-start"
        WebElement subtitleElement = driver.findElement(By.cssSelector("p.subtitle-start"));

        // Get the text content of the <p> element
        String subtitleText = subtitleElement.getText();

        // Expected subtitle text
        String expectedSubtitleText = "In just four steps, appmake will generate a detailed estimation for the effort needed to build your platform. You will receive the MAKE document which contains a price estimation and the functional specifications that accurately describe your software system in technical terms after you complete your email.";

        // Assert the subtitle text
        assertEquals(subtitleText, expectedSubtitleText, "Subtitle text mismatch");
        driver.findElement(startButton).click();


    }

}
