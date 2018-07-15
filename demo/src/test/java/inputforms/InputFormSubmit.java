package inputforms;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class InputFormSubmit extends BaseClass {
    @Test

    public void formFilling() throws InterruptedException {


         WebDriver driver = openSeleniumEasySite();

         selectInputFormsFromLeftSide(driver);

         //Select inputFormFiled = formFiledFromLeftSide(driver);
         formfiled(driver);

         Thread.sleep(3000);
         closeWebSite(driver);
    }


        private void formfiled(WebDriver driver) throws  InterruptedException{
        driver.findElement(By.xpath("//ul[@id='treemenu']//a[text()='Input Form Submit']")).click();
        driver.findElement(By.xpath("//fieldset//div[1]//div[1]//div[1]//input[1]")).sendKeys("shaik");
        driver.findElement(By.xpath("//fieldset//div[2]//div[1]//div[1]//input[1]")).sendKeys("kalam");
        driver.findElement(By.xpath("//fieldset//div[3]//div[1]//div[1]//input[1]")).sendKeys("shaik.kalam1997@gmail.com");
        driver.findElement(By.xpath("//fieldset//div[4]//div[1]//div[1]//input[1]")).sendKeys("7660049118");
        driver.findElement(By.xpath("//fieldset//div[5]//div[1]//div[1]//input[1]")).sendKeys("saroonagar");
        driver.findElement(By.xpath("//fieldset//div[6]//div[1]//div[1]//input[1]")).sendKeys("Hyderabad");
        //driver.findElement(By.xpath("//option[contains(text(),'Indiana')]")).click();
         String country[] = {"Arizona","California","Connecticut","District of Columbia","Indiana"};
           for(int col=0;col<country.length;col++) {
                // inputFormFiled.selectByVisibleText(country[col]);
               driver.findElement(By.xpath("//select[@class='form-control selectpicker']"));
           }
        driver.findElement(By.xpath("//fieldset//div[8]//div[1]//div[1]//input[1]")).sendKeys("50060");
        driver.findElement(By.xpath("//div[@class='form-group']//input[@class='form-control']")).sendKeys("SeleniumLearning");
            for (int col = 1; col <= 2; col++) {
                driver.findElement(By.xpath("//div[@class='col-md-4']//div["+ col +"]//label[1]")).click();
            }
        driver.findElement(By.xpath("//textarea[@class='form-control']")).sendKeys("Automation Learning Selenium");
        driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();

        Thread.sleep(2000);

    }
}
