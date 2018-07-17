package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SingleFormDemoPage {

    WebDriver driver;

    static final By messageTxt = By.id("user-message");
    static final By showMessageBtn = By.xpath("//button[text()='Show Message']");
    static final By showMessage = By.id("display");
    static final By aValue = By.id("sum1");
    static final By bValue = By.id("sum2");
    static final By totalBtn = By.xpath("//button[text()='Get Total']");
    static final By displayValue = By.id("displayvalue");


    public WebElement getTotalBtn(){
        return driver.findElement(totalBtn);
    }

    public SingleFormDemoPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clearAndEnterMessage(String msg) {
        driver.findElement(messageTxt).clear();
        driver.findElement(messageTxt).sendKeys(msg);
    }

    public WebElement showMessageBtn() {
        return driver.findElement(showMessageBtn);
    }

    public String getShowMessageTxt() {
        return driver.findElement(showMessage).getText();
    }

    public WebElement aValue() {
        driver.findElement(aValue).clear();
        return driver.findElement(aValue);
    }

    public WebElement bValue() {
        driver.findElement(bValue).clear();
        return driver.findElement(bValue);
    }

    public WebElement getDisplayValue() {
        return driver.findElement(displayValue);
    }
}
