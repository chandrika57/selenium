package seleniumBasics;

import org.openqa.selenium.By;

import static Frameworks.ReusableMethods.SetUp;
import static Frameworks.ReusableMethods.driver;

public class FacebookAlertBox {
    public static void main(String[] args) {
        SetUp();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("chandrika.v207@gmail.com");
        driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("chandrika57");
        driver.findElement(By.xpath("//button[contains(@name,'login')]")).click();

    }
}
