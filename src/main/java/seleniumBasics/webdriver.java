package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver {


    public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver","C:\\Users\\91733\\.m2\\repository\\org\\seleniumhq\\selenium\\chromedriver.exe ");
       WebDriver driver =new ChromeDriver();
        driver.get("https://www.google.com/");

    }

}
