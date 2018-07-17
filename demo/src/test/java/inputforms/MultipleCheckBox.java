package inputforms;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleCheckBox extends BaseClass {

    @Test
    public void checkAll() throws InterruptedException {

        WebDriver driver = openSeleniumEasySite();

        selectInputFormsFromLeftSide(driver);

        multipleCheckBoxDemo(driver);

        closeWebSite(driver);
    }

    private void multipleCheckBoxDemo(WebDriver driver) throws InterruptedException {

        driver.findElement(By.xpath("//ul[@id='treemenu']//a[text()='Checkbox Demo']")).click();
        driver.findElement(By.xpath(".//*[@id='easycont']/div/div[2]/div[2]/div[2]/div[1]/label")).click();
        driver.findElement(By.xpath("//div[@class='panel-body']//div[2]//label[1]")).click();
        driver.findElement(By.xpath("//div[@class='panel-body']//div[3]//label[1]")).click();
        driver.findElement(By.xpath("//div[@class='panel-body']//div[4]//label[1]")).click();

        String expMsg = "Uncheck All";

        String uncheckAllMsg = driver.findElement(By.xpath("//*[@id='check1']")).getAttribute("value");
        Assert.assertEquals(expMsg, uncheckAllMsg);

        driver.findElement(By.xpath("//div[@class='panel-body']//div[2]//label[1]")).click();
        String checkAllMsg = driver.findElement(By.xpath("//*[@id='check1']")).getAttribute("value");
        Assert.assertEquals("Check All", checkAllMsg);
    }
}

