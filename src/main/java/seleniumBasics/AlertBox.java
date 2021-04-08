package seleniumBasics;

import org.openqa.selenium.By;

import static Frameworks.ReusableMethods.SetUp;
import static Frameworks.ReusableMethods.driver;

public class AlertBox {
    public static void main(String[] args) throws InterruptedException {
        SetUp();
        driver.get("https://demo.actitime.com/login.do");
        driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("admin");
        driver.findElement(By.xpath("//input[contains(@name,'pwd')]")).sendKeys("manager");
        //driver.findElement(By.xpath("//button[contains(@name,'login')]")).click();
        //driver.findElement(By.xpath("//input[contains(@name,'remember')]")).click();
        driver.findElement(By.xpath("(//div[contains(text(),'Login')])[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[contains(@id,'container_tasks')]")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//div[contains(@class,'title ellipsis')]")).click();
       driver.findElement(By.xpath("//div[contains(@class,'item createNewCustomer')]")).click();
        Thread.sleep(3000);
       driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter Customer Name')])[2]")).sendKeys("chandu");
       driver.findElement(By.xpath("(//div[contains(@class,'closeButton')])[7]")).click();
        Thread.sleep(3000);
       driver.switchTo().alert().accept();
        Thread.sleep(3000);


    }
}







