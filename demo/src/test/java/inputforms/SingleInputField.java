package inputforms;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.SingleFormDemoPage;


public class SingleInputField extends BaseClass {

    @Test
    public void showMessage() throws InterruptedException {


        WebDriver driver = openSeleniumEasySite();

        selectInputFormsFromLeftSide(driver);

        selectSimpleFormFromLeftSide(driver);

        //Test1
        display(driver, "welcome");

        //Test2
        display(driver, "kalam");

        //Test3
        display(driver, "hyderabad");

        //Test4
        display(driver, "London");

        //Test5
        display(driver, "NewDelhi");

        //Test6
        display(driver, "Secunderabad");

        closeWebSite(driver);
    }

    private void selectSimpleFormFromLeftSide(WebDriver driver) {
        driver.findElement(By.xpath("//ul[@id='treemenu']//a[text()='Simple Form Demo']")).click();
    }


    private void display(WebDriver driver, String msg) throws InterruptedException {

        SingleFormDemoPage singleFormDemoPage = new SingleFormDemoPage(driver);
        singleFormDemoPage.clearAndEnterMessage(msg);
        singleFormDemoPage.showMessageBtn().click();
        String message = singleFormDemoPage.getShowMessageTxt();

        Assert.assertEquals(msg, message);

        Thread.sleep(2000);
    }
}
