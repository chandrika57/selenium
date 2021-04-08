package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {


        WebDriver driver;
        @Given("Launch browser")
        public void launch_browser () throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\91733\\Documents\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            Thread.sleep(3000);

        }
        @When("Enter url")
        public void enter_url () {
            driver.get("https://demo.actitime.com/login.do");
        }
        @Then("Enter username")
        public void enter_username () {
            driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys(" admin");

        }
        @Then("Enter password")
        public void enter_password () {
            driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys(" manager");
        }

    }


