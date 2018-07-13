package inputforms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

    public WebDriver openSeleniumEasySite() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/sshaik02/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.seleniumeasy.com/test/basic-first-form-demo.html");

        Thread.sleep(5000);
        return driver;
    }


    void selectInputFormsFromLeftSide(WebDriver driver) throws InterruptedException {
        driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
        Thread.sleep(2000);
    }

    public void closeWebSite(WebDriver driver) {
        driver.quit();
    }
}
