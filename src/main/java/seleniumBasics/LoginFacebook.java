package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginFacebook {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\91733\\Documents\\chromedriver.exe");
        WebDriver driver =new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("chandrika.v207@gmail.com");
        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("chandrika57");
        driver.findElement(By.xpath("//button[@name='login']")).click();
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@aria-label='Account']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='aov4n071']//div[3]//div[4]")).click();
   Thread.sleep(3000);
   driver.quit();

    }
}
