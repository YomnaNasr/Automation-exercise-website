package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class RigesterUserPage{
    WebDriver driver;

    public RigesterUserPage(WebDriver driver) {
        this.driver = driver;
    }
    By logoutButton = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a");

    By signupLoginButton = By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(4) > a");
    By newUserSignupIsVisible = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/h2");
    By nameTextField = By.cssSelector("#form > div > div > div:nth-child(3) > div > form > input[type=text]:nth-child(2)");
    By emailTextField = By.cssSelector("#form > div > div > div:nth-child(3) > div > form > input[type=email]:nth-child(3)");
    By signUpButton = By.cssSelector("#form > div > div > div:nth-child(3) > div > form > button");
    By loginToYourAccount = By.cssSelector("#form > div > div > div.col-sm-4.col-sm-offset-1 > div > h2");
    By emailTextFieldLogin = By.cssSelector("#form > div > div > div.col-sm-4.col-sm-offset-1 > div > form > input[type=email]:nth-child(2)");
    By passwordTextFieldLogin= By.cssSelector("#form > div > div > div.col-sm-4.col-sm-offset-1 > div > form > input[type=password]:nth-child(3)");
    By loginButton = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button");
    By errorYourEmailOrPasswordIsIncorrectElement= By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/p");
    By errorEmailAddressAlreadyExistElement = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/p");
    By contactUsButton = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[8]/a");
   By testCasesButton = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a");

  By productButton = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a") ;

  By productList = By.cssSelector("body > section:nth-child(3)");

  By firstProduct = By.xpath("//a[@href=\"/product_details/1\"]");
  By productDetails = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div");
 By searchProduct = By.id("search_product");
  public void VerifyHomePageVisiblity(){
        Assert.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/","you are in wrong page");
        System.out.println("aaaaaaaaaaa"+driver.getCurrentUrl());
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
    public void verifyLoginToYourAccountIsVisible(){
        driver.findElement(loginToYourAccount).isDisplayed();
    }
    public  void enterEmailLogin(String email){
        driver.findElement(emailTextFieldLogin).sendKeys(email);
    }
    public  void enterPasswordLogin(String password){
        driver.findElement(passwordTextFieldLogin).sendKeys(password);
    }
    public void  clickOnLoginButton(){
        driver.findElement(loginButton).click();
    }
    public void verifyErrorYourEmailOrPasswordIsIncorrectIsVisible(){
        driver.findElement(errorYourEmailOrPasswordIsIncorrectElement).isDisplayed();
    }

    public void clickOnLogoutButton(){
        driver.findElement(logoutButton).click();
    }
    public void verifyThatuserIsNavigatedToLoginPage(){
        Assert.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/login");
    }
    public void verifyErrorEmailAddressAlreadyExistIsVisible(){
        driver.findElement(errorEmailAddressAlreadyExistElement).isDisplayed();

    }
    public void clickOnContactUsButton(){
        driver.findElement(contactUsButton).click();
    }
    public void clickOnTestCasesButton(){
        driver.findElement(testCasesButton).click();

    }
    public void verifyUserNavigateToTestCasesPageSuccessfully(){
        Assert.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/test_cases");

    }
    public void clickOnProductButton(){
      driver.findElement(productButton).click();
    }
    public void verifyUserNavigatedToPRODUCTSPageSuccessfully(){
      Assert.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/products");
    }
    public void verifyTheProductsListVisible(){
      driver.findElement(productList).isDisplayed();

    }
    public void clickOnFirstProduct(){
            WebElement textField = driver.findElement(firstProduct);
            String value2 = textField.getAttribute("href");
            driver.navigate().to(value2);

    }
    public void verifyUserLandedToProductDetails(){
      Assert.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/product_details/1");
    }
    public void verifyProductDetailsIsVisible(){
      driver.findElement(productDetails).isDisplayed();

    }
    public void search(String searchInput){
      driver.findElement(searchProduct).sendKeys(searchInput);
    }




}
