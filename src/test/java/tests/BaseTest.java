package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {


    WebDriver driver ;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    @BeforeClass
   public void sutUp(){
        driver= new ChromeDriver();
        driver.get("https://automationexercise.com/");
    }

}
