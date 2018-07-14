package inputforms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

    public WebDriver openSeleniumEasySite() throws InterruptedException {

        //Chrome browser
        // System.setProperty("webdriver.chrome.driver", "C://Users//subhani//Downloads//chromedriver.exe");
//        System.setProperty("webdriver.chrome.driver", "/Users/sshaik02/Downloads/chromedriver");
//        WebDriver driver = new ChromeDriver();

        //Firefox browser
        System.setProperty("webdriver.gecko.driver","/Users/sshaik02/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();


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
