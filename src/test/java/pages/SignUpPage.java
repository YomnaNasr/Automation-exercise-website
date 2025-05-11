package pages;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SignUpPage extends BaseTest {
    By visibleInfo = By.cssSelector("#form > div > div > div > div.login-form > h2 > b");
    By title_Mrs_RadioButton = By.id("id_gender2");
    By nameTextField =By.id("name");
    By emailTextField = By.id("email");
    By passwordTextField = By.id("password");
    By dayDropdown = By.id("days");
    By monthDropdown = By.id("months");
    By yearDropdown = By.id("years");
    By signUpNewsletterChecker = By.id("newsletter");
    By ReceiveSpecialOffersFromOurPartnersChecker = By.id("uniform-optin");
    By firstNameTextField = By.id("first_name");
    By lastNameTextField = By.id("last_name");
    By companyTextField = By.id("company");
    By addressTextField = By.id("address");
    By address2TextField = By.id("address2");
    By countryTextField = By.cssSelector("#country > option:nth-child(5)");

    By stateTextField = By.id("state");
    By cityTextField = By.id("city");
    By zipcodeTextField = By.id("zipcode");
    By mobileNumberTextField = By.id("mobile_number");
    By createAccountButton =By.cssSelector("#form > div > div > div > div.login-form > form > button");

    public void  VerifENTERACCOUNINFORMATIONvisiblty(){
        driver.findElement(visibleInfo).isDisplayed();
    }

    public void setTitle_Mrs_RadioButton() {
        driver.findElement(title_Mrs_RadioButton).click();
    }

    public void setNameTextField(String name) {
        driver.findElement(nameTextField).sendKeys(name);
    }

    public void setEmailTextField(String email) {
        driver.findElement(emailTextField).sendKeys(email);
    }

    public void setPasswordTextField(String password) {
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

}
