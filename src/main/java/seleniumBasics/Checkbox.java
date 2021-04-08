package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class Checkbox {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\91733\\Documents\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("http://demo.actitime.com");
       driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
        driver.findElement(By.xpath("//div[starts-with(text(),'Login')][1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[@class='customerNameHeader']/ancestor::div[1]/ancestor::tr/td[1]")).click();
      /* Iterator itr = A.iterator();
         while (itr.hasNext()) {
             WebElement b = (WebElement) itr.next();
            b.click();*/



        }












    }


