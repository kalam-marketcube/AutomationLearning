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

        String[] ageGroup = {"0 - 5", "5 - 15", "15 - 50"};

        selctMaleAgeGroup(driver, ageGroup);

        selectFemaleAgeGroup(driver, ageGroup);

        closeWebSite(driver);

    }

    private void selectFemaleAgeGroup(WebDriver driver, String[] ageGroup) throws InterruptedException {
        for (int col = 1; col <= 3; col++) {
            driver.findElement(By.xpath("//*[@id='easycont']//div[1]/label[2]")).click();
            driver.findElement(By.xpath("//*[@id='easycont']/div/div[2]/div[2]/div[2]/div[2]/label[" + col + "]/input")).click();
            driver.findElement(By.xpath("//button[text()='Get values']")).click();

            String expMsg = "Sex : Female" + "\n" + "Age group: " + ageGroup[col - 1];
            String actMsg = driver.findElement(By.xpath("//p[@class='groupradiobutton']")).getText();

            Assert.assertEquals(expMsg, actMsg);
            Thread.sleep(2000);
        }
    }

    private void selctMaleAgeGroup(WebDriver driver, String[] ageGroup) throws InterruptedException {
        for (int col = 1; col <= 3; col++) {
            driver.findElement(By.xpath("//*[@id='easycont']//div[1]/label[1]")).click();
            driver.findElement(By.xpath("//*[@id='easycont']/div/div[2]/div[2]/div[2]/div[2]/label[" + col + "]/input")).click();
            driver.findElement(By.xpath("//button[text()='Get values']")).click();

            String expMsg = "Sex : Male" + "\n" + "Age group: " + ageGroup[col - 1];
            String actMsg = driver.findElement(By.xpath("//p[@class='groupradiobutton']")).getText();

            Assert.assertEquals(expMsg, actMsg);
            Thread.sleep(2000);
        }
    }

    private void selectRadioButtonFromLeftSide(WebDriver driver) throws InterruptedException {
        driver.findElement(By.xpath("//ul[@id='treemenu']//a[text()='Radio Buttons Demo']")).click();
        Thread.sleep(3000);
    }
}
