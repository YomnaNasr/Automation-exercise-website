package base;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BaseTest {
public static WebDriver driver;
public Faker faker = new Faker();
public void lunchBrowser(WebDriver driver){
    this.driver=driver;
}
public void openUrl(String webUrl){
    driver.get(webUrl);
}


}
