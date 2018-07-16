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

        //driver.findElement(By.id("task-table-filter")).clear();
        driver.findElement(By.id("task-table-filter")).sendKeys("Wireframes");

        String actTask = driver.findElement(By.xpath("//*[@id='task-table']/tbody/tr[1]/td[2]")).getText();
        Assert.assertEquals("Wireframes", actTask);

        String actAssignee = driver.findElement(By.xpath("//*[@id='task-table']/tbody/tr[1]/td[3]")).getText();
        Assert.assertEquals("John Smith", actAssignee);

        String actStatus = driver.findElement(By.xpath("//*[@id='task-table']/tbody/tr[1]/td[4]")).getText();
        Assert.assertEquals("in progress", actStatus);

        Thread.sleep(5000);
        driver.findElement(By.id("task-table-filter")).clear();
        driver.findElement(By.id("task-table-filter")).sendKeys("Landing Page");

        String actTask1 = driver.findElement(By.xpath("//td[contains(text(),'Landing Page')]")).getText();
        Assert.assertEquals("Landing Page", actTask1);

        String actAssignee1 = driver.findElement(By.xpath("//td[contains(text(),'Mike Trout')]")).getText();
        Assert.assertEquals("Mike Trout", actAssignee1);

        String actStatus1 = driver.findElement(By.xpath("//td[contains(text(),'completed')]")).getText();
        Assert.assertEquals("completed", actStatus1);

        Thread.sleep(5000);
        driver.findElement(By.id("task-table-filter")).clear();
        driver.findElement(By.id("task-table-filter")).sendKeys("SEO tags");

        String actTask2 = driver.findElement(By.xpath("//td[contains(text(),'SEO tags')]")).getText();
        Assert.assertEquals("SEO tags", actTask2);

        String actAssignee2 = driver.findElement(By.xpath("//td[contains(text(),'Loblab Dan')]")).getText();
        Assert.assertEquals("Loblab Dan", actAssignee2);

        String actStatus2 = driver.findElement(By.xpath("//td[contains(text(),'failed qa')]")).getText();
        Assert.assertEquals("failed qa", actStatus2);

        Thread.sleep(5000);
        driver.findElement(By.id("task-table-filter")).clear();
        driver.findElement(By.id("task-table-filter")).sendKeys("Bootstrap 3");

        String actTask3 = driver.findElement(By.xpath("//td[contains(text(),'Bootstrap 3')]")).getText();
        Assert.assertEquals("Bootstrap 3", actTask3);

        String actAssignee3 = driver.findElement(By.xpath("//td[contains(text(),'Emily John')]")).getText();
        Assert.assertEquals("Emily John", actAssignee3);

        //String actStatus3 = driver.findElement(By.xpath("//td[contains(text(),'in progress')]")).getText();
        //Assert.assertEquals("in progress", actStatus3);

        Thread.sleep(5000);
        driver.findElement(By.id("task-table-filter")).clear();
        driver.findElement(By.id("task-table-filter")).sendKeys("jQuery library");

        String actTask4 = driver.findElement(By.xpath("//td[contains(text(),'jQuery library')]")).getText();
        Assert.assertEquals("jQuery library", actTask4);

        String actAssignee4 = driver.findElement(By.xpath("//td[contains(text(),'Holden Charles')]")).getText();
        Assert.assertEquals("Holden Charles", actAssignee4);

        //String actStatus4 = driver.findElement(By.xpath("//*[@id='task-table']/tbody/tr[5]/td[4]')]")).getText();
        //Assert.assertEquals("deployed", actStatus4);

        Thread.sleep(5000);
        driver.findElement(By.id("task-table-filter")).clear();
        driver.findElement(By.id("task-table-filter")).sendKeys("Browser Issues");

        String actTask5 = driver.findElement(By.xpath("//td[contains(text(),'Browser Issues')]")).getText();
        Assert.assertEquals("Browser Issues", actTask5);

        String actAssignee5 = driver.findElement(By.xpath("//td[contains(text(),'Jane Doe')]")).getText();
        Assert.assertEquals("Jane Doe", actAssignee5);

        //String actStatus5 = driver.findElement(By.xpath("//*[@id='task-table']/tbody/tr[6]/td[4]')]")).getText();
        //Assert.assertEquals("failed qa", actStatus5);

        Thread.sleep(5000);
        driver.findElement(By.id("task-table-filter")).clear();
        driver.findElement(By.id("task-table-filter")).sendKeys("Bug fixing");

        String actTask6 = driver.findElement(By.xpath("//td[contains(text(),'Bug fixing')]")).getText();
        Assert.assertEquals("Bug fixing", actTask6);

        String actAssignee6 = driver.findElement(By.xpath("//td[contains(text(),'Kilgore Trout')]")).getText();
        Assert.assertEquals("Kilgore Trout", actAssignee6);

        //String actStatus6 = driver.findElement(By.xpath("//*[@id='task-table']/tbody/tr[7]/td[4]')]")).getText();
        //Assert.assertEquals("in progress", actStatus6);
        closeWebSite(driver);

    }
}
