package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ContactUsPage {
    WebDriver driver;
    By contactUsButton = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[8]/a");
    By getInTouchElement =  By.xpath("//*[@id=\"contact-page\"]/div[2]/div[1]/div/h2");
    By name = By.xpath("//*[@id=\"contact-us-form\"]/div[1]/input");
    By email = By.xpath("//*[@id=\"contact-us-form\"]/div[2]/input");
    By subject=By.xpath("//*[@id=\"contact-us-form\"]/div[3]/input");
    By message =By.id("message");
    By uploadFileElement = By.xpath("//*[@id=\"contact-us-form\"]/div[5]/input");
    By submitButton = By.xpath("//*[@id=\"contact-us-form\"]/div[6]/input");
    By successMessageElement= By.xpath("//*[@id=\"contact-page\"]/div[2]/div[1]/div/div[2]");
    By homeButton = By.xpath("//*[@id=\"form-section\"]/a/span");
    public ContactUsPage(WebDriver driver) {
        this.driver=driver;
    }
    public void clickOnContactUsButton(){
        driver.findElement(contactUsButton).click();
    }

    public void verifyGETINTOUCHIsVisible(){
        driver.findElement(getInTouchElement).isDisplayed();
    }

    public void setName(String namevr) {
        driver.findElement(name).sendKeys(namevr);
    }

    public void setEmail(String emailvr) {
        driver.findElement(email).sendKeys(emailvr);
    }

    public void setSubject(String subjectVr) {
        driver.findElement(subject).sendKeys(subjectVr);
    }

    public void setMessage(String messagevr) {
        driver.findElement(message).sendKeys(messagevr);
    }
    public void  enterNameEmailSubjectMessage(String name,String email,String subject ,String message){
        setName(name);
        setEmail(email);
        setMessage(subject);
        setSubject(message);
    }
    public void  uploadFile(String path){
        driver.findElement(uploadFileElement).sendKeys(path);

    }
    public void clickSubmitButton(){
        driver.findElement(submitButton).submit();
    }
    public void verifySuccessMessageIsVisible(){
        driver.findElement(successMessageElement).isDisplayed();
    }
    public void clickOnHomeButton(){
        driver.findElement(homeButton).click();
    }
    public void verifyRedirectToHomePageSuccessfully(){
        Assert.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/");
    }
}
