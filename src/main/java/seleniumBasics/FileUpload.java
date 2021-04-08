package seleniumBasics;

import Frameworks.ReusableMethods;
import org.openqa.selenium.By;

import java.io.IOException;

public class FileUpload extends ReusableMethods {
    public static void main(String[] args) throws InterruptedException, IOException {
        SetUp();
        implictWait(30);
        driver.get("https://my.naukri.com/account/register/basicdetails");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@value='fresher']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='file']")).click();
        Thread.sleep(3000);
        Runtime.getRuntime().exec("D://chandu//fileupload.exe");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();


    }
}
