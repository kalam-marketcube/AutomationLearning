package table;

import inputforms.BaseClass;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TableDataSearch extends BaseClass {

    @Test
    public void tasks() throws InterruptedException {

        WebDriver driver = openSeleniumEasySite();

        driver.findElement(By.xpath("//a[text()='Table']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//ul[@id='treemenu']//a[text()='Table Data Search']")).click();
        Thread.sleep(2000);

        int row;
        searchFilterData(driver, row = 1, "Wireframes", "Wireframes", "John Smith", "in progress");

        searchFilterData(driver, row = 2, "Landing Page", "Landing Page", "Mike Trout", "completed");

        searchFilterData(driver, row = 3, "SEO tags", "SEO tags", "Loblab Dan", "failed qa");

        searchFilterData(driver, row = 4, "Bootstrap 3", "Bootstrap 3", "Emily John", "in progress");

        searchFilterData(driver, row = 5, "jQuery library", "jQuery library", "Holden Charles", "deployed");

        searchFilterData(driver, row = 6, "Browser Issues", "Browser Issues", "Jane Doe", "failed qa");

        searchFilterData(driver, row = 7, "Bug fixing", "Bug fixing", "Kilgore Trout", "in progress");

        closeWebSite(driver);

    }

    private void searchFilterData(WebDriver driver, int row, String searchString, String taskName, String assignee, String status) throws InterruptedException {

        driver.findElement(By.id("task-table-filter")).clear();
        driver.findElement(By.id("task-table-filter")).sendKeys(searchString);
        Thread.sleep(2000);

        String actTask = driver.findElement(By.xpath("//*[@id='task-table']/tbody/tr[" + row + "]/td[2]")).getText();
        Assert.assertEquals(taskName, actTask);

        String actAssignee = driver.findElement(By.xpath("//*[@id='task-table']/tbody/tr[" + row + "]/td[3]")).getText();
        Assert.assertEquals(assignee, actAssignee);

        String actStatus = driver.findElement(By.xpath("//*[@id='task-table']/tbody/tr[" + row + "]/td[4]")).getText();
        Assert.assertEquals(status, actStatus);
        Thread.sleep(2000);
    }
}
