package pages;


import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Date;

public class SignUpPage {
    WebDriver driver;

    Faker faker = new Faker();
    Date birthDate = faker.date().birthday(18, 65);

    // Get calendar instance
//    Calendar calendar = Calendar.getInstance();  // <-- java.util.Calendar
//    calendar.setTime(birthDate);                 // <-- java.util.Date
//
//    String day = String.valueOf(calendar.get(Calendar.DAY_OF_MONTH));
//    String month = new DateFormatSymbols().getMonths()[calendar.get(Calendar.MONTH)];
//    String year = String.valueOf(calendar.get(Calendar.YEAR));

   public SignUpPage(WebDriver driver) {
       this.driver=driver;
   }

    By visibleInfo = By.cssSelector("#form > div > div > div > div.login-form > h2 > b");
    By title_Mrs_RadioButton = By.id("id_gender2");
    By nameTextField =By.id("name");
    By emailTextField = By.id("email");
    By passwordTextField = By.id("password");
    By dayDropdown = By.id("days");
    By monthDropdown = By.id("months");
    By yearDropdown = By.id("years");
    By signUpNewsletterChecker = By.id("newsletter");
    By ReceiveSpecialOffersFromOurPartnersChecker = By.id("optin");
    By firstNameTextField = By.id("first_name");
    By lastNameTextField = By.id("last_name");
    By companyTextField = By.id("company");
    By addressTextField = By.id("address1");
    By address2TextField = By.id("address2");
    By countryTextField = By.cssSelector("#country > option:nth-child(5)");

    By stateTextField = By.id("state");
    By cityTextField = By.id("city");
    By zipcodeTextField = By.id("zipcode");
    By mobileNumberTextField = By.id("mobile_number");
    By createAccountButton =By.cssSelector("#form > div > div > div > div.login-form > form > button");
    By accountCreatedElement = By.cssSelector("#form > div > div > div > h2 > b");
    By continueButton = By.cssSelector("#form > div > div > div > div > a");
    By logedInUserNameVisibility = By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(10) > a");
    By deleteButton = By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(5) > a");
    By accountDeletedVisibility = By.cssSelector("#form > div > div > div > h2 > b");
    By continueButtonAfterDelete = By.cssSelector("#form > div > div > div > div > a");
    public void  VerifENTERACCOUNINFORMATIONvisiblty(){
        System.out.println(driver.findElement(visibleInfo).isDisplayed());
    }

    public void enterTitle_Mrs_RadioButton() {
        driver.findElement(title_Mrs_RadioButton).click();
    }

    public void enterNameTextField(String name) {
        driver.findElement(nameTextField).sendKeys(name);
    }

    public void enterEmailTextField(String email) {
        driver.findElement(emailTextField).sendKeys(email);
    }

    public void enterPasswordTextField(String password) {
        driver.findElement(passwordTextField).sendKeys(password);
    }

    public void selectDay(String day) {
        new Select(driver.findElement(dayDropdown)).selectByVisibleText(day);
    }

    public void selectMonth(String month) {
        new Select(driver.findElement(monthDropdown)).selectByVisibleText(month);
    }

    public void selectYear(String year) {
        new Select(driver.findElement(yearDropdown)).selectByVisibleText(year);
    }
    public void clickOnNewsletterChecker(){
        driver.findElement(signUpNewsletterChecker).click();
    }
    public void clickOnReceiveSpecialOffersFromOurPartnersChecker(){
        driver.findElement(ReceiveSpecialOffersFromOurPartnersChecker).click();
    }
    public void setFirstName(String firstName) {
        driver.findElement(firstNameTextField).sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        driver.findElement(lastNameTextField).sendKeys(lastName);
    }

    public void setCompany(String company) {
        driver.findElement(companyTextField).sendKeys(company);
    }

    public void setAddress(String address) {
        driver.findElement(addressTextField).sendKeys(address);
    }

    public void setAddress2(String address2) {
        driver.findElement(address2TextField).sendKeys(address2);
    }

    // Country is a <select>, use Select
    public void selectCountry(String countryName) {
        new Select(driver.findElement(countryTextField)).selectByVisibleText(countryName);
    }

    public void setState(String state) {
        driver.findElement(stateTextField).sendKeys(state);
    }

    public void setCity(String city) {
        driver.findElement(cityTextField).sendKeys(city);
    }

    public void setZipcode(String zipcode) {
        driver.findElement(zipcodeTextField).sendKeys(zipcode);
    }

    public void setMobileNumber(String number) {
        driver.findElement(mobileNumberTextField).sendKeys(number);
    }

    public void clickCreateAccountButton() {
        driver.findElement(createAccountButton).click();
    }
    public void selectDateOfBirth(String day, String month, String year) {
        driver.findElement(dayDropdown).sendKeys(day);
        driver.findElement(monthDropdown).sendKeys(month);
        driver.findElement(yearDropdown).sendKeys(year);

    }
    public void fillDetails(String firstName,String lastName, String company, String address, String address2,String state,String city,String zipCode,String mobileNumber){
        setFirstName(firstName);
        setLastName(lastName);
        setCompany(company);
        setAddress(address);
        setAddress2(address2);
        setState(state);
        setCity(city);
        setZipcode(zipCode);
        setMobileNumber(mobileNumber);
    }
    public void  verifyACCOUNTCREATEDisVisible (){
        System.out.println(driver.findElement(accountCreatedElement).isDisplayed());
    }
    public void clickOnContinueButton(){
        driver.findElement(continueButton).click();
    }
    public void VerifyThatLoggedInAsusernameIsVisible(){
        driver.findElement(logedInUserNameVisibility).isDisplayed();
    }
    public void clickOnDeleteButton(){
        driver.findElement(deleteButton).click();
    }
    public void verifyThatACCOUNTDELETEDIsVisible(){
        driver.findElement(accountDeletedVisibility).isDisplayed();

    }
    public void clickOncontinueButtonAfterDelet(){
        driver.findElement(continueButtonAfterDelete).click();

    }



}
