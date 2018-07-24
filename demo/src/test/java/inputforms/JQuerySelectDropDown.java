package inputforms;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class JQuerySelectDropDown extends  BaseClass {
    
    @Test
    public void selectACountry() throws InterruptedException {

        String country[] = {"Australia", "Bangladesh", "Denmark", "Hong Kong", "India", "Japan", "Netherlands", "New Zealand", "South Africa", "United States of America"};

        WebDriver driver = openSeleniumEasySite();
        selectInputFormsFromLeftSide(driver);

        driver.findElement(By.xpath("//ul[@id='treemenu']//a[text()='JQuery Select dropdown']")).click();

        for (int count = 0; count < country.length; count++) {

            driver.findElement(By.xpath("//option[@value='"+country[count]+"']")).click();

            driver.findElement(By.id("select2-country-container")).click();
        }
        Thread.sleep(3000);
        closeWebSite(driver);
    }
}


