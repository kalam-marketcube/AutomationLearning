package inputforms;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.SingleFormDemoPage;

public class TwoInputFields extends BaseClass {

    @Test
    public void getTotal() throws InterruptedException {

        WebDriver driver = openSeleniumEasySite();

        // click on side menu simple form
        driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
        driver.findElement(By.xpath("//ul[@id='treemenu']//a[text()='Simple Form Demo']")).click();

        //Test1
        multipleValues(driver, 8, 6, 14);

        //Test2
        multipleValues(driver, 26, 56, 82);

        //Test3
        multipleValues(driver, 889, 646, 1535);

        closeWebSite(driver);

    }

    private void multipleValues(WebDriver driver, int value1, int value2, int expTotal) throws InterruptedException {

        SingleFormDemoPage singleFormDemoPage = new SingleFormDemoPage(driver);
        singleFormDemoPage.aValue().sendKeys(String.valueOf(value1));
        singleFormDemoPage.bValue().sendKeys(String.valueOf(value2));
        singleFormDemoPage.getTotalBtn().click();
        String actTotal = singleFormDemoPage.getDisplayValue().getText();
        Assert.assertEquals(Integer.parseInt(actTotal), expTotal);


//        driver.findElement(By.id("sum1")).clear();
//        driver.findElement(By.id("sum1")).sendKeys(String.valueOf(value1));
//
//        driver.findElement(By.id("sum2")).clear();
//        driver.findElement(By.id("sum2")).sendKeys(String.valueOf(value2));

//        driver.findElement(By.xpath("//button[text()='Get Total']")).click();
//        Thread.sleep(3000);

//        String actTotal = driver.findElement(By.id("displayvalue")).getText();

//         Assert.assertEquals(Integer.parseInt(actTotal), expTotal);
    }

}
