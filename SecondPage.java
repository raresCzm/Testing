package abac_Software;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecondPage {
    private WebDriver driver;

    private By textField = By.id("mat-input-0");
    private By passwordField = By.id("password");
    private By loginButton = By.cssSelector("#login button");
    private By smallApp=By.xpath("//label[contains(text(), 'SMALL')]");
    private By mediumApp=By.xpath("//label[contains(text(), 'MEDIUM')]");
    private By largeApp=By.xpath("//label[contains(text(), 'LARGE')]");

    public SecondPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setPurposeOfProject(String purpose) {
        //'sendKyes' is the method to type in text
        driver.findElement((By) textField).sendKeys(purpose);
    }

    public void setSizeOfTheAppSmall(){
        driver.findElement(smallApp).click();
    }

    public void setSizeOfTheAppMedium(){
        driver.findElement(mediumApp).click();
    }
    public void setSizeOfTheAppLarge(){
        driver.findElement(largeApp).click();
    }

}