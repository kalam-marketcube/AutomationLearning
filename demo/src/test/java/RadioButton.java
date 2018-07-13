import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButton extends BaseClass {

    @Test
    public void getCheckedValue() throws InterruptedException {

        WebDriver driver = openSeleniumEasySite();

        selectInputFormsFromLeftSide(driver);

        selectRadioButtonFromLeftSide(driver);

        //Test1
        genderSelection(driver, "Male");

        //Test2
        genderSelection(driver, "Female");

        closeWebSite(driver);
    }

    private void selectRadioButtonFromLeftSide(WebDriver driver) throws InterruptedException {
        driver.findElement(By.xpath("//ul[@id='treemenu']//a[text()='Radio Buttons Demo']")).click();
        Thread.sleep(2000);
    }

    private void genderSelection(WebDriver driver, String gender) throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='easycont']/div/div[2]/div[1]/div[2]//input[@value='" + gender + "']")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("buttoncheck")).click();

        String expMsg = "Radio button '" + gender + "' is checked";

        String actMsg = driver.findElement(By.xpath("//p[@class='radiobutton']")).getText();

        Assert.assertEquals(expMsg, actMsg);
        Thread.sleep(2000);
    }
}
