package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import pages.ContactUsPage;
import pages.RigesterUserPage;

public class RigesterUserTest extends BaseTest{
    Faker faker = new Faker();
    String name = faker.name().name();
    String email = faker.internet().emailAddress();
    String subject = faker.lorem().sentence(); // Generates a fake subject
    String message = faker.lorem().paragraph();

    @Test
    public void rigesterUserPageTest1(){
        RigesterUserPage rigesterUserPage = new RigesterUserPage(driver);
        rigesterUserPage.VerifyHomePageVisiblity();
        rigesterUserPage.clickOnSignupLoginButton();
        rigesterUserPage.VerifyNewUserSignupIsVisible();
        rigesterUserPage.enterName(name);
        rigesterUserPage.enterEmail(email);
        rigesterUserPage.clickSignUpButton();

    }
    @Test
    public void rigesterUserWithExistingEmail(){
        RigesterUserPage rigesterUserPage = new RigesterUserPage(driver);
        rigesterUserPage.VerifyHomePageVisiblity();
        rigesterUserPage.clickOnSignupLoginButton();
        rigesterUserPage.VerifyNewUserSignupIsVisible();
        rigesterUserPage.enterName("yomn nasr");
        rigesterUserPage.enterEmail("yomnanasr57@gmail.com");
        rigesterUserPage.clickSignUpButton();
        rigesterUserPage.verifyErrorEmailAddressAlreadyExistIsVisible();

    }
    @Test
    public void contactUs(){
        RigesterUserPage rigesterUserPage = new RigesterUserPage(driver);
        ContactUsPage contactUs = new ContactUsPage(driver);
        rigesterUserPage.VerifyHomePageVisiblity();
        rigesterUserPage.clickOnContactUsButton();
        contactUs.enterNameEmailSubjectMessage(name,email,subject,message);
        contactUs.uploadFile("C:/Users/batta/Desktop/Yomna Nasr Elessaily CV.pdf");
        contactUs.clickSubmitButton();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        contactUs.verifySuccessMessageIsVisible();
        contactUs.clickOnHomeButton();
        contactUs.verifyRedirectToHomePageSuccessfully();

    }
    @Test
    public void verifyTestCasesPage(){
        RigesterUserPage rigesterUserPage= new RigesterUserPage(driver);
        rigesterUserPage.VerifyHomePageVisiblity();
        rigesterUserPage.clickOnTestCasesButton();
        rigesterUserPage.verifyUserNavigateToTestCasesPageSuccessfully();

    }
    @Test
    public void verifyAllProductsAndProductDetailPage(){
        RigesterUserPage rigesterUserPage= new RigesterUserPage(driver);
        rigesterUserPage.VerifyHomePageVisiblity();
        rigesterUserPage.clickOnProductButton();
        rigesterUserPage.verifyUserNavigatedToPRODUCTSPageSuccessfully();
        rigesterUserPage.verifyTheProductsListVisible();
        rigesterUserPage.clickOnFirstProduct();
        rigesterUserPage.verifyUserLandedToProductDetails();
        rigesterUserPage.verifyProductDetailsIsVisible();


    }
    @Test
    public void searchProduct(){
        RigesterUserPage rigesterUserPage= new RigesterUserPage(driver);
        rigesterUserPage.VerifyHomePageVisiblity();
        rigesterUserPage.clickOnProductButton();
        rigesterUserPage.verifyUserNavigatedToPRODUCTSPageSuccessfully();


    }

}
