package seleniumBasics;

import Frameworks.ReusableMethods;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class TakingScreenShot extends ReusableMethods {

    public static void main(String[] args) throws IOException {
        SetUp();
        driver.get("https://web.whatsapp.com/");
        File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File destinationfile =new File("D:\\Prathyusha\\chandu\\screenshots.jpeg");
        FileHandler.copy(srcfile, destinationfile);

    }
}
