package Practise;

import Frameworks.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

public class DropdrownYear extends ReusableMethods {
    public static void main(String[] args) throws InterruptedException {
        SetUp();
        driver.get("https://www.facebook.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
        Thread.sleep(3000);
        WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
        Select sc = new Select(year);
        sc.selectByIndex(2);
        Thread.sleep(3000);
        sc.selectByValue("1991");
        Thread.sleep(3000);
        sc.selectByVisibleText("1992");
        Thread.sleep(3000);
        List<WebElement> years = sc.getOptions();
        Iterator ir = years.iterator();
        while(ir.hasNext()){
            WebElement a= (WebElement) ir.next();
            String b=a.getText();
            System.out.println(b);

        }





    }








}
