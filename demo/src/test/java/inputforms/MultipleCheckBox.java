package inputforms;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleCheckBox extends BaseClass{

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

        Thread.sleep(3000);

        String expMsg = "Uncheck All";

       // String actMsg = driver.findElement(By.xpath("//*[@id='check1']")).getText();

        //driver.findElement(By.xpath("//input[@id='check1']")).click();
       // Assert.assertEquals(expMsg,actMsg);
        //System.out.println(expMsg);


        }
}

