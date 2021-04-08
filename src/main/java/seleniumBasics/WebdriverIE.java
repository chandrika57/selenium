package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebdriverIE {
    public static void main(String[] args) {
        System.setProperty("webdriver.ie.driver","C://Users//91733//Documents//IEDriverServer.exe");
       // WebDriver driver =new InternetExplorerDriver();
        WebDriver driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
    }
}
