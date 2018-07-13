import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkbox extends BaseClass {

    @Test
    public void singleCheckbox() throws InterruptedException {

        WebDriver driver = openSeleniumEasySite();

        selectInputFormsFromLeftSide(driver);

        singleCheckboxDemo(driver);

        closeWebSite(driver);

    }


    private void singleCheckboxDemo(WebDriver driver) throws InterruptedException {
        driver.findElement(By.xpath("//ul[@id='treemenu']//a[text()='Checkbox Demo']")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("isAgeSelected")).click();
        Thread.sleep(2000);

        String expMsg = "Success - Check box is checked";

        String actMsg = driver.findElement(By.id("txtAge")).getText();

        Assert.assertEquals(expMsg, actMsg);
    }
}
