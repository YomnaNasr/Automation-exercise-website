package tests;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import pages.RigesterUserPage;
import pages.SignUpPage;

public class SignUpTest extends BaseTest{
    Faker faker = new Faker();
    SignUpPage signUpPage ;
    RigesterUserPage rigesterUserPage ;
    String name = faker.name().name();
    String email = faker.internet().emailAddress();
    String password = faker.internet().password();
    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String company = faker.company().name();
    String address = faker.address().fullAddress();
    String address2 = faker.address().secondaryAddress();
    String state = faker.address().state();
    String city= faker.address().city();
    String zipCode= faker.address().zipCode();
    String mobileNumber = faker.phoneNumber().phoneNumber();

    @Test()
    public void rigesterUserPageTest2(){
        rigesterUserPage = new RigesterUserPage(driver);
        rigesterUserPage.VerifyHomePageVisiblity();
        rigesterUserPage.clickOnSignupLoginButton();
        rigesterUserPage.VerifyNewUserSignupIsVisible();
        rigesterUserPage.enterName(name);
        rigesterUserPage.enterEmail(email);
        rigesterUserPage.clickSignUpButton();
        signUpPage = new SignUpPage(driver);
        signUpPage.VerifENTERACCOUNINFORMATIONvisiblty();
        signUpPage.enterTitle_Mrs_RadioButton();
        signUpPage.enterPasswordTextField(password);
        int age = 18 + faker.number().numberBetween(0, 47); // Generate an age between 18 and 65
        String dobDay = String.format("%02d", faker.number().numberBetween(1, 28)); // Day (1-28 to avoid invalid dates)
        String dobMonth = new java.text.SimpleDateFormat("MMMM").format(faker.date().birthday(age, age).getMonth());
        String dobYear = String.valueOf(faker.number().numberBetween(1950, 2005));
       // accountPage.selectDateOfBirth(dobDay, dobMonth, dobYear);
        signUpPage.selectDateOfBirth(dobDay,dobMonth,dobYear);
        System.out.println("Selected Date: " + dobDay + " " + dobMonth + " " +dobYear);
        signUpPage.clickOnNewsletterChecker();
        signUpPage.clickOnReceiveSpecialOffersFromOurPartnersChecker();
        signUpPage.fillDetails(firstName,lastName,company,address,address2,state,city,zipCode,mobileNumber);
        signUpPage.clickCreateAccountButton();
        signUpPage.verifyACCOUNTCREATEDisVisible();
        signUpPage.clickOnContinueButton();
        signUpPage.VerifyThatLoggedInAsusernameIsVisible();
        signUpPage.clickOnDeleteButton();
        signUpPage.verifyThatACCOUNTDELETEDIsVisible();
        signUpPage.clickOncontinueButtonAfterDelet();

    }
    @Test
    public void validLogin(){
        rigesterUserPage = new RigesterUserPage(driver);
        signUpPage = new SignUpPage(driver);
        rigesterUserPage.VerifyHomePageVisiblity();
        rigesterUserPage.clickOnSignupLoginButton();
        rigesterUserPage.verifyLoginToYourAccountIsVisible();
        rigesterUserPage.enterEmailLogin("yomnanasr@gmail.com");
        rigesterUserPage.enterPasswordLogin("test123");
        rigesterUserPage.clickOnLoginButton();
        signUpPage.VerifyThatLoggedInAsusernameIsVisible();
        signUpPage.clickOnDeleteButton();
        signUpPage.verifyThatACCOUNTDELETEDIsVisible();

    }
    @Test
    public void invalidLogin(){
        rigesterUserPage = new RigesterUserPage(driver);
        rigesterUserPage.VerifyHomePageVisiblity();
        rigesterUserPage.clickOnSignupLoginButton();
        rigesterUserPage.verifyLoginToYourAccountIsVisible();
        rigesterUserPage.enterEmailLogin("yomnanasr@gmail552.com52");
        rigesterUserPage.enterPasswordLogin("test123oj");
        rigesterUserPage.clickOnLoginButton();
        rigesterUserPage.verifyErrorYourEmailOrPasswordIsIncorrectIsVisible();
        rigesterUserPage.search("Blue Top");


    }

}
