package datepickers;

import inputforms.BaseClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Date;


public class DateExample extends BaseClass {

    @Test
    public void selectDate() throws InterruptedException {
        WebDriver driver = openSeleniumEasySite();

        driver.findElement(By.xpath("//a[text()='Date pickers']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//ul[@id='treemenu']//a[text()='Bootstrap Date Picker']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id='sandbox-container1']/div/span/i")).click();

        int todaysDate = new Date().getDate() - 1;

        int totalRows = driver.findElements(By.xpath("//div[3]/div[1]/table/tbody/tr")).size();

        int totalCols = driver.findElements(By.xpath("//div[3]/div[1]/table/tbody/tr[1]/td")).size();

        for (int noOfRows = 1; noOfRows <= totalRows; noOfRows++) {
            for (int noOfCols = 1; noOfCols <= totalCols; noOfCols++) {

                int date = Integer.parseInt(driver.findElement(By.xpath("//div[3]/div[1]/table/tbody/tr[" + noOfRows + "]/td[" + noOfCols + "]")).getText());

                if (todaysDate == date) {
                    driver.findElement(By.xpath("//div[3]/div[1]/table/tbody/tr[" + noOfRows + "]/td[" + noOfCols + "]")).click();
                    Thread.sleep(5000);
                    break;
                }
                break;
            }
        }
        closeWebSite(driver);
    }
}