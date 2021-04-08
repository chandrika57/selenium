package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\91733\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.get("http://demo.actitime.com");
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
        driver.findElement(By.xpath("//a[@id='loginButton']")).click();
        Thread.sleep(3000) ;
        driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
        Thread.sleep(3000);
        driver.quit();
    }
}
