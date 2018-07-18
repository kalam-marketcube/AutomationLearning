package inputforms;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleSelectList extends BaseClass {

    @Test

    public void selectACountry() throws InterruptedException {

        String country[] = {"California", "Florida", "New Jersey", "New York", "Ohio", "Texas", "Pennsylvania", "Washington"};
        WebDriver driver = openSeleniumEasySite();

        selectInputFormsFromLeftSide(driver);

        for (int count = 0; count < country.length; count++) {


            driver.findElement(By.xpath("//option[@value='" + country[count] + "']")).click();

            driver.findElement(By.xpath("//button[@id='printMe']")).click();
            String firstSelected = driver.findElement(By.xpath("//p[@class='getall-selected']")).getText();

            Assert.assertTrue(firstSelected.contains(firstSelected));

        }

        Thread.sleep(2000);
        closeWebSite(driver);

    }

}
