package abac_Software;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FirstPage {

    private WebDriver driver;
    private By startButton=By.id("start-estimate_sub");

    public FirstPage(WebDriver driver) {
        this.driver = driver;
    }

//    public void clickStartButton(){
//        driver.findElement(startButton).click();
//    }

    public SecondPage clickStartButton(){
        driver.findElement(startButton).click();
        return new SecondPage(driver);
    }
}
