package seleniumBasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
    public static void m1 (String property) throws IOException {
        FileInputStream file = new FileInputStream("C:\\Users\\91733\\IdeaProjects\\Selenium\\src\\main\\resources\\TestData.properties");
        Properties pro = new Properties();
        pro.load(file);
        String prabrowser = pro.getProperty(property);
        System.out.println( prabrowser);

    }
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("C:\\Users\\91733\\IdeaProjects\\Selenium\\src\\main\\resources\\TestData.properties");
        Properties pro = new Properties();
        pro.load(file);
        String browser = pro.getProperty("Browser");
        System.out.println(browser);
        String url= pro.getProperty("url");
        System.out.println(url);
        m1("Browser");

    }
}
