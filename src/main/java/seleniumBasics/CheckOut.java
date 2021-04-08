package seleniumBasics;

import Frameworks.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckOut extends ReusableMethods {
    public static void main(String[] args) throws InterruptedException {
        SetUp();
        driver.get("http://demo.actitime.com");
        WebElement text = driver.findElement(By.xpath("//td[contains(text(),'Please ')]"));
        System.out.println(text.getText());
        WebElement checkbox = driver.findElement(By.name("remember"));
        Thread.sleep((3000));
        boolean beforeclick= checkbox.isSelected();
        System.out.println("beforeclick:"+beforeclick);
        checkbox.click();
        Thread.sleep((3000));
        boolean afterclick =checkbox.isSelected();
        System.out.println("afterclick:" +afterclick);
        boolean login = driver.findElement(By.xpath("(//div[contains(text(),'Login')])[1]")).isEnabled();
        System.out.println("login is enabled:"+login);
        boolean forgetdisplay =driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?')]")).isDisplayed();
        System.out.println(" forgetdisplay:" + forgetdisplay);

    }

}
