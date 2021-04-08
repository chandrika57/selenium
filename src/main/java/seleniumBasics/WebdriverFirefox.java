package seleniumBasics;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class WebdriverFirefox {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C://Users//91733//Documents//geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

    }
}
