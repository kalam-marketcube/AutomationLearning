import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectList extends BaseClass {

    @Test
    public void selectADay() throws InterruptedException {

        String days[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        WebDriver driver = openSeleniumEasySite();

        selectInputFormsFromLeftSide(driver);

        Select selectADay = selectDropdownFromLeftSide(driver);

        selectDays(days, driver, selectADay);

        closeWebSite(driver);
    }

    private Select selectDropdownFromLeftSide(WebDriver driver) {
        driver.findElement(By.xpath("//ul[@id='treemenu']//a[text()='Select Dropdown List']")).click();

        return new Select(driver.findElement(By.id("select-demo")));
    }

    private void selectDays(String[] days, WebDriver driver, Select selectADay) throws InterruptedException {
        for (int count = 0; count < days.length; count++) {

            selectADay.selectByVisibleText(days[count]);

            Thread.sleep(2000);

            String selected = driver.findElement(By.className("selected-value")).getText();

            Assert.assertTrue(selected.contains(days[count]));
        }
    }
}
