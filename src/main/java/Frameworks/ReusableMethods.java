package Frameworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ReusableMethods {

 public static WebDriver driver;

        public static void  SetUp() {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\91733\\Documents\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://www.google.com/");
            driver.manage().window().maximize();
        }
        public static void tearDown(){
            driver.quit();
        }
        public static void implictWait(int sec){
            driver.manage().timeouts().implicitlyWait(sec,TimeUnit.SECONDS);
        }





}



