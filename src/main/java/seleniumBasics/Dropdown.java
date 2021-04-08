package seleniumBasics;

import Frameworks.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.nio.channels.SelectableChannel;
import java.util.Iterator;
import java.util.List;

public class  Dropdown extends ReusableMethods {

    public static void main(String[] args) throws InterruptedException {
        SetUp();
driver.get("https://www.facebook.com/");
driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
        Thread.sleep(3000);
WebElement month =driver.findElement(By.name("birthday_month"));
Select sc =new Select(month);
//value select with indexsc.selectByIndex(6);
//Thread.sleep(3000);
//value select with value
sc.selectByValue("5");
//Thread.sleep(3000);
sc.selectByVisibleText("Sep");
Thread.sleep(3000);
List<WebElement> values =sc.getOptions();
Iterator<WebElement> ic = values.iterator();
while(ic.hasNext()){
    WebElement a =ic.next();
    String b =a.getText();
    System.out.println(b);
}












    }






}



