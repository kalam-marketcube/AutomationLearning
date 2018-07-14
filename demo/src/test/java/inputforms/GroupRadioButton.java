package inputforms;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GroupRadioButton extends BaseClass {

    @Test

    public void selectRadioButtons() throws InterruptedException {

        WebDriver driver = openSeleniumEasySite();

        selectInputFormsFromLeftSide(driver);

        selectRadioButtonFromLeftSide(driver);

        genderAgeSelection(driver);

        closeWebSite(driver);
    }

    private void selectRadioButtonFromLeftSide(WebDriver driver) throws InterruptedException {
        driver.findElement(By.xpath("//ul[@id='treemenu']//a[text()='Radio Buttons Demo']")).click();
        Thread.sleep(3000);
    }

    private void genderAgeSelection(WebDriver driver ) throws InterruptedException {
        driver.findElement(By.xpath("//div[@class='panel-body']//div[1]//label[1]//input[1]")).click();
        driver.findElement(By.xpath("//div[@class='panel-body']//div[2]//label[1]//input[1]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Get values')]")).click();

        String expMsg = "Sex : Male"  + "\n"+ "Age group: 0 - 5";
        String actMsg = driver.findElement(By.xpath("//p[@class='groupradiobutton']")).getText();

        Assert.assertEquals(expMsg, actMsg);
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@class='panel-body']//div[1]//label[1]//input[1]")).click();
        driver.findElement(By.xpath("//div[@class='panel-body']//div[2]//label[2]//input[1]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Get values')]")).click();

        String expMsg1 = "Sex : Male"  + "\n"+ "Age group: 5 - 15";
        String actMsg1 = driver.findElement(By.xpath("//p[@class='groupradiobutton']")).getText();

        Assert.assertEquals(expMsg1, actMsg1);
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@class='panel-body']//div[1]//label[1]//input[1]")).click();
        driver.findElement(By.xpath("//div[@class='panel-body']//div[2]//label[3]//input[1]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Get values')]")).click();

        String expMsg2 = "Sex : Male"  + "\n"+ "Age group: 15 - 50";
        String actMsg2 = driver.findElement(By.xpath("//p[@class='groupradiobutton']")).getText();

        Assert.assertEquals(expMsg2, actMsg2);
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@class='panel-body']//div[1]//label[2]//input[1]")).click();
        driver.findElement(By.xpath("//div[@class='panel-body']//div[2]//label[1]//input[1]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Get values')]")).click();

        String expMsg3 = "Sex : Female"  + "\n"+ "Age group: 0 - 5";
        String actMsg3 = driver.findElement(By.xpath("//p[@class='groupradiobutton']")).getText();

        Assert.assertEquals(expMsg3, actMsg3);
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@class='panel-body']//div[1]//label[2]//input[1]")).click();
        driver.findElement(By.xpath("//div[@class='panel-body']//div[2]//label[2]//input[1]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Get values')]")).click();

        String expMsg4 = "Sex : Female"  + "\n"+ "Age group: 5 - 15";
        String actMsg4 = driver.findElement(By.xpath("//p[@class='groupradiobutton']")).getText();

        Assert.assertEquals(expMsg4, actMsg4);
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@class='panel-body']//div[1]//label[2]//input[1]")).click();
        driver.findElement(By.xpath("//div[@class='panel-body']//div[2]//label[3]//input[1]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Get values')]")).click();

        String expMsg5 = "Sex : Female"  + "\n"+ "Age group: 15 - 50";
        String actMsg5 = driver.findElement(By.xpath("//p[@class='groupradiobutton']")).getText();

        Assert.assertEquals(expMsg5, actMsg5);
        Thread.sleep(2000);

    }
}
