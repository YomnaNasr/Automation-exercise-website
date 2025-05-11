package pages;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;

public class RigesterUserPage extends BaseTest {
    By signupLoginButton = By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(4) > a");
    By newUserSignupIsVisible = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/h2");
    By nameTextField = By.cssSelector("#form > div > div > div:nth-child(3) > div > form > input[type=text]:nth-child(2)");
    By emailTextField = By.cssSelector("#form > div > div > div:nth-child(3) > div > form > input[type=email]:nth-child(3)");
    By signUpButton = By.cssSelector("#form > div > div > div:nth-child(3) > div > form > button");
    BaseTest baseTestObj = new BaseTest();

    public void openWebsite() {
        baseTestObj.openUrl("http://automationexercise.com");
    }
    public void VerifyHomePageVisiblity(){
        Assert.assertEquals(driver.getCurrentUrl(),"http://automationexercise.com","you are in wrong page");

    }
    public void clickOnSignupLoginButton(){
        driver.findElement(signupLoginButton).click();
    }
    public void VerifyNewUserSignupIsVisible(){
        Assert.assertTrue(driver.findElement(newUserSignupIsVisible).isDisplayed());
    }
    public void enterName(String name){
        driver.findElement(nameTextField).sendKeys(name);
    }
    public void enterEmail(String email){
        driver.findElement(emailTextField).sendKeys(email);
    }
    public void clickSignUpButton(){
        driver.findElement(signUpButton).click();
    }

}
