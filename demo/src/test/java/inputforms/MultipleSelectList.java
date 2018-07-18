package inputforms;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleSelectList  extends BaseClass{

    @Test

    public void selectACountry() throws InterruptedException {

        String country[] = { "California", "Florida", "New Jersey", "New York", "Ohio", "Texas", "Pennsylvania", "Washington"};
        WebDriver driver = openSeleniumEasySite();

        selectInputFormsFromLeftSide(driver);

        driver.findElement(By.xpath( "//ul[@id='treemenu']//a[text()='Select Dropdown List']"));

        driver.findElement(By.xpath("//option[@value='California']")).click();

        driver.findElement(By.xpath("//button[@id='printMe']")).click();
        String firstSelected = driver.findElement(By.xpath("//p[@class='getall-selected']")).getText();

        Assert.assertTrue(firstSelected.contains(firstSelected));

        //for(int count = 0; count < country.length; count++) {
        // firstSelected.selectByVisibleText[country[count]];

        //firstSelected.selectByVisibleText[country[count]];
        //firstSelected.selectByIndex(1);
        //System.out.println("First selected option is :" +firstSelected);
        // break;
        // }
        Thread.sleep(3000);
        closeWebSite(driver);

    }



}
