package seleniumBasics;

import Frameworks.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;


public class MouseKeyBoardActions extends ReusableMethods {
    public static void main(String[] args) throws InterruptedException {
        SetUp();
        driver.get("http://demo.actitime.com");
       WebElement forget = driver.findElement(By.id("toPasswordRecoveryPageLink"));
        Actions action = new Actions(driver);
        action.contextClick(forget);
        Thread.sleep(3000);
        action.sendKeys(forget, Keys.DOWN).build().perform();
        action.sendKeys(forget, Keys.DOWN).build().perform();
        action.sendKeys(forget, Keys.DOWN).build().perform();
        action.sendKeys(forget, Keys.DOWN).build().perform();
        action.sendKeys(forget, Keys.DOWN).build().perform();
        action.sendKeys(forget, Keys.DOWN).build().perform();
        action.sendKeys(forget, Keys.ENTER ).build().perform();











        
    }


}
