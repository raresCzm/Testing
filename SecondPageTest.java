package abac_Software;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondPageTest extends BaseTestAppMake {

    private org.openqa.selenium.By By;

    @Test
    public void setPurposeOfProject() throws InterruptedException {

        SecondPage secondPage = firstPage.clickStartButton();
        String textToInsert = "Hello, this is some text.";
        secondPage.setPurposeOfProject(textToInsert);
        WebElement field = driver.findElement(By.id("mat-input-0"));
        String fieldValue = field.getAttribute("value");

        // Assert that the field value matches the inserted text
        Assert.assertEquals(fieldValue, textToInsert);

        // Print the field value
        System.out.println("Field Value: " + fieldValue);

    }

    @Test
    public void setSizeOfAppSmall() {
        //small
        SecondPage secondPage = firstPage.clickStartButton();
        secondPage.setSizeOfTheAppSmall();

        // Check the selected status of the "SMALL" app size
        WebElement elementByText = driver.findElement(By.xpath("//label[contains(text(), 'SMALL')]"));
        boolean isAppSmallSelected = elementByText.isSelected();

        // Check the selected status of the "MEDIUM" and "LARGE" app sizes
        WebElement elementByText1 = driver.findElement(By.xpath("//label[contains(text(), 'MEDIUM')]"));
        boolean isAppMediumSelected = elementByText1.isSelected();

        WebElement elementByText2 = driver.findElement(By.xpath("//label[contains(text(), 'LARGE')]"));
        boolean isAppLargeSelected = elementByText2.isSelected();

        // Assert that only the "SMALL" size is selected
        Assert.assertTrue(isAppSmallSelected);
        Assert.assertFalse(isAppMediumSelected);
        Assert.assertFalse(isAppLargeSelected);
    }


}
