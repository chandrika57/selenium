package seleniumBasics;

import Frameworks.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Iterator;
import java.util.List;


public class Links {

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();

        System.setProperty("webdriver.chrome.driver","C:\\Users\\91733\\Documents\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
        Iterator<WebElement> i = alllinks.iterator();
        while (i.hasNext()) {
             WebElement a = i.next();
            String text= a.getText();
            System.out.println(text);

        }

    }


}


